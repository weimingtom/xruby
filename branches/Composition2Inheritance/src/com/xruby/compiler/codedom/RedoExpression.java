package com.xruby.compiler.codedom;

public class RedoExpression extends Expression {

	public void accept(CodeVisitor visitor) {
		visitor.visitRedo();
	}

}
