/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class SymbolExpression extends Expression {
	private final String value_;

	public SymbolExpression(String value) {
		value_ = value;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitSymbolExpression(value_.toString());
	}
}
