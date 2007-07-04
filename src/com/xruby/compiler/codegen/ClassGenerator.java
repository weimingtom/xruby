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

    public abstract void loadArgOfMethodForBlock();

    protected ClassGenerator(String name) {
        name_ = name;
    }

    public CompilationResult getCompilationResult() {
        return new CompilationResult(name_, cw_.toByteArray());
    }

    SymbolTable getSymbolTable() {
        return getMethodGenerator().getSymbolTable();
    }

    String decorateName(String name) {
        return "$" + name;
    }

    public void restoreLocalVariableFromBlock(String blockName, String name) {
        getMethodGenerator().loadLocal(getSymbolTable().getInternalBlockVar());
        getMethodGenerator().getField(Type.getType("L" + blockName + ";"), decorateName(name), Types.RUBY_VALUE_TYPE);
        if (getSymbolTable().getLocalVariable(name) >= 0) {
            getMethodGenerator().storeRubyLocalVariable(name);
        } else {
            //TODO may happen in for..in, binding, not sure if this is a bug
            getMethodGenerator().storeNewLocalVariable(name);
        }
    }

    public void addParameter(String name) {
        getSymbolTable().addMethodParameter(name);
    }

    public void setAsteriskParameter(String name, int argc) {
        //initializeAsteriskParameter() is always called. -- this will makes code generation simpler.
        //But doing it here has a little advantage (optimazation): if the
        //asterisk parameter is not used, we'd better avoid calling initializeAsteriskParameter().
        getMethodGenerator().RubyAPI_initializeAsteriskParameter(argc);
        int i = getMethodGenerator().newLocal(Types.RUBY_VALUE_TYPE);
        getSymbolTable().addAsteriskOrBlockMethodParameter(name, i);
        getMethodGenerator().storeLocal(i);
    }

    public void setBlockParameter(String name) {
        getMethodGenerator().RubyAPI_initializeBlockParameter();
        int i = getMethodGenerator().newLocal(Types.RUBY_VALUE_TYPE);
        getSymbolTable().addAsteriskOrBlockMethodParameter(name, i);
        getMethodGenerator().storeLocal(i);
    }

    public void visitEnd() {
        cv_.visitEnd();
    }

    public int getAnonymousLocalVariable() {
        return getMethodGenerator().newLocal(Types.RUBY_VALUE_TYPE);
    }

    public void storeVariable(String name) {
        if (getSymbolTable().getLocalVariable(name) >= 0) {
            getMethodGenerator().storeRubyLocalVariable(name);
            return;
        }

        int i = getSymbolTable().getAsteriskOrBlockMethodParameter(name);
        if (i >= 0) {
            getMethodGenerator().storeLocal(i);
            return;
        }

        int index = getSymbolTable().getMethodParameter(name);
        if (index >= 0) {
            storeMethodParameter(index);
            return;
        }

        getMethodGenerator().storeNewLocalVariable(name);
    }

    public void loadVariable(String name) {
        //check if this is local variable
        if (getSymbolTable().getLocalVariable(name) >= 0) {
            getMethodGenerator().loadRubyLocalVariable(name);
            return;
        }

        int i = getSymbolTable().getAsteriskOrBlockMethodParameter(name);
        if (i >= 0) {
            getMethodGenerator().loadLocal(i);
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
        //signature:
        //run(RubyValue reciever, RubyArray args, RubyBlock block)
        getMethodGenerator().loadArg(1);
        getMethodGenerator().push(index);
        getMethodGenerator().invokeVirtual(Types.RUBY_ARRAY_TYPE,
                    Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
    }

    public void storeMethodParameter(int index) {
        int i = getMethodGenerator().newLocal(Types.RUBY_VALUE_TYPE);
        getMethodGenerator().storeLocal(i);
        getMethodGenerator().loadArg(1);
        getMethodGenerator().push(index);
        getMethodGenerator().loadLocal(i);
        getMethodGenerator().invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue set(int, com.xruby.runtime.lang.RubyValue)"));
        getMethodGenerator().pop();
    }

    public MethodGenerator getMethodGenerator() {
        return mg_for_run_method_;
    }

    public void createBinding(boolean isInClassBuilder, boolean isInSingletonMethod, boolean isInGlobalScope, boolean isInBlock) {
        int i = getSymbolTable().getInternalBindingVar();
        if (i >= 0) {
            getMethodGenerator().loadLocal(i);
            updateBinding(isInClassBuilder, isInSingletonMethod, isInGlobalScope, isInBlock);
            return;
        }

        newBinding();
        updateBinding(isInClassBuilder, isInSingletonMethod, isInGlobalScope, isInBlock);

        getMethodGenerator().dup();
        i = getMethodGenerator().newLocal(Types.RUBY_BINDING_TYPE);
        getMethodGenerator().storeLocal(i);
        getSymbolTable().setInternalBindingVar(i);
    }

    private void newBinding() {
        getMethodGenerator().newInstance(Types.RUBY_BINDING_TYPE);
        getMethodGenerator().dup();
        getMethodGenerator().invokeConstructor(Types.RUBY_BINDING_TYPE,
                Method.getMethod("void <init> ()"));
    }

    private void updateBinding(boolean isInClassBuilder, boolean isInSingletonMethod, boolean isInGlobalScope, boolean isInBlock) {
        getMethodGenerator().loadSelf(isInBlock);
        getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setSelf(com.xruby.runtime.lang.RubyValue)"));

        if (isInClassBuilder) {
            getMethodGenerator().pushNull();
        } else {
            getMethodGenerator().loadBlock(isInBlock);
        }
        getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setBlock(com.xruby.runtime.lang.RubyBlock)"));

        if (!isInBlock) {
            getMethodGenerator().loadCurrentScope(isInClassBuilder, isInSingletonMethod, isInGlobalScope, isInBlock);
        } else {
            getMethodGenerator().pushNull();//TODO fix this and loadCurrentClass
        }
        getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
            Method.getMethod("com.xruby.runtime.lang.RubyBinding setScope(com.xruby.runtime.lang.RubyModule)"));

        addVariableToBinding();
    }

    public void addVariableToBinding() {
        Collection<String> vars = getSymbolTable().getLocalVariables();
        for (String s : vars) {
            getMethodGenerator().push(s);
            getMethodGenerator().loadRubyLocalVariable(s);
            getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyBinding addVariable(String, com.xruby.runtime.lang.RubyValue)"));
        }

        Collection<String> params = getSymbolTable().getParameters();
        for (String s : params) {
            getMethodGenerator().push(s);
            loadMethodPrameter(getSymbolTable().getMethodParameter(s));
            getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
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
            mg_for_run_method_.invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.value.RubyArray add(com.xruby.runtime.lang.RubyValue)"));
            mg_for_run_method_.pop();
        }
    }
}

