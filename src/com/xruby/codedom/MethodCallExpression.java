/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class MethodCallExpression extends Expression {

	private Expression receiver_; 
	private String methodName_;
	private Block block_;
	private MethodCallArguments arguments_;

	public MethodCallExpression(Expression receiver, String methodName, MethodCallArguments arguments, Block block) {
		receiver_ = receiver;
		methodName_ = methodName;
		arguments_ = arguments;
		block_ = block;
	}

	public Expression convertElementAccessToElmentSet(Expression value) {
		MethodCallArguments  args = arguments_.clone();
		args.addArgument(value);
		MethodCallExpression r = new MethodCallExpression(receiver_, "[]=", args, null);
		return r;
	}

	public final String getName() {
		return methodName_;
	}

	public MethodCallArguments getArguments() {
		return arguments_;
	}

	public Block getBlock() {
		return block_;
	}

	public void accept(CodeVisitor visitor) {
		if (null != receiver_) {
			receiver_.accept(visitor);
		} else {
			visitor.visitSelfExpression();
		}

		visitor.visitParameters((null != arguments_)? arguments_.size() : 0);
		if (null != arguments_) {
			arguments_.accept(visitor);
		}

		if (null != block_) {
			block_.accept(visitor);
		}

		visitor.visitMethodCall(methodName_,
							(null != receiver_),
							(null != block_));
	}
}
