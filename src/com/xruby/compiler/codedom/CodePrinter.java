/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import org.objectweb.asm.Label;

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

	public void visitDefinedConstant(String name) {
		result_.append("defined? ");
		result_.append(name);
		result_.append("\n");
	}

	public void visitDefinedCurrentNamespaceConstant(String name) {
		visitDefinedConstant(name);
	}

	public void visitDefinedTopLevelConstant(String name) {
		visitDefinedConstant(name);
	}

	public void visitDefinedMethod(String name) {
		result_.append("defined? ");
		result_.append(name);
		result_.append("\n");
	}

	public void visitDefinedSuperMethod() {
		result_.append("defined? super\n");
	}

	public void visitDefinedYield() {
		result_.append("defined? yield\n");
	}

	public void visitDefinedLocalVariable(String name) {
		result_.append("defined? ");
		result_.append(name);
		result_.append("\n");
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
		result_.append(name);
		result_.append("\n");
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

	public void visitNoParameterForSuper() {
	}

	public void visitBinding(boolean single_arg) {
	}

	public void visitNoBlock(boolean is_super_or_block_given_call) {
	}

	public void visitNoSuperClass() {
	}

	public void visitBlockArgument() {
	}

	public void visitMethodCallBegin() {
	}

	public void visitMethodCallEnd(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName, boolean single_arg) {
		result_.append(methodName);
		result_.append(":");
		result_.append(hasReceiver);
		result_.append("\n");
	}

	public void visitFloatExpression(double value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitFixnumExpression(int value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitBignumExpression(BigInteger value) {
		result_.append(value);
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

	public String visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method) {
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

        return methodName;
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

    public void visitModuleDefination1() {
    }
    
	public void visitModuleDefination2(String moduleName, boolean has_scope) {
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

	public Object visitAfterWhenCondition(Object case_value, boolean asterisk) {
		result_.append("when");
		if (asterisk) {
			result_.append("*");
		}
		result_.append("\n");
		return null;
	}

	public Object visitAfterWhenBody(Object next_label, Object end_label) {
		result_.append("end when\n");
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

	public Object visitBodyBegin(boolean has_ensure) {
		result_.append("body begin\n");
		return null;
	}

	public Object visitBodyAfter() {
		result_.append("body after\n");
		return null;
	}

	public void visitBodyEnd(Object label) {
		result_.append("body end\n");
	}

	public Object visitPrepareEnsure() {
		result_.append("visitPrepareEnsure\n");
		return null;
	}

	public int visitRescueBegin(Object begin, Object end) {
		result_.append("visitRescueBegin\n");
		return 0;
	}

	public void visitEnsure(int var) {
		result_.append("ensure\n");
	}

	public int visitEnsureBodyBegin() {
		result_.append("EnsureBodyBegin");
		return 0;
	}

	public void visitEnsureBodyEnd(int var) {
		result_.append("EnsureBodyEnd");
	}

	public void visitAfterRescueBody(Object next_label, Object end_label) {
		result_.append("end rescue\n");
	}

	public void visitRescueEnd(int exception_variable, boolean has_ensure) {
		result_.append("end rescue!\n");
	}

	public Object visitRescueVariable(String name, int exception_var) {
		result_.append("=>");
		result_.append(name);
		result_.append("\n");
		return null;
	}

	public void visitArrayBegin(int size, int rhs_size, boolean has_single_asterisk) {
		result_.append("[:");
		result_.append(size);
		result_.append(":");
		result_.append(rhs_size);
		result_.append(":");
		result_.append(has_single_asterisk);
		result_.append("\n");
	}

	public void visitArrayEnd() {
		result_.append("]!\n");
	}

	public void visitArrayElement(boolean asterisk,boolean is_method_call) {
		if (asterisk) {
			result_.append("[]*\n");
		}

		if (is_method_call)
		{
			result_.append("[]()\n");
		}
	}

	public void visitHashBegin() {
		result_.append("{!\n");
	}

	public void visitHashElement() {
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

	public void visitYieldEnd(int argc) {
		result_.append("end yield\n");
	}

	public void visitSuperBegin() {
		result_.append("super\n");
	}

	public void visitSuperEnd(boolean has_no_arg, boolean has_one_arg) {
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

	public void visitMethodDefinationAsteriskParameter(String name, int argc) {
		result_.append("*parameter:");
		result_.append(name);
		result_.append("\n");
	}

	public void visitMethodDefinationBlockParameter(String name) {
		result_.append("&parameter:");
		result_.append(name);
		result_.append("\n");
	}

	public void visitMethodDefinationDefaultParameters(int size) {
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

	public void visitRetry() {
		result_.append("retry\n");
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

	public void visitWhileBodyEnd(boolean has_body) {
		result_.append("end while\n");
	}

	public void visitFrequentlyUsedInteger(int i) {
		result_.append("FrequentlyUsedInteger:");
		result_.append(i);
		result_.append("\n");
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

	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, 
			int num_of_default_args, boolean is_for_in_expression, 
			boolean has_extra_comma, boolean has_body) {
		result_.append("block:");
		result_.append(num_of_args);
		result_.append(":");
		result_.append(has_asterisk_parameter);
		result_.append(":");
		result_.append(num_of_default_args);
		result_.append(":");
		result_.append(has_extra_comma);
		result_.append(":");
		result_.append(has_body);
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
	

	public int visitMultipleAssignment(boolean single_lhs, boolean has_mlhs, boolean has_mrhs) {
		result_.append("MultipleAssignment:");
		result_.append(single_lhs);
		result_.append(":");
		result_.append(has_mlhs);
		result_.append(":");
		result_.append(has_mrhs);
		result_.append("\n");
		return 0;
	}

	public int visitNestedVariable(boolean single_lhs, boolean has_mlhs) {
		result_.append("NestedVariable:");
		result_.append(single_lhs);
		result_.append(":");
		result_.append(has_mlhs);
		result_.append("\n");
		return 0;
	}

	public boolean isDefinedInCurrentScope(String name) {
		return false;
	}

	public void visitSpecialLambdaCallBegin() {
	}

	public void visitSpecialLambdaCallEnd(String blockName, String[] assignedCommons) {
	}

	public void visitPotentialProcCall() {
	}

    public void visitMultipleArrayAssign() {
	}

    // ---------------------------
    //   Interfaces for debugger
    // ---------------------------
    public Label visitLineLabel(int lineNumber) {
        return null;
    }
}
