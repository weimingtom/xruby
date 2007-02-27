/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import com.xruby.runtime.lang.RubyBinding;
import java.util.*;

class FieldManager {
	private final FieldManager parent_;
	private final Set<String> fields_ = new HashSet<String>();//assigned fields are fields as well
	private final Set<String> assigned_fields_ = new HashSet<String>();
	
	public FieldManager(FieldManager parent) {
		parent_ = parent;
	}
 
	public void addField(String s) {
		fields_.add(s);
		if (null != parent_) {
			parent_.addField(s);
		}
	}
	
	public void addAssignedField(String s) {
		fields_.add(s);
		assigned_fields_.add(s);
		if (null != parent_) {
			parent_.addField(s);
			parent_.addAssignedField(s);
		}
	}
	
	public String[] getFields() {
		return fields_.toArray(new String[fields_.size()]);
	}
	
	public String[] getAssignedFields() {
		return assigned_fields_.toArray(new String[assigned_fields_.size()]);
	}

}

class ClassGeneratorForRubyBlock extends ClassGenerator {
	private final SymbolTable symbol_table_of_the_current_scope_;
	private final int argc_;
	private final boolean has_asterisk_parameter_;
	private final int default_argc_;
	private final boolean is_for_in_expression_;//for..in expression does not introduce new scope
	private final RubyBinding binding_;
	private final FieldManager field_manager_;

	public ClassGeneratorForRubyBlock(String name,
			int argc,
			boolean has_asterisk_parameter,
			int default_argc,
			ClassGenerator owner,
			boolean is_for_in_expression,
			RubyBinding binding) {
		super(name);
		symbol_table_of_the_current_scope_ = owner.getSymbolTable();
		mg_for_run_method_ = visitRubyBlock();
		argc_ = argc;
		has_asterisk_parameter_ = has_asterisk_parameter;
		default_argc_ = default_argc;
		is_for_in_expression_ = is_for_in_expression;
		binding_ = binding;
		field_manager_ = new FieldManager(
			(owner instanceof ClassGeneratorForRubyBlock) ? ((ClassGeneratorForRubyBlock)owner).field_manager_ : null);
	}
	
	protected Class getType() {
		return Types.RubyBlockClass;
	}

	private void loadField(String name) {
		mg_for_run_method_.loadThis();
		mg_for_run_method_.getField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
	}
	
	public String[] getAssignedFields() {
		return field_manager_.getAssignedFields();
	}

	public void loadVariable(String name) {
		if (isDefinedInOwnerScope(name)) {
			field_manager_.addField(name);
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
		if (is_for_in_expression_ || isDefinedInOwnerScope(name)) {
			field_manager_.addAssignedField(name);
			storeField(name);
			if (is_for_in_expression_) {
				updateBinding(binding_, name);
			}
		} else {
			super.storeVariable(name);
		}
	}

	private void initialFiledUsingBlockParameter(String name) {
		if (isDefinedInOwnerScope(name)) {
			field_manager_.addAssignedField(name);
			getMethodGenerator().loadThis();
			super.loadVariable(name);
			getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
		}
	}

	public void restoreLocalVariableFromBlock(String blockName, String name) {
		int i = getSymbolTable().getLocalVariable(name);
		if (i < 0) {
			getMethodGenerator().loadThis();
		}
		
		getMethodGenerator().loadLocal(getSymbolTable().getInternalBlockVar());
		getMethodGenerator().getField(Type.getType("L" + blockName + ";"), name, Type.getType(Types.RubyValueClass));
		
		if (i < 0) {
			getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Type.getType(Types.RubyValueClass));
		} else {
			getMethodGenerator().storeLocal(i);
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
		cv_.visit(Opcodes.V1_5,
				Opcodes.ACC_PUBLIC,		//need to modify fields when doing Proc#call, see RubyProc.java
				name_,	
				null,								// signature
				"com/xruby/runtime/lang/RubyBlock",	// superName
				null								// interface
				);
	
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray)"),
				cv_,
				null,
				symbol_table_of_the_current_scope_);
	}

	static String buildContructorSignature(int size) {
		StringBuilder method_name = new StringBuilder("void <init> (com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock");
		for (int i = 0; i < size; ++i) {
			method_name.append(", ");
			method_name.append("com.xruby.runtime.lang.RubyValue");
		}
		method_name.append(")");
		return method_name.toString();
	}
	
	public String[] createFieldsAndConstructorOfRubyBlock() {
		String[] commons = field_manager_.getFields();
		createConstructorOfRubyBlock(commons);
		createFields(commons);
		return commons;
	}

	private void createFields(final String[] commons) {
		for (String name : commons) {
			FieldVisitor fv = cv_.visitField(Opcodes.ACC_PUBLIC,
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
				cv_,
				null,
				symbol_table_of_the_current_scope_);
		
		mg.loadThis();
		mg.push(argc_);
		mg.push(has_asterisk_parameter_);
		mg.push(default_argc_);
		mg.loadArg(0);
		mg.loadArg(1);
		mg.loadArg(2);
		mg.invokeConstructor(Type.getType(Types.RubyBlockClass),
						Method.getMethod("void <init> (int, boolean, int, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock)"));
		
		for (int i = 0; i < commons.length; ++i) {
			mg.loadThis();
			mg.loadArg(i + 3);
			mg.putField(Type.getType("L" + name_ + ";"), commons[i], Type.getType(Types.RubyValueClass));
		}
		
		mg.returnValue();
		mg.endMethod();
	}

	private void addVariableToBinding(String s) {
		getMethodGenerator().push(s);
		field_manager_.addField(s);
		loadField(s);
		getMethodGenerator().invokeVirtual(Type.getType(Types.RubyBindingClass),
				Method.getMethod("com.xruby.runtime.lang.RubyBinding addVariable(String, com.xruby.runtime.lang.RubyValue)"));
	}

	public void createBinding(boolean isInSingletonMethod, boolean isInGlobalScope, boolean is_in_block) {
		super.createBinding(isInSingletonMethod, isInGlobalScope, is_in_block);

		//TODO one level look up is not enough 
		Collection<String> vars = symbol_table_of_the_current_scope_.getLocalVariables();
		for (String s : vars) {
			addVariableToBinding(s);
		}
		
		Collection<String> params = symbol_table_of_the_current_scope_.getParameters();
		for (String s : params) {
			addVariableToBinding(s);
		}
	}
	
	private boolean isDefinedInOwnerScope(String name) {
		SymbolTableForBlock st = (SymbolTableForBlock)getSymbolTable();
		return st.isDefinedInOwnerScope(name);
	}

	public boolean isDefinedInCurrentScope(String name) {
		if (isDefinedInOwnerScope(name)) {
			return true;
		} else {
			return super.isDefinedInCurrentScope(name);
		}
	}
}

