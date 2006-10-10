package com.xruby.codedom;

public class Colon2Expression extends Expression {

	private Expression left_;
	private String name_;
	
	public Colon2Expression(Expression left, String name) {
		left_ = left;
		name_ = name;
	}
	
	public void accept(CodeVisitor visitor) {
		left_.accept(visitor);
		visitor.visitColon2(name_);
	}

}
