/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class BinaryOperatorExpression extends Expression {

	private String operator_;
	private Expression left_;
	private Expression right_;

	public BinaryOperatorExpression(String operator, Expression left, Expression right) {
		operator_ = operator;
		left_ = left;
		right_ = right;
	}

	public void accept(CodeVisitor visitor) {
		left_.accept(visitor);
		right_.accept(visitor);
		visitor.visitBinaryOperator(operator_);
	}
}
