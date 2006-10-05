/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class MethodDefinationExpression extends Expression {

	private String methodName_;
	private BodyStatement bodyStatement_ = null;
	private ArrayList<String> parameters_ = new ArrayList<String>();
	private String asterisk_parameter_ = null;
	private ArrayList<Expression> default_parameters_ = new ArrayList<Expression>();
	
	public MethodDefinationExpression(String methodName) {
		methodName_ = methodName;
	}
	
	public void setBody(BodyStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(String name, Expression default_value) {
		parameters_.add(name);
		if (null != default_value) {
			default_parameters_.add(default_value);
		}
	}

	public void setAsteriskParameter(String name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = name;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitMethodDefination(methodName_, parameters_.size(), (null != asterisk_parameter_), default_parameters_.size());
		
		for (String p : parameters_) {
			visitor.visitMethodDefinationParameter(p);
		}
		
		if (null != asterisk_parameter_) {
			visitor.visitMethodDefinationAsteriskParameter(asterisk_parameter_);
		}

		//TODO asterisk_parameter_
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
	
		visitor.visitMethodDefinationEnd((null != bodyStatement_) ?
										bodyStatement_.last_statement_has_return_value() : false);
	}

}
