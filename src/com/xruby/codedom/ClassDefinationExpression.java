/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ClassDefinationExpression extends Expression {

	private String className_;
	private Expression superClass_;
	private BodyStatement bodyStatement_;
	
	public ClassDefinationExpression(String className, Expression superClass, BodyStatement bodyStatement) {
		className_ = className;
		superClass_ = superClass;
		bodyStatement_ = bodyStatement;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitClassDefination1(className_);
		superClass_.accept(visitor);
		visitor.visitClassDefination2(className_);
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitClassDefinationEnd(className_, (null == bodyStatement_) ? false : bodyStatement_.last_statement_has_return_value());
	}

}
