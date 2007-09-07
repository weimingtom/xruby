/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyString;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.List;

class MethodGenerator extends GeneratorAdapter {

    private SymbolTable symbol_table_;
    private IntegerTable integer_table_ = new IntegerTable();
    private ArrayList<Class> current_types_on_stack_ = new ArrayList<Class>();
    private ArrayList<Integer> saved_vars_ = new ArrayList<Integer>();//may be have same length of current_types_on_stack_
    private final boolean is_singleton_;
    private final LabelManager label_manager_ = new LabelManager();
    private final EnsureLabelManager ensure_label_manager_ = new EnsureLabelManager();

    public MethodGenerator(final int arg0, final Method arg1, final ClassVisitor cv, RubyBinding binding, SymbolTable st, boolean is_singleton) {
        super(arg0, arg1, null, null, cv);
        if (null == st) {
            symbol_table_ = new SymbolTable(null == binding ? null : binding.getVariableNames());
        } else {
            symbol_table_ = new SymbolTableForBlock(null == binding ? null : binding.getVariableNames(), st);
        }
        is_singleton_ = is_singleton;
        visitCode();
    }

    public SymbolTable getSymbolTable() {
           return symbol_table_;
    }

    public LabelManager getLabelManager() {
        return label_manager_;
    }

    public EnsureLabelManager getEnsureLabelManager() {
        return ensure_label_manager_;
    }

    public boolean isSingleton() {
        return is_singleton_;
    }

    public void saveCurrentVariablesOnStack() {
        Collections.reverse(current_types_on_stack_);
        for (Class c : current_types_on_stack_) {
            int v = newLocal(Type.getType(c));
            saved_vars_.add(v);
            storeLocal(v);
        }
        Collections.reverse(current_types_on_stack_);
    }

    public void restoreCurrentVariablesOnStack() {
        if (saved_vars_.isEmpty()) {
            return;
        }

        int i = newLocal(Type.getType(RubyValue.class));
        storeLocal(i);

        Collections.reverse(saved_vars_);
        for (Integer v : saved_vars_) {
            loadLocal(v);
        }
        saved_vars_.clear();

        loadLocal(i);
    }

    //Use this method if you are going to stack depth > 1 and exception may throw in the middle
    public void addCurrentVariablesOnStack(Class c) {
        current_types_on_stack_.add(c);
    }

    public void removeCurrentVariablesOnStack() {
        current_types_on_stack_.remove(current_types_on_stack_.size() - 1);
    }

    public void pushNull() {
        visitInsn(Opcodes.ACONST_NULL);
    }

    public void loadRubyLocalVariable(String name) {
        loadLocal(getSymbolTable().getLocalVariable(name));
    }

    public void storeRubyLocalVariable(String name) {
        storeLocal(getSymbolTable().getLocalVariable(name));
    }

    public void storeNewLocalVariable(String name) {
        int i = newLocal(Types.RUBY_VALUE_TYPE);
        getSymbolTable().addLocalVariable(name, i);
        storeLocal(i);
    }

    public void storeVariablesAssignedInBlock(String block_name, String[] assigned_commons, int i) {
        if (assigned_commons.length == 0) {
            return;
        }

        if (i < 0) {
            i = newLocal(Types.RUBY_BLOCK_TYPE);
            dup();
            storeLocal(i);
        }

        symbol_table_.addVariblesAssignedInBlock(block_name, i, assigned_commons);
    }

    public void returnIfBlockReturned() {
        dup();
        invokeVirtual(Types.RUBY_VALUE_TYPE,
                Method.getMethod("boolean returnedInBlock()"));
        Label after_return = new Label();
        ifZCmp(GeneratorAdapter.EQ, after_return);
        returnValue();//TODO more error checking, may not in the method context
        mark(after_return);
        /*TODO if it is going to return any way, should not not check.
          Right now the code may look like:
              if(!rubyvalue5.returnedInBlock()) goto _L2; else goto _L1
              _L1:
                      return;
              _L2:
                      return;
          */
    }

    public void store_asterisk_parameter_(Class c) {
        loadThis();
        swap();
        putField(Type.getType(c), "asterisk_parameter_", Types.RUBY_VALUE_TYPE);
    }

    public void store_block_parameter_(Class c) {
        loadThis();
        swap();
        putField(Type.getType(c), "block_parameter_", Types.RUBY_VALUE_TYPE);
    }

    public void load_asterisk_parameter_(Class c) {
        loadThis();
        getField(Type.getType(c), "asterisk_parameter_", Types.RUBY_VALUE_TYPE);
    }

