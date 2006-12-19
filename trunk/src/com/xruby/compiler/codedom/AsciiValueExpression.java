package com.xruby.compiler.codedom;

public class AsciiValueExpression extends Expression {
	private int value_;
	
	public AsciiValueExpression(String value) {
		if (value.charAt(1) == '\\') {
			switch (value.charAt(2)) {
				case 'n':
					value_ = '\n';
					return;
				case 'r':
					value_ = '\r';
					return;
				default:
					//TODO more escped value
					value_ = (int)value.charAt(2);
					return;
				
			}
		} else {
			value_ = (int)value.charAt(1);
			return;
		}
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitFixnumExpression(value_);
	}
}
