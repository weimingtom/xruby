/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class ArrayExpression extends Expression {
	private ArrayList<Expression> elements_;
	private Expression asterisk_element_ = null;
	
	public ArrayExpression() {
		elements_ = new ArrayList<Expression>();
	}
	
	public ArrayExpression(Expression e) {
		elements_ = new ArrayList<Expression>();
		elements_.add(e);
	}
	
	public ArrayExpression(ArrayList<Expression> elements) {
		elements_ = elements;
	}
	
	public ArrayExpression(ArrayList<Expression> elements, Expression asterisk_element) {
		elements_ = elements;
		asterisk_element_ = asterisk_element;
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
	
	void accept(CodeVisitor visitor, boolean for_multiple_assign) {
		visitor.visitArrayBegin(elements_.size());
		
		for (Expression e : elements_) {
			visitor.visitArrayElementBegin();
			e.accept(visitor);
			visitor.visitArrayElementEnd(false);
		}

		if (null != asterisk_element_) {
			visitor.visitArrayElementBegin();
			asterisk_element_.accept(visitor);
			visitor.visitArrayElementEnd(true);
		}
		
		if (!for_multiple_assign) {
			visitor.visitArrayEnd();
		}
	}
	
	public void accept(CodeVisitor visitor) {
		accept(visitor, false);
	}
	
}
