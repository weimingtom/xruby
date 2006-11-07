/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.util.*;

import com.xruby.compiler.codedom.*;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class RubyCompilerImpl implements CodeVisitor {
	
	private ClassGenerator cg_;
	private Stack<ClassGenerator> suspended_cgs_ = new Stack<ClassGenerator>();
	private CompilationResults compilation_results_ = new CompilationResults();
	private String script_name_;
	private LabelManager labelManager_ = new LabelManager();
	
	public RubyCompilerImpl(String script_name) {
		script_name_ = script_name;
	}
	
	private boolean isInGlobalScope() {
		return suspended_cgs_.empty() && !cg_.isInClassBuilder();
	}

	private boolean isInBlock() {
		return (cg_ instanceof ClassGeneratorForRubyBlock);
	}

	public CompilationResults compile(Program program)
			throws CompilerException {

		cg_ = new ClassGeneratorForRubyProgram(NameFactory.createClassName(script_name_, null));
		program.accept(this);

		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();
		compilation_results_.add(cg_.getCompilationResult());
		return compilation_results_;
	}

	public void visitClassDefination1(String className) {

		cg_.getMethodGenerator().loadThis();

		if (isInGlobalScope()) {
			cg_.getMethodGenerator().RubyRuntime_GlobalScope();
		} else {
			cg_.getMethodGenerator().loadArg(1);
		}

		if (ObjectFactory.isBuiltin(className)) {
			cg_.getMethodGenerator().ObjectFactory_getBuiltinClass(className);
		} else {
			cg_.getMethodGenerator().push(className);
		}
		//super class will be pushed next, then visitSuperClass() will be called
	}

	public void visitClassDefination2(String className) {
		cg_.getMethodGenerator().RubyModule_defineClass(ObjectFactory.isBuiltin(className));

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getMethodGenerator().getLocalVariable(className));
		
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().convert_RubyValue_to_RubyModule();

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(className);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitClassDefination3() {
		cg_.getMethodGenerator().loadThis();
	}

	public void visitClassDefination4() {
		cg_.getMethodGenerator().dup();

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder("SIGLETON");
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitClassDefinationEnd(boolean last_statement_has_return_value) {
		cg_.endClassBuilderMethod(last_statement_has_return_value);
	}

	public void visitModuleDefination(String moduleName) {
		visitClassDefination1(moduleName);
		cg_.getMethodGenerator().RubyModule_defineModule();

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getMethodGenerator().getLocalVariable(moduleName));

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().convert_RubyValue_to_RubyModule();

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(moduleName);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitModuleDefinationEnd(boolean last_statement_has_return_value) {
		visitClassDefinationEnd(last_statement_has_return_value);//TODO
	}

	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method) {

		String uniqueMethodName = NameFactory.createClassName(script_name_, methodName);

		cg_.getMethodGenerator().MethodCollection_defineMethod(methodName, uniqueMethodName, is_singleton_method);

		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyMethod(methodName, uniqueMethodName, num_of_args, has_asterisk_parameter, num_of_default_args);
	}

	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, int num_of_default_args) {
		String uniqueBlockName = NameFactory.createClassNameForBlock(script_name_);
		
		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyBlock(uniqueBlockName,
					num_of_args,
					has_asterisk_parameter,
					num_of_default_args,
					cg_.getSymbolTable());
		return uniqueBlockName;
	}

	public String[] visitBlockEnd(String uniqueBlockName, boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}

		cg_.getMethodGenerator().returnValue();
		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();

		String[] commons = ((ClassGeneratorForRubyBlock)cg_).createFieldsAndConstructorOfRubyBlock();
		String[] assigned_commons = ((ClassGeneratorForRubyBlock)cg_).getAssignedFields();
		
		compilation_results_.add(cg_.getCompilationResult());
		cg_ = suspended_cgs_.pop();
		
		cg_.getMethodGenerator().new_BlockClass(uniqueBlockName, commons, isInGlobalScope(), isInBlock());

		if (assigned_commons.length > 0) {
			cg_.getMethodGenerator().saveBlockForFutureRestore();
		}
		return assigned_commons;
	}
	
	public void visitMethodDefinationParameter(String name) {
		cg_.addParameter(name);
	}

	public void visitMethodDefinationAsteriskParameter(String name) {
		cg_.setAsteriskParameter(name);
	}

	public void visitMethodDefinationBlockParameter(String name) {
		cg_.setBlockParameter(name);
	}

	public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}

		cg_.getMethodGenerator().returnValue();
		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();
		
		compilation_results_.add(cg_.getCompilationResult());
		cg_ = suspended_cgs_.pop();
	}

	public Object visitMethodDefinationDefaultParameterBegin(int index) {
		Label next_label = new Label();

		cg_.getMethodGenerator().loadMethodPrameterLength();
		cg_.getMethodGenerator().push(index);
		cg_.getMethodGenerator().ifICmp(GeneratorAdapter.GT, next_label);

		cg_.getMethodGenerator().loadArg(1);
		
		return next_label;
	}

	public void visitMethodDefinationDefaultParameterEnd(Object next_label) {
		cg_.getMethodGenerator().ArrayValue_add(false);
		cg_.getMethodGenerator().mark((Label)next_label);
	}

	public void visitNoParameter() {
		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
	}

	public void visitNoBlock(boolean is_in_super) {
		if (is_in_super) {
			cg_.getMethodGenerator().loadArg(2);
		} else {
			cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
		}
	}

	public void visitNoSuperClass() {
		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
	}

	public void visitBlockArgument() {
		cg_.getMethodGenerator().convert_RubyValue_to_RubyBlock();
	}
	
	public void visitMethodCall(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName) {	
		if (hasReceiver) {
			cg_.getMethodGenerator().RubyRuntime_callPublicMethod(methodName);
		} else {
			cg_.getMethodGenerator().RubyRuntime_callMethod(methodName);
		}

		if (null != assignedCommons && assignedCommons.length > 0) {
			cg_.getMethodGenerator().dup();
			for (String name : assignedCommons) {
				cg_.getMethodGenerator().restoreLocalVariableFromBlock(blockName, name);
			}
		}
	}

	public void visitBinaryOperator(String operator) {
		if (operator.equals("!=")) {
			cg_.getMethodGenerator().RubyRuntime_callPublicMethod_OneArgNoBlcok("==");
			cg_.getMethodGenerator().RubyRuntime_operatorNot();
		} else {
			//operator as method call
			cg_.getMethodGenerator().RubyRuntime_callPublicMethod_OneArgNoBlcok(operator);
		}
	}
	
	public Object visitAndBinaryOperatorLeft() {
		//The and and && operators evaluate their first operand. If false,
		//the expression returns false; otherwise, the expression returns
		//the value of the second operand. 
		cg_.getMethodGenerator().dup();
		Label label = (Label)visitAfterIfCondition();
		cg_.getMethodGenerator().pop();//discard the current value;
		return label;
	}

	public void visitAndBinaryOperatorRight(Object label) {
		cg_.getMethodGenerator().mark((Label)label);
	}

	public Object visitOrBinaryOperatorLeft() {
		//The or and || operators evaluate their first operand. If true, 
		//the expression returns true; otherwise, the expression returns
		//the value of the second operand. 
		cg_.getMethodGenerator().dup();
		Label label = (Label)visitAfterUnlessCondition();
		cg_.getMethodGenerator().pop();//discard the current value;
		return label;
	}

	public void visitOrBinaryOperatorRight(Object label) {
		visitAndBinaryOperatorRight(label);
	}

	public void visitUnaryOperator(String operator) {
		if (operator.equals("!")) {
			cg_.getMethodGenerator().RubyRuntime_operatorNot();
		} else {
			cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
			cg_.getMethodGenerator().RubyRuntime_callPublicMethod_OneArgNoBlcok(operator);
		}
	}
	
	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().ArrayValue_expandArrayIfThereIsZeroOrOneValue();
		}
		cg_.getMethodGenerator().GlobalVatiables_set(var);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().ArrayValue_expandArrayIfThereIsZeroOrOneValue();
		}
		if (!is_multiple_assign) {
			cg_.getMethodGenerator().dup();//do not pop off empty stack
		}

		cg_.storeVariable(var);
	}

	public void visitFloatExpression(double value) {
		cg_.getMethodGenerator().ObjectFactory_createFloat(value);
	}

	public void visitIntegerExpression(int value) {
		cg_.getMethodGenerator().ObjectFactory_createFixnum(value);
	}

	public void visitStringExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createString(value);
	}
	
	public void visitStringExpressionWithExpressionSubstitutionBegin() {
		cg_.getMethodGenerator().new_StringValue();
	}
	
	public void visitStringExpressionWithExpressionSubstitution(String value) {
		cg_.getMethodGenerator().StringValue_append(value);
	}

	public void visitStringExpressionWithExpressionSubstitution() {
		cg_.getMethodGenerator().StringValue_append();
	}
	
	public void visitStringExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().ObjectFactory_createString();
	}
	
	public void visitRegexpExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().ObjectFactory_createRegexp();
	}

	public void visitCommandOutputExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().RubyRuntime_runCommandAndCaptureOutput();
	}
	
	public void visitRegexpExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createRegexp(value);
	}

	public void visitSymbolExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createSymbol(value);
	}
	
	public void visitTerminal() {
		cg_.getMethodGenerator().pop();
	}
	
	public void visitEof(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
		}
		cg_.getMethodGenerator().returnValue();
	}

	public void visitLocalVariableExpression(String value) {
		cg_.loadVariable(value);
	}

	public void visitNilExpression() {
		cg_.getMethodGenerator().ObjectFactory_nilValue();
	}

	public Object visitAfterIfCondition() {
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	class Pair<T1, T2> {
		T1 first;
		T2 second;

		Pair(T1 first, T2 second) {
			this.first = first;
			this.second = second;
		}
	}

	public void visitWhileConditionBegin() {
		labelManager_.openNewScope();
		cg_.getMethodGenerator().mark(labelManager_.getCurrentNext());
	}

	public void visitWhileConditionEnd(boolean is_until) {		
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		if (is_until) {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, labelManager_.getCurrentX());
		} else {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, labelManager_.getCurrentX());
		}

		cg_.getMethodGenerator().mark(labelManager_.getCurrentRedo());
	}

	public void visitWhileBodyEnd() {
		cg_.getMethodGenerator().pop();
		cg_.getMethodGenerator().goTo(labelManager_.getCurrentNext());

		cg_.getMethodGenerator().mark(labelManager_.getCurrentX());
		visitNilExpression();//this is the value of while expression if no break is called.
		
		cg_.getMethodGenerator().mark(labelManager_.getCurrentBreak());
		labelManager_.closeCurrentScope();
	}

	public Object visitAfterIfBody(Object next_label, Object end_label) {
		if (null == end_label) {
			end_label = new Label();
		}
		
		if (null != next_label) {
			cg_.getMethodGenerator().goTo((Label)end_label);
			cg_.getMethodGenerator().mark((Label)next_label);
		} else {
			cg_.getMethodGenerator().mark((Label)end_label);
		}

		return end_label;
	}

	public Object visitAfterCaseCondition() {
		int i = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(i);
		return i;
	}

	public Object visitAfterWhenCondition(Object case_value) {
		int i = (Integer)case_value;
		cg_.getMethodGenerator().loadLocal(i);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testCaseEqual(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)"));
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	public Object visitAfterWhenBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}

	public void visitTrueExpression() {
		cg_.getMethodGenerator().ObjectFactory_trueValue();
	}

	public void visitFalseExpression() {
		cg_.getMethodGenerator().ObjectFactory_falseValue();
	}

	public Object visitAfterUnlessCondition() {
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, label);
		return label;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}

	public Object visitPrepareRescueBegin() {
		return cg_.getMethodGenerator().mark();
	}

	public Object visitPrepareRescueEnd(Object start) {
		Label end = cg_.getMethodGenerator().mark();

		Label after_exception = new Label();
		cg_.getMethodGenerator().goTo(after_exception);
		
		cg_.getMethodGenerator().catchException((Label)start,
				end,
				Type.getType(RubyException.class));

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(exception_variable);

		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);//hack???
		
		return new Pair<Integer, Label>(exception_variable, after_exception);
	}

	public void visitRescueEnd(Object var, Object end_label) {
		cg_.getMethodGenerator().mark((Label)end_label);
		Label after_exception = ((Pair<Integer, Label>)var).second;
		cg_.getMethodGenerator().mark(after_exception);
	}

	public Object visitRescueVariable(String name, Object var) {
		int exception_variable = ((Pair<Integer, Label>)var).first;
		cg_.getMethodGenerator().loadLocal(exception_variable);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testExceptionType(com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyException)"));
		
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);

		cg_.getMethodGenerator().pop();//hack???
		
		return label;
	}
	
	public Object visitAfterRescueBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGenerator().new_ArrayValue(size, notSingleAsterisk);
	}
	
	public void visitHashBegin() {
		cg_.getMethodGenerator().new_HashValue();
	}

	public void visitArrayElementBegin() {
		cg_.getMethodGenerator().dup();
	}

	public void visitHashElementBegin() {
		cg_.getMethodGenerator().dup();
	}
	
	public void visitArrayElementEnd(boolean asterisk, boolean is_method_call) {
		if (asterisk) {
			cg_.getMethodGenerator().ArrayValue_expand(is_method_call);
		} else {
			cg_.getMethodGenerator().ArrayValue_add(is_method_call);
		}
	}
	
	public void visitHashElementEnd() {
		cg_.getMethodGenerator().HashValue_addValue();
	}
	
	public void visitArrayEnd() {
		cg_.getMethodGenerator().ObjectFactory_createArray();
	}
	
	public void visitHashEnd() {
		cg_.getMethodGenerator().ObjectFactory_createHash();
	}

	public void visitYieldBegin() {
		if (isInBlock()) {
			cg_.getMethodGenerator().loadBlockOfCurrentMethod();
		} else {
			cg_.getMethodGenerator().loadArg(2);//TODO error checking: make sure yield is called in the right context
		}
		visitSelfExpression();
	}

	public void visitYieldEnd() {
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyBlock.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue)"));
	}

	public void visitSuperBegin() {
		cg_.getMethodGenerator().loadArg(0);//TODO error checking: super called outside of method (NoMethodError)
	}

	public void visitSuperEnd() {
		cg_.getMethodGenerator().push(((ClassGeneratorForRubyMethod)cg_).getMethodName());
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue callSuperMethod(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.ArrayValue, com.xruby.runtime.lang.RubyBlock, String)"));
	}

	public void visitGlobalVariableExpression(String value) {
		cg_.getMethodGenerator().GlobalVatiables_get(value);
	}

	public void visitCommandOutputExpression(String value) {
		cg_.getMethodGenerator().RubyRuntime_runCommandAndCaptureOutput(value);
	}

	public void visitReturn() {
		cg_.getMethodGenerator().returnValue();
	}

	public void visitAliasGlobalVariable(String newName, String oldName) {
		cg_.getMethodGenerator().GlobalVatiables_alias(newName, oldName);
	}

	public void visitAliasMethod(String newName, String oldName) {
		cg_.getMethodGenerator().MethodCollection_aliasMethod(newName, oldName);	
	}

	public void visitUndef(String name) {
		cg_.getMethodGenerator().MethodCollection_undefMethod(name);
	}
	
	public void visitSelfExpression() {
		if (!isInGlobalScope()) {
			cg_.getMethodGenerator().loadArg(0);
		} else {
			cg_.getMethodGenerator().ObjectFactory_topLevelSelfValue();
		}
	}

	public void visitClassVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue getClassVariable(String)"));
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().ArrayValue_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGenerator().storeLocal(value);

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadArg(1);
		} else {
			visitSelfExpression();
			cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
		}
		
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue setClassVariable(com.xruby.runtime.lang.RubyValue, String)"));
	}
	
	public void visitInstanceVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue getInstanceVariable(String)"));
	}

	public void visitInstanceVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().ArrayValue_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGenerator().storeLocal(value);
		visitSelfExpression();
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.runtime.lang.RubyValue setInstanceVariable(com.xruby.runtime.lang.RubyValue, String)"));
	}
	
	public void visitMrhs(int var, int index, boolean asterisk) {
		cg_.getMethodGenerator().loadLocal(var);
		if (asterisk) {
			cg_.getMethodGenerator().ArrayValue_collect(index);
		} else {
			cg_.getMethodGenerator().ArrayValue_get(index);
		}
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		if (single_lhs) {
			cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.runtime.value.ArrayValue)"));
			return 0;
		} else {
			if (single_rhs) {
				cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
						Method.getMethod("com.xruby.runtime.value.ArrayValue expandArrayIfThereIsOnlyOneArrayValue(com.xruby.runtime.value.ArrayValue)"));
			}
			int var = cg_.getMethodGenerator().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGenerator().storeLocal(var);
			return var;
		}
	}

	public void visitMultipleAssignmentEnd() {
		//do nothing
	}
	
	public int visitNestedVariableBegin(boolean single_lhs) {
		if (single_lhs) {
			return 0;
		} else {
			cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
							Method.getMethod("com.xruby.runtime.value.ArrayValue convertToArrayIfNotYet(com.xruby.runtime.lang.RubyValue)"));
			int var = cg_.getMethodGenerator().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGenerator().storeLocal(var);
			return var;
		}
	}
	
	public void visitNestedVariableEnd() {
		//do nothing
	}

	public void visitBreakBegin() {
		if (isInBlock()) {
			cg_.getMethodGenerator().loadThis();
		}
	}

	public void visitBreakEnd() {
		if (isInBlock()) {
			cg_.getMethodGenerator().breakBlock();
		} else {
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentBreak());
		}
	}

	public void visitNextBegin() {
	}

	public void visitNextEnd() {
		if (isInBlock()) {
			visitReturn();
		} else {
			cg_.getMethodGenerator().pop();
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentNext());
		}
	}

	public void visitRedo() {
		cg_.getMethodGenerator().goTo(labelManager_.getCurrentRedo());
	}

	public void visitExclusiveRangeOperator() {
		cg_.getMethodGenerator().push(true);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitInclusiveRangeOperator() {
		cg_.getMethodGenerator().push(false);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitCurrentNamespaceConstant(String name) {
		if (isInGlobalScope()) {
			visitTopLevelConstant(name);
			return;
		}

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadArg(1);
		} else {
			visitSelfExpression();
			cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
					Method.getMethod("com.xruby.runtime.lang.RubyClass getRubyClass()"));
		}

		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getCurrentNamespaceConstant(String)"));
	}

	public void visitConstant(String name) {
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getConstant(com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void visitTopLevelConstant(String name) {
		//quick access for builtin
		if (ObjectFactory.isBuiltin(name)) {
			cg_.getMethodGenerator().getStatic(Type.getType(ObjectFactory.class),
					name + "ClassValue",
					Type.getType(RubyValue.class));
			return;
		}

		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue getTopLevelConstant(String)"));
	}

	public void visitCurrentNamespaceConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (isInGlobalScope()) {
			visitTopLevelConstantAssignmentOperator(name, rhs_is_method_call, is_multiple_assign);
			return;
		}
		
		visitSelfExpression();
		visitConstantAssignmentOperator(name, rhs_is_method_call, is_multiple_assign);
	}
	
	public void visitConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		//TODO handle rhs_is_method_call and is_multiple_assignment
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue setConstant(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, String)"));
	}

	public void visitTopLevelConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		//TODO handle rhs_is_method_call and is_multiple_assignment
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.runtime.lang.RubyValue setTopLevelConstant(com.xruby.runtime.lang.RubyValue, String)"));
		
	}
}
