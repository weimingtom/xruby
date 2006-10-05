/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.ArrayList;

class Pair {
	String name;
	String[] value;
};

public class Block {

	private CompoundStatement bodyStatement_ = null;
	private ArrayList<String> parameters_ = new ArrayList<String>();
	private String asterisk_parameter_ = null;
	private ArrayList<Expression> default_parameters_ = new ArrayList<Expression>();
	
	public void setBody(CompoundStatement bodyStatement) {
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

	public Pair accept(CodeVisitor visitor) {
		String name = visitor.visitBlock(parameters_.size(), (null != asterisk_parameter_), default_parameters_.size());
		
		for (String p : parameters_) {
			visitor.visitMethodDefinationParameter(p);
		}
		
		//TODO support default_value

		if (null != asterisk_parameter_) {
			visitor.visitMethodDefinationAsteriskParameter(asterisk_parameter_);
		}
		
		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
		}

		Pair p = new Pair();
		p.name = name;
		p.value = visitor.visitBlockEnd(name, (null != bodyStatement_) ?
										bodyStatement_.last_statement_has_return_value() : false);
		return p;
	}
}
