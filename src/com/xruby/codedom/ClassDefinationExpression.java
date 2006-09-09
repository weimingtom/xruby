/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ClassDefinationExpression extends Expression {

	private String className_;
	private String superClassName_;
	private BodyStatement bodyStatement_;
	
	public ClassDefinationExpression(String className, String superClassName, BodyStatement bodyStatement) {
		className_ = className;
		superClassName_ = superClassName;
		bodyStatement_ = bodyStatement;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitClassDefination(className_, superClassName_);
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitClassDefinationEnd(className_, (null == bodyStatement_) ? false : bodyStatement_.last_statement_has_return_value());
	}

}
