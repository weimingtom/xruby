/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class WhileExpression extends Expression {
	private final Expression condition_;
	private final CompoundStatement body_;
	boolean is_until_;
	
	public WhileExpression(Expression condition, CompoundStatement body, boolean is_until) {
		assert(null != condition);
		condition_ = condition;
		body_ = body;
		is_until_ = is_until;
	}
	
	public boolean will_not_be_executed() {
		if (!is_until_ && conditionIsAlwayFalse(condition_)) {
			//while (false)
			return true;
		} else if (is_until_ && conditionIsAlwayTrue(condition_)) {
			//while (true)
			return true;
		} else {
			return false;
		}
	}
	
	public void accept(CodeVisitor visitor) {

		Object label_pair = visitor.visitWhileBody();
		
		if (null != body_) {
			body_.accept(visitor);
		}
		
		visitor.visitWhileConditionBegin(label_pair);
		condition_.accept(visitor);
		visitor.visitWhileConditionEnd(label_pair, is_until_);
	}

}
