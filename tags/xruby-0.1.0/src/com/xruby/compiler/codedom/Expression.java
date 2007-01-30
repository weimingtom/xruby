/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

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
	boolean willNotBeExecuted() {
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

	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		//Default behavior is do nothing
	}
	
}
