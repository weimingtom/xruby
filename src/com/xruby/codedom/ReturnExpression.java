/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ReturnExpression extends Expression {

	private ReturnArguments arguments_;
	
	public ReturnExpression(ReturnArguments arguments){
		arguments_ = arguments;
	}
	
	public void accept(CodeVisitor visitor) {
		if (null != arguments_) { 
			arguments_.accept(visitor);
		} else {
			visitor.visitNilExpression();
		}
		visitor.visitReturn();
	}

}
