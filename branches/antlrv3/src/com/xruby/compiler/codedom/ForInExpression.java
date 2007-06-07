/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.SyntaxException;

import java.util.ArrayList;

public class ForInExpression extends Expression {

	private Expression exp_;
	private Block block_;

	public ForInExpression(Expression exp, Block block) {
		exp_ = exp;
		block_= block;
		block_.setIsForInExpression();
	}

	public void accept(CodeVisitor visitor) {
		block_.initAllParametersToNil(visitor);
        block_.setStartPosition(position);

        MethodCallExpression e;
		try {
			e = new MethodCallExpression(exp_, "each", null, block_);
        } catch (SyntaxException e1) {
			throw new Error(e1);
		}
		e.accept(visitor);
	}

	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		block_.getNewlyAssignedVariables(symboltable, result);
	}
}