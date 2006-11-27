/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.math.BigInteger;

public class IntegerExpression extends Expression {
	private BigInteger value_;

	public IntegerExpression(BigInteger value) {
		value_ = value;
	}
	
	public IntegerExpression(int value){
		value_ = BigInteger.valueOf(value);
	}

	public IntegerExpression(String value, int radix) {
		try {
			value_ = new BigInteger(value, radix);
		} catch (NumberFormatException e) {
			//TODO
		}
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitIntegerExpression(value_.toString(), 10);
	}
}
