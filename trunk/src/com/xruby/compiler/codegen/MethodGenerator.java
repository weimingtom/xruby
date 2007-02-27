/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import java.math.BigInteger;
import java.util.*;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MethodGenerator extends GeneratorAdapter {
	
	private SymbolTable symbol_table_;
	private ArrayList<Class> current_types_on_stack_ = new ArrayList<Class>();
	private ArrayList<Integer> saved_vars_ = new ArrayList<Integer>();//may be have same length of current_types_on_stack_

	public MethodGenerator(final int arg0, final Method arg1, final ClassVisitor cv, RubyBinding binding, SymbolTable st) {
		super(arg0, arg1, null, null, cv);
		if (null == st) { 
			symbol_table_ = new SymbolTable(null == binding ? null : binding.getVariableNames());
		} else {
			symbol_table_ = new SymbolTableForBlock(null == binding ? null : binding.getVariableNames(), st);
		}
		visitCode();
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

	public SymbolTable getSymbolTable() {
		return symbol_table_;
	}

	public void pushNull() {
		visitInsn(Opcodes.ACONST_NULL);
	}
	
	public int getLocalVariable(String name) {
		int i = getSymbolTable().getLocalVariable(name);
		if (i >= 0) {
			return i;
		}

		return getNewLocalVariable(name);
	}

	public int getNewLocalVariable(String name) {
		int i = newLocal(Type.getType(Types.RubyValueClass));
		getSymbolTable().addLocalVariable(name, i);
		return i;
	}

	public void storeParameter(int index) {
		int i = newLocal(Type.getType(Types.RubyValueClass));
		storeLocal(i);
		loadArg(1);
		push(index);
		loadLocal(i);
		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue set(int, com.xruby.runtime.lang.RubyValue)"));
		pop();
	}

	public void storeBlockForFutureRestoreAndCheckReturned() {
		dup();
		int i = symbol_table_.getInternalBlockVar();
		if (i < 0) {
			i = newLocal(Type.getType(Types.RubyBlockClass));
			symbol_table_.setInternalBlockVar(i);
		}
		storeLocal(i);
	}

	public void returnIfBlockReturned() {
		dup();	
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("boolean returnedInBlock()"));
		Label after_return = new Label();
		ifZCmp(GeneratorAdapter.EQ, after_return);
		returnValue();//TODO more error checking, may not in the method context
		mark(after_return);
	}
	
	public void load_asterisk_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "asterisk_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void load_block_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "block_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void loadBlock(boolean is_in_block) {
		if (is_in_block) {
			loadBlockOfCurrentMethod();
		} else {
			loadArg(2);
		}
	}

	public void loadMethodPrameter(int index) {
		//signatiure run(RubyValue reciever, RubyArray parameters, RubyBlock block)
		loadArg(1);
		push(index);
		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void loadMethodPrameterLength() {
		loadArg(1);
		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("int size()"));
	}

	public void loadCurrentClass(boolean isInClassBuilder, boolean isInSingletonMethod, boolean isInGlobalScope, boolean isInBlock) {
		if (isInClassBuilder) {
			loadCurrentClass();
		} else if (isInSingletonMethod) {
			loadSelf(isInBlock);
			checkCast(Type.getType(Types.RubyClassClass));
		} else if (isInGlobalScope) {
			loadArg(3);
		} else {
			loadThis();
			RubyMethod_getOwner();
		}
	}

	/// @return true if in global scope
	public boolean loadCurrentClass() {
		getStatic(Type.getType(RubyRuntime.class),
			"ObjectClass",
			Type.getType(RubyClass.class));
		return false;
	}
	
	public void call_initializeAsteriskParameter(Class c) {
		loadThis();
		loadArg(1);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.runtime.lang.RubyValue initializeAsteriskParameter(com.xruby.runtime.value.RubyArray)"));

	}

	public void call_initializeBlockParameter(Class c) {
		loadThis();
		loadArg(2);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.runtime.lang.RubyValue initializeBlockParameter(com.xruby.runtime.lang.RubyBlock)"));
	}

	public void breakFromBlock() {
		loadThis();
		push(true);
		putField(Type.getType(Types.RubyBlockClass), "__break__", Type.getType(boolean.class));
		returnValue();
	}

	public void returnFromBlock() {
		loadThis();
		push(true);
		putField(Type.getType(Types.RubyBlockClass), "__return__", Type.getType(boolean.class));
		returnValue();
	}

	public void redoFromBlock() {
		loadThis();
		push(true);
		putField(Type.getType(Types.RubyBlockClass), "__redo__", Type.getType(boolean.class));
		returnValue();
	}
	
	public int saveRubyArrayAsLocalVariable() {
		int var = newLocal(Type.getType(Types.RubyArrayClass));
		storeLocal(var);
		return var;
	}

	public int saveRubyValueAsLocalVariable() {
		int var = newLocal(Type.getType(Types.RubyValueClass));
		storeLocal(var);
		return var;
	}
	
	public void catchRubyException(Label start, Label end) {
		catchException(start,
				end,
				Type.getType(RubyException.class));
	}

	public void loadBlockOfCurrentMethod() {
		loadThis();
		getField(Type.getType(Types.RubyBlockClass), "blockOfCurrentMethod_", Type.getType(Types.RubyBlockClass));
	}

	public void loadSelfOfCurrentMethod() {
		loadThis();
		getField(Type.getType(Types.RubyBlockClass), "selfOfCurrentMethod_", Type.getType(Types.RubyValueClass));
	}

	public void storeVariable(String name) {
		int i = getSymbolTable().getLocalVariable(name);
		if (i >= 0) {
			storeLocal(i);
			return;
		} 

		int index = getSymbolTable().getMethodParameter(name);
		if (index >= 0) {
			storeParameter(index);
			return;
		}

		storeLocal(getNewLocalVariable(name));
	}
	
	public void loadVariable(Class c, String name) {
		//check if this is local variable
		if (getSymbolTable().getLocalVariable(name) >= 0) {
			loadLocal(getLocalVariable(name));
			return;
		}
		
		// check if this is asterisk method parameter
		// Actually we do not have to have the following code block: we can move initializeAsteriskParameter
		// to the RubyMethod.initializeAsteriskParameter method so that it is always called. And may be we should
		// -- this will make code generation simpler. But doing it here has a little advantage (optimazation): if the
		//asterisk parameter is not used, we can avoid calling initializeAsteriskParameter().
		int asterisk_parameter_access_counter = getSymbolTable().getMethodAsteriskParameter(name);
		if (0 == asterisk_parameter_access_counter) {
			call_initializeAsteriskParameter(c);
			return;
		} else if (asterisk_parameter_access_counter > 0) {
			load_asterisk_parameter_(c);
			return;
		}

		int block_parameter_access_counter = getSymbolTable().getMethodBlockParameter(name);
		if (0 == block_parameter_access_counter) {
			call_initializeBlockParameter(c);
			return;
		} else if (block_parameter_access_counter > 0) {
			load_block_parameter_(c);
			return;
		}
		
		//check if this is normal method parameter
		int index = getSymbolTable().getMethodParameter(name);
		if (index >= 0) {
			loadMethodPrameter(index);
			return;
		}
		
		// never used, for example a = a + 1
		ObjectFactory_nilValue();
	}

	public void loadSelf(boolean is_in_block) {
		if (is_in_block) {
			loadSelfOfCurrentMethod();
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

	public void new_BlockClass(ClassGenerator cg, String methodName, String[] commons, boolean is_in_global_scope, boolean is_in_block) {
		Type methodNameType = Type.getType("L" + methodName + ";");
		newInstance(methodNameType);
		dup();

		if (is_in_global_scope) {
			pushNull();
		} else if (is_in_block) {
			loadBlockOfCurrentMethod();
		} else {
			loadCurrentBlock();
		}

		loadSelf(is_in_block);

		if (is_in_block) {
			loadThis();
		} else {
			pushNull();
		}
		
		for (String name : commons) {
			cg.loadVariable(name);
		}
		
		invokeConstructor(methodNameType,
				Method.getMethod(ClassGeneratorForRubyBlock.buildContructorSignature(commons.length)));
	}
	
	public void RubyArray_add(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyAPI.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}
		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("com.xruby.runtime.value.RubyArray add(com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyArray_expand(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyAPI.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}

		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("com.xruby.runtime.value.RubyArray expand(com.xruby.runtime.lang.RubyValue)"));
	}
	
	public void RubyArray_get(int index) {
		push(index);
		invokeVirtual(Type.getType(Types.RubyArrayClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void RubyArray_collect(int index) {
		push(index);
		invokeVirtual(Type.getType(Types.RubyArrayClass),
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
		invokeVirtual(Type.getType(Types.RubyHashClass),
				Method.getMethod("com.xruby.runtime.value.RubyHash add(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
	}

	public boolean RubyRuntime_getBuiltinClass(String className) {
		if (RubyRuntime.isBuiltinClass(className)) {
			getStatic(Type.getType(RubyRuntime.class),
					className + "Class",
					Type.getType(Types.RubyClassClass));
			return true;
		} else {
			return false;
		}
	}

	public boolean RubyRuntime_getBuiltinModule(String name) {
		if (RubyRuntime.isBuiltinModule(name)) {
			getStatic(Type.getType(RubyRuntime.class),
					name + "Module",
					Type.getType(Types.RubyModuleClass));
			return true;
		} else {
			return false;
		}
	}
	
	public void ObjectFactory_createFloat(double value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyFloat createFloat(double)"));
	}

	public void ObjectFactory_createFixnum(int value) {
		if (value >=0 && value <= 10) {
			getStatic(Type.getType(ObjectFactory.class),
				"fixnum" + value,
				Type.getType(RubyFixnum.class));
		} else {
			push(value);
			invokeStatic(Type.getType(ObjectFactory.class),
	                Method.getMethod("com.xruby.runtime.value.RubyFixnum createFixnum(int)"));
		}
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
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubySymbol createSymbol(String)"));
	}
	
	public void ObjectFactory_nilValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"nilValue",
				Type.getType(Types.RubyValueClass));
	}
	
	public void ObjectFactory_trueValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"trueValue",
				Type.getType(Types.RubyValueClass));
	}
	
	public void ObjectFactory_falseValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"falseValue",
				Type.getType(Types.RubyValueClass));
	}

	public void ObjectFactory_createArray(int size, boolean notSingleAsterisk) {
		push(size);
		push(notSingleAsterisk);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyArray createArray(int, boolean)"));
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
					"GlobalScope",
					Type.getType(RubyModule.class));
	}

	public void RubyAPI_testTrueFalse() {
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("boolean testTrueFalse(com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyAPI_callPublicMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void RubyAPI_callPublicMethod_OneArgNoBlcok(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));	
	}

	public void RubyAPI_callMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void RubyAPI_callMethod_OneArgNoBlcok(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void RubyAPI_callSuperMethod(String methodName) {
		push(methodName);
		loadThis();
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, String, com.xruby.runtime.lang.RubyMethod)"));
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
	
	public void RubyModule_defineClass(String className) {
		if (RubyRuntime.isBuiltinClass(className)) {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass defineBuiltInClass(com.xruby.runtime.lang.RubyClass, com.xruby.runtime.lang.RubyValue)"));
		} else {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass defineClass(String, com.xruby.runtime.lang.RubyValue)"));
		}
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
	
	public void RubyModule_defineMethod(String methodName, String uniqueMethodName, boolean is_singleton_method) {
		if (!is_singleton_method) {
			loadCurrentClass();
		} else {
			RubyValue_getSingletonClass();
		}
		
		push(methodName);
		new_MethodClass(uniqueMethodName);
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineMethod(String, com.xruby.runtime.lang.RubyMethod)"));
	}
	
	public void RubyBlock_invoke(boolean is_in_block) {
		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray)"));
	}

	public void checkBreakedOrReturned(boolean is_in_block) {
		int value = newLocal(Type.getType(Types.RubyValueClass));
		storeLocal(value);

		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("boolean breakedOrReturned()"));
		Label after_return = new Label();
		ifZCmp(GeneratorAdapter.EQ, after_return);
		if (is_in_block) {
			loadThis();
			push(true);
			putField(Type.getType(Types.RubyBlockClass), "__break__", Type.getType(boolean.class));
		}
		loadLocal(value);
		returnValue();//TODO more error checking, may not in the method context
		mark(after_return);
		loadLocal(value);
	}

	public void RubyValue_getRubyClass() {
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
	}
	
	public void RubyValue_getSingletonClass() {
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.runtime.lang.RubyClass getSingletonClass()"));
	}

	public void RubyValue_getInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue getInstanceVariable(String)"));
	}

	public void RubyValue_setInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue setInstanceVariable(com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void RubyMethod_getOwner() {
		invokeVirtual(Type.getType(Types.RubyMethodClass),
				Method.getMethod("com.xruby.runtime.lang.RubyModule getOwner()"));
	}

	public void RubyProc_isDefinedInAnotherBlock() {
		invokeVirtual(Type.getType(Types.RubyProcClass),
				Method.getMethod("boolean isDefinedInAnotherBlock()"));
	}
}

class MethodGeneratorForClassBuilder extends MethodGenerator {
	private boolean is_singleton_;
	
	public MethodGeneratorForClassBuilder(int arg0, Method arg1, ClassVisitor cv, boolean is_singleton) {
		super(arg0, arg1, cv, null, null);
		is_singleton_ = is_singleton;
	}

	boolean isSingleton() {
		return is_singleton_;
	}

	public boolean loadCurrentClass() {
		loadArg(1);
		return true;
	}

	void loadCurrentBlock() {
		pushNull();
	}
}

