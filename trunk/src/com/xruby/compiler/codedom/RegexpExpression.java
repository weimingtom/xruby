package com.xruby.compiler.codedom;

public class RegexpExpression extends StringExpression {

	public RegexpExpression(String value) {
		super(value, false);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitRegexpExpression(getValue());
	}	
}
