/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.ArrayList;

class When {
	
	private final Expression condition_;
	private final CompoundStatement body_;
	
	When(Expression condition, CompoundStatement body) {
		condition_ = condition;
		body_ = body;
	}

	public Object accept(CodeVisitor visitor, Object var, Object end_label) {
		condition_.accept(visitor);
		Object next_label = visitor.visitAfterWhenCondition(var);
		if (null != body_) {
			body_.accept(visitor);
		}
		return visitor.visitAfterWhenBody(next_label, end_label, false);
	}
}

public class CaseExpression extends Expression {
	private final Expression condition_;
	private ArrayList<When> whens = new ArrayList<When>();
	private CompoundStatement else_body_;
	
	public CaseExpression(Expression condition) {
		condition_ = condition;
	}

	public void addWhen(Expression condition, CompoundStatement body) {
		whens.add(new When(condition, body));
	}

	public void addElse(CompoundStatement body) {
		else_body_ = body;
	}

	public void accept(CodeVisitor visitor) {
		condition_.accept(visitor);
		Object var = visitor.visitAfterCaseCondition();

		Object end_label = null;
		for (When when : whens) {
			end_label = when.accept(visitor, var, end_label);
		}
		
		if (null != else_body_) {
			else_body_.accept(visitor);
			visitor.visitAfterWhenBody(null, end_label, true);
		}
	}
}
