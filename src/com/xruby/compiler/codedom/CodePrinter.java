/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.math.BigInteger;

public class CodePrinter implements CodeVisitor {
	StringBuilder result_ = new StringBuilder();

	public String toString() {
		return result_.toString();
	}

	public void visitDefinedPublicMethod(String name) {
		result_.append("defined?(public) ");
		result_.append(name);
		result_.append("\n");
	}

	public void visitDefinedMethod(String name) {
		result_.append("defined? ");
		result_.append(name);
		result_.append("\n");
	}

	public void visitDefinedSuperMethod() {
		result_.append("defined? super\n");
	}
	
	public void visitBinaryOperator(String operator) {
		result_.append(operator);
		result_.append("\n");
	}
	
	public Object visitAndBinaryOperatorLeft() {
		result_.append("&& left\n");
		return null;
	}
	
	public void visitAndBinaryOperatorRight(Object label) {
		result_.append("&& right\n");
	}
	
	public Object visitOrBinaryOperatorLeft() {
		result_.append("|| left\n");
		return null;
	}
	
	public void visitOrBinaryOperatorRight(Object label) {
		result_.append("|| right\n");
	}
	
	public void visitExclusiveRangeOperator() {
		result_.append("... operator\n");
	}

	public void visitInclusiveRangeOperator() {
		result_.append(".. operator\n");
	}
	
	public void visitUnaryOperator(String operator) {
		result_.append(operator);
		result_.append("\n");
	}

	public void visitConstant(String name) {
		result_.append("::");
		result_.append(name);
		result_.append("\n");
	}

	public void visitCurrentNamespaceConstant(String name) {
		visitConstant(name);
	}

