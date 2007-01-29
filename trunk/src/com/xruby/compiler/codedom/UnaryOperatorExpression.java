/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