    public void load_block_parameter_(Class c) {
        loadThis();
        getField(Type.getType(c), "block_parameter_", Types.RUBY_VALUE_TYPE);
    }

    public void loadBlock(boolean is_in_block) {
        if (is_in_block) {
            RubyBlock_blockOfCurrentMethod_();
        } else {
            loadCurrentBlock();
        }
    }

    public void loadMethodPrameterLength() {
        //This is only called for methods with default args
        loadArg(1);
        invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("int size()"));
    }

    public void loadCurrentScope(boolean is_in_class_builder, boolean is_in_singleton_method, boolean is_in_global_scope, boolean is_in_block) {
        if (is_in_class_builder) {
            loadCurrentClass();
        } else if (is_in_global_scope) {
            loadArg(3);
        } else {
            loadThis();
            MethodBlockBase_getScope();
        }
    }

    public void loadCurrentClass() {
        loadArg(3);
    }

    public void loadMethodArg() {
        loadArg(1);
    }

    public int saveRubyArrayAsLocalVariable() {
        int var = newLocal(Types.RUBY_ARRAY_TYPE);
        storeLocal(var);
        return var;
    }

    public int saveRubyValueAsLocalVariable() {
        int var = newLocal(Types.RUBY_VALUE_TYPE);
        storeLocal(var);
        return var;
    }

    public void catchRubyException(Label start, Label end) {
        catchException(start,
                end,
                Type.getType(RubyException.class));
    }

    public void RubyBlock_argOfCurrentMethod_() {
        loadThis();
        getField(Types.RUBY_BLOCK_TYPE, "argOfCurrentMethod_", Types.RUBY_VALUE_TYPE);
    }

    public void RubyBlock_argsOfCurrentMethod_() {
        loadThis();
        getField(Types.RUBY_BLOCK_TYPE, "argsOfCurrentMethod_", Types.RUBY_ARRAY_TYPE);
    }

    private void RubyBlock_blockOfCurrentMethod_() {
        loadThis();
        getField(Types.RUBY_BLOCK_TYPE, "blockOfCurrentMethod_", Types.RUBY_BLOCK_TYPE);
    }

    private void RubyBlock_selfOfCurrentMethod_() {
        loadThis();
        getField(Types.RUBY_BLOCK_TYPE, "selfOfCurrentMethod_", Types.RUBY_VALUE_TYPE);
    }

    public void RubyBlock__break__() {
        loadThis();
        push(true);
        putField(Types.RUBY_BLOCK_TYPE, "__break__", Type.getType(boolean.class));
    }

    public void RubyBlock__return__() {
        loadThis();
        push(true);
        putField(Types.RUBY_BLOCK_TYPE, "__return__", Type.getType(boolean.class));
    }

    public void RubyBlock__retry__() {
        loadThis();
        push(true);
        putField(Types.RUBY_BLOCK_TYPE, "__retry__", Type.getType(boolean.class));
    }

    public void RubyBlock_getCurrentMethod() {
        invokeVirtual(Types.RUBY_BLOCK_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyMethod getCurrentMethod()"));
    }

    public void loadSelf(boolean is_in_block) {
        if (is_in_block) {
            RubyBlock_selfOfCurrentMethod_();
        } else {
            loadArg(0);
        }
    }

    public void new_MethodClass(String methodName) {
        Type methodNameType = Type.getType("L" + methodName + ";");
        newInstance(methodNameType);
        dup();
        invokeConstructor(methodNameType,
                Method.getMethod("void <init> ()"));
    }

    void loadCurrentBlock() {
        loadArg(2);
    }

    public void new_BlockClass(ClassGenerator cg, String name, boolean is_in_class_builder, boolean is_in_singleton_method, boolean is_in_global_scope, boolean is_in_block) {
        Type methodNameType = Type.getType("L" + name + ";");
        newInstance(methodNameType);
        dup();

        loadSelf(is_in_block);

        cg.loadArgOfMethodForBlock();

        if (is_in_global_scope) {
            pushNull();
        } else {
            loadBlock(is_in_block);
        }

        loadCurrentScope(is_in_class_builder, is_in_singleton_method, is_in_global_scope, is_in_block);

        if (is_in_block) {
            loadThis();
            RubyBlock_getCurrentMethod();
            push(true);
        } else if (is_in_global_scope || is_in_class_builder) {
            pushNull();
            push(false);
        } else {
            loadThis();
            push(false);
        }

        invokeConstructor(methodNameType,
                Method.getMethod(ClassGeneratorForRubyBlock.buildContructorSignature()));

    }

    public void RubyArray_add(boolean is_method_call) {
        if (is_method_call) {
            invokeStatic(Type.getType(RubyAPI.class),
                    Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
        }
        invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.value.RubyArray add(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyArray_expand(boolean is_method_call) {
        if (is_method_call) {
            invokeStatic(Type.getType(RubyAPI.class),
                    Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
        }

        invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.value.RubyArray expand(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyArray_get(int index) {
        push(index);
        invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
    }

    public void RubyArray_collect(int index) {
        push(index);
        invokeVirtual(Types.RUBY_ARRAY_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue collect(int)"));
    }

    public void RubyString_append(String value) {
        push(value);
        invokeVirtual(Type.getType(RubyString.class),
                Method.getMethod("com.xruby.runtime.value.RubyString appendString(String)"));
    }

    public void RubyString_append() {
        invokeVirtual(Type.getType(RubyString.class),
                Method.getMethod("com.xruby.runtime.value.RubyString appendString(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyHash_addValue() {
        invokeVirtual(Types.RUBY_HASH_TYPE,
                Method.getMethod("com.xruby.runtime.value.RubyHash add(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
    }

    public boolean RubyRuntime_getBuiltinClass(String className) {
        if (Types.isBuiltinClass(className)) {
            getStatic(Type.getType(RubyRuntime.class),
                    className + "Class",
                    Types.RUBY_CLASS_TYPE);
            return true;
        } else {
            return false;
        }
    }

    public boolean RubyRuntime_getBuiltinModule(String name) {
        if (Types.isBuiltinModule(name)) {
            getStatic(Type.getType(RubyRuntime.class),
                    name + "Module",
                    Types.RUBY_MODULE_TYPE);
            return true;
        } else {
            return false;
        }
    }

    public void createFrequentlyUsedInteger(int value) {
        if (value >= 0 && value <= 10) {
            return;
        }

        Integer i = integer_table_.getInteger(value);
        if (null != i) {
            return;
        }

        ObjectFactory_createFixnum(value);
        int var = newLocal(Types.RUBY_VALUE_TYPE);
        storeLocal(var);
        integer_table_.addInteger(value, var);
    }

    public void ObjectFactory_createFixnum(int value) {
        if (value >= 0 && value <= 10) {
            getStatic(Type.getType(ObjectFactory.class),
                    "FIXNUM" + value,
                    Type.getType(RubyFixnum.class));
            return;
        }

        Integer i = integer_table_.getInteger(value);
        if (null != i) {
            loadLocal(i);
            return;
        }

        push(value);
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyFixnum createFixnum(int)"));
    }

    public void ObjectFactory_createFloat(double value) {
        push(value);
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyFloat createFloat(double)"));
    }

    public void ObjectFactory_createBignum(BigInteger value) {
        push(value.toString());
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyBignum createBignum(String)"));
    }

    public void ObjectFactory_createString(String value) {
        push(value);
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyString createString(String)"));
    }

    public void ObjectFactory_createString() {
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyString createString()"));
    }

    public void ObjectFactory_createRegexp(String value) {
        push(value);
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyRegexp createRegexp(String)"));
    }

    public void ObjectFactory_createRegexp() {
        invokeVirtual(Type.getType(RubyString.class),
                Method.getMethod("String toString()"));
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyRegexp createRegexp(String)"));
    }

    public void ObjectFactory_createSymbol(String value) {
        if (null != value) {
            push(value);
        } else {
            invokeVirtual(Type.getType(RubyString.class),
                Method.getMethod("String toString()"));
        }
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubySymbol createSymbol(String)"));
    }

    public void ObjectFactory_nilValue() {
        getStatic(Type.getType(ObjectFactory.class),
                "NIL_VALUE",
                Types.RUBY_VALUE_TYPE);
    }

    public void ObjectFactory_trueValue() {
        getStatic(Type.getType(ObjectFactory.class),
                "TRUE_VALUE",
                Types.RUBY_VALUE_TYPE);
    }

    public void ObjectFactory_falseValue() {
        getStatic(Type.getType(ObjectFactory.class),
                "FALSE_VALUE",
                Types.RUBY_VALUE_TYPE);
    }

    public void ObjectFactory_createArray(int size, int rhs_size, boolean has_single_asterisk) {
        push(size);
        push(rhs_size);
        push(has_single_asterisk);
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyArray createArray(int, int, boolean)"));
    }

    public void ObjectFactory_createHash() {
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyHash createHash()"));
    }

    public void ObjectFactory_createRange() {
        invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyRange createRange(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, boolean)"));
    }

    public void GlobalVatiables_set(String var) {
        if (GlobalVariables.isReadOnly(var)) {
            push(var);
            invokeStatic(Type.getType(GlobalVariables.class),
                    Method.getMethod("void throwNameError(String)"));
            return;
        }

        push(var);
        invokeStatic(Type.getType(GlobalVariables.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue set(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void GlobalVatiables_get(String var) {
        push(var);
        invokeStatic(Type.getType(GlobalVariables.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue get(String)"));
    }

    public void GlobalVariables_alias(String newName, String oldName) {
        push(newName);
        push(oldName);
        invokeStatic(Type.getType(GlobalVariables.class),
                Method.getMethod("void alias(String, String)"));
    }

    public void RubyRuntime_GlobalScope() {
        getStatic(Type.getType(RubyRuntime.class),
                "ObjectClass",
                Type.getType(RubyClass.class));
    }

    public void RubyValue_isTrue() {
        invokeVirtual(Type.getType(RubyValue.class), Method.getMethod("boolean isTrue()"));
    }

    private void loadRubyID(String s) {
        RubyIDClassGenerator.getField(this, s);
    }

    public void RubyAPI_callPublicMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callPublicNoArgMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicNoArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callPublicOneArgMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicOneArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callNoArgMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callNoArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callOneArgMethod(String methodName) {
        loadRubyID(methodName);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callOneArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyAPI_callSuperMethod() {
        loadThis();
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.MethodBlockBase)"));
    }

    public void RubyAPI_callSuperNoArgMethod() {
        loadThis();
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperNoArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.MethodBlockBase)"));
    }

    public void RubyAPI_callSuperOneArgMethod() {
        loadThis();
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperOneArgMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.MethodBlockBase)"));
    }

    public void RubyAPI_operatorNot() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue operatorNot(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_runCommandAndCaptureOutput(String command) {
        push(command);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue runCommandAndCaptureOutput(String)"));
    }

    public void RubyAPI_runCommandAndCaptureOutput() {
        invokeVirtual(Type.getType(RubyString.class),
                Method.getMethod("String toString()"));
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue runCommandAndCaptureOutput(String)"));
    }

    public void RubyAPI_testCaseEqual() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("boolean testCaseEqual(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_testExceptionType() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("boolean testExceptionType(com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyException)"));
    }

    public void RubyAPI_getSingleValue() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue getSingleValue(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_expandArrayIfThereIsZeroOrOneValue() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_expandArrayIfThereIsZeroOrOneValue2() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.value.RubyArray)"));
    }

    public void RubyAPI_expandArrayIfThereIsOnlyOneRubyArray() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.value.RubyArray expandArrayIfThereIsOnlyOneRubyArray(com.xruby.runtime.value.RubyArray)"));
    }

    public void RubyAPI_expandArrayIfThereIsOnlyOneRubyArray2() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsOnlyOneRubyArray(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_convertToArrayIfNotYet() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.value.RubyArray convertToArrayIfNotYet(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_convertRubyValue2RubyBlock() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyBlock convertRubyValue2RubyBlock(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_convertRubyException2RubyValue() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue convertRubyException2RubyValue(com.xruby.runtime.lang.RubyException)"));
    }

    public void RubyAPI_isDefinedPublicMethod(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyModule, String)"));
    }

    public void RubyAPI_isDefinedMethod(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedMethod(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyAPI_isDefinedCurrentNamespaceConstant(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedCurrentNamespaceConstant(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyAPI_isDefinedSuperMethod(String name) {
        push(name);
        loadThis();
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedSuperMethod(com.xruby.runtime.lang.RubyValue, String, com.xruby.runtime.lang.RubyMethod)"));
    }

    public void RubyAPI_isDefinedYield() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedYield(com.xruby.runtime.lang.RubyBlock)"));
    }

    public void RubyAPI_setTopLevelConstant(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue setTopLevelConstant(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyAPI_getCurrentNamespaceConstant(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue getCurrentNamespaceConstant(com.xruby.runtime.lang.RubyModule, String)"));
    }

    public void RubyAPI_getConstant(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue getConstant(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyAPI_setConstant(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue setConstant(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyAPI_callArraySet() {
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("void callArraySet(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_defineClass() {
        invokeStatic(Type.getType(RubyAPI.class),
                    Method.getMethod("com.xruby.runtime.lang.RubyClass defineClass(String, com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyModule_defineClass() {
        invokeVirtual(Type.getType(RubyModule.class),
                    Method.getMethod("com.xruby.runtime.lang.RubyClass defineClass(String, com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyAPI_defineModule(String name) {
        push(name);
        invokeStatic(Type.getType(RubyAPI.class),
                    Method.getMethod("com.xruby.runtime.lang.RubyModule defineModule(String)"));
    }

    public void RubyAPI_initializeAsteriskParameter(int argc) {
        loadArg(1);
        push(argc);
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue initializeAsteriskParameter(com.xruby.runtime.value.RubyArray, int)"));
    }

    public void RubyAPI_initializeBlockParameter() {
        this.loadCurrentBlock();
        invokeStatic(Type.getType(RubyAPI.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue initializeBlockParameter(com.xruby.runtime.lang.RubyBlock)"));
    }

    public void RubyModule_defineModule(String name) {
        push(name);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("com.xruby.runtime.lang.RubyModule defineModule(String)"));
    }

    public void RubyModule_getClassVariable(String name) {
        push(name);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue getClassVariable(String)"));
    }

    public void RubyModule_setClassVariable(String name) {
        push(name);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue setClassVariable(com.xruby.runtime.lang.RubyValue, String)"));
    }

    public void RubyModule_aliasMethod(String newName, String oldName) {
        loadCurrentClass();
        push(newName);
        push(oldName);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("void aliasMethod(String, String)"));
    }

    public void RubyModule_undefMethod(String name) {
        loadCurrentClass();
        push(name);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("void undefMethod(String)"));
    }

    public void RubyModule_defineMethod(String methodName, String uniqueMethodName) {
        push(methodName);
        new_MethodClass(uniqueMethodName);
        invokeVirtual(Type.getType(RubyModule.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue defineMethod(String, com.xruby.runtime.lang.RubyMethod)"));
    }

    public void RubyBlock_invokeNoArg(boolean is_in_block) {
        invokeVirtual(Types.RUBY_BLOCK_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyBlock_invokeOneArg(boolean is_in_block) {
        invokeVirtual(Types.RUBY_BLOCK_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
    }

    public void RubyBlock_invoke(boolean is_in_block) {
        invokeVirtual(Types.RUBY_BLOCK_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray)"));
    }

    public void checkBreakedOrReturned(boolean is_in_block) {
        int value = newLocal(Types.RUBY_VALUE_TYPE);
        storeLocal(value);

        invokeVirtual(Types.RUBY_BLOCK_TYPE,
                Method.getMethod("boolean breakedOrReturned()"));
        Label after_return = new Label();
        ifZCmp(GeneratorAdapter.EQ, after_return);
        if (is_in_block) {
            loadThis();
            push(true);
            putField(Types.RUBY_BLOCK_TYPE, "__break__", Type.getType(boolean.class));
        }
        loadLocal(value);
        returnValue();//TODO more error checking, may not in the method context
        mark(after_return);
        loadLocal(value);
    }

    public void RubyValue_getRubyClass() {
        invokeVirtual(Types.RUBY_VALUE_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
    }

    public void RubyValue_getSingletonClass() {
        invokeVirtual(Types.RUBY_VALUE_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyClass getSingletonClass()"));
    }

    public void RubyValue_getInstanceVariable(String name) {
        //push(name);
        RubyIDClassGenerator.getField(this, name);
        invokeVirtual(Types.RUBY_VALUE_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue getInstanceVariable(com.xruby.runtime.lang.RubyID)"));
    }

    public void RubyValue_setInstanceVariable(String name) {
        RubyIDClassGenerator.getField(this, name);
        //push(name);
        invokeVirtual(Types.RUBY_VALUE_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyValue setInstanceVariable(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyID)"));
    }

    private void MethodBlockBase_getScope() {
        invokeVirtual(Types.METHOD_BLOCK_BASE_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyModule getScope()"));
    }

    public void RubyProc_isDefinedInAnotherBlock() {
        invokeVirtual(Types.RUBY_PROC_TYPE,
                Method.getMethod("boolean isDefinedInAnotherBlock()"));
    }

    // For debug function

    /**
     * Write the local varirable info.
     *
     */
    public void writeLocalVariableInfo() {
        Label endLabel = mark();
        SymbolTable table = getSymbolTable();
        Map<String,Label> varRanges = table.getLocalVariableRange();

        List<String> sequence = table.getDeclarationSeq();
        for(String var: sequence) {
            Label startLabel = varRanges.get(var);
            if(startLabel != null) {
                int index = table.getLocalVariable(var);
                this.visitLocalVariable(var, "Lcom/xruby/runtime/lang/RubyValue;", null, startLabel, endLabel, index);
            }
        }
    }
}

