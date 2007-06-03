/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import org.objectweb.asm.util.CheckClassAdapter;
import com.xruby.runtime.lang.RubyBinding;
import java.util.*;

abstract class ClassGenerator {

    private final ClassWriter cw_ = new ClassWriter(ClassWriter.COMPUTE_MAXS);

    //can simply use 'cv_ = cw_'. CheckClassAdapter make compilation slower,
    //but it does lots of verification on the bytecode
    protected final ClassVisitor cv_ = new CheckClassAdapter(cw_);

    protected final String name_;
    protected MethodGenerator mg_for_run_method_ = null;
    private Stack<MethodGenerator> suspended_mgs_for_class_builder_method_ = new Stack<MethodGenerator>();
    private MethodGenerator current_mg_for_class_builder_method_ = null;//TODO should be a queue

    protected ClassGenerator(String name) {
        name_ = name;
    }

    public CompilationResult getCompilationResult() {
        return new CompilationResult(name_, cw_.toByteArray());
    }

    SymbolTable getSymbolTable() {
        return getMethodGenerator().getSymbolTable();
    }

    public boolean isInClassBuilder() {
        if (null != current_mg_for_class_builder_method_) {
            return true;
        } else {
            return false;
        }
    }

    public void restoreLocalVariableFromBlock(String blockName, String name) {
        getMethodGenerator().loadLocal(getSymbolTable().getInternalBlockVar());
        getMethodGenerator().getField(Type.getType("L" + blockName + ";"), name, Type.getType(Types.RubyValueClass));
        getMethodGenerator().storeLocal(getMethodGenerator().getLocalVariable(name));
    }

    public void startClassBuilderMethod(String name, boolean is_singleton) {
        if (null != current_mg_for_class_builder_method_) {
            suspended_mgs_for_class_builder_method_.push(current_mg_for_class_builder_method_);
        }

        current_mg_for_class_builder_method_ = new MethodGenerator(
                Opcodes.ACC_PRIVATE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue " + name + "(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule)"),
                cv_,
                null,
                null,
                is_singleton);
    }

    public void endClassBuilderMethod(boolean last_statement_has_return_value) {
        if (last_statement_has_return_value) {
            current_mg_for_class_builder_method_.pop();
        }

        current_mg_for_class_builder_method_.loadArg(0);
        current_mg_for_class_builder_method_.returnValue();

        current_mg_for_class_builder_method_.endMethod();
        if (!suspended_mgs_for_class_builder_method_.empty()) {
            current_mg_for_class_builder_method_ = suspended_mgs_for_class_builder_method_.pop();
        } else {
            current_mg_for_class_builder_method_ = null;
        }
    }

    public void callClassBuilderMethod(String name) {
        getMethodGenerator().invokeConstructor(Type.getType("L" + name_ + ";"),
            Method.getMethod("com.xruby.runtime.lang.RubyValue " + name + "(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule)"));
    }

    public void addParameter(String name) {
        getSymbolTable().addMethodParameter(name);
    }

    public void setAsteriskParameter(String name) {
        //initializeAsteriskParameter() is always called. -- this will makes code generation simpler.
        //But doing it here has a little advantage (optimazation): if the
        //asterisk parameter is not used, we'd better avoid calling initializeAsteriskParameter().
        getSymbolTable().setMethodAsteriskParameter(name);
        getMethodGenerator().call_initializeAsteriskParameter(getCurrentType());
    }

    public void setBlockParameter(String name) {
        getSymbolTable().setMethodBlockParameter(name);
        getMethodGenerator().call_initializeBlockParameter(getCurrentType());
    }

    public void visitEnd() {
        cv_.visitEnd();
    }

    public int getAnonymousLocalVariable() {
        return getMethodGenerator().newLocal(Type.getType(Types.RubyValueClass));
    }

    abstract protected Class getCurrentType();

    public void storeVariable(String name) {
        int i = getSymbolTable().getLocalVariable(name);
        if (i >= 0) {
            getMethodGenerator().storeLocal(i);
            return;
        }

        Class c = getCurrentType();
        if (getSymbolTable().getMethodAsteriskParameter(name)) {
            getMethodGenerator().store_asterisk_parameter_(c);
            return;
        }

        if (getSymbolTable().getMethodBlockParameter(name)) {
            getMethodGenerator().store_block_parameter_(c);
            return;
        }

        int index = getSymbolTable().getMethodParameter(name);
        if (index >= 0) {
            storeMethodParameter(index);
            return;
        }

        getMethodGenerator().storeLocal(getMethodGenerator().getNewLocalVariable(name));
    }

    public void loadVariable(String name) {
        //check if this is local variable
        if (getSymbolTable().getLocalVariable(name) >= 0) {
            getMethodGenerator().loadLocal(getMethodGenerator().getLocalVariable(name));
            return;
        }

        Class c = getCurrentType();
        if (getSymbolTable().getMethodAsteriskParameter(name)) {
            getMethodGenerator().load_asterisk_parameter_(c);
            return;
        }

        if (getSymbolTable().getMethodBlockParameter(name)) {
            getMethodGenerator().load_block_parameter_(c);
            return;
        }

        //check if this is normal method parameter
        int index = getSymbolTable().getMethodParameter(name);
        if (index >= 0) {
            loadMethodPrameter(index);
            return;
        }

        // never used, for example a = a + 1
        getMethodGenerator().ObjectFactory_nilValue();
    }

