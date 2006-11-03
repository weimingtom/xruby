/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ClassDefinationExpression extends Expression {

	private String className_;
	private Expression exp_;
	private Expression superClass_;
	private BodyStatement bodyStatement_;
	
	public ClassDefinationExpression(String className, Expression superClass, BodyStatement bodyStatement) {
		className_ = className;
		exp_ = null;
		superClass_ = superClass;
		bodyStatement_ = bodyStatement;
	}

	public ClassDefinationExpression(Expression exp, Expression superClass, BodyStatement bodyStatement) {
		className_ = null;
		exp_ = exp;
		superClass_ = superClass;
		bodyStatement_ = bodyStatement;
	}

	public void accept(CodeVisitor visitor) {
		if (null != className_) {
			visitor.visitClassDefination1(className_);
			if (null != superClass_) {
				superClass_.accept(visitor);
			} else {
				visitor.visitNoSuperClass();
			}
			visitor.visitClassDefination2(className_);
		} else {
			visitor.visitClassDefination3();
			exp_.accept(visitor);
			visitor.visitClassDefination4();
		}
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitClassDefinationEnd((null == bodyStatement_) ? false : bodyStatement_.last_statement_has_return_value());
	}

}
