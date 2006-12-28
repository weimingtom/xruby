/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.*;
import antlr.RecognitionException;

public class MultipleAssignmentStatement extends Statement {
	private ArrayList<VariableExpression> mlhs_ = new ArrayList<VariableExpression>();
	private ArrayList<Expression> mrhs_ = new ArrayList<Expression>();
	private VariableExpression asterisk_lhs_ = null;
	private Expression asterisk_rhs_ = null;
	private boolean handle_special_case_ = false;
	private boolean has_extra_comma_ = false; //e.g. "a, = 1, 2"

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
			if (m.getArguments() != null &&
					m.getArguments().size() > 0) {//TODO more erro checking? e.g. a(), b = 1
				throw new RecognitionException("Only variable can be parallel assigned");
			}
			mlhs_.add(new LocalVariableExpression(m.getName(), false));
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
		if (e instanceof VariableExpression) {
			asterisk_lhs_ = (VariableExpression)e;
		} else {
			throw new RecognitionException("Only variable can be parallel assigned");
		}
	}
	
	public void accept(CodeVisitor visitor) {
		
		Collections.reverse(mlhs_);
		
		ArrayExpression to_a = new ArrayExpression(mrhs_, asterisk_rhs_);
		
		to_a.accept(visitor);
		
		boolean single_mrhs = mrhs_.size() == 1 && null == asterisk_rhs_ && mlhs_.size() > 0;
		
		if (mlhs_.size() == 1 && null == asterisk_lhs_ && !has_extra_comma_) {
			//a = 1, 2 is as same as a = [1, 2]
			visitor.visitMultipleAssignmentBegin(true, single_mrhs);
			mlhs_.get(0).acceptAsAssignment(visitor, false, true);
		} else {
			int var = visitor.visitMultipleAssignmentBegin(false, single_mrhs);
			
			for (int i = 0; i < mlhs_.size(); ++i) {
				visitor.visitMrhs(var, i, false);
			}
			
			if (null != asterisk_lhs_) {
				visitor.visitMrhs(var, mlhs_.size(), true);
				asterisk_lhs_.acceptAsAssignment(visitor, false, true);
			}
			
			for (VariableExpression lhs : mlhs_) {
				lhs.acceptAsAssignment(visitor, false, true);
			}
		}
		
		visitor.visitMultipleAssignmentEnd();
	}
	
}
