/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.*;

public class MethodDefinationExpression extends Expression {

	private String methodName_;
	private Expression method_owner_;
	private BodyStatement bodyStatement_ = null;
	private ArrayList<String> parameters_ = new ArrayList<String>();
	private String asterisk_parameter_ = null;
	private String block_parameter_ = null;
	private ArrayList<Expression> default_parameters_ = new ArrayList<Expression>();
	
	public MethodDefinationExpression(String methodName) {
		methodName_ = methodName;
		method_owner_ = null;
	}

	public MethodDefinationExpression(String methodName, Expression method_owner) {
		methodName_ = methodName;
		method_owner_ = method_owner;
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

	public void setBlockParameter(String name) {
		assert(null == block_parameter_);
		block_parameter_ = name;
	}
	
	public void accept(CodeVisitor visitor) {
		if (null != method_owner_) {
			method_owner_.accept(visitor);
		}
		
		visitor.visitMethodDefination(methodName_,
						parameters_.size(),
						(null != asterisk_parameter_),
						default_parameters_.size(),
						(null != method_owner_));
		
		for (String p : parameters_) {
			visitor.visitMethodDefinationParameter(p);
		}
		
		if (null != asterisk_parameter_) {
			visitor.visitMethodDefinationAsteriskParameter(asterisk_parameter_);
		}

		if (null != block_parameter_) {
			visitor.visitMethodDefinationBlockParameter(block_parameter_);
		}

		int i = parameters_.size() - default_parameters_.size();
		for (Expression e : default_parameters_) {
			Object next_label = visitor.visitMethodDefinationDefaultParameterBegin(i);
			e.accept(visitor);
			visitor.visitMethodDefinationDefaultParameterEnd(next_label);
			++i;
		}
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}
	
		visitor.visitMethodDefinationEnd((null != bodyStatement_) ?
										bodyStatement_.last_statement_has_return_value() : false);
	}

}
