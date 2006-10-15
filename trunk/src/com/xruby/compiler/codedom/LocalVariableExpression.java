/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class LocalVariableExpression extends VariableExpression {
	private final String value_;
	private final boolean isFunction_;

	public String getValue() {
		return value_.toString();
	}

	public boolean isFunction() {
		return isFunction_;
	}

	public LocalVariableExpression(String value, boolean isFunction) {
		value_ = value;
		isFunction_ = isFunction;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitLocalVariableExpression(value_);
	}

	public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign) {
		visitor.visitLocalVariableAssignmentOperator(value_, rhs_is_method_call, is_multiple_assign);
	}
}
