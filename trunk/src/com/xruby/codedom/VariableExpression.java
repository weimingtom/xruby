/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class VariableExpression extends Expression {
	private final String value_;
	private final boolean isFunction_;

	public String getValue() {
		return value_.toString();
	}

	public boolean isFunction() {
		return isFunction_;
	}

	public VariableExpression(String value, boolean isFunction) {
		value_ = value;
		isFunction_ = isFunction;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitVariableExpression(value_);
	}
}
