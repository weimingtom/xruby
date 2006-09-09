/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;

import com.xruby.core.builtin.*;
import com.xruby.core.lang.*;

class MethodGenerator extends GeneratorAdapter {
	
	private SymbolTable symbol_table_ = new SymbolTable();

	public SymbolTable getSymbolTable() {
		return symbol_table_;
	}
	
	public MethodGenerator(final int arg0, final Method arg1, final String arg2, final Type[] arg3, final ClassVisitor arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	public void new_RubyValue_Array(int size) {
		push(size);
		newArray(Type.getType(RubyValue.class));
	}
	
	public void new_MethodClass(String methodName) {
		Type methodNameType = Type.getType("L" + methodName + ";");
		newInstance(methodNameType);
		dup();
		invokeConstructor(methodNameType,
				Method.getMethod("void <init> ()"));
	}
	
	public void new_ArrayValue(int size) {
		Type arrayValue = Type.getType(ArrayValue.class);
		newInstance(arrayValue);
		dup();
		push(size);
		invokeConstructor(arrayValue,
				Method.getMethod("void <init> (int)"));
	}
	
	public void new_HashValue() {
		Type hashValue = Type.getType(HashValue.class);
		newInstance(hashValue);
		dup();
		invokeConstructor(hashValue,
				Method.getMethod("void <init> ()"));
		
	}
	
	public void ArrayValue_addValue() {
		invokeVirtual(Type.getType(ArrayValue.class),
				Method.getMethod("void add(com.xruby.core.lang.RubyValue)"));
	}
	
	public void HashValue_addValue() {
		invokeVirtual(Type.getType(HashValue.class),
				Method.getMethod("void add(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)"));
	}
	
	public void ObjectFactory_createFloat(float value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createFloat(float)"));
	}
	
	public void ObjectFactory_createFixnum(int value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createFixnum(int)"));
	}

	public void ObjectFactory_createString(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createString(String)"));
	}
	
	public void ObjectFactory_createSymbol(String value) {
		push(value);
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createSymbol(String)"));
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
                Method.getMethod("com.xruby.core.lang.RubyValue createArray(com.xruby.core.builtin.ArrayValue)"));
	}
	
	public void ObjectFactory_createHash() {
		invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createHash(com.xruby.core.builtin.HashValue)"));
	}

	public void GlobalVatiables_set(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			putStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.core.lang.RubyValue set(com.xruby.core.lang.RubyValue, String)"));
		}
	}

	public void GlobalVatiables_get(String var) {
		String name = GlobalVariables.translatePredefined(var);
		if (null != name) {
			getStatic(Type.getType(GlobalVariables.class), name, Type.getType(RubyValue.class));
		} else {
			push(var);
			invokeStatic(Type.getType(GlobalVariables.class),
				Method.getMethod("com.xruby.core.lang.RubyValue get(String)"));
		}
	}

	public void runCommandAndCaptureOutput(String value) {
		push(value);
		invokeStatic(Type.getType(RubyRuntime.class),
                Method.getMethod("com.xruby.core.lang.RubyValue runCommandAndCaptureOutput(String)"));
	}

	public void loadMethodPrameter(int index) {
		//signatiure run(RubyValue reciever, RubyValue[] parameters, RubyBlock block)
		loadArg(1);
		push(index);
		arrayLoad(Type.getType(RubyValue.class));	
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

	/// make current class a RubyValue and save it as  a local variable
	public void saveCurrentClassAsRubyValueThenLoad(int var) {
		invokeStatic(Type.getType(ObjectFactory.class),
				Method.getMethod("com.xruby.core.lang.RubyValue createClass(com.xruby.core.lang.RubyClass)"));
		dup();
		storeLocal(var);
	}
	public void RubyClass_aliasMethod(String newName, String oldName) {
		loadCurrentClass();
		push(newName);
		push(oldName);
		invokeVirtual(Type.getType(RubyClass.class),
				Method.getMethod("void aliasMethod(String, String)"));
	}

	public void RubyClass_undefMethod(String name) {
		loadCurrentClass();
		push(name);
		invokeVirtual(Type.getType(RubyClass.class),
				Method.getMethod("void undefMethod(String)"));
	}

	public void RubyRuntime_testTrueFalse() {
		invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testTrueFalse(com.xruby.core.lang.RubyValue)"));
	}

	public void defineClass(String className, String parentClassName) {
		if (ObjectFactory.isBuiltin(parentClassName)) {
			push(className);
			getStatic(Type.getType(RubyRuntime.class),
					parentClassName + "Class",
					Type.getType(RubyClass.class));
			invokeVirtual(Type.getType(RubyModule.class),
					Method.getMethod("com.xruby.core.lang.RubyClass defineClass(String, com.xruby.core.lang.RubyClass)"));
		} else {
			push(className);
			push(parentClassName);
			invokeVirtual(Type.getType(RubyModule.class),
					Method.getMethod("com.xruby.core.lang.RubyClass defineClass(String, String)"));
		}
	}

	public void defineMethod(String methodName, String uniqueMethodName) {
		if (!loadCurrentClass()) {
			dup();
			invokeVirtual(Type.getType(RubyClass.class), Method.getMethod("void setAccessPrivate()"));	
		}
		
		push(methodName);
		new_MethodClass(uniqueMethodName);
		invokeVirtual(Type.getType(RubyClass.class),
				Method.getMethod("com.xruby.core.lang.RubyValue defineMethod(String, com.xruby.core.lang.RubyMethod)"));
	}

	public void load_asterisk_parameter_(Class c) {
		loadThis();
		getField(Type.getType(c), "asterisk_parameter_", Type.getType(RubyValue.class));
	}

	public void call_initializeAsteriskParameter(Class c) {
		loadThis();
		loadArg(1);
		invokeVirtual(Type.getType(c),
				Method.getMethod("com.xruby.core.lang.RubyValue initializeAsteriskParameter(com.xruby.core.lang.RubyValue[])"));

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

