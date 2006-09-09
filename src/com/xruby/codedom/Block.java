/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.ArrayList;

public class Block implements Visitable {

	private CompoundStatement bodyStatement_ = null;
	private ArrayList<String> parameters_ = new ArrayList<String>();
	private String asterisk_parameter_ = null;
	
	public void setBody(CompoundStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(String name) {
		parameters_.add(name);
	}

	public void setAsteriskParameter(String name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = name;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitBlock(parameters_.size(), (null != asterisk_parameter_));
		
		for (String p : parameters_) {
			visitor.visitMethodDefinationParameter(p);
		}

		if (null != asterisk_parameter_) {
			visitor.visitMethodDefinationAsteriskParameter(asterisk_parameter_);
		}
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}

		visitor.visitBlockEnd((null != bodyStatement_) ?
										bodyStatement_.last_statement_has_return_value() : false);
	}
}
