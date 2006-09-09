/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ModuleDefinationExpression extends Expression {

	private String methodName_;
	private BodyStatement bodyStatement_;
	
	public ModuleDefinationExpression(String methodName, BodyStatement bodyStatement) {
		methodName_ = methodName;
		bodyStatement_ = bodyStatement;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitModuleDefination(methodName_);
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitModuleDefinationEnd(null, bodyStatement_.last_statement_has_return_value());
	}

}
