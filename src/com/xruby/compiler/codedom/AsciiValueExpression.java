package com.xruby.compiler.codedom;

public class AsciiValueExpression extends Expression {
	private int value_;
	
	public AsciiValueExpression(String value) {
		value_ = (int)value.charAt(1);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitFixnumExpression(value_);
	}
}
