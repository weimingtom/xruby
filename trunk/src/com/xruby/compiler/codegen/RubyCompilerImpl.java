/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.Label;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.util.*;

import com.xruby.compiler.codedom.*;

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
	
	private static boolean isBuiltin(String name) {
		if (name.equals("Object") ||
				name.equals("NilClass") ||
				name.equals("TrueClass") ||
				name.equals("FalseClass") ||
				name.equals("Numeric") ||
				name.equals("Integer") ||
				name.equals("Fixnum") ||
				name.equals("Float") ||
				name.equals("String") ||
				name.equals("Exception") ||
				name.equals("RuntimeError") ||
				name.equals("Array") ||
				name.equals("Hash") ||
				name.equals("Class") ||
				name.equals("Module") ||
				name.equals("IO") ||
				name.equals("Proc") ||
				name.equals("Range") ||
				name.equals("Regexp") ||
				name.equals("File") ||
				name.equals("Method") ||
				name.equals("Time") ||
				name.equals("MatchDate") ||
				name.equals("Bignum")) {
			return true;
		} else {
			return false;
		}
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

		if (isBuiltin(className)) {
			cg_.getMethodGenerator().ObjectFactory_getBuiltinClass(className);
		} else {
			cg_.getMethodGenerator().push(className);
		}
		//super class will be pushed next, then visitSuperClass() will be called
	}

	public void visitClassDefination2(String className) {
		cg_.getMethodGenerator().RubyModule_defineClass(isBuiltin(className));

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

		cg_.getMethodGenerator().saveBlockForFutureRestoreAndCheckReturned();

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
		cg_.getMethodGenerator().RubyArray_add(false);
		cg_.getMethodGenerator().mark((Label)next_label);
	}

	public void visitNoParameter() {
		cg_.getMethodGenerator().pushNull();
	}

	public void visitNoBlock(boolean is_in_super) {
		if (is_in_super) {
			cg_.getMethodGenerator().loadArg(2);
		} else {
			cg_.getMethodGenerator().pushNull();
		}
	}

	public void visitNoSuperClass() {
		cg_.getMethodGenerator().pushNull();
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

		if (null != blockName) {
			cg_.getMethodGenerator().returnIfBlockReturned();
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
			cg_.getMethodGenerator().pushNull();
			cg_.getMethodGenerator().RubyRuntime_callPublicMethod_OneArgNoBlcok(operator);
		}
	}
	
	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsZeroOrOneValue();
		}
		cg_.getMethodGenerator().GlobalVatiables_set(var);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsZeroOrOneValue();
		}
		if (!is_multiple_assign) {
			cg_.getMethodGenerator().dup();//do not pop off empty stack
		}

		cg_.storeVariable(var);
	}

	public void visitFloatExpression(double value) {
		cg_.getMethodGenerator().ObjectFactory_createFloat(value);
	}

	public void visitIntegerExpression(String value, int radix) {
		cg_.getMethodGenerator().ObjectFactory_createInteger(value, radix);
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
			cg_.getMethodGenerator().pushNull();
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
		cg_.getMethodGenerator().RubyRuntime_testCaseEqual();
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
		
		cg_.getMethodGenerator().catchRubyException((Label)start, end);

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(exception_variable);

		cg_.getMethodGenerator().pushNull();//hack???
		
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
		cg_.getMethodGenerator().RubyRuntime_testExceptionType();
		
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);

		cg_.getMethodGenerator().pop();//hack???
		
		return label;
	}
	
	public Object visitAfterRescueBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGenerator().new_RubyArray(size, notSingleAsterisk);
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
			cg_.getMethodGenerator().RubyArray_expand(is_method_call);
		} else {
			cg_.getMethodGenerator().RubyArray_add(is_method_call);
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
		cg_.getMethodGenerator().dup();//will be used to call breaked().
		visitSelfExpression();
	}

	public void visitYieldEnd() {
		cg_.getMethodGenerator().RubyBlock_invoke();
	}

	public void visitSuperBegin() {
		cg_.getMethodGenerator().loadArg(0);//TODO error checking: super called outside of method (NoMethodError)
	}

	public void visitSuperEnd() {
		cg_.getMethodGenerator().RubyRuntime_callSuperMethod(((ClassGeneratorForRubyMethod)cg_).getMethodName());
	}

	public void visitGlobalVariableExpression(String value) {
		cg_.getMethodGenerator().GlobalVatiables_get(value);
	}

	public void visitCommandOutputExpression(String value) {
		cg_.getMethodGenerator().RubyRuntime_runCommandAndCaptureOutput(value);
	}

	public void visitReturn() {
		if (isInBlock()) {
			cg_.getMethodGenerator().returnFromBlock();
		} else {
			cg_.getMethodGenerator().returnValue();
		}
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
		cg_.getMethodGenerator().RubyValue_getRubyClass();
		cg_.getMethodGenerator().RubyModule_getClassVariable(name);
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadArg(1);
		} else {
			visitSelfExpression();
			cg_.getMethodGenerator().RubyValue_getRubyClass();
		}
		
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().RubyModule_setClassVariable(name);
	}
	
	public void visitInstanceVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().RubyValue_getInstanceVariable(name);
	}

	public void visitInstanceVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();
		visitSelfExpression();
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().RubyValue_setInstanceVariable(name);
	}
	
	public void visitMrhs(int var, int index, boolean asterisk) {
		cg_.getMethodGenerator().loadLocal(var);
		if (asterisk) {
			cg_.getMethodGenerator().RubyArray_collect(index);
		} else {
			cg_.getMethodGenerator().RubyArray_get(index);
		}
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		if (single_lhs) {
			cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsZeroOrOneValue2();
			return 0;
		} else {
			if (single_rhs) {
				cg_.getMethodGenerator().RubyRuntime_expandArrayIfThereIsOnlyOneRubyArray();
			}
			return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
		}
	}

	public void visitMultipleAssignmentEnd() {
		//do nothing
	}
	
	public int visitNestedVariableBegin(boolean single_lhs) {
		if (single_lhs) {
			return 0;
		} else {
			cg_.getMethodGenerator().RubyRuntime_convertToArrayIfNotYet();
			return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
		}
	}
	
	public void visitNestedVariableEnd() {
		//do nothing
	}

	public void visitBreak() {
		if (isInBlock()) {
			cg_.getMethodGenerator().breakFromBlock();
		} else {
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentBreak());
		}
	}

	public void visitNext() {
		if (isInBlock()) {
			cg_.getMethodGenerator().returnValue();
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
			cg_.getMethodGenerator().RubyValue_getRubyClass();
		}

		cg_.getMethodGenerator().RubyModule_getCurrentNamespaceConstant(name);
	}

	public void visitConstant(String name) {
		cg_.getMethodGenerator().RubyModule_getConstant(name);
	}

	public void visitTopLevelConstant(String name) {
		//quick access for builtin
		if (isBuiltin(name)) {
			cg_.getMethodGenerator().ObjectFactory_getBuiltinClass(name);
			return;
		}

		cg_.getMethodGenerator().RubyModule_getTopLevelConstant(name);
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
		cg_.getMethodGenerator().RubyModule_setConstant(name);
	}

	public void visitTopLevelConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		//TODO handle rhs_is_method_call and is_multiple_assignment
		cg_.getMethodGenerator().RubyModule_setTopLevelConstant(name);
	}
}
