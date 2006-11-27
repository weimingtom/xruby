/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import antlr.RecognitionException;

public class AssignmentOperatorExpression extends Expression {

	private VariableExpression lhs_;
	private Expression rhs_;

	VariableExpression getLhs() {
		return lhs_;
	}
	
	Expression getRhs() {
		return rhs_;
	}
	
	public static Expression create(Expression left, Expression right) throws RecognitionException {
		if (left instanceof MethodCallExpression) {
			MethodCallExpression call = (MethodCallExpression)left;
			if ((call.getName().equals("[]") ||
				call.hasReceiver())) {
				return call.convertElementAccessToElmentSet(right);
			} else {
				throw new RecognitionException("Method call can not be assigned");
			}
		} else {
			return new AssignmentOperatorExpression(left, right);
		}
	}

	public AssignmentOperatorExpression(Expression left, Expression right) throws RecognitionException {
		if (left instanceof VariableExpression) {
			lhs_ = (VariableExpression)left;
		} else {
			throw new RecognitionException("Only variable can be assigned");
		}
		
		rhs_ = right;
	}

	public void accept(CodeVisitor visitor) {
		rhs_.accept(visitor);
		lhs_.acceptAsAssignment(visitor,
				rhs_ instanceof MethodCallExpression || rhs_ instanceof YieldExpression,
				false);
	}
}
