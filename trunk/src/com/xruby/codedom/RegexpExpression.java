package com.xruby.codedom;

public class RegexpExpression extends StringExpression {

	public RegexpExpression(String value) {
		super(value, true);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitRegexpExpression(getValue());
	}	
}
