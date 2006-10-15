/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class BinaryOperatorExpression extends Expression {

	protected String operator_;
	protected Expression left_;
	protected Expression right_;

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
