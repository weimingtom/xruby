/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ExpressionStatement extends Statement {
	private Expression exp_;

	public Expression getExpression() {
		return exp_;
	}

	public ExpressionStatement(Expression exp) {
		exp_ = exp;
	}

	public void accept(CodeVisitor visitor) {
		exp_.accept(visitor);
	}
}
