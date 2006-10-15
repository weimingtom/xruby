package com.xruby.compiler.codedom;

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
		stmts_.add(new GlobalVariableExpression(s));
	}
	
	public void addInstanceVariable(String s) {
		stmts_.add(new InstanceVariableExpression(s));
	}
	
	public void addClassVariable(String s) {
		stmts_.add(new ClassVariableExpression(s));
	}
	
	public void addString(String s) {
		stmts_.add(s);
	}

	public void accept(CodeVisitor visitor) {
		
		visitor.visitStringExpressionWithExpressionSubstitutionBegin();
		
		for (Object o : stmts_) {
			if (o instanceof String) {
				visitor.visitStringExpressionWithExpressionSubstitution((String)o);
			} else if (o instanceof InstanceVariableExpression) {
				((InstanceVariableExpression)o).accept(visitor);
				visitor.visitStringExpressionWithExpressionSubstitution();
			} else if (o instanceof ClassVariableExpression) {
				((ClassVariableExpression)o).accept(visitor);
				visitor.visitStringExpressionWithExpressionSubstitution();
			} else if (o instanceof GlobalVariableExpression) {
				((GlobalVariableExpression)o).accept(visitor);
				visitor.visitStringExpressionWithExpressionSubstitution();
			} else if (o instanceof CompoundStatement){
				((CompoundStatement)o).accept(visitor);
				visitor.visitStringExpressionWithExpressionSubstitution();
			} else {
				assert(false);
			}
		}
		
		visitor.visitStringExpressionWithExpressionSubstitutionEnd();
	}
	
}
