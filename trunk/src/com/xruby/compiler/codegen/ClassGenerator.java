/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
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

	public void storeVariable(String name) {
		getMethodGenerator().storeVariable(name);
	}

	public void startClassBuilderMethod(String name, boolean is_singleton) {
		if (null != current_mg_for_class_builder_method_) {
			suspended_mgs_for_class_builder_method_.push(current_mg_for_class_builder_method_);
		}

		current_mg_for_class_builder_method_ = new MethodGeneratorForClassBuilder(
				Opcodes.ACC_PRIVATE,
				Method.getMethod("com.xruby.runtime.lang.RubyValue " + name + "(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyModule)"),
				null,
				null,
				cv_,
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
		cv_.visitEnd();
	}

	public int getAnonymousLocalVariable() {
		return getMethodGenerator().newLocal(Type.getType(Types.RubyValueClass));
	}
	
	abstract protected Class getType();
	
	public void loadVariable(String name) {
		getMethodGenerator().loadVariable(getType(), name);
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
			getMethodGenerator().loadMethodPrameter(getSymbolTable().getMethodParameter(s));
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

