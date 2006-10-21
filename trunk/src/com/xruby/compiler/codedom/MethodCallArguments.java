/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

public class MethodCallArguments implements Visitable {

	protected final ArrayList<Expression> arguments_ = new ArrayList<Expression>();
	protected Expression asterisk_argument_ = null;
	protected Expression block_argument_ = null;
	
	public MethodCallArguments() {
	}
	
	public MethodCallArguments(Expression argument) {
		arguments_.add(argument);
	}

	Expression getBlockArgument() {
		return block_argument_;
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
		assert(null == asterisk_argument_);
		asterisk_argument_ = argument;
	}

	public void setBlockArgument(Expression argument) {
		assert(null == block_argument_);
		block_argument_ = argument;
	}

	public void addArgument(Expression argument) {
		arguments_.add(argument);
	}

	public void accept(CodeVisitor visitor) {
		ArrayExpression to_a = new ArrayExpression(arguments_, asterisk_argument_);
		to_a.accept(visitor, false);
	}
}
