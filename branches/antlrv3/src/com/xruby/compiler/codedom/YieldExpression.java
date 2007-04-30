/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class YieldExpression extends Expression {

	private MethodCallArguments arguments_;

	public YieldExpression(MethodCallArguments arguments) {
		arguments_ = arguments;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitYieldBegin();

		if (null == arguments_) {
			visitor.visitNoParameter();
		} else {
			arguments_.accept(visitor);
		}

		visitor.visitYieldEnd();
	}
}

