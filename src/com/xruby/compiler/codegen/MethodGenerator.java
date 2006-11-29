/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;


import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MethodGenerator extends GeneratorAdapter {
	
	private SymbolTable symbol_table_ = new SymbolTable();

	public MethodGenerator(final int arg0, final Method arg1, final String arg2, final Type[] arg3, final ClassVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
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
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue set(int, com.xruby.runtime.lang.RubyValue)"));
		pop();
	}

	public void storeBlockForFutureRestoreAndCheckReturned() {
		dup();
		int i = symbol_table_.getLocalVariable("block$");
		if (i < 0) {
			i = newLocal(Type.getType(Types.RubyBlockClass));
			symbol_table_.addLocalVariable("block$", i);
		}
		storeLocal(i);
	}
	
	public void restoreLocalVariableFromBlock(String blockName, String name) {
		loadLocal(getSymbolTable().getLocalVariable("block$"));
		getField(Type.getType("L" + blockName + ";"), name, Type.getType(Types.RubyValueClass));
		storeLocal(getLocalVariable(name));
	}

	public void returnIfBlockReturned() {
		int value = newLocal(Type.getType(Types.RubyValueClass));
		storeLocal(value);

		loadLocal(getSymbolTable().getLocalVariable("block$"));
	
		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("boolean returned()"));
		Label after_return = new Label();
		ifZCmp(GeneratorAdapter.EQ, after_return);
		loadLocal(value);
		returnValue();//TODO more error checking, may not in the method context
		mark(after_return);
		loadLocal(value);
	}
	
	public void load_asterisk_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "asterisk_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void load_block_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "block_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void loadMethodPrameter(int index) {
		//signatiure run(RubyValue reciever, RubyArray parameters, RubyBlock block)
		loadArg(1);
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void loadMethodPrameterLength() {
		loadArg(1);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("int size()"));
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
		putField(Type.getType(Types.RubyBlockClass), "__breaked__", Type.getType(boolean.class));
		returnValue();
	}

	public void returnFromBlock() {
		loadThis();
		push(true);
		putField(Type.getType(Types.RubyBlockClass), "__returned__", Type.getType(boolean.class));
		returnValue();
	}
	
	public int saveRubyArrayAsLocalVariable() {
		int var = newLocal(Type.getType(RubyArray.class));
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

	public void loadSelf(boolean is_in_global_scope, boolean is_in_block) {
		if (is_in_global_scope) {
			ObjectFactory_topLevelSelfValue();
		} else if (is_in_block) {
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

	public void new_BlockClass(Class c, String methodName, String[] commons, boolean is_in_global_scope, boolean is_in_block) {
		Type methodNameType = Type.getType("L" + methodName + ";");
		newInstance(methodNameType);
		dup();

		if (is_in_global_scope) {
			pushNull();
		} else if (is_in_block) {
			loadBlockOfCurrentMethod();
		} else {
			loadArg(2);
		}

		loadSelf(is_in_global_scope, is_in_block);
		
		for (String name : commons) {
			loadVariable(c, name);
		}
		
		invokeConstructor(methodNameType,
				Method.getMethod(ClassGeneratorForRubyBlock.buildContructorSignature(commons.length)));
	}
	
	public void RubyArray_add(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyAPI.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("void add(com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyArray_expand(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyAPI.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}

		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("void expand(com.xruby.runtime.lang.RubyValue)"));
	}
	
	public void RubyArray_get(int index) {
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void RubyArray_collect(int index) {
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
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
	
	public void HashValue_addValue() {
		invokeVirtual(Type.getType(RubyHash.class),
				Method.getMethod("void add(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyRuntime_getBuiltinClass(String className) {
		getStatic(Type.getType(RubyRuntime.class),
					className + "Class",
					Type.getType(Types.RubyClassClass));
	}
	
	public void ObjectFactory_createFloat(double value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.value.RubyFloat createFloat(double)"));
	}
	
	public void ObjectFactory_createFixnum(int value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createFixnum(int)"));
	}
	
	public void ObjectFactory_createInteger(String value, int radix) {
		push(value);
		push(radix);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createInteger(String,int)"));
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

	public void ObjectFactory_topLevelSelfValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"topLevelSelfValue",
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
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			putStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue set(com.xruby.runtime.lang.RubyValue, String)"));
		}
	}

	public void GlobalVatiables_get(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(String)"));
		}
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
	
	public void RubyAPI_isDefined(String name) {
		push(name);
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue isDefined(com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void RubyAPI_isDefinedSuper(String name) {
		push(name);
		loadThis();
		invokeStatic(Type.getType(RubyAPI.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue isDefinedSuper(com.xruby.runtime.lang.RubyValue, String, com.xruby.runtime.lang.RubyMethod)"));
	}
	
	public void RubyModule_defineClass(boolean isBuiltin) {
		if (isBuiltin) {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass defineBuiltInClass(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
		} else {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass defineClass(String, com.xruby.runtime.lang.RubyValue)"));
		}
	}

	public void RubyModule_defineModule() {
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyModule defineModule(String)"));
	}

	public void RubyModule_getCurrentNamespaceConstant(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getCurrentNamespaceConstant(String)"));
	}

	public void RubyModule_getTopLevelConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getTopLevelConstant(String)"));
	}

	public void RubyModule_getConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getConstant(com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void RubyModule_setConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue setConstant(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void RubyModule_setTopLevelConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue setTopLevelConstant(com.xruby.runtime.lang.RubyValue, String)"));
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
			if (!loadCurrentClass()) {
				dup();				
				invokeVirtual(Type.getType(RubyClass.class), Method.getMethod("void setAccessPrivate()"));
			}
		} else {
			RubyValue_getSingletonClass();
		}
		
		push(methodName);
		new_MethodClass(uniqueMethodName);
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineMethod(String, com.xruby.runtime.lang.RubyMethod)"));
	}
	
	public void RubyBlock_invoke() {
		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray)"));

		checkBreaked();
	}

	private void checkBreaked() {
		int value = newLocal(Type.getType(Types.RubyValueClass));
		storeLocal(value);

		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("boolean breaked()"));
		Label after_return = new Label();
		ifZCmp(GeneratorAdapter.EQ, after_return);
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
}

class MethodGeneratorForClassBuilder extends MethodGenerator {
	public MethodGeneratorForClassBuilder(int arg0, Method arg1, String arg2, Type[] arg3, ClassVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean loadCurrentClass() {
		loadArg(1);
		return true;
	}
}

