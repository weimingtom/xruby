/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class ExceptionList {

	private ArrayList<VariableExpression> arguments_ = new ArrayList<VariableExpression>();
	private VariableExpression var_ = null;
	
	public void addArgument(VariableExpression v) {
		arguments_.add(v);
	}
	
	public void addExceptionVariable(VariableExpression v) {
		var_ = v;
	}
	
	public Object accept(CodeVisitor visitor, Object excepton_var) {
		visitor.visitParameters(arguments_.size());
		
		int i = 0;
		for (VariableExpression v : arguments_) {
			visitor.visitParameterBegin(i);
			v.accept(visitor);
			visitor.visitParameterEnd();
		}

		if (null != var_) {
			var_.accept(visitor);
		}

		return visitor.visitRescueVariable((null != var_) ? var_.getValue() : null, excepton_var);
	}

}
