/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import antlr.RecognitionException;

public class ForInExpression extends Expression {
	
	private Expression exp_;
	private Block block_;
	
	public ForInExpression(Expression exp, Block block) {
		exp_ = exp;
		block_= block;
	}

	public void accept(CodeVisitor visitor) {
		String var = block_.getFirstParameter();
		
		MethodCallExpression e;
		AssignmentOperatorExpression assign;
		try {
			assign = new AssignmentOperatorExpression(new LocalVariableExpression(var, false), new NilExpression());
			e = new MethodCallExpression(exp_, "each", null, block_);
		} catch (RecognitionException e1) {
			throw new Error(e1);
		}
		
		assign.accept(visitor);
		visitor.visitTerminal();
		e.accept(visitor);
	}
}
