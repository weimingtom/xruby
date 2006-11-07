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
	
	public void saveBlockForFutureRestore() {
		dup();
		int i = symbol_table_.getLocalVariable("block$");
		if (i < 0) {
			i = newLocal(Type.getType(RubyBlock.class));
			symbol_table_.addLocalVariable("block$", i);
		}
		storeLocal(i);
	}

	public int getLocalVariable(String name) {
		int i = getSymbolTable().getLocalVariable(name);
		if (i >= 0) {
			return i;
		}

		i = newLocal(Type.getType(RubyValue.class));
		getSymbolTable().addLocalVariable(name, i);
		return i;
	}

	public void restoreLocalVariableFromBlock(String blockName, String name) {
		loadLocal(getSymbolTable().getLocalVariable("block$"));
		getField(Type.getType("L" + blockName + ";"), name, Type.getType(RubyValue.class));
		storeLocal(getLocalVariable(name));
	}

	public void new_MethodClass(String methodName) {
		Type methodNameType = Type.getType("L" + methodName + ";");
		newInstance(methodNameType);
		dup();
		invokeConstructor(methodNameType,
				Method.getMethod("void <init> ()"));
	}

	public void loadBlockOfCurrentMethod() {
		loadThis();
		getField(Type.getType(RubyBlock.class), "blockOfCurrentMethod_", Type.getType(RubyBlock.class));
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
	
	public void new_ArrayValue(int size, boolean notSingleAsterisk) {
		Type arrayValue = Type.getType(ArrayValue.class);
		newInstance(arrayValue);
		dup();
		push(size);
		push(notSingleAsterisk);
		invokeConstructor(arrayValue,
				Method.getMethod("void <init> (int, boolean)"));
	}
	
	public void new_HashValue() {
		Type t = Type.getType(HashValue.class);
		newInstance(t);
		dup();
		invokeConstructor(t, Method.getMethod("void <init> ()"));
		
	}
	
	public void new_StringValue() {
		Type t = Type.getType(StringValue.class);
		newInstance(t);
		dup();
		invokeConstructor(t, Method.getMethod("void <init> ()"));
	}
	
	public void ArrayValue_add(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}
		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("void add(com.xruby.runtime.lang.RubyValue)"));
	}

	public void ArrayValue_expand(boolean is_method_call) {
		if (is_method_call) {
			invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
		}

		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("void expand(com.xruby.runtime.lang.RubyValue)"));
	}
	
	public void ArrayValue_get(int index) {
		push(index);
		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void ArrayValue_collect(int index) {
		push(index);
		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue collect(int)"));
	}

	public void ArrayValue_expandArrayIfThereIsZeroOrOneValue() {
		invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.lang.RubyValue)"));
	}
	
	public void StringValue_append(String value) {
		push(value);
		invokeVirtual(Type.getType(StringValue.class),
				Method.getMethod("com.xruby.runtime.value.StringValue appendString(String)"));
	}

	public void StringValue_append() {
		invokeVirtual(Type.getType(StringValue.class),
				Method.getMethod("com.xruby.runtime.value.StringValue appendString(com.xruby.runtime.lang.RubyValue)"));
	}
	
	public void HashValue_addValue() {
		invokeVirtual(Type.getType(HashValue.class),
				Method.getMethod("void add(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
	}

	public void convert_RubyValue_to_RubyModule() {
		invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("Object getValue()"));
		checkCast(Type.getType(RubyModule.class));
	}

	public void convert_RubyValue_to_RubyBlock() {
		invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("Object getValue()"));
		checkCast(Type.getType(RubyBlock.class));
	}

	public void ObjectFactory_getBuiltinClass(String className) {
		getStatic(Type.getType(ObjectFactory.class),
					className + "ClassValue",
					Type.getType(RubyValue.class));
	}
	
	public void ObjectFactory_createFloat(double value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createFloat(double)"));
	}
	
	public void ObjectFactory_createFixnum(int value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createFixnum(int)"));
	}

	public void ObjectFactory_createString(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createString(String)"));
	}

	public void ObjectFactory_createString() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createString(com.xruby.runtime.value.StringValue)"));
	}
	
	public void ObjectFactory_createRegexp(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createRegexp(String)"));
	}

	public void ObjectFactory_createRegexp() {
		invokeVirtual(Type.getType(StringValue.class),
			Method.getMethod("String toString()"));
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createRegexp(String)"));
	}
	
	public void ObjectFactory_createSymbol(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createSymbol(String)"));
	}
	
	public void ObjectFactory_nilValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"nilValue",
				Type.getType(RubyValue.class));
	}

	public void ObjectFactory_topLevelSelfValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"topLevelSelfValue",
				Type.getType(RubyValue.class));
	}
	
	public void ObjectFactory_trueValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"trueValue",
				Type.getType(RubyValue.class));
	}
	
	public void ObjectFactory_falseValue() {
		getStatic(Type.getType(ObjectFactory.class),
				"falseValue",
				Type.getType(RubyValue.class));
	}
	
	public void ObjectFactory_createArray() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createArray(com.xruby.runtime.value.ArrayValue)"));
	}
	
	public void ObjectFactory_createHash() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue createHash(com.xruby.runtime.value.HashValue)"));
	}

	public void GlobalVatiables_set(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			putStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue set(com.xruby.runtime.lang.RubyValue, String)"));
		}
	}

	public void GlobalVatiables_get(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(String)"));
		}
	}

	public void loadMethodPrameter(int index) {
		//signatiure run(RubyValue reciever, ArrayValue parameters, RubyBlock block)
		loadArg(1);
		push(index);
		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue get(int)"));
	}

	public void loadMethodPrameterLength() {
		loadArg(1);
		invokeVirtual(Type.getType(ArrayValue.class),
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
		invokeVirtual(Type.getType(MethodCollection.class),
				Method.getMethod("void aliasMethod(String, String)"));
	}

	public void MethodCollection_undefMethod(String name) {
		loadCurrentClass();
		push(name);
		invokeVirtual(Type.getType(MethodCollection.class),
				Method.getMethod("void undefMethod(String)"));
	}

	public void RubyRuntime_testTrueFalse() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testTrueFalse(com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyRuntime_GlobalScope() {
		getStatic(Type.getType(RubyRuntime.class),
					"GlobalScope",
					Type.getType(RubyModule.class));
	}

	public void RubyRuntime_callPublicMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_callPublicMethod_OneArgNoBlcok(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callPublicMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));	
	}

	public void RubyRuntime_callMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_callSuperMethod(String methodName) {
		push(methodName);
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void RubyRuntime_operatorNot() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue operatorNot(com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyRuntime_runCommandAndCaptureOutput(String command) {
		push(command);
		invokeStatic(Type.getType(RubyRuntime.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue runCommandAndCaptureOutput(String)"));
	}

	public void RubyRuntime_runCommandAndCaptureOutput() {
		invokeVirtual(Type.getType(StringValue.class),
			Method.getMethod("String toString()"));
		invokeStatic(Type.getType(RubyRuntime.class),
                Method.getMethod("com.xruby.runtime.lang.RubyValue runCommandAndCaptureOutput(String)"));
	}

	public void RubyRuntime_testCaseEqual() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testCaseEqual(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
	}

	public void RubyRuntime_testExceptionType() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testExceptionType(com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyException)"));
	}

	public void RubyModule_defineClass(boolean isBuiltin) {
		if (isBuiltin) {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineBuiltInClass(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
		} else {
			invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineClass(String, com.xruby.runtime.lang.RubyValue)"));
		}
	}

	public void RubyModule_defineModule() {
		invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineModule(String)"));
	}

	public void RubyBlock_invoke() {
		invokeVirtual(Type.getType(RubyBlock.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue)"));

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
		invokeVirtual(Type.getType(MethodCollection.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue defineMethod(String, com.xruby.runtime.lang.RubyMethod)"));
	}

	public void RubyValue_getRubyClass() {
		invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
	}

	public void RubyValue_getInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue getInstanceVariable(String)"));
	}

	public void RubyValue_setInstanceVariable(String name) {
		push(name);
		invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue setInstanceVariable(com.xruby.runtime.lang.RubyValue, String)"));
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

	public void load_asterisk_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "asterisk_parameter_", Type.getType(RubyValue.class));
	}

	public void load_block_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "block_parameter_", Type.getType(RubyValue.class));
	}

	public void call_initializeAsteriskParameter(Class c) {
		loadThis();
		loadArg(1);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.runtime.lang.RubyValue initializeAsteriskParameter(com.xruby.runtime.value.ArrayValue)"));

	}

	public void call_initializeBlockParameter(Class c) {
		loadThis();
		loadArg(2);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.runtime.lang.RubyValue initializeBlockParameter(com.xruby.runtime.lang.RubyBlock)"));
	}

	public void breakBlock() {
		putField(Type.getType(RubyBlock.class), "breakValue_", Type.getType(RubyValue.class));
		pushNull();
		returnValue();
	}

	public void ObjectFactory_createRange() {
		invokeStatic(Type.getType(ObjectFactory.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue createRange(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, boolean)"));
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

