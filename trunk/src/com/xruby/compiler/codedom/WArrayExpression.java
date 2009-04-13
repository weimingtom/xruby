/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class WArrayExpression extends Expression {
	private final String value_;

	public WArrayExpression(String value) {
		value_ = value.trim();
	}

	private ArrayExpression convert2ArrayExpression() {
		ArrayExpression a = new ArrayExpression();
		String[] tokens = value_.split("\\s");
		for (String s : tokens) {
			a.addElement(new StringExpression(s, false));
		}
		return a;
	}
	
	public void accept(CodeVisitor visitor) {
		ArrayExpression a = convert2ArrayExpression();
		a.accept(visitor);
	}
}
