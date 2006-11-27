package com.xruby.compiler.codedom;

public class RegexpExpressionWithExpressionSubstitution extends ExpressionWithExpressionSubstitution {

	public RegexpExpressionWithExpressionSubstitution(String s) {
		addString(s);
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
		
		visitor.visitRegexpExpressionWithExpressionSubstitutionEnd();
	}

}
