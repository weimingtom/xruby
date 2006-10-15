/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public abstract class Expression implements Visitable {
	protected boolean conditionIsAlwayTrue(Expression e) {
		if (e instanceof IntegerExpression) {
			return true;
		} else if (e instanceof FloatExpression) {
			return true;
		} else if (e instanceof StringExpression) {
			return true;
		} else if (e instanceof TrueExpression) {
			return true;
		}
		
		return false;
	}
	
	/// Used for optimazation, so we will not compile dead code
	public boolean will_not_be_executed() {
		return false;
	}
	
	protected boolean conditionIsAlwayFalse(Expression e) {
		if (e instanceof FalseExpression) {
			return true;
		} else if (e instanceof NilExpression) {
			return true;
		}
		
		return false;
	}
	
}
