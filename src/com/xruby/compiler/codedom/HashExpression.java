/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.*;

public class HashExpression extends Expression {
	
	class ExpressionPair implements Visitable {
		private Expression key;
		private Expression value;

		ExpressionPair(Expression k, Expression v) {
			key = k;
			value = v;
		}

		public void accept(CodeVisitor visitor) {
			visitor.visitHashElementBegin();
			key.accept(visitor);
			value.accept(visitor);
			visitor.visitHashElementEnd();
		}
	}
	
	private ArrayList<ExpressionPair> elements_ = new ArrayList<ExpressionPair>();
	
	public void addElement(Expression k, Expression v) {
		elements_.add(new ExpressionPair(k, v));
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitHashBegin();
		
		int i = 0;
		for (ExpressionPair e : elements_) {
			e.accept(visitor);
			++i;
		}
		
		visitor.visitHashEnd();
	}
}
