/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class SuperExpression extends Expression {

	public void accept(CodeVisitor visitor) {
		visitor.visitSuperExpression();
	}

}
