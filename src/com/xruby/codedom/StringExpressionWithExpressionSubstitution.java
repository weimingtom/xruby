package com.xruby.codedom;

import java.util.*;

public class StringExpressionWithExpressionSubstitution extends Expression {
	private ArrayList<Object> stmts_ = new ArrayList<Object>();
	
	public StringExpressionWithExpressionSubstitution(String s) {
		addString(s);
	}
	
	public void addCompoundStatement(CompoundStatement stmts) {
		stmts_.add(stmts);
	}
	
	public void addGlobalVariable(String s) {
		stmts_.add(new MethodCallExpression(new GlobalVariableExpression(s), "to_s" , null, null));
	}
	
	public void addInstanceVariable(String s) {
		stmts_.add(new MethodCallExpression(new InstanceVariableExpression(s), "to_s" , null, null));
	}
	
	public void addClassVariable(String s) {
		stmts_.add(new MethodCallExpression(new ClassVariableExpression(s), "to_s" , null, null));
	}
	
	public void addString(String s) {
		stmts_.add(s);
	}

	public void accept(CodeVisitor visitor) {
		
		visitor.visitStringExpressionWithExpressionSubstitutionBegin();
		
		for (Object o : stmts_) {
			if (o instanceof String) {
				visitor.visitStringExpressionWithExpressionSubstitution((String)o);
			} else if (o instanceof MethodCallExpression) {
				
			}
		}
		
		visitor.visitStringExpressionWithExpressionSubstitutionEnd();
	}
	
}
