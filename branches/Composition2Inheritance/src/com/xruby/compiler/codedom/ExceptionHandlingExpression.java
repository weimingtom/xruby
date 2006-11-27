/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ExceptionHandlingExpression extends Expression {
	private final BodyStatement bodyStatement_;
	
	public ExceptionHandlingExpression(BodyStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}

	public void accept(CodeVisitor visitor) {
		bodyStatement_.accept(visitor);
	}
}
