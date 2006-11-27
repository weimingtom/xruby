/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class UnaryOperatorExpression extends Expression {
	private String operator_;
	private Expression left_;

	public UnaryOperatorExpression(String operator, Expression left) {
		operator_ = operator;
		left_ = left;
	}

	public void accept(CodeVisitor visitor) {
		left_.accept(visitor);
		visitor.visitUnaryOperator(operator_);
	}
}
