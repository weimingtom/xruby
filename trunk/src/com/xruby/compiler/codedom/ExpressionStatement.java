/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

public class ExpressionStatement extends Statement {
	private Expression exp_;

	public ExpressionStatement(Expression exp) {
		exp_ = exp;
	}
	
	public Expression getExpression() {
		return exp_;
	}

	public void accept(CodeVisitor visitor) {
		exp_.accept(visitor);
	}
	
	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		exp_.getNewlyAssignedVariables(symboltable, result);
	}
}
