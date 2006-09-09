/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.ArrayList;

public class MethodCallArguments implements Visitable {

	protected final ArrayList<Expression> arguments_ = new ArrayList<Expression>();
	private Expression asterisk_arguments_ = null;
	
	public int size() {
		expandAsteriskArgument();
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

	protected void expandAsteriskArgument() {
		//TODO duplication with ParallelAssignmentStatement
		if (null != asterisk_arguments_) {
			if ((asterisk_arguments_ instanceof NilExpression) ||
					(asterisk_arguments_ instanceof IntegerExpression)) {
				arguments_.add(asterisk_arguments_);
				asterisk_arguments_ = null;
			}  else if (asterisk_arguments_ instanceof ArrayExpression) {
				final ArrayList<Expression> elements = ((ArrayExpression)asterisk_arguments_).getElements();
				for (Expression e : elements) {
					arguments_.add(e);
				}
				asterisk_arguments_ = null;
			}
		}
	}

	public void accept(CodeVisitor visitor) {
		expandAsteriskArgument();
		
		int i = 0;
		for (Expression exp : arguments_) {
			visitor.visitParameterBegin(i);
			exp.accept(visitor);
			visitor.visitParameterEnd();
			++i;
		}
	}
}
