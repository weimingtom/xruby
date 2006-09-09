/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ReturnArguments extends MethodCallArguments {

	public void accept(CodeVisitor visitor) {
		expandAsteriskArgument();
		
		if (arguments_.size() > 1) {
			ArrayExpression a = new ArrayExpression(arguments_);
			a.accept(visitor);
		} else if (arguments_.size() == 1){
			arguments_.get(0).accept(visitor);
		} else {
			visitor.visitNilExpression();
		}
	}
}
