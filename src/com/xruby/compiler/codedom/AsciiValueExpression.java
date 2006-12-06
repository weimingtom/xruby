package com.xruby.compiler.codedom;

public class AsciiValueExpression extends Expression {
	private Integer value_;
	
	public AsciiValueExpression(String value) {
		value_ = (int)value.charAt(1);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitIntegerExpression(value_.toString(), 10);
	}
}
