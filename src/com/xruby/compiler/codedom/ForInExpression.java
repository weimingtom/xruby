/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import antlr.RecognitionException;
import java.util.ArrayList;

public class ForInExpression extends Expression {
	
	private Expression exp_;
	private Block block_;
	
	public ForInExpression(Expression exp, Block block) {
		exp_ = exp;
		block_= block;
	}

	public void accept(CodeVisitor visitor) {
		try {
			for (String var : block_.getParameters()) {
				AssignmentOperatorExpression assign = new AssignmentOperatorExpression(new LocalVariableExpression(var, false), new NilExpression());
				assign.accept(visitor);
				visitor.visitTerminal();
			}
			
			MethodCallExpression e = new MethodCallExpression(exp_, "each", null, block_);
			e.accept(visitor);
		} catch (RecognitionException e1) {
			throw new Error(e1);
		}
	}

	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (String name : block_.getParameters()) {
			if (!symboltable.isDefinedInCurrentScope(name)) {
				result.add(name);
			}
		}
	}
}
