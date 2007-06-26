/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class ClassDefinationExpression extends Expression {

	private String className_;//e.g. class C
	private Expression exp_;//e.g. class << self
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
			visitor.visitSingletonClassDefination1();
			exp_.accept(visitor);
			visitor.visitSingletonClassDefination2();
		}
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitClassDefinationEnd((null == bodyStatement_) ? false : bodyStatement_.lastStatementHasReturnValue());
	}

}
