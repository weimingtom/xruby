/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
