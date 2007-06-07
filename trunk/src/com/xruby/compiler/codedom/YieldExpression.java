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

		int argc = getArgc();
		if (argc == 0) {
			//visitor.visitNoParameter();
		} else if (argc == 1) {
			arguments_.getFirstExpression().accept(visitor);
		} else {
			arguments_.accept(visitor);
		}
		
		
		visitor.visitYieldEnd(argc);
	}
	
	private int getArgc() {
		if (null == arguments_) {
			return 0;
		}
		
		if (arguments_.getAsteriskArgument() != null) {
			return -1;
		}
		
		if (arguments_.getBlockArgument() != null) {
			return -1;
		}
		
		return arguments_.size();
	}
}

