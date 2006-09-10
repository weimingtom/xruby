/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import antlr.RecognitionException;

class NameFactory
{
	private static AtomicInteger count_ = new AtomicInteger(0);
	
	public static void reset() {
		count_.set(0);
	}
	
	public static String generateTempVariableName() {
		//name like 'tmp$1' won't appear in ruby
		return "tmp$" + count_.getAndIncrement();
	}
}

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

	/*
• If the last rvalue is prefixed with an asterisk and implements to_ary, the rvalue is
replaced with the elements of the array, with each element forming its own rvalue.
• If the assignment contains multiple lvalues and one rvalue, the rvalue is converted
into an Array, and this array is expanded into a set of rvalues as described in (1).
• Successive rvalues are assigned to the lvalues. This assignment effectively happens
in parallel, so that (for example) a,b=b,a swaps the values in a and b.
• If there are more lvalues than rvalues, the excess will have nil assigned to them.
• If there are more rvalues than lvalues, the excess will be ignored.
• These rules are modified slightly if the last lvalue is precededwith an asterisk. This
lvalue will always receive an array during the assignment. The array will consist
of whatever rvalue would normally have been assigned to this lvalue, followed by
the excess rvalues (if any).
• If an lvalue contains a parenthesized list, the list is treated as a nested assignment
statement, and then it is assigned from the corresponding rvalue as described by
these rules.
*/	
	
	private void balance_mlhs_and_mrhs() {
		
		//'a, b = [1, 2]' is same as 'a, b = 1, 2'
		if ((mlhs_.size() > 1) &&
			(mrhs_.size() == 1)) {
			if (mrhs_.get(0) instanceof ArrayExpression) {
				ArrayExpression a = (ArrayExpression)mrhs_.get(0);
				mrhs_ = a.getElements();
			} else {
				//TODO a = [1, 2]; b, c = a; does not work as expected => should be tranlated to b, c = a[0], a[1]
			}
		}
		
		//If there are more lvalues than rvalues, the excess will have nil assigned to them.
		if (null == asterisk_rhs_) {
			int excess = mlhs_.size() - mrhs_.size();
			for (int i = 0; i < excess; ++i) {
				mrhs_.add(new NilExpression());
			}
		}

		if (null != asterisk_rhs_) {
			
			MethodCallExpression to_a = new MethodCallExpression(asterisk_rhs_, "to_a", null, null);
			
			if (mlhs_.size() == 1) {
				MethodCallExpression length = new MethodCallExpression(to_a, "length", null, null);
				BinaryOperatorExpression condition = new BinaryOperatorExpression(">", length, new IntegerExpression(1));
				MethodCallArguments args = new MethodCallArguments(new IntegerExpression(0));
				MethodCallExpression arg_0 = new MethodCallExpression(to_a, "[]", args, null);
				mrhs_.add(new IfExpression(condition, to_a, arg_0));
			} else if (mlhs_.size() == 0 && null != asterisk_lhs_) {
				mlhs_.add(asterisk_lhs_);
				asterisk_lhs_ = null;
				
				BinaryOperatorExpression condition = new BinaryOperatorExpression("==", asterisk_rhs_, new NilExpression());
				mrhs_.add(new IfExpression(condition, new ArrayExpression(new NilExpression()), to_a));
			} else {
				VariableExpression tmp_var = new VariableExpression(NameFactory.generateTempVariableName(), false);
				
				try {
					AssignmentOperatorExpression assign = new AssignmentOperatorExpression(tmp_var, to_a);
					MethodCallArguments args = new MethodCallArguments(new IntegerExpression(0));
					mrhs_.add(new MethodCallExpression(assign, "[]", args, null));
				} catch (RecognitionException e) {
					throw new Error(e);
				}
				
				int excess = mlhs_.size() - mrhs_.size();
				for (int i = 0; i < excess; ++i) {
					MethodCallArguments args = new MethodCallArguments(new IntegerExpression(i + 1));
					mrhs_.add(new MethodCallExpression(tmp_var, "[]", args, null));
				}
			}
			asterisk_rhs_ = null;
		}
		
		//A speical case: 'a = 1, 2' is same as 'a = [1, 2]'
		if ((mlhs_.size() == 1) &&
			(mrhs_.size() > 1)) {
			ArrayExpression array = new ArrayExpression();
			for (Expression e : mrhs_) {
				array.addElement(e);
			}
			
			mrhs_.clear();
			mrhs_.add(array);
		}

		//if the last lvalue is precededwith an asterisk. This
		//lvalue will always receive an array during the assignment. The array will consist
		//of whatever rvalue would normally have been assigned to this lvalue, followed by
		//the excess rvalues (if any).
		if ((null != asterisk_lhs_) && (mrhs_.size() >= mlhs_.size())) {
			ArrayExpression array = new ArrayExpression();
			if (mlhs_.size() < mrhs_.size()) {
				array.getElements().addAll(mlhs_.size(), mrhs_);
				for (int i = mrhs_.size() - 1; i >= mlhs_.size() ; --i) {
					mrhs_.remove(i);
				}
			}
			mrhs_.add(array);
			mlhs_.add(0, asterisk_lhs_);
		}
	}
	
	public void accept(CodeVisitor visitor) {
		
		Collections.reverse(mlhs_);
		
		balance_mlhs_and_mrhs();

		for (Expression e : mrhs_) {
			e.accept(visitor);
		}
		
		// If there are more rvalues than lvalues, the excess will be ignored.
		for (int i = 0; i < (mrhs_.size() - mlhs_.size()); ++i) {
			visitor.visitTerminal();
		}

		for (String name : mlhs_) {
			visitLhs(name, visitor);
		}
	}
	
	private void visitLhs(String name, CodeVisitor visitor) {
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
	
}
