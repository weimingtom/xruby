/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby.compiler.codedom;

public class FloatExpression extends Expression
{
	private float value_;
	
	public float getValue() {
		return value_;
	}

	public FloatExpression(String value) {
		value_ = Float.parseFloat(value);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitFloatExpression(value_);
	}
}

