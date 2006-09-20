/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import java.util.*;
import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class SymbolTable {
	private final Map<String, Integer> local_variables_ = new HashMap<String, Integer>();
	private final ArrayList<String> method_parameters_ = new ArrayList<String>();
	private String asterisk_parameters_ = null;
	private int access_counter_ = 0;
	
	public void addLocalVariable(String name, int i) {
		local_variables_.put(name, i);
	}
	
	public Integer getLocalVariable(String name) {
		return local_variables_.get(name);
	}
	
	public void addMethodParameters(String name) {
		method_parameters_.add(name);
	}

	public void setMethodAsteriskParameters(String name) {
		assert(null == asterisk_parameters_);
		asterisk_parameters_ = name;
	}
	
	public int getMethodParameter(String name) {
		return method_parameters_.indexOf(name);
	}

	public int getMethodAsteriskParameter(String name) {
		if (null == asterisk_parameters_) {
			return -1;
		} else if (!asterisk_parameters_.equals(name)) {
			return -1;
		} else {
			return access_counter_++;
		}
	}
}

abstract class ClassGenerator {
	
	protected final ClassWriter cw_ = new ClassWriter(true);
	protected final String name_;
	protected MethodGenerator mg_for_run_method_ = null;
	private MethodGenerator mg_for_class_builder_method_ = null;//TODO should be a queue

	private SymbolTable getSymbolTable() {
		return getMethodGeneratorForRunMethod().getSymbolTable();
	}

	public boolean isInClassBuilder() {
		if (null != mg_for_class_builder_method_) {
			return true;
		} else {
			return false;
		}
	}
	
	public void startClassBuilderMethod(String name) {
		mg_for_class_builder_method_ = new MethodGeneratorForClassBuilder(
				Opcodes.ACC_PRIVATE,
				Method.getMethod("com.xruby.core.lang.RubyValue " + name + "(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyClass)"),
				null,
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	public void endClassBuilderMethod(boolean last_statement_has_return_value) {
		if (last_statement_has_return_value) {
			mg_for_class_builder_method_.pop();
		}

		mg_for_class_builder_method_.loadArg(0);
		mg_for_class_builder_method_.returnValue();

		mg_for_class_builder_method_.endMethod();
		mg_for_class_builder_method_ = null;
	}

	public void callClassBuilderMethod(String name) {
		mg_for_run_method_.invokeConstructor(Type.getType("L" + name_ + ";"), 
			Method.getMethod("com.xruby.core.lang.RubyValue " + name + "(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyClass)"));
	}

	protected ClassGenerator(String name) {
		name_ = name;
	}
	
	public void addParameter(String name) {
		getSymbolTable().addMethodParameters(name);
	}

	public void setAsteriskParameter(String name) {
		getSymbolTable().setMethodAsteriskParameters(name);
	}
	
	public void visitEnd() {
		cw_.visitEnd();
	}

	public int getAnonymousLocalVariable() {
		return getMethodGeneratorForRunMethod().newLocal(Type.getType(RubyValue.class));
	}
	
	abstract protected Class getType();
	
	public void loadVariable(String name) {
		//quick access for builtin
		if (ObjectFactory.isBuiltin(name)) {
			getMethodGeneratorForRunMethod().getStatic(Type.getType(ObjectFactory.class),
					name + "ClassValue",
					Type.getType(RubyValue.class));
			return;
		}

		// check if this is asterisk method parameter
		int access_counter = getSymbolTable().getMethodAsteriskParameter(name);
		if (0 == access_counter) {
			getMethodGeneratorForRunMethod().call_initializeAsteriskParameter(getType());
			return;
		} else if (access_counter > 0) {
			getMethodGeneratorForRunMethod().load_asterisk_parameter_(getType());
			return;
		}
		
		//check if this is normal method parameter
		int index = getSymbolTable().getMethodParameter(name);
		if (index >= 0) {
			getMethodGeneratorForRunMethod().loadMethodPrameter(index);
			return;
		}
		
		//now it must be local variable
		if (getSymbolTable().getLocalVariable(name) == null) {
			getMethodGeneratorForRunMethod().ObjectFactory_nilValue();// never used, for example a = a + 1
		} else {
			getMethodGeneratorForRunMethod().loadLocal(getLocalVariable(name));
		}
		return;
	}
	
	public int getLocalVariable(String name) {
		Integer r = getSymbolTable().getLocalVariable(name);
		if (null != r) {
			return r;
		}

		int i = getMethodGeneratorForRunMethod().newLocal(Type.getType(RubyValue.class));
		getSymbolTable().addLocalVariable(name, i);
		return i;
	}
	
	public MethodGenerator getMethodGeneratorForRunMethod() {
		if (null != mg_for_class_builder_method_) {
			return mg_for_class_builder_method_;
		} else {
			return mg_for_run_method_;
		}
	}
	
	public CompilationResult getCompilationResult() {
		return new CompilationResult(name_, cw_.toByteArray());
	}

	protected void createImplicitConstructor(ClassWriter cw) {
		Method m = Method.getMethod("void <init> ()");
		GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PUBLIC,
				m,
				null,
				null,
				cw);
		mg.loadThis();
		mg.invokeConstructor(Type.getType(Object.class), m);
		mg.returnValue();
		mg.endMethod();
	}
}

class ClassGeneratorForRubyProgram extends ClassGenerator {
	public ClassGeneratorForRubyProgram(String name) {
		super(name);
		mg_for_run_method_ = visitRubyProgram();
	}
	
