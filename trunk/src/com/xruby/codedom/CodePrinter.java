/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class CodePrinter implements CodeVisitor {
	StringBuilder result_ = new StringBuilder();

	public String toString() {
		return result_.toString();
	}
	
	public void visitBinaryOperator(String operator) {
		result_.append(operator);
		result_.append("\n");
	}
	
	public void visitUnaryOperator(String operator) {
		result_.append(operator);
		result_.append("\n");
	}
	
	public void visitGlobalVariableAssignmentOperator(String var) {
		result_.append(var);
		result_.append(" =\n");
	}

	public void visitInstanceVariableAssignmentOperator(String var) {
		result_.append(var);
		result_.append(" =\n");
	}

	public void visitClassVariableAssignmentOperator(String var) {
		result_.append(var);
		result_.append(" =\n");
	}

	public void visitLocalVariableAssignmentOperator(String var) {
		result_.append(var);
		result_.append(" =\n");
	}
	
	public void visitLocalVariableMultipleAssignmentOperator(String var) {
		result_.append(var);
		result_.append(" //=\n");
	}

	public void visitMethodCall(String methodName, boolean hasReceiver, boolean hasBlock) {
		result_.append(methodName);
		result_.append(":");
		result_.append(hasReceiver);
		result_.append(":");
		result_.append(hasBlock);
		result_.append("\n");
	}

	public void visitParameters(int size) {
		result_.append("parameters:");
		result_.append(size);
		result_.append("\n");
	}
	
	public void visitParameterBegin(int index) {
		result_.append("(\n");
		result_.append(index);
		result_.append(":");
	}

	public void visitParameterEnd() {
		result_.append(")\n");
	}

	public void visitFloatExpression(float value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitIntegerExpression(int value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitStringExpression(String value) {
		result_.append(value);
		result_.append("\n");
	}

	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter) {
		result_.append("def ");
		result_.append(methodName);
		result_.append(":");
		result_.append(num_of_args);
		result_.append(":");
		result_.append(has_asterisk_parameter);
		result_.append("\n");
	}

	public void visitClassDefination(String className, String superClassName) {
		result_.append("class ");
		result_.append(className);
		result_.append(" < ");
		result_.append(superClassName);
		result_.append("\n");
	}
	
	public void visitModuleDefination(String className) {
		result_.append("module ");
		result_.append(className);
		result_.append("\n");
	}

	public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
		result_.append("end def:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}
	
	public void visitClassDefinationEnd(String className, boolean last_statement_has_return_value) {
		result_.append("end ");
		result_.append(className);
		result_.append(":");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}

	public void visitModuleDefinationEnd(String moduleName, boolean last_statement_has_return_value) {
		result_.append("end ");
		result_.append(moduleName);
		result_.append(":");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}

	public void visitTerminal() {
		result_.append(";\n");
	}

	public void visitEof(boolean last_statement_has_return_value) {
		result_.append("EOF");
	}

	public void visitVariableExpression(String value) {
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

	public Object visitAfterIfBody(Object next_label, Object end_label, boolean is_last) {
		result_.append("end if");
		if (is_last) {
			result_.append("!");
		}
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

	public Object visitAfterWhenBody(Object next_label, Object end_label, boolean is_last) {
		result_.append("end when");
		if (is_last) {
			result_.append("!");
		}
		result_.append("\n");
		return null;
	}

	public Object visitAfterUnlessCondition() {
		result_.append("unless\n");
		return null;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label, boolean is_last) {
		result_.append("end unless");
		if (is_last) {
			result_.append("!");
		}
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

	public Object visitAfterRescueBody(Object next_label, Object end_label, boolean is_last) {
		result_.append("end rescue\n");
		return null;
	}

	public void visitRescueEnd(Object exception_var) {
		result_.append("end rescue!\n");
	}
	
	public Object visitRescueVariable(String name, Object exception_var) {
		result_.append("=>");
		result_.append(name);
		result_.append("\n");
		return null;
	}

	public void visitArrayBegin(int size) {
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

	public void visitArrayElementEnd(boolean asterisk) {
		if (asterisk) {
			result_.append("]*\n");
		} else {
			result_.append("]\n");
		}
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

	public void visitYield() {
		result_.append("yield\n");
	}
	
	public void visitYieldEnd() {
		result_.append("end yield\n");
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

	public void visitReturn() {
		result_.append("return\n");
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

	public Object visitWhileBody() {
		result_.append("while\n");
		return null;
	}

	public void visitWhileConditionBegin(Object label_pair) {
		result_.append("while condition\n");
	}

	public void visitWhileConditionEnd(Object label_pair, boolean is_until) {
		result_.append("end while\n");
	}

	public void visitSelfExpression() {
		result_.append("self\n");
	}

	public void visitSuperExpression() {
		result_.append("super\n");
	}

	public void visitBlock(int num_of_args, boolean has_asterisk_parameter) {
		result_.append("block:");
		result_.append(num_of_args);
		result_.append(":");
		result_.append(has_asterisk_parameter);
		result_.append("\n");
	}

	public void visitBlockEnd(boolean last_statement_has_return_value) {
		result_.append("end block:");
		result_.append(last_statement_has_return_value);
		result_.append("\n");
	}

	public void visitMrhs(int var, int index, boolean asterisk) {
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



}
