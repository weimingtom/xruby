/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class UnlessExpression extends Expression {

	private final Expression unless_condition_;
	private final CompoundStatement unless_body_;
	private final CompoundStatement else_body_;
	
	public UnlessExpression(Expression condition, CompoundStatement body, CompoundStatement else_body) {
		unless_condition_ = condition;
		unless_body_ = body;
		else_body_ = else_body;
	}
	
	public void accept(CodeVisitor visitor) {
		
		//optimazation
		//TODO add more optimazation
		//TODO maybe we should do this in treewalker?
		if (conditionIsAlwayFalse(unless_condition_)) {
			unless_body_.accept(visitor);
			return;
		}
		
		accept_with_no_optimazation(visitor);	
	}
	
	private void accept_with_no_optimazation(CodeVisitor visitor) {
		unless_condition_.accept(visitor);
		Object next_label = visitor.visitAfterUnlessCondition();
		if (null != unless_body_) {
			unless_body_.accept(visitor);
		}
		final Object end_label = visitor.visitAfterUnlessBody(next_label, null, null == else_body_);
		
		if (null != else_body_) {
			else_body_.accept(visitor);
			visitor.visitAfterUnlessBody(null, end_label, true);
		}
	}

}
