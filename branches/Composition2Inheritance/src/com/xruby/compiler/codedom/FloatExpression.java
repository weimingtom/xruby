/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby.compiler.codedom;

public class FloatExpression extends Expression
{
	private double value_;

	public FloatExpression(String value) {
		value_ = Double.parseDouble(value);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitFloatExpression(value_);
	}
}

