/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class ArrayExpression extends Expression {
	private ArrayList<Expression> elements_;
	private Expression asterisk_element_;
	private boolean notSingleAsterisk_;
	
	public ArrayExpression() {
		elements_ = new ArrayList<Expression>();
		asterisk_element_ = null;
		notSingleAsterisk_ = true;
	}

	ArrayExpression(ArrayList<Expression> elements, Expression asterisk_element) {
		elements_ = elements;
		asterisk_element_ = asterisk_element;
		notSingleAsterisk_ = elements.size() > 0;
	}
	
	public void addElement(Expression e) {
		elements_.add(e);
	}

	public void setAsteriskElement(Expression e) {
		asterisk_element_ = e;
	}

	public ArrayList<Expression> getElements() {
		return elements_;
	}
	
	void accept(CodeVisitor visitor, boolean create_ruby_value) {
		visitor.visitArrayBegin(elements_.size(), notSingleAsterisk_);
		
		for (Expression e : elements_) {
			visitor.visitArrayElementBegin();
			e.accept(visitor);
			visitor.visitArrayElementEnd(false, e instanceof MethodCallExpression);
		}

		if (null != asterisk_element_) {
			visitor.visitArrayElementBegin();
			asterisk_element_.accept(visitor);
			visitor.visitArrayElementEnd(true, asterisk_element_ instanceof MethodCallExpression);
		}
		
		if (create_ruby_value) {
			visitor.visitArrayEnd();
		}
	}
	
	public void accept(CodeVisitor visitor) {
		accept(visitor, true);
	}
	
}
