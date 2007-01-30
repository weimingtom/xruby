/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
			visitor.visitNoParameterForSuper();
		} else {
			arguments_.accept(visitor);
		}

		if (null != block_) {
			block_.accept(visitor);
		} else if (null != arguments_ && null != arguments_.getBlockArgument()) {
			arguments_.getBlockArgument().accept(visitor);
			visitor.visitBlockArgument();
		} else {
			visitor.visitNoBlock(true);
		}

		visitor.visitSuperEnd();
	}

}
