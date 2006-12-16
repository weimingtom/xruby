package com.xruby.compiler.codedom;

public class RetryExpression extends Expression {

	public void accept(CodeVisitor visitor) {
		visitor.visitRetry();
	}

}
