/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.SyntaxException;

import java.util.ArrayList;

public class AssignmentOperatorExpression extends Expression {

	private VariableExpression lhs_;
	private Expression rhs_;

	public AssignmentOperatorExpression(Expression left, Expression right) /*throws RecognitionException*/ {
		if (left instanceof VariableExpression) {
			lhs_ = (VariableExpression)left;
		} else {
			throw new SyntaxException("Only variable can be assigned");
		}
		
		rhs_ = right;
	}
	
	VariableExpression getLhs() {
		return lhs_;
	}
	
	Expression getRhs() {
		return rhs_;
	}
	
	public static Expression create(Expression left, Expression right) /*throws RecognitionException*/ {
		if (left instanceof MethodCallExpression) {
			MethodCallExpression call = (MethodCallExpression)left;
			if (call.isElementSet()) {
				return call.convertElementAccessToElementSet(right);
			} else {
				throw new SyntaxException("Method call can not be assigned");
			}
		} else {
			return new AssignmentOperatorExpression(left, right);
		}
	}

	public void accept(CodeVisitor visitor) {
		rhs_.accept(visitor);
		lhs_.acceptAsAssignment(visitor,
				rhs_ instanceof MethodCallExpression || rhs_ instanceof YieldExpression,
				false);
	}
	
	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		if (lhs_ instanceof LocalVariableExpression) {
			String name = ((LocalVariableExpression)lhs_).getValue();
			if (!symboltable.isDefinedInCurrentScope(name)) {
				result.add(name);
			}
		}
	}

	public void getFrequentlyUsedIntegers(ArrayList<Integer> result) {
		rhs_.getFrequentlyUsedIntegers(result);
	}
}
