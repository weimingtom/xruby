/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

class Parameter
{
	private String name_;
	private Expression default_value_;
	
	public Parameter(String name, Expression default_value) {
		name_ = name;
		default_value_ = default_value;
	}
	
	public String getName() {
		return name_;
	}
}

public class MethodDefinationExpression extends Expression {

	private String methodName_;
	private BodyStatement bodyStatement_ = null;
	private ArrayList<Parameter> parameters_ = new ArrayList<Parameter>();
	private Parameter asterisk_parameter_ = null;
	
	public MethodDefinationExpression(String methodName) {
		methodName_ = methodName;
	}
	
	public void setBody(BodyStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(String name, Expression default_value) {
		parameters_.add(new Parameter(name, default_value));
	}

	public void setAsteriskParameter(String name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = new Parameter(name, null);
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitMethodDefination(methodName_, parameters_.size(), (null != asterisk_parameter_));
		
		for (Parameter p : parameters_) {
			visitor.visitMethodDefinationParameter(p.getName());
		}
		
		if (null != asterisk_parameter_) {
			visitor.visitMethodDefinationAsteriskParameter(asterisk_parameter_.getName());
		}

		//TODO asterisk_parameter_
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
	
		visitor.visitMethodDefinationEnd((null != bodyStatement_) ?
										bodyStatement_.last_statement_has_return_value() : false);
	}

}
