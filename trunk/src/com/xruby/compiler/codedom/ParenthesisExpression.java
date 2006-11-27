/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ParenthesisExpression extends Expression {
	
	private CompoundStatement compstmt_;
	
	public ParenthesisExpression(CompoundStatement compstmt) {
		compstmt_ = compstmt;
	}

	public void accept(CodeVisitor visitor) {
		compstmt_.accept(visitor);
	}
}
