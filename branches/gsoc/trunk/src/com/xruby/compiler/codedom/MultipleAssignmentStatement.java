/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.*;
import antlr.RecognitionException;

public class MultipleAssignmentStatement extends Statement {
	private ArrayList<Expression> mlhs_ = new ArrayList<Expression>();
	private ArrayList<Expression> mrhs_ = new ArrayList<Expression>();
	private VariableExpression asterisk_lhs_ = null;
	private Expression asterisk_rhs_ = null;
	private boolean handle_special_case_ = false;
	private boolean has_extra_comma_; //e.g. "a, = 1, 2"

	public MultipleAssignmentStatement(boolean has_extra_comma) {
		has_extra_comma_ = has_extra_comma;
	}
	
	public void addLhs(Expression e) throws RecognitionException {
		if (handle_special_case_) {
			mrhs_.add(e);
			return;
		}
		
		if (e instanceof VariableExpression) {
			mlhs_.add((VariableExpression)e);
		} else if (e instanceof AssignmentOperatorExpression) {
			//For inputs like 'a = 1, 2, 3', tree parser will recognize them, but in wrong struture
			AssignmentOperatorExpression a = (AssignmentOperatorExpression)e;
			mlhs_.add(a.getLhs());
			mrhs_.add(a.getRhs());
			handle_special_case_ = true;
		} else if (e instanceof MethodCallExpression) {
			//For inputs like 'a, b = 1', a will be recognized as MethodCall
			MethodCallExpression m = (MethodCallExpression)e;
			if (m.getArguments() == null ||
					m.getArguments().size() == 0) {//TODO more erro checking? e.g. a(), b = 1
				mlhs_.add(new LocalVariableExpression(m.getName(), false));
			} else if (m.isElementSet()) {
				mlhs_.add(m);
			} else {
				throw new RecognitionException("Only variable can be parallel assigned");
			}
		} else {
			throw new RecognitionException("Only variable can be parallel assigned");
		}
	}
	
	public void addRhs(Expression e) {
		mrhs_.add(e);
	}
	
	public void setAsteriskRhs(Expression e) {
		assert(null == asterisk_rhs_);
		asterisk_rhs_ = e;
	}

	public void setAsteriskLhs(Expression e)throws RecognitionException {
		assert(null == asterisk_lhs_);
		if (null == e) {
			asterisk_lhs_ = new LocalVariableExpression("anonymous_asterisk$", false);
		} else if (e instanceof VariableExpression) {
			asterisk_lhs_ = (VariableExpression)e;
		} else {
			throw new RecognitionException("Only variable can be parallel assigned");
		}
	}
	
	public void accept(CodeVisitor visitor) {
		acceptMrhs(visitor, mrhs_, asterisk_rhs_);
		acceptMLhs(visitor, mlhs_, asterisk_lhs_, has_extra_comma_, true);
	}

	/*
	a, b, *c = [1, 2, 3]; p a, b
	a, b, *c = 1, 2, 3; p a, b #<= same

	*a = 1, 2, 3; p a
	*a = [1, 2, 3]; p a #<= NOT same
	*/
	private static void acceptMrhs(CodeVisitor visitor, ArrayList<Expression> mrhs, Expression asterisk_rhs) {
		Expression to_a = new ArrayExpression(mrhs, asterisk_rhs);
		to_a.accept(visitor);
	}

	static void acceptMLhs(CodeVisitor visitor, 
								ArrayList<Expression> mlhs,
								VariableExpression asterisk_lhs,
								boolean has_extra_comma,
								boolean is_multi_rhs) {
		Collections.reverse(mlhs);

		if (!is_multi_rhs && mlhs.size() == 1) {
			visitor.visitMultipleAssignment(true, true, is_multi_rhs);
			((VariableExpression)mlhs.get(0)).acceptAsAssignment(visitor, false, true);
		} else if (mlhs.size() == 1 && null == asterisk_lhs && !has_extra_comma) {
			visitor.visitMultipleAssignment(true, true, is_multi_rhs);
			((VariableExpression)mlhs.get(0)).acceptAsAssignment(visitor, false, true);
		} else {
			int var = visitor.visitMultipleAssignment(false, mlhs.size() > 0, is_multi_rhs);
		
			for (int i = 0; i < mlhs.size(); ++i) {
				visitor.visitMrhs(var, i, false);
			}
			
			if (null != asterisk_lhs) {
				visitor.visitMrhs(var, mlhs.size(), true);
				asterisk_lhs.acceptAsAssignment(visitor, false, true);
			}
			
			for (Expression lhs : mlhs) {
				if (lhs instanceof VariableExpression) {
					((VariableExpression)lhs).acceptAsAssignment(visitor, false, true);
				} else {
					assert(lhs instanceof MethodCallExpression);
					((MethodCallExpression)lhs).acceptMultipleArrayAssign(visitor);
				}
			}
		}
	}

	void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (Expression exp : mlhs_) {
			exp.getNewlyAssignedVariables(symboltable, result);
		}
	}
}
