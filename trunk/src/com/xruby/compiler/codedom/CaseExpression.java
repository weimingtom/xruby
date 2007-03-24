/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

class When {
	
	private final Expression condition_;
	final CompoundStatement body_;
	
	When(Expression condition, CompoundStatement body) {
		condition_ = condition;
		body_ = body;
	}

	public Object accept(CodeVisitor visitor, Object var, Object end_label) {
		condition_.accept(visitor);
		Object next_label = visitor.visitAfterWhenCondition(var);
		if (null != body_) {
			body_.accept(visitor);
		} else {
			visitor.visitNilExpression();
		}
		return visitor.visitAfterWhenBody(next_label, end_label);
	}
}

public class CaseExpression extends Expression {
	private final Expression condition_;
	private ArrayList<When> whens_ = new ArrayList<When>();
	private CompoundStatement else_body_;
	
	public CaseExpression(Expression condition) {
		condition_ = condition;
	}

	public void addWhen(Expression condition, CompoundStatement body) {
		whens_.add(new When(condition, body));
	}

	public void addElse(CompoundStatement body) {
		else_body_ = body;
	}

	private void ensureElseBodyIsNotEmpty() {
		if (null == else_body_) {
			else_body_ = new CompoundStatement();
			else_body_.addStatement(new ExpressionStatement(new NilExpression()));
		}
	}

	public void accept(CodeVisitor visitor) {
		ensureElseBodyIsNotEmpty();

		for (When when : whens_) {
			if (null != when.body_) {
				when.body_.ensureVariablesAreInitialized(visitor);
			}
		}
		
		else_body_.ensureVariablesAreInitialized(visitor);
		
		condition_.accept(visitor);
		Object var = visitor.visitAfterCaseCondition();

		Object end_label = null;
		for (When when : whens_) {
			end_label = when.accept(visitor, var, end_label);
		}
		
		else_body_.accept(visitor);
		visitor.visitAfterWhenBody(null, end_label);
	}
}
