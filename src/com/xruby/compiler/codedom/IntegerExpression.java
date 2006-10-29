/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class IntegerExpression extends Expression {
	private int value_;

	public IntegerExpression(int value) {
		value_ = value;
	}

	public IntegerExpression(String value, int radix) {
		try {
			value_ = Integer.parseInt(value, radix);
		} catch (NumberFormatException e) {
			//TODO
		}
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitIntegerExpression(value_);
	}
}
