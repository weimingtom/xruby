/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import java.util.*;

abstract class ClassGenerator {
	
	protected final ClassWriter cw_ = new ClassWriter(true);
	protected final String name_;
	protected MethodGenerator mg_for_run_method_ = null;
	private Stack<MethodGenerator> suspended_mgs_for_class_builder_method_ = new Stack<MethodGenerator>();
	private MethodGenerator current_mg_for_class_builder_method_ = null;//TODO should be a queue

	protected ClassGenerator(String name) {
		name_ = name;
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

	public void storeVariable(String name) {
		int i = getSymbolTable().getLocalVariable(name);
		if (i >= 0) {
			getMethodGenerator().storeLocal(i);
			return;
		} 

		int index = getSymbolTable().getMethodParameter(name);
		if (index >= 0) {
			getMethodGenerator().storeParameter(index);
			return;
		}

		getMethodGenerator().storeLocal(getMethodGenerator().getNewLocalVariable(name));
	}
	
	public void startClassBuilderMethod(String name) {
		if (null != current_mg_for_class_builder_method_) {
			suspended_mgs_for_class_builder_method_.push(current_mg_for_class_builder_method_);
		}

		current_mg_for_class_builder_method_ = new MethodGeneratorForClassBuilder(
				Opcodes.ACC_PRIVATE,
				Method.getMethod("com.xruby.runtime.lang.RubyValue " + name + "(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyModule)"),
				null,
				null,
				cw_);
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
			Method.getMethod("com.xruby.runtime.lang.RubyValue " + name + "(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyModule)"));
	}

	public void addParameter(String name) {
		getSymbolTable().addMethodParameter(name);
	}

	public void setAsteriskParameter(String name) {
		getSymbolTable().setMethodAsteriskParameter(name);
	}

	public void setBlockParameter(String name) {
		getSymbolTable().setMethodBlockParameter(name);
	}
	
	public void visitEnd() {
		cw_.visitEnd();
	}

	public int getAnonymousLocalVariable() {
		return getMethodGenerator().newLocal(Type.getType(Types.RubyValueClass));
	}
	
	abstract protected Class getType();
	
	public void loadVariable(String name) {
		//check if this is local variable
		if (getSymbolTable().getLocalVariable(name) >= 0) {
			getMethodGenerator().loadLocal(getMethodGenerator().getLocalVariable(name));
			return;
		}
		
		// check if this is asterisk method parameter
		// Actually we do not have to have the following code block: we can move initializeAsteriskParameter
		// to the RubyMethod.initializeAsteriskParameter method so that it is always called. And may be we should
		// -- this will make code generation simpler. But doing it here has a little advantage (optimazation): if the
		//asterisk parameter is not used, we can avoid calling initializeAsteriskParameter().
		int asterisk_parameter_access_counter = getSymbolTable().getMethodAsteriskParameter(name);
		if (0 == asterisk_parameter_access_counter) {
			getMethodGenerator().call_initializeAsteriskParameter(getType());
			return;
		} else if (asterisk_parameter_access_counter > 0) {
			getMethodGenerator().load_asterisk_parameter_(getType());
			return;
		}

		int block_parameter_access_counter = getSymbolTable().getMethodBlockParameter(name);
		if (0 == block_parameter_access_counter) {
			getMethodGenerator().call_initializeBlockParameter(getType());
			return;
		} else if (block_parameter_access_counter > 0) {
			getMethodGenerator().load_block_parameter_(getType());
			return;
		}
		
		//check if this is normal method parameter
		int index = getSymbolTable().getMethodParameter(name);
		if (index >= 0) {
			getMethodGenerator().loadMethodPrameter(index);
			return;
		}
		
		// never used, for example a = a + 1
		getMethodGenerator().ObjectFactory_nilValue();
		return;
	}
	
	public MethodGenerator getMethodGenerator() {
		if (null != current_mg_for_class_builder_method_) {
			return current_mg_for_class_builder_method_;
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

