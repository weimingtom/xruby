/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.*;

class Rescue {
	private final ExceptionList condition_;
	private final CompoundStatement body_;
	
	Rescue(ExceptionList condition, CompoundStatement body) {
		condition_ = condition;
		body_ = body;
	}

	public Object accept(CodeVisitor visitor, Object start_label, Object last_label, Object excepton_var) {
		
		Object next_label = condition_.accept(visitor, excepton_var);
		
		if (null != body_) {
			body_.accept(visitor);
		}

		return visitor.visitAfterRescueBody(next_label, last_label);
	}
}

public class BodyStatement implements Visitable {
	
	private final CompoundStatement compoundStatement_;
	private ArrayList<Rescue> rescues_ = new ArrayList<Rescue>();
	private CompoundStatement else_ = null;
	private CompoundStatement ensure_ = null;

	public int size() {
		return compoundStatement_.size();
	}
	
	public BodyStatement(CompoundStatement compoundStatement) {
		compoundStatement_ = compoundStatement;
	}

	boolean last_statement_has_return_value() {
		return compoundStatement_.last_statement_has_return_value();
	}

	public void addRescue(ExceptionList el, CompoundStatement compoundStatement) {
		rescues_.add(new Rescue(el, compoundStatement));
	}

	public void addElse(CompoundStatement compoundStatement) {
		else_ = compoundStatement;
	}

	public void addEnsure(CompoundStatement compoundStatement) {
		ensure_ = compoundStatement;
	}

	public void accept(CodeVisitor visitor) {
		Object start_label = null;
		
		if (!rescues_.isEmpty()) {
			start_label = visitor.visitPrepareRescueBegin();
		}

		compoundStatement_.accept(visitor);
		
		if (!rescues_.isEmpty()) {
			Object exception_var = visitor.visitPrepareRescueEnd(start_label);
			Object last_label = null;
			for (Rescue rescue : rescues_) {
				last_label = rescue.accept(visitor, start_label, last_label, exception_var);
			}
			
			visitor.visitRescueEnd(exception_var, last_label);
		}
	}
}
