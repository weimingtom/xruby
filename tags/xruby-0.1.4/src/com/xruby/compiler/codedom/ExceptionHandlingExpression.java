/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
