/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;


import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;

import com.xruby.newruntime.lang.*;
import com.xruby.newruntime.value.*;

class MethodGeneratorBase extends GeneratorAdapter {
	protected SymbolTable symbol_table_ = new SymbolTable();

	public MethodGeneratorBase(final int arg0, final Method arg1, final String arg2, final Type[] arg3, final ClassVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	public SymbolTable getSymbolTable() {
		return symbol_table_;
	}

	public void pushNull() {
		visitInsn(Opcodes.ACONST_NULL);
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

	public void new_RubyArray(int size, boolean notSingleAsterisk) {
		Type arrayValue = Type.getType(RubyArray.class);
		newInstance(arrayValue);
		dup();
		push(size);
		push(notSingleAsterisk);
		invokeConstructor(arrayValue,
				Method.getMethod("void <init> (int, boolean)"));
	}
	
	public void new_HashValue() {
		Type t = Type.getType(RubyHash.class);
		newInstance(t);
		dup();
		invokeConstructor(t, Method.getMethod("void <init> ()"));
		
	}
	
	public void new_RubyString() {
		Type t = Type.getType(RubyString.class);
		newInstance(t);
		dup();
		invokeConstructor(t, Method.getMethod("void <init> ()"));
	}

	public void saveBlockForFutureRestoreAndCheckReturned() {
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
				Method.getMethod("com.xruby.newruntime.lang.RubyValue set(int, com.xruby.newruntime.lang.RubyValue)"));
		pop();
	}
}

class MethodGenerator extends MethodGeneratorBase {
	
