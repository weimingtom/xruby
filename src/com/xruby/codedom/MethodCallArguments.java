/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.ArrayList;

public class MethodCallArguments implements Visitable {

	protected final ArrayList<Expression> arguments_ = new ArrayList<Expression>();
	private Expression asterisk_arguments_ = null;
	
	public MethodCallArguments() {
	}
	
	public MethodCallArguments(Expression argument) {
		arguments_.add(argument);
	}

	boolean hasAsteriskArguments() {
		return null != asterisk_arguments_;
	}
	
	public int size() {
		return arguments_.size();
	}

	Expression getFirstExpression() {
		return arguments_.get(0);
	}

	public MethodCallArguments clone() {
		MethodCallArguments r = new MethodCallArguments();
		for (Expression exp : arguments_) {
			r.addArgument(exp);
		}
		return r;
	}

	public void setAsteriskArgument(Expression argument) {
		assert(null == asterisk_arguments_);
		asterisk_arguments_ = argument;
	}

	public void addArgument(Expression argument) {
		arguments_.add(argument);
	}

	private void accept_no_asterisk_arguments(CodeVisitor visitor) {
		int i = 0;
		for (Expression exp : arguments_) {
			visitor.visitParameterBegin(i);
			exp.accept(visitor);
			visitor.visitParameterEnd();
			++i;
		}
	}

	private void accept_with_asterisk_arguments(CodeVisitor visitor) {
		ArrayExpression to_a = new ArrayExpression(arguments_, asterisk_arguments_);
		to_a.accept(visitor, true);
		visitor.visitAsteriskParameter();
	}

	public void accept(CodeVisitor visitor) {
		if (null == asterisk_arguments_) {		
			accept_no_asterisk_arguments(visitor);
		} else {
			accept_with_asterisk_arguments(visitor);
		}
	}
}
