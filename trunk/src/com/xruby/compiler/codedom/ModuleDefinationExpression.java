/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ModuleDefinationExpression extends Expression {

	private String moduleName_;
	private BodyStatement bodyStatement_;
	
	public ModuleDefinationExpression(String moduleName, BodyStatement bodyStatement) {
		moduleName_ = moduleName;
		bodyStatement_ = bodyStatement;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitModuleDefination(moduleName_);
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
		
		visitor.visitModuleDefinationEnd((null == bodyStatement_) ? false : bodyStatement_.lastStatementHasReturnValue());
	}

}