	public void visitTopLevelConstant(String name) {
		visitConstant(name);
	}

	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		result_.append(var);
		if (rhs_is_method_call) {
			result_.append(" *=\n");
		} else {
			result_.append(" =\n");
		}
	}

	public void visitInstanceVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		visitGlobalVariableAssignmentOperator(var, rhs_is_method_call);
	}

	public void visitClassVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		visitGlobalVariableAssignmentOperator(var, rhs_is_method_call);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		result_.append(var);
		result_.append(" ");
		if (rhs_is_method_call) {
			result_.append("*");
		}
		if (is_multiple_assignment) {
			result_.append("//");
		}
		result_.append("=\n");
	}

	public void visitCurrentNamespaceConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		visitLocalVariableAssignmentOperator(var, rhs_is_method_call, is_multiple_assignment);
	}

	public void visitTopLevelConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		visitCurrentNamespaceConstantAssignmentOperator(var, rhs_is_method_call, is_multiple_assignment);
	}

	public void visitConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		visitCurrentNamespaceConstantAssignmentOperator(var, rhs_is_method_call, is_multiple_assignment);
	}
	
	public void visitNoParameter() {
	}

	public void visitNoBlock(boolean is_in_super) {
	}

	public void visitNoSuperClass() {
	}

	public void visitBlockArgument() {
	}

	public void visitMethodCall(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName) {
		result_.append(methodName);
		result_.append(":");
		result_.append(hasReceiver);
		result_.append("\n");
	}

	public void visitFloatExpression(double value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitIntegerExpression(String value, int radix) {
		result_.append(new BigInteger(value, radix).toString());
		result_.append("\n");
	}

	public void visitStringExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}
	
	public void visitStringExpressionWithExpressionSubstitutionBegin() {
		result_.append("visitStringExpressionWithExpressionSubstitutionBegin\n");
	}
	
	public void visitStringExpressionWithExpressionSubstitution(String value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitStringExpressionWithExpressionSubstitution() {
	}
	
	public void visitStringExpressionWithExpressionSubstitutionEnd() {
		result_.append("StringExpressionWithExpressionSubstitutionEnd\n");
	}

	public void visitRegexpExpressionWithExpressionSubstitutionEnd() {
		result_.append("RegexExpressionWithExpressionSubstitutionEnd\n");
	}

	public void visitCommandOutputExpressionWithExpressionSubstitutionEnd() {
		result_.append("CommandOutputExpressionWithExpressionSubstitutionEnd\n");
	}

	public void visitRegexpExpression(String value) {
		result_.append("/");
		result_.append(value);
		result_.append("/\n");
	}
	
	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method) {
		result_.append("def ");
		result_.append(methodName);
		result_.append(":");
		result_.append(num_of_args);
		result_.append(":");
		result_.append(has_asterisk_parameter);
		result_.append(":");
		result_.append(num_of_default_args);
		result_.append(":");
		result_.append(is_singleton_method);
		result_.append("\n");
	}

	public void visitClassDefination1(String className) {
		result_.append("class ");
		result_.append(className);
		result_.append("\n");
	}

	public void visitClassDefination2(String className) {
		result_.append("ClassDefination2\n");
	}

	public void visitSingletonClassDefination1() {
		result_.append("visitSingletonClassDefination1\n");
	}

	public void visitSingletonClassDefination2() {
		result_.append("visitSingletonClassDefination2\n");
	}
	
	public void visitModuleDefination(String moduleName) {
		result_.append("module ");
		result_.append(moduleName);
		result_.append("\n");
	}

	public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
		result_.append("end def:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}
	
	public void visitClassDefinationEnd(boolean last_statement_has_return_value) {
		result_.append("end:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}

	public void visitModuleDefinationEnd(boolean last_statement_has_return_value) {
		result_.append("end:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}

	public void visitTerminal() {
		result_.append(";\n");
	}

	public void visitEof(boolean last_statement_has_return_value) {
		result_.append("EOF");
	}

	public void visitLocalVariableExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitTrueExpression() {
		result_.append("true\n");
	}
	
	public void visitFalseExpression() {
		result_.append("false\n");
	}

	public void visitNilExpression() {
		result_.append("nil\n");
	}

	public Object visitAfterIfCondition() {
		result_.append("if\n");
		return null;
	}

	public Object visitAfterIfBody(Object next_label, Object end_label) {
		result_.append("end if");
		result_.append("\n");
		return null;
	}

	public Object visitAfterCaseCondition() {
		result_.append("case\n");
		return null;
	}

	public Object visitAfterWhenCondition(Object case_value) {
		result_.append("when\n");
		return null;
	}

	public Object visitAfterWhenBody(Object next_label, Object end_label) {
		result_.append("end when");
		result_.append("\n");
		return null;
	}

	public Object visitAfterUnlessCondition() {
		result_.append("unless\n");
		return null;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label) {
		result_.append("end unless");
		result_.append("\n");
		return null;
	}

	public Object visitPrepareRescueBegin() {
		result_.append("prepare rescue begin\n");
		return null;
	}

	public Object visitPrepareRescueEnd(Object start) {
		result_.append("prepare rescue end\n");
		return null;
	}

	public Object visitAfterRescueBody(Object next_label, Object end_label) {
		result_.append("end rescue\n");
		return null;
	}

	public void visitRescueEnd(Object exception_var, Object end_label) {
		result_.append("end rescue!\n");
	}
	
	public Object visitRescueVariable(String name, Object exception_var) {
		result_.append("=>");
		result_.append(name);
		result_.append("\n");
		return null;
	}

	public void visitArrayBegin(int size,boolean notSingleAsterisk) {
		if (!notSingleAsterisk) {
			result_.append("*");
		}
		result_.append("[:");
		result_.append(size);
		result_.append("\n");
	}
	
	public void visitArrayEnd() {
		result_.append("]!\n");
	}

	public void visitArrayElementBegin() {
		result_.append("[\n");
	}

	public void visitArrayElementEnd(boolean asterisk,boolean is_method_call) {
		result_.append("]");
		if (asterisk) {
			result_.append("*");
		}

		if (is_method_call)
		{
			result_.append("()");
		}
		result_.append("\n");
	}

	public void visitHashBegin() {
		result_.append("{!\n");
	}

	public void visitHashElementBegin() {
		result_.append("{\n");
	}

	public void visitHashElementEnd() {
		result_.append("}\n");
	}

	public void visitHashEnd() {
		result_.append("}!\n");
	}
	
	public void visitSymbolExpression(String value) {
		result_.append(":" + value + "\n");
	}

	public void visitYieldBegin() {
		result_.append("yield\n");
	}
	
	public void visitYieldEnd() {
		result_.append("end yield\n");
	}

	public void visitSuperBegin() {
		result_.append("super\n");
	}
	
	public void visitSuperEnd() {
		result_.append("end super\n");
	}

	public void visitGlobalVariableExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}
	
	public void visitClassVariableExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitInstanceVariableExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitCommandOutputExpression(String value) {
		result_.append("`");
		result_.append(value);
		result_.append("`\n");
	}

	public void visitMethodDefinationParameter(String name) {
		result_.append("parameter:");
		result_.append(name);
		result_.append("\n");
	}
	
	public void visitMethodDefinationAsteriskParameter(String name) {
		result_.append("*parameter:");
		result_.append(name);
		result_.append("\n");
	}

	public void visitMethodDefinationBlockParameter(String name) {
		result_.append("&parameter:");
		result_.append(name);
		result_.append("\n");
	}

	public Object visitMethodDefinationDefaultParameterBegin(int index) {
		result_.append("DefaultParameterBegin:");
		result_.append(index);
		result_.append("\n");
		return null;
	}

	public void visitMethodDefinationDefaultParameterEnd(Object next_label) {
		result_.append("DefaultParameterEnd\n");
	}

	public void visitReturn() {
		result_.append("return\n");
	}
	
	public void visitBreak() {
		result_.append("break\n");
	}
	
	public void visitNext() {
		result_.append("next\n");
	}
	
	public void visitRedo() {
		result_.append("redo\n");
	}

	public void visitAliasGlobalVariable(String newName, String oldName) {
		visitAliasMethod(newName, oldName);
	}

	public void visitAliasMethod(String newName, String oldName) {
		result_.append("alias ");
		result_.append(newName);
		result_.append(" ");
		result_.append(oldName);
		result_.append("\n");
	}

	public void visitUndef(String name) {
		result_.append("undef ");
		result_.append(name);
		result_.append("\n");
	}

	public void visitWhileBodyEnd() {
		result_.append("end while\n");
	}

	public void visitWhileConditionBegin() {
		result_.append("while condition\n");
	}

	public void visitWhileConditionEnd(boolean is_until) {
		result_.append("end while condition\n");
	}

	public void visitSelfExpression() {
		result_.append("self\n");
	}

	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, int num_of_default_args) {
		result_.append("block:");
		result_.append(num_of_args);
		result_.append(":");
		result_.append(has_asterisk_parameter);
		result_.append(":");
		result_.append(num_of_default_args);	
		result_.append("\n");
		return null;
	}

	public String[] visitBlockEnd(String name, boolean last_statement_has_return_value) {
		result_.append("end block:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
		return null;
	}

	public void visitMrhs(int var, int index, boolean asterisk) {
		result_.append("mrhs:");
		result_.append(index);
		if (asterisk) {
			result_.append("*");
		}
		result_.append("\n");
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		result_.append("begin MultipleAssignment:");
		result_.append(single_lhs);
		result_.append(":");
		result_.append(single_rhs);
		result_.append("\n");
		return 0;
	}

	public void visitMultipleAssignmentEnd() {
		result_.append("end MultipleAssignment\n");
	}

	public int visitNestedVariableBegin(boolean single_lhs) {
		result_.append("begin NestedVariable\n");
		return 0;
	}
	
	public void visitNestedVariableEnd() {
		result_.append("end NestedVariable\n");
	}
}
