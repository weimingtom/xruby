/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.math.BigInteger;

interface ISymbolTable {
	public boolean isDefinedInCurrentScope(String name);
}

public interface CodeVisitor extends ISymbolTable {
	public void visitBinaryOperator(String operator);
	public Object visitAndBinaryOperatorLeft();
	public void visitAndBinaryOperatorRight(Object label);
	public Object visitOrBinaryOperatorLeft();
	public void visitOrBinaryOperatorRight(Object label);
	public void visitUnaryOperator(String operator);
	public void visitInclusiveRangeOperator();
	public void visitExclusiveRangeOperator();
	public void visitConstant(String name);
	public void visitCurrentNamespaceConstant(String name);
	public void visitTopLevelConstant(String name);

	public void visitMethodCallBegin();
	public void visitMethodCallEnd(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName, boolean single_arg);
	
	public void visitDefinedPublicMethod(String name);
	public void visitDefinedMethod(String name);
	public void visitDefinedConstant(String name);
	public void visitDefinedCurrentNamespaceConstant(String name);
	public void visitDefinedTopLevelConstant(String name);
	public void visitDefinedSuperMethod();
	public void visitDefinedYield();
	public void visitDefinedLocalVariable(String name);

	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call);
	public void visitInstanceVariableAssignmentOperator(String var, boolean rhs_is_method_call);
	public void visitClassVariableAssignmentOperator(String var, boolean rhs_is_method_call);
	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment);
	public void visitCurrentNamespaceConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment);
	public void visitTopLevelConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment);
	public void visitConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment);

	public void visitNoParameter();
	public void visitNoParameterForSuper();
	public void visitNoBlock(boolean is_super_or_block_given_call);
	public void visitBlockArgument();
	public void visitBinding(boolean single_arg);

	public void visitNoSuperClass();
	
	public void visitFloatExpression(double value);
	public void visitFixnumExpression(int value);
	public void visitBignumExpression(BigInteger value);
	public void visitLocalVariableExpression(String value); 
	public void visitTrueExpression();
	public void visitFalseExpression();
	public void visitNilExpression();
	public void visitSelfExpression();
	public void visitStringExpression(String value);
	public void visitRegexpExpression(String value);
	public void visitCommandOutputExpression(String value);
	
	public void visitStringExpressionWithExpressionSubstitutionBegin();
	public void visitStringExpressionWithExpressionSubstitution(String value);
	public void visitStringExpressionWithExpressionSubstitution();
	public void visitStringExpressionWithExpressionSubstitutionEnd();
	public void visitRegexpExpressionWithExpressionSubstitutionEnd();
	public void visitCommandOutputExpressionWithExpressionSubstitutionEnd();
	
	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method);
	public void visitMethodDefinationParameter(String name);
	public void visitMethodDefinationAsteriskParameter(String name);
	public void visitMethodDefinationBlockParameter(String name);
	public void visitMethodDefinationEnd(boolean last_statement_has_return_value);

	public void visitMethodDefinationDefaultParameters(int size);
	public Object visitMethodDefinationDefaultParameterBegin(int index);
	public void visitMethodDefinationDefaultParameterEnd(Object next_label);
	
	public void visitClassDefination1(String className);
	public void visitClassDefination2(String className);
	public void visitSingletonClassDefination1();
	public void visitSingletonClassDefination2();
	public void visitClassDefinationEnd(boolean last_statement_has_return_value);
	
	public void visitModuleDefination(String moduleName);
	public void visitModuleDefinationEnd(boolean last_statement_has_return_value);
	
	public void visitTerminal();
	public void visitEof(boolean last_statement_has_return_value);
	
	public Object visitAfterIfCondition();
	public Object visitAfterIfBody(Object next_label, Object end_label);
	
	public Object visitAfterCaseCondition();
	public Object visitAfterWhenCondition(Object case_value, boolean asterisk);
	public Object visitAfterWhenBody(Object next_label, Object end_label);

	public Object visitAfterUnlessCondition();
	public Object visitAfterUnlessBody(Object next_label, Object end_label);
	
	public Object visitBodyBegin(boolean has_ensure);
	public Object visitBodyAfter();
	public void visitBodyEnd(Object label);
	public int visitRescueBegin(Object begin, Object end);
	public Object visitPrepareEnsure();
	public int visitEnsureBodyBegin();
	public void visitEnsure(int var);
	public void visitEnsureBodyEnd(int var);
	public Object visitRescueVariable(String name, int exception_var);
	public void visitAfterRescueBody(Object next_label, Object end_label);
	public void visitRescueEnd(int exception_variable, boolean has_ensure);

	public void visitArrayBegin(int size, int rhs_size, boolean has_single_asterisk);
	public void visitArrayEnd();
	public void visitArrayElement(boolean asterisk, boolean is_method_call);
	
	public void visitYieldBegin();
	public void visitYieldEnd();

	public void visitSuperBegin();
	public void visitSuperEnd(boolean has_no_arg, boolean has_one_arg);

	public void visitSymbolExpression(String value);
	public void visitGlobalVariableExpression(String value);
	public void visitClassVariableExpression(String value);
	public void visitInstanceVariableExpression(String value);
	
	public void visitReturn();
	public void visitBreak();
	public void visitNext();
	public void visitRedo();
	public void visitRetry();
	
	public void visitAliasGlobalVariable(String newName, String oldName);
	public void visitAliasMethod(String newName, String oldName);
	public void visitUndef(String name);

	public void visitHashBegin();
	public void visitHashEnd();
	public void visitHashElement();

	public void visitFrequentlyUsedInteger(int i);
	public void visitWhileConditionBegin();
	public void visitWhileConditionEnd(boolean is_until);
	public void visitWhileBodyEnd(boolean has_body);
	
	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_for_in_expression);
	public String[] visitBlockEnd(String name, boolean last_statement_has_return_value);
	
	public void visitMrhs(int var, int index, boolean asterisk);
	public int visitMultipleAssignment(boolean single_lhs, boolean has_mlhs);
	public void visitMultipleArrayAssign();
	public int visitNestedVariable(boolean single_lhs, boolean has_mlhs);

	public void visitSpecialLambdaCallBegin();
	public void visitSpecialLambdaCallEnd(String blockName, String[] assignedCommons);

	public void visitPotentialProcCall();
}
