/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

// && and || are not as same as other binaray operators, they
//are not method calls and can not be overiden.
public class AndOrBinaryOperatorExpression extends BinaryOperatorExpression {

	public AndOrBinaryOperatorExpression(String operator, Expression left, Expression right) {
		super(operator, left, right);
	}

	public void accept(CodeVisitor visitor) {
		if (operator_.equals("&&")) {
			left_.accept(visitor);
			Object label = visitor.visitAndBinaryOperatorLeft();
			right_.accept(visitor);
			visitor.visitAndBinaryOperatorRight(label);
		} else {
			left_.accept(visitor);
			Object label = visitor.visitOrBinaryOperatorLeft();
			right_.accept(visitor);
			visitor.visitOrBinaryOperatorRight(label);
		}
	}
}