	protected Class getType() {
		assert(false);
		return null;
	}

	private MethodGenerator visitRubyProgram() {
		cw_.visit(Opcodes.V1_5,
				Opcodes.ACC_PUBLIC,
				name_,
				null,										// signature
				"java/lang/Object",							// superName
				new String[] { "com/xruby/core/lang/RubyProgram" }	// interface
				);

		createImplicitConstructor(cw_);
		createStaticVoidMain(cw_);
		
		//Implement RubyProgram
		return new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("com.xruby.core.lang.RubyValue run()"),
				null,// signature
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	private void createStaticVoidMain(ClassWriter cw) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
				Method.getMethod("void main (String[])"),
				null,
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw);

		Type program = Type.getType("L" + name_ + ";");
		mg.newInstance(program);
		mg.dup();
		mg.invokeConstructor(program,
				Method.getMethod("void <init> ()"));
		mg.invokeVirtual(program,
				Method.getMethod("com.xruby.core.lang.RubyValue run()"));
		mg.pop();
		
		mg.returnValue();
		mg.endMethod();
	}
	
}

class ClassGeneratorForRubyMethod extends ClassGenerator {
	public ClassGeneratorForRubyMethod(String name, int argc, boolean has_asterisk_parameter) {
		super(name);
		mg_for_run_method_ = visitRubyMethod(argc, has_asterisk_parameter);
	}
	
	protected Class getType() {
		return RubyMethod.class;
	}

	private MethodGenerator visitRubyMethod(int argc, boolean has_asterisk_parameter) {
		cw_.visit(Opcodes.V1_5,
				0,		//No modifier
				name_,	
				null,								// signature
				"com/xruby/core/lang/RubyMethod",	// superName
				null								// interface
				);
		
		createConstructorOfRubyMethod(argc, has_asterisk_parameter);
		
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.core.lang.RubyValue run(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock)"),
				null,// signature
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	private void createConstructorOfRubyMethod(int argc, boolean has_asterisk_parameter) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("void <init> ()"),
				null,
				null,
				cw_);
		mg.loadThis();
		mg.push(argc);
		mg.push(has_asterisk_parameter);
		mg.invokeConstructor(Type.getType(RubyMethod.class),
						Method.getMethod("void <init> (int, boolean)"));
		mg.returnValue();
		mg.endMethod();
	}
}

class ClassGeneratorForRubyBlock extends ClassGenerator {
	public ClassGeneratorForRubyBlock(String name, int argc, boolean has_asterisk_parameter) {
		super(name);
		mg_for_run_method_ = visitRubyBlock(argc, has_asterisk_parameter);
	}
	
	protected Class getType() {
		return RubyBlock.class;
	}

	private MethodGenerator visitRubyBlock(int argc, boolean has_asterisk_parameter) {
		cw_.visit(Opcodes.V1_5,
				0,		//No modifier
				name_,	
				null,								// signature
				"com/xruby/core/lang/RubyBlock",	// superName
				null								// interface
				);
		
		createConstructorOfRubyBlock(argc, has_asterisk_parameter);
		
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.core.lang.RubyValue run(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue)"),
				null,// signature
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	private void createConstructorOfRubyBlock(int argc, boolean has_asterisk_parameter) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("void <init> ()"),
				null,
				null,
				cw_);
		mg.loadThis();
		mg.push(argc);
		mg.push(has_asterisk_parameter);
		mg.invokeConstructor(Type.getType(RubyBlock.class),
						Method.getMethod("void <init> (int, boolean)"));
		mg.returnValue();
		mg.endMethod();
	}
}

