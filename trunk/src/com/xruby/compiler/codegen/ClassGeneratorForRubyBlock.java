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
    private final ClassGeneratorForRubyBlock cg_;
    private final Set<String> fields_ = new HashSet<String>();//assigned fields are fields as well
    private final Set<String> assigned_fields_ = new HashSet<String>();

    public FieldManager(FieldManager parent, ClassGeneratorForRubyBlock cg) {
        parent_ = parent;
        cg_ = cg;
    }

    public void addField(String s) {
        fields_.add(s);
        if (null != parent_) {
            parent_.addField(s);
        }
    }

    public void addAssignedField(String s, boolean is_for_in_expression) {
        fields_.add(s);

        if (is_for_in_expression || cg_.isDefinedInOwnerScope(s)) {
            assigned_fields_.add(s);
        }

        if (null != parent_) {
            parent_.addField(s);
            parent_.addAssignedField(s, false);
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
    private final SymbolTable symbol_table_of_the_current_scope_;//TODO remove this field, use isDefinedInOwnerScope
    private final int argc_;
    private final boolean has_asterisk_parameter_;
    private final int default_argc_;
    private final boolean is_for_in_expression_;//for..in expression does not introduce new scope
    private final RubyBinding binding_;
    private final FieldManager field_manager_;
    private final String fileName;
    private final ClassGeneratorForRubyBlockHelper helper;
    private final ClassGenerator owner_;

    public ClassGeneratorForRubyBlock(String name, String fileName,
            int argc,
            boolean has_asterisk_parameter,
            int default_argc,
            ClassGenerator owner,
            boolean is_for_in_expression,
            boolean has_extra_comma,
            RubyBinding binding) {
        super(name);
        this.helper = ClassGeneratorForRubyBlockHelper.getHelper(argc, has_asterisk_parameter, is_for_in_expression, has_extra_comma);
        this.fileName = fileName;
        symbol_table_of_the_current_scope_ = owner.getSymbolTable();
        mg_for_run_method_ = visitRubyBlock();
        argc_ = argc;
        has_asterisk_parameter_ = has_asterisk_parameter;
        default_argc_ = default_argc;
        is_for_in_expression_ = is_for_in_expression;
        binding_ = binding;
        field_manager_ = new FieldManager(
            (owner instanceof ClassGeneratorForRubyBlock) ? ((ClassGeneratorForRubyBlock)owner).field_manager_ : null,
                    this);
        owner_ = owner;
    }

    public void callSuperMethod(boolean has_no_arg, boolean has_one_arg) {
        if (has_one_arg ||
            (has_no_arg && OwnerHasOneArg())) {
            getMethodGenerator().RubyAPI_callSuperOneArgMethod(getMethodName());
        } else if (has_no_arg && OwnerHasNoArg()) {
            getMethodGenerator().RubyAPI_callSuperNoArgMethod(getMethodName());
        } else {
            getMethodGenerator().RubyAPI_callSuperMethod(getMethodName());
        }
    }

	public void loadNoParameterForSuper() {
		if (OwnerHasOneArg()) {
			getMethodGenerator().RubyBlock_argOfCurrentMethod_();
		} else {
			getMethodGenerator().RubyBlock_argsOfCurrentMethod_();
		}
	}

    private String getMethodName() {
        if (owner_ instanceof ClassGeneratorForRubyMethod) {
            return ((ClassGeneratorForRubyMethod)owner_).getMethodName();
        } else if (owner_ instanceof ClassGeneratorForRubyBlock) {
            return ((ClassGeneratorForRubyBlock)owner_).getMethodName();
        } else {
            throw new Error("Wrong context");
        }
    }

    private boolean OwnerHasOneArg() {
        if (owner_ instanceof ClassGeneratorForRubyBlock) {
            return ((ClassGeneratorForRubyBlock)owner_).OwnerHasOneArg();
        } else if (owner_ instanceof ClassGeneratorForOneArgRubyMethod) {
            return true;
        } else {
            assert(owner_ instanceof ClassGeneratorForRubyMethod);
            return false;
        }
    }

    private boolean OwnerHasNoArg() {
        if (owner_ instanceof ClassGeneratorForRubyBlock) {
            return ((ClassGeneratorForRubyBlock)owner_).OwnerHasNoArg();
        } else if (owner_ instanceof ClassGeneratorForNoArgRubyMethod) {
            return true;
        } else {
            assert(owner_ instanceof ClassGeneratorForRubyMethod);
            return false;
        }
    }

    private void loadField(String name) {
        mg_for_run_method_.loadThis();
        mg_for_run_method_.getField(Type.getType("L" + name_ + ";"), name, Types.RUBY_VALUE_TYPE);
    }

    private void storeField(String name) {
        super.storeVariable(SymbolTable.NAME_FOR_INTERNAL_TMP_VAR);

        getMethodGenerator().loadThis();
        loadVariable(SymbolTable.NAME_FOR_INTERNAL_TMP_VAR);
        getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Types.RUBY_VALUE_TYPE);
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

    public void storeVariable(String name) {
        if (is_for_in_expression_ || isDefinedInOwnerScope(name)) {
            field_manager_.addAssignedField(name, is_for_in_expression_);
            storeField(name);
            if (is_for_in_expression_) {
                updateBinding(binding_, name);
            }
        } else {
            super.storeVariable(name);
        }
    }

    private void addNewFieldToClass(String name) {
        FieldVisitor fv = cv_.visitField(Opcodes.ACC_PUBLIC,
            name,
            Type.getDescriptor(Types.RUBY_VALUE_CLASS),
            null,
            null
            );
        fv.visitEnd();
    }

    private void initialFiledUsingBlockParameter(String name) {
        if (isDefinedInOwnerScope(name)) {
            field_manager_.addAssignedField(name, false);
            getMethodGenerator().loadThis();
            super.loadVariable(name);
            getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Types.RUBY_VALUE_TYPE);
        }
    }

    public void restoreLocalVariableFromBlock(String blockName, String name) {
        int i = getSymbolTable().getLocalVariable(name);
        if (i < 0) {
            getMethodGenerator().loadThis();
        }

        getMethodGenerator().loadLocal(getSymbolTable().getInternalBlockVar());
        getMethodGenerator().getField(Type.getType("L" + blockName + ";"), name, Types.RUBY_VALUE_TYPE);

        if (i < 0) {
            getMethodGenerator().putField(Type.getType("L" + name_ + ";"), name, Types.RUBY_VALUE_TYPE);
        } else {
            getMethodGenerator().storeLocal(i);
        }
    }

    public void addParameter(String name) {
        super.addParameter(name);
        initialFiledUsingBlockParameter(name);
    }

    public void setAsteriskParameter(String name, int argc) {
        super.setAsteriskParameter(name, argc);
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
                this.helper.getSuperName(),	// superName
                null								// interface
                );

        // set source file's name, for debug
        if(fileName != null) {
            cv_.visitSource(fileName, null);
        }

        return new MethodGenerator(Opcodes.ACC_PROTECTED,
                Method.getMethod(this.helper.getRunMethodName()),
                cv_,
                null,
                symbol_table_of_the_current_scope_,
                false);
    }

    static String buildContructorSignature(int size) {
        String defaultMethodName = "void <init> (com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule, boolean";
        StringBuilder method_name = new StringBuilder(defaultMethodName);
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
        for (String name : commons) {
            addNewFieldToClass(name);
        }
        return commons;
    }

    private void createConstructorOfRubyBlock(final String[] commons) {

        MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
                Method.getMethod(buildContructorSignature(commons.length)),
                cv_,
                null,
                symbol_table_of_the_current_scope_,
                false);

        mg.loadThis();

        this.helper.pushBasciArgForSuperArg(mg, argc_, has_asterisk_parameter_, default_argc_);

        mg.loadArg(0);
        mg.loadArg(1);
        mg.loadArg(2);
        mg.loadArg(3);
		mg.loadArg(4);
		mg.loadArg(5);

        mg.invokeConstructor(this.helper.getSuperClassType(),
                Method.getMethod(this.helper.getSuperCtorName()));

        for (int i = 0; i < commons.length; ++i) {
            mg.loadThis();
            mg.loadArg(i + 6);
            mg.putField(Type.getType("L" + name_ + ";"), commons[i], Types.RUBY_VALUE_TYPE);
        }

        mg.returnValue();
        mg.endMethod();
    }

    private void addVariableToBinding(String s) {
        getMethodGenerator().push(s);
        field_manager_.addField(s);
        loadField(s);
        getMethodGenerator().invokeVirtual(Types.RUBY_BINDING_TYPE,
                Method.getMethod("com.xruby.runtime.lang.RubyBinding addVariable(String, com.xruby.runtime.lang.RubyValue)"));
    }

    public void createBinding(boolean isInClassBuilder, boolean isInSingletonMethod, boolean isInGlobalScope, boolean isInBlock) {
        super.createBinding(isInClassBuilder, isInSingletonMethod, isInGlobalScope, isInBlock);

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

    public boolean isDefinedInOwnerScope(String name) {
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

	public void loadArgOfMethodForBlock() {
		getMethodGenerator().RubyBlock_argOfCurrentMethod_();
		getMethodGenerator().RubyBlock_argsOfCurrentMethod_();
	}
}

