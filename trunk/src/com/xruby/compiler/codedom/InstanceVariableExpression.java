/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class InstanceVariableExpression extends VariableExpression {
	private final String value_;
	
	public String getValue() {
		return value_.toString();
	}

	public InstanceVariableExpression(String value) {
		value_ = value;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitInstanceVariableExpression(value_);
	}

	public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign) {
		visitor.visitInstanceVariableAssignmentOperator(value_, rhs_is_method_call);
	}
}
