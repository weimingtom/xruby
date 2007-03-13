package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import java.util.*;

class ClassGeneratorForRubyBlock extends ClassGenerator {

	private final SymbolTable symbol_table_of_the_current_scope_;
	private final int argc_;
	private final boolean has_asterisk_parameter_;
	private final int default_argc_;
	Set<String> fields_ = new HashSet<String>();//assigned fields are fields as well
	Set<String> assigned_fields_ = new HashSet<String>();

	public ClassGeneratorForRubyBlock(String name,
			int argc,
			boolean has_asterisk_parameter,
			int default_argc,
			SymbolTable symbol_table_of_the_current_scope) {
		super(name);
		mg_for_run_method_ = visitRubyBlock();
		symbol_table_of_the_current_scope_ = symbol_table_of_the_current_scope;
		argc_ = argc;
		has_asterisk_parameter_ = has_asterisk_parameter;
		default_argc_ = default_argc;
	}
	
	protected Class getType() {
		return Types.RubyBlockClass;
	}

	private void loadField(String name) {
		mg_for_run_method_.loadThis();
		mg_for_run_method_.getField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
	}

	public void loadVariable(String name) {
		if (symbol_table_of_the_current_scope_.isDefinedInCurrentScope(name)) {
			fields_.add(name);
			loadField(name);
		} else {
			super.loadVariable(name);
		}
	}

	private void storeField(String name) {
		super.storeVariable("tmp$");
			
		getMethodGenerator().loadThis();
		loadVariable("tmp$");
		getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
	}

	public void storeVariable(String name) {
		if (symbol_table_of_the_current_scope_.isDefinedInCurrentScope(name)) {
			fields_.add(name);
			assigned_fields_.add(name);
			storeField(name);
		} else {
			super.storeVariable(name);
		}
	}

	private void initialFiledUsingBlockParameter(String name) {
		if (symbol_table_of_the_current_scope_.isDefinedInCurrentScope(name)) {
			fields_.add(name);
			assigned_fields_.add(name);
			getMethodGenerator().loadThis();
			super.loadVariable(name);
			getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
		}
	}

	public void addParameter(String name) {
		super.addParameter(name);
		initialFiledUsingBlockParameter(name);
	}

	public void setAsteriskParameter(String name) {
		super.setAsteriskParameter(name);
		initialFiledUsingBlockParameter(name);
	}

	public void setBlockParameter(String name) {
		super.setBlockParameter(name);
		initialFiledUsingBlockParameter(name);
	}

	private MethodGenerator visitRubyBlock() {
		cw_.visit(Opcodes.V1_5,
				0,		//No modifier
				name_,	
				null,								// signature
				"com/xruby/runtime/lang/RubyBlock",	// superName
				null								// interface
				);
	
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray)"),
				null,
				null,
				cw_);
	}

	static String buildContructorSignature(int size) {
		StringBuilder method_name = new StringBuilder("void <init> (com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue");
		for (int i = 0; i < size; ++i) {
			method_name.append(", ");
			method_name.append("com.xruby.runtime.lang.RubyValue");
		}
		method_name.append(")");
		return method_name.toString();
	}
	
	public String[] createFieldsAndConstructorOfRubyBlock() {
		String[] commons = fields_.toArray(new String[fields_.size()]);
		createConstructorOfRubyBlock(commons);
		createFields(commons);
		return commons;
	}

	public String[] getAssignedFields() {
		return assigned_fields_.toArray(new String[assigned_fields_.size()]);
	}

	private void createFields(final String[] commons) {
		for (String name : commons) {
			FieldVisitor fv = cw_.visitField(assigned_fields_.contains(name) ? Opcodes.ACC_PUBLIC : Opcodes.ACC_PRIVATE,
					name,
					Type.getDescriptor(Types.RubyValueClass),
					null,
					null
					);
			fv.visitEnd();
		}
	}
	
	private void createConstructorOfRubyBlock(final String[] commons) {
		
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod(buildContructorSignature(commons.length)),
				null,
				null,
				cw_);
		
		mg.loadThis();
		mg.push(argc_);
		mg.push(has_asterisk_parameter_);
		mg.push(default_argc_);
		mg.loadArg(0);
		mg.loadArg(1);
		mg.invokeConstructor(Type.getType(Types.RubyBlockClass),
						Method.getMethod("void <init> (int, boolean, int, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue)"));
		
		for (int i = 0; i < commons.length; ++i) {
			mg.loadThis();
			mg.loadArg(i + 2);
			mg.putField(Type.getType("L" + name_ + ";"), commons[i], Type.getType(Types.RubyValueClass));
		}
		
		mg.returnValue();
		mg.endMethod();
	}
}