    public void loadMethodPrameter(int index) {
        //signatiure:
        //run(RubyValue reciever, RubyArray args, RubyBlock block)
        getMethodGenerator().loadArg(1);
        getMethodGenerator().push(index);
        getMethodGenerator().invokeVirtual(Type.getType(Types.RubyArrayClass),
                    Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
    }

    public void storeMethodParameter(int index) {
        int i = getMethodGenerator().newLocal(Type.getType(Types.RubyValueClass));
        getMethodGenerator().storeLocal(i);
        getMethodGenerator().loadArg(1);
        getMethodGenerator().push(index);
        getMethodGenerator().loadLocal(i);
        getMethodGenerator().invokeVirtual(Type.getType(Types.RubyArrayClass),
                Method.getMethod("com.xruby.runtime.lang.RubyValue set(int, com.xruby.runtime.lang.RubyValue)"));
        getMethodGenerator().pop();
    }

    public MethodGenerator getMethodGenerator() {
        if (null != current_mg_for_class_builder_method_) {
            return current_mg_for_class_builder_method_;
        } else {
            return mg_for_run_method_;
        }
    }

    public void createBinding(boolean isInSingletonMethod, boolean isInGlobalScope, boolean is_in_block) {
        int i = getSymbolTable().getInternalBindingVar();
        if (i >= 0) {
            getMethodGenerator().loadLocal(i);
            updateBinding(isInSingletonMethod, isInGlobalScope, is_in_block);
            return;
        }

        newBinding();
        updateBinding(isInSingletonMethod, isInGlobalScope, is_in_block);

        getMethodGenerator().dup();
        i = getMethodGenerator().newLocal(Type.getType(Types.RubyBindingClass));
        getMethodGenerator().storeLocal(i);
        getSymbolTable().setInternalBindingVar(i);
    }

    private void newBinding() {
        Type type = Type.getType(Types.RubyBindingClass);
        getMethodGenerator().newInstance(type);
        getMethodGenerator().dup();
        getMethodGenerator().invokeConstructor(type,
                Method.getMethod("void <init> ()"));
    }

    private void updateBinding(boolean isInSingletonMethod, boolean isInGlobalScope, boolean is_in_block) {
        Type type = Type.getType(Types.RubyBindingClass);

        getMethodGenerator().loadSelf(is_in_block);
        getMethodGenerator().invokeVirtual(type,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setSelf(com.xruby.runtime.lang.RubyValue)"));

        if (isInClassBuilder()) {
            getMethodGenerator().pushNull();
        } else {
            getMethodGenerator().loadBlock(is_in_block);
        }
        getMethodGenerator().invokeVirtual(type,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setBlock(com.xruby.runtime.lang.RubyBlock)"));

        if (!is_in_block) {
            getMethodGenerator().loadCurrentClass(isInClassBuilder(), isInSingletonMethod, isInGlobalScope, is_in_block);
        } else {
            getMethodGenerator().pushNull();//TODO fix this and loadCurrentClass
        }
        getMethodGenerator().invokeVirtual(type,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setScope(com.xruby.runtime.lang.RubyModule)"));

        addVariableToBinding();
    }

    public void addVariableToBinding() {
        Type type = Type.getType(Types.RubyBindingClass);

        Collection<String> vars = getSymbolTable().getLocalVariables();
        for (String s : vars) {
            getMethodGenerator().push(s);
            getMethodGenerator().loadLocal(getSymbolTable().getLocalVariable(s));
            getMethodGenerator().invokeVirtual(type,
                Method.getMethod("com.xruby.runtime.lang.RubyBinding addVariable(String, com.xruby.runtime.lang.RubyValue)"));
        }

        Collection<String> params = getSymbolTable().getParameters();
        for (String s : params) {
            getMethodGenerator().push(s);
            loadMethodPrameter(getSymbolTable().getMethodParameter(s));
            getMethodGenerator().invokeVirtual(type,
                Method.getMethod("com.xruby.runtime.lang.RubyBinding addVariable(String, com.xruby.runtime.lang.RubyValue)"));
        }
    }

    public boolean isDefinedInCurrentScope(String name) {
        return getSymbolTable().isDefinedInCurrentScope(name);
    }

    protected void updateBinding(RubyBinding binding, String name) {
        if (null != binding && !binding.hasName(name)) {

            binding.addVariableName(name);

            mg_for_run_method_.dup();
            mg_for_run_method_.loadArg(1);
            mg_for_run_method_.swap();
            mg_for_run_method_.invokeVirtual(Type.getType(Types.RubyArrayClass),
                Method.getMethod("com.xruby.runtime.value.RubyArray add(com.xruby.runtime.lang.RubyValue)"));
            mg_for_run_method_.pop();
        }
    }
}

