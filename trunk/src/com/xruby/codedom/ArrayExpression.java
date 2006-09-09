/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class ArrayExpression extends Expression {
	private ArrayList<Expression> elements_;
	
	public ArrayExpression() {
		elements_ = new ArrayList<Expression>();
	}
	
	public ArrayExpression(ArrayList<Expression> elements) {
		elements_ = elements;
	}
	
	public void addElement(Expression e) {
		elements_.add(e);
	}

	public ArrayList<Expression> getElements() {
		return elements_;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitArrayBegin(elements_.size());
		
		int i = 0;
		for (Expression e : elements_) {
			visitor.visitArrayElementBegin();
			e.accept(visitor);
			visitor.visitArrayElementEnd();
			++i;
		}
		
		visitor.visitArrayEnd();
	}
}
