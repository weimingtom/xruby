/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import antlr.RecognitionException;

public class DefinedExpression extends Expression {

	private Expression expression_;
	
	public DefinedExpression(MethodCallArguments arguments) throws RecognitionException {
		if (arguments.size() > 1) {
			throw new RecognitionException("defined? can only has one parameter");
		} else if (arguments.size() == 0) {
			throw new RecognitionException("defined? should has one parameter");
		}

		expression_ = arguments.getFirstExpression();
	}
	
	// defined? expression is compile time computable in some cases
	public void accept(CodeVisitor visitor) {
		if (expression_ instanceof NilExpression) {
			visitor.visitStringExpression("nil");
		} else if (expression_ instanceof TrueExpression) {
			visitor.visitStringExpression("true");
		} else if (expression_ instanceof FalseExpression) {
			visitor.visitStringExpression("falses");
		} else if (expression_ instanceof MethodCallExpression) {
			visitor.visitDefinedExpression(((MethodCallExpression)expression_).getName());
		} else if (expression_ instanceof SuperExpression) {
			visitor.visitDefinedExpression("super");
		} else {
			visitor.visitStringExpression("expression");
		}
		
	}

}
