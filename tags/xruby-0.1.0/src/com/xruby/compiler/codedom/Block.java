/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

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
	private boolean should_validate_argument_length_ = false;
	private boolean is_for_in_expression_ = false;
	
	ArrayList<String> getParameters() {
		return parameters_;
	}
	
	public void setBody(CompoundStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(String name, Expression default_value) {
		parameters_.add(name);
		if (null != default_value) {
			default_parameters_.add(default_value);
		}
	}

	void setIsForInExpression() {
		is_for_in_expression_ = true;
	}

	//{||} -> true
	//{|x,...|} -> true
	//{} -> false
	public void setShouldValidateArgumentLength() {
		should_validate_argument_length_ = true;
	}

	public void setAsteriskParameter(String name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = name;
	}

	public Pair accept(CodeVisitor visitor) {
		String name = visitor.visitBlock((should_validate_argument_length_ ? parameters_.size() : -1),
									(null != asterisk_parameter_),
									default_parameters_.size(),
									is_for_in_expression_);
		
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
										bodyStatement_.lastStatementHasReturnValue() : false);
		return p;
	}
}
