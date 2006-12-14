/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.math.BigInteger;
import antlr.RecognitionException;

public class IntegerExpression extends Expression {
	private BigInteger value_;
	private static final BigInteger FIXNUM_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
	private static final BigInteger FIXNUM_MIN = BigInteger.valueOf(Integer.MIN_VALUE);

	public IntegerExpression(BigInteger value) {
		value_ = value;
	}
	
	public IntegerExpression(int value){
		value_ = BigInteger.valueOf(value);
	}

	public IntegerExpression(String value, int radix) throws RecognitionException {
		try {
			value_ = new BigInteger(value, radix);
		} catch (NumberFormatException e) {
			throw new RecognitionException(e.toString());
		}
	}

	public void accept(CodeVisitor visitor) {
		if (value_.compareTo(FIXNUM_MAX) > 0 || value_.compareTo(FIXNUM_MIN) < 0) {
			visitor.visitBignumExpression(value_);
		} else {
			visitor.visitFixnumExpression(value_.intValue());
		}
	}
}
