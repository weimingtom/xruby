/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;
import antlr.RecognitionException;

public class MultipleAssignmentStatement extends Statement {
	private ArrayList<String> mlhs_ = new ArrayList<String>();
	private ArrayList<Expression> mrhs_ = new ArrayList<Expression>();
	private String asterisk_lhs_ = null;
	private Expression asterisk_rhs_ = null;
	private boolean handle_special_case_ = false;
	
	public void addLhs(Expression e) throws RecognitionException {
		if (handle_special_case_) {
			mrhs_.add(e);
			return;
		}
		
		if (e instanceof VariableExpression) {
			mlhs_.add(((VariableExpression)e).getValue());
		} else if (e instanceof GlobalVariableExpression) {
			mlhs_.add(((GlobalVariableExpression)e).getValue());
		} else if (e instanceof AssignmentOperatorExpression) {
			//For inputs like 'a = 1, 2, 3', tree parser will recognize them, but in wrong struture
			AssignmentOperatorExpression a = (AssignmentOperatorExpression)e;
			mlhs_.add(a.getName());
			mrhs_.add(a.getValue());
			handle_special_case_ = true;
		} else if (e instanceof MethodCallExpression) {
			//For inputs like 'a, b = 1', a will be recognized as MethodCall
			MethodCallExpression m = (MethodCallExpression)e;
			if (m.getArguments() != null &&
					m.getArguments().size() > 0) {//TODO more erro checking? e.g. a(), b = 1
				throw new RecognitionException("Only variable can be parallel assigned");
			}
			mlhs_.add(m.getName());
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
			asterisk_lhs_ = ((VariableExpression)e).getValue();
		} else {
			throw new RecognitionException("Only variable can be parallel assigned");
		}
	}
	
	private void visitMlhs(String name, CodeVisitor visitor) {
		switch (name.charAt(0)) {
			case '$':
				visitor.visitGlobalVariableAssignmentOperator(name);
				break;
			case '@':
				if ('@' == name.charAt(1)) {
					visitor.visitClassVariableAssignmentOperator(name);
				} else {
					visitor.visitInstanceVariableAssignmentOperator(name);
				}
				break;
			default:
				visitor.visitLocalVariableMultipleAssignmentOperator(name);	
		}
	}

	public void accept(CodeVisitor visitor) {
		
		Collections.reverse(mlhs_);
		
		ArrayExpression to_a = new ArrayExpression(mrhs_, asterisk_rhs_);
		
		to_a.accept(visitor, false);
		
		boolean single_mrhs = mrhs_.size() == 1 && null == asterisk_rhs_ && mlhs_.size() > 0;
		
		if (mlhs_.size() == 1 && null == asterisk_lhs_) {
			//a = 1, 2 is as same as a = [1, 2]
			visitor.visitMultipleAssignmentBegin(true, single_mrhs);
			visitMlhs(mlhs_.get(0), visitor);
		} else {
			int var = visitor.visitMultipleAssignmentBegin(false, single_mrhs);
			
			for (int i = 0; i < mlhs_.size(); ++i) {
				visitor.visitMrhs(var, i, false);
			}
			
			if (null != asterisk_lhs_) {
				visitor.visitMrhs(var, mlhs_.size(), true);
				visitMlhs(asterisk_lhs_, visitor);
			}
			
			for (String name : mlhs_) {
				visitMlhs(name, visitor);
			}
		}
		
		visitor.visitMultipleAssignmentEnd();
	}
	
}
