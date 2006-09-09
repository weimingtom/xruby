/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ClassVariableExpression extends Expression {
	private final String value_;
	
	public String getValue() {
		return value_.toString();
	}

	public ClassVariableExpression(String value) {
		value_ = value;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitClassVariableExpression(value_);
	}
}
