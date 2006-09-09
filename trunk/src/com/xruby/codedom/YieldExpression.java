/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class YieldExpression extends Expression {

	private MethodCallArguments arguments_;

	public YieldExpression(MethodCallArguments arguments) {
		arguments_ = arguments;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitYield();

		if (null != arguments_) {
			visitor.visitParameters(arguments_.size());
			arguments_.accept(visitor);
		} else {
			visitor.visitParameters(0);
		}

		visitor.visitYieldEnd();
	}
}
