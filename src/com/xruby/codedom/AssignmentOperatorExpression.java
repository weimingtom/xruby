/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import antlr.RecognitionException;

public class AssignmentOperatorExpression extends Expression {

	private String name_;
	private Expression value_;

	String getName() {
		return name_;
	}
	
	Expression getValue() {
		return value_;
	}
	
	public static Expression create(Expression left, Expression right) throws RecognitionException {
		if (left instanceof MethodCallExpression) {
			MethodCallExpression call = (MethodCallExpression)left;
			if (call.getName().equals("[]")) {
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
			name_ = ((VariableExpression)left).getValue();
		} else if (left instanceof GlobalVariableExpression) {
			name_ = ((GlobalVariableExpression)left).getValue();
		}  else if (left instanceof InstanceVariableExpression) {
			name_ = ((InstanceVariableExpression)left).getValue();
		}  else if (left instanceof ClassVariableExpression) {
			name_ = ((ClassVariableExpression)left).getValue();
		} else {
			throw new RecognitionException("Only variable can be assigned");
		}
		
		value_ = right;
	}

	public void accept(CodeVisitor visitor) {
		value_.accept(visitor);
		
		switch (name_.charAt(0)) {
			case '$':
				visitor.visitGlobalVariableAssignmentOperator(name_);
				break;
			case '@':
				if ('@' == name_.charAt(1)) {
					visitor.visitClassVariableAssignmentOperator(name_);
				} else {
					visitor.visitInstanceVariableAssignmentOperator(name_);
				}
				break;
			default:
				visitor.visitLocalVariableAssignmentOperator(name_, value_ instanceof MethodCallExpression);
		}
	}
}
