/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class SuperExpression extends Expression {

	private MethodCallArguments arguments_;
	private Block block_;

	public SuperExpression(MethodCallArguments arguments, Block block) {
		arguments_ = arguments;
		block_ = block;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitSuperBegin();

		if (null == arguments_) {
			visitor.visitNoParameter();
		} else {
			arguments_.accept(visitor);
		}

		String name = null;
		String[] assignedCommons = null;
		if (null != block_) {
			Pair p = block_.accept(visitor);
			name = p.name;
			assignedCommons = p.value;
		} else if (null != arguments_ && null != arguments_.getBlockArgument()) {
			arguments_.getBlockArgument().accept(visitor);
			visitor.visitBlockArgument();
		} else {
			visitor.visitNoBlock();
		}

		visitor.visitSuperEnd();
	}

}