	public MethodGenerator(final int arg0, final Method arg1, final String arg2, final Type[] arg3, final ClassVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
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

	public void loadBlockOfCurrentMethod() {
		loadThis();
		getField(Type.getType(Types.RubyBlockClass), "blockOfCurrentMethod_", Type.getType(Types.RubyBlockClass));
	}

	public void new_MethodClass(String methodName) {
		Type methodNameType = Type.getType("L" + methodName + ";");
		newInstance(methodNameType);
		dup();
		invokeConstructor(methodNameType,
				Method.getMethod("void <init> ()"));
	}
		
	public void new_BlockClass(String methodName, String[] commons, boolean is_in_global_scope, boolean is_in_block) {
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
		
		for (String name : commons) {
			int i = symbol_table_.getMethodParameter(name);
			if (i >= 0) {
				loadMethodPrameter(i);
			} else {
				i = symbol_table_.getLocalVariable(name);
				assert(i >= 0);
				loadLocal(i);
			}
		}
		
		invokeConstructor(methodNameType,
				Method.getMethod(ClassGeneratorForRubyBlock.buildContructorSignature(commons.length)));
	}
	
	public void RubyArray_add(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyRuntime.class),
					Method.getMethod("com.xruby.newruntime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.newruntime.lang.RubyValue)"));
		}
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("void add(com.xruby.newruntime.lang.RubyValue)"));
	}

	public void RubyArray_expand(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(RubyRuntime.class),
					Method.getMethod("com.xruby.newruntime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.newruntime.lang.RubyValue)"));
		}

		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("void expand(com.xruby.newruntime.lang.RubyValue)"));
	}
	
	public void RubyArray_get(int index) {
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue get(int)"));
	}

	public void RubyArray_collect(int index) {
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue collect(int)"));
	}

	public void RubyString_append(String value) {
		push(value);
		invokeVirtual(Type.getType(RubyString.class),
				Method.getMethod("com.xruby.newruntime.value.RubyString appendString(String)"));
	}

	public void RubyString_append() {
		invokeVirtual(Type.getType(RubyString.class),
				Method.getMethod("com.xruby.newruntime.value.RubyString appendString(com.xruby.newruntime.lang.RubyValue)"));
	}
	
	public void HashValue_addValue() {
		invokeVirtual(Type.getType(RubyHash.class),
				Method.getMethod("void add(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue)"));
	}

	public void convert_RubyValue_to_RubyModule() {
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("Object getValue()"));
		checkCast(Type.getType(RubyModule.class));
	}

	public void convert_RubyValue_to_RubyBlock() {
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("Object getValue()"));
		checkCast(Type.getType(Types.RubyBlockClass));
	}

	private String translateName(String rubyName) {
		if (rubyName.equals("Kernel")) {
			return "KernelModule";
		}
		
		return rubyName.toLowerCase() + "Class";
	}
	
	public void RubyRuntime_getBuiltinType(String className) {
		getStatic(Type.getType(RubyRuntime.class),
					translateName(className),
					Type.getType(Types.RubyValueClass));
	}
	
	public void ObjectFactory_createFloat(double value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyFloat createFloat(double)"));
	}
	
	public void ObjectFactory_createFixnum(int value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createFixnum(int)"));
	}
	
	public void ObjectFactory_createInteger(String value, int radix) {
		push(value);
		push(radix);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createInteger(String,int)"));
	}

	public void ObjectFactory_createString(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createString(String)"));
	}

	public void ObjectFactory_createString() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createString(com.xruby.newruntime.value.RubyString)"));
	}
	
	public void ObjectFactory_createRegexp(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createRegexp(String)"));
	}

	public void ObjectFactory_createRegexp() {
		invokeVirtual(Type.getType(RubyString.class),
			Method.getMethod("String toString()"));
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createRegexp(String)"));
	}
	
	public void ObjectFactory_createSymbol(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createSymbol(String)"));
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
	
	public void ObjectFactory_createArray() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createArray(com.xruby.newruntime.value.RubyArray)"));
	}
	
	public void ObjectFactory_createHash() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue createHash(com.xruby.newruntime.value.RubyHash)"));
	}

	public void ObjectFactory_createRange() {
		invokeStatic(Type.getType(ObjectFactory.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue createRange(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue, boolean)"));
	}
	
	public void GlobalVatiables_set(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			putStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue set(com.xruby.newruntime.lang.RubyValue, String)"));
		}
	}

	public void GlobalVatiables_get(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(Types.RubyValueClass));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue get(String)"));
		}
	}

	public void loadMethodPrameter(int index) {
		//signatiure run(RubyValue reciever, RubyArray parameters, RubyBlock block)
		loadArg(1);
		push(index);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue get(int)"));
	}

	public void loadMethodPrameterLength() {
		loadArg(1);
		invokeVirtual(Type.getType(RubyArray.class),
				Method.getMethod("int size()"));
	}

	public void GlobalVatiables_alias(String newName, String oldName) {
		push(newName);
		push(oldName);
		invokeStatic(Type.getType(GlobalVariables.class),
                Method.getMethod("void alias(String, String)"));
	}

	/// @return true if in global scope
	public boolean loadCurrentClass() {
		getStatic(Type.getType(RubyRuntime.class),
			"ObjectClass",
			Type.getType(RubyClass.class));
		return false;
	}

	public void MethodCollection_aliasMethod(String newName, String oldName) {
		loadCurrentClass();
		push(newName);
		push(oldName);
		invokeVirtual(Type.getType(RubyClassModuleBase.class),
				Method.getMethod("void aliasMethod(String, String)"));
	}

	public void MethodCollection_undefMethod(String name) {
		loadCurrentClass();
		push(name);
		invokeVirtual(Type.getType(RubyClassModuleBase.class),
				Method.getMethod("void undefMethod(String)"));
	}

	public void RubyRuntime_testTrueFalse() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testTrueFalse(com.xruby.newruntime.lang.RubyValue)"));
	}

	public void RubyRuntime_GlobalScope() {
		getStatic(Type.getType(RubyRuntime.class),
					"GlobalScope",
					Type.getType(RubyModule.class));
	}

	public void RubyRuntime_callPublicMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue callPublicMethod(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.value.RubyArray, com.xruby.newruntime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_callPublicMethod_OneArgNoBlcok(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue callPublicMethod(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue, String)"));	
	}

	public void RubyRuntime_callMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue callMethod(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.value.RubyArray, com.xruby.newruntime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_callSuperMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue callSuperMethod(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.value.RubyArray, com.xruby.newruntime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_operatorNot() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue operatorNot(com.xruby.newruntime.lang.RubyValue)"));
	}

	public void RubyRuntime_runCommandAndCaptureOutput(String command) {
		push(command);
		invokeStatic(Type.getType(RubyRuntime.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue runCommandAndCaptureOutput(String)"));
	}

	public void RubyRuntime_runCommandAndCaptureOutput() {
		invokeVirtual(Type.getType(RubyString.class),
			Method.getMethod("String toString()"));
		invokeStatic(Type.getType(RubyRuntime.class),
                Method.getMethod("com.xruby.newruntime.lang.RubyValue runCommandAndCaptureOutput(String)"));
	}

	public void RubyRuntime_testCaseEqual() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testCaseEqual(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue)"));
	}

	public void RubyRuntime_testExceptionType() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testExceptionType(com.xruby.newruntime.value.RubyArray, com.xruby.newruntime.lang.RubyException)"));
	}

	public void RubyRuntime_expandArrayIfThereIsZeroOrOneValue() {
		invokeStatic(Type.getType(RubyRuntime.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.newruntime.lang.RubyValue)"));
	}

	public void RubyRuntime_expandArrayIfThereIsZeroOrOneValue2() {
		invokeStatic(Type.getType(RubyRuntime.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.newruntime.value.RubyArray)"));
	}

	public void RubyRuntime_expandArrayIfThereIsOnlyOneRubyArray() {
		invokeStatic(Type.getType(RubyRuntime.class),
			Method.getMethod("com.xruby.newruntime.value.RubyArray expandArrayIfThereIsOnlyOneRubyArray(com.xruby.newruntime.value.RubyArray)"));
	}

	public void RubyRuntime_convertToArrayIfNotYet() {
		invokeStatic(Type.getType(RubyRuntime.class),
			Method.getMethod("com.xruby.newruntime.value.RubyArray convertToArrayIfNotYet(com.xruby.newruntime.lang.RubyValue)"));
	}
	
	public void RubyModule_defineClass(boolean isBuiltin) {
		if (isBuiltin) {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue defineBuiltInClass(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue)"));
		} else {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue defineClass(String, com.xruby.newruntime.lang.RubyValue)"));
		}
	}

	public void RubyModule_defineModule() {
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue defineModule(String)"));
	}

	public void RubyModule_getCurrentNamespaceConstant(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue getCurrentNamespaceConstant(String)"));
	}

	public void RubyModule_getTopLevelConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue getTopLevelConstant(String)"));
	}

	public void RubyModule_getConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue getConstant(com.xruby.newruntime.lang.RubyValue, String)"));
	}

	public void RubyModule_setConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue setConstant(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue, String)"));
	}

	public void RubyModule_setTopLevelConstant(String name) {
		push(name);
		invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.newruntime.lang.RubyValue setTopLevelConstant(com.xruby.newruntime.lang.RubyValue, String)"));
	}

	public void RubyBlock_invoke() {
		invokeVirtual(Type.getType(Types.RubyBlockClass),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue invoke(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.value.RubyArray)"));

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

	public void MethodCollection_defineMethod(String methodName, String uniqueMethodName, boolean is_singleton_method) {
		if (!is_singleton_method) {
			if (!loadCurrentClass()) {
				dup();
				invokeVirtual(Type.getType(RubyClass.class), Method.getMethod("void setAccessPrivate()"));	
			}
		}
		
		push(methodName);
		new_MethodClass(uniqueMethodName);
		invokeVirtual(Type.getType(RubyClassModuleBase.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue defineMethod(String, com.xruby.newruntime.lang.RubyMethod)"));
	}

	public void RubyValue_getRubyClass() {
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.newruntime.lang.RubyClass getRubyClass()"));
	}

	public void RubyValue_getInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue getInstanceVariable(String)"));
	}

	public void RubyValue_setInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(Types.RubyValueClass),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue setInstanceVariable(com.xruby.newruntime.lang.RubyValue, String)"));
	}

	public void RubyModule_getClassVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue getClassVariable(String)"));
	}

	public void RubyModule_setClassVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue setClassVariable(com.xruby.newruntime.lang.RubyValue, String)"));
	}

	public void load_asterisk_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "asterisk_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void load_block_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "block_parameter_", Type.getType(Types.RubyValueClass));
	}

	public void call_initializeAsteriskParameter(Class c) {
		loadThis();
		loadArg(1);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue initializeAsteriskParameter(com.xruby.newruntime.value.RubyArray)"));

	}

	public void call_initializeBlockParameter(Class c) {
		loadThis();
		loadArg(2);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.newruntime.lang.RubyValue initializeBlockParameter(com.xruby.newruntime.lang.RubyBlock)"));
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

