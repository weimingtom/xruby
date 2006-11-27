package com.xruby.compiler.codedom;

import java.util.*;
import antlr.RecognitionException;

public class NestedVariableExpression extends VariableExpression{
	private ArrayList<VariableExpression> mlhs_ = new ArrayList<VariableExpression>();
	private VariableExpression asterisk_lhs_ = null;

	public void addLhs(Expression e) throws RecognitionException {
		if (e instanceof VariableExpression) {
			mlhs_.add((VariableExpression)e);
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
	
	public void setAsteriskLhs(Expression e)throws RecognitionException {
		assert(null == asterisk_lhs_);
		if (e instanceof VariableExpression) {
			asterisk_lhs_ = (VariableExpression)e;
		} else {
			throw new RecognitionException("Only variable can be parallel assigned");
		}
	}
	
	public void accept(CodeVisitor visitor) {
		throw new Error("Nested variable should not appear in thie context");
	}

	//TODO duplicated code from MultipleAssignmentStatement
	public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign) {
		assert(is_multiple_assign);
		Collections.reverse(mlhs_);
		
		boolean single_mrhs = true;
		
		if (mlhs_.size() == 1 && null == asterisk_lhs_) {
			//a = 1, 2 is as same as a = [1, 2]
			visitor.visitNestedVariableBegin(true);
			mlhs_.get(0).acceptAsAssignment(visitor, false, true);
		} else {
			int var = visitor.visitNestedVariableBegin(false);
			
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

		visitor.visitNestedVariableEnd();
	}
	
}
