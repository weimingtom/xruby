/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class CommandOutputExpression extends Expression {
	private final StringBuilder value_;

	public CommandOutputExpression(String value) {
		value_ = new StringBuilder(value);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitCommandOutputExpression(value_.toString());
	}
}
