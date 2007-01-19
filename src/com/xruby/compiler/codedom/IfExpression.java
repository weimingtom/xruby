/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.*;

import antlr.RecognitionException;

class Elseif {
	
	private final Expression condition_;
	private final CompoundStatement body_;
	
	Elseif(Expression condition, CompoundStatement body) {
		condition_ = condition;
		body_ = body;
	}

	public void accept(CodeVisitor visitor, Object end_label) {
		condition_.accept(visitor);
		Object next_label = visitor.visitAfterIfCondition();
		if (null != body_) {
			body_.accept(visitor);
		}
		visitor.visitAfterIfBody(next_label, end_label);
	}
}

public class IfExpression extends Expression {

	private final Expression if_condition_;
	private CompoundStatement if_body_;
	private ArrayList<Elseif> elsifs = new ArrayList<Elseif>();
	private CompoundStatement else_body_;

	public IfExpression(Expression condition, Expression left, Expression right) {
		if_condition_ = condition;
		if_body_ = new CompoundStatement();
		if_body_.addStatement(new ExpressionStatement(left));
		else_body_ = new CompoundStatement();
		else_body_.addStatement(new ExpressionStatement(right));
	}
	
	public IfExpression(Expression condition, CompoundStatement body) {
		if_condition_ = condition;
		if_body_ = body;
	}

	public void addElsif(Expression condition, CompoundStatement body) {
		elsifs.add(new Elseif(condition, body));
	}

	public void addElse(CompoundStatement body) {
		else_body_ = body;
	}

	private void ensureIfBodyAndElseBodyAreNotEmpty() {
		if (null == if_body_) {
			if_body_ = new CompoundStatement();
			if_body_.addStatement(new ExpressionStatement(new NilExpression()));
		}

		if (null == else_body_) {
			else_body_ = new CompoundStatement();
			else_body_.addStatement(new ExpressionStatement(new NilExpression()));
		}
	}

	static void ensureVariablesAreInitialized(CompoundStatement body, CodeVisitor visitor) {
		//some vairiables appeare first in if's body, and they may not be excuted.
		ArrayList<String> vars = new ArrayList<String>();
		body.getNewlyAssignedVariables(visitor, vars);
		if (vars.isEmpty()) {
			return;
		}
		
		CompoundStatement comp = new CompoundStatement();
		for (String var : vars) {
			try {
				comp.addStatement(new ExpressionStatement(new AssignmentOperatorExpression(new LocalVariableExpression(var, false), new NilExpression())));
			} catch (RecognitionException e) {
				throw new Error(e);
			}
		}
		comp.accept(visitor);
		visitor.visitTerminal();
	}
	
	public void accept(CodeVisitor visitor) {
		ensureIfBodyAndElseBodyAreNotEmpty();

		ensureVariablesAreInitialized(if_body_, visitor);
		ensureVariablesAreInitialized(else_body_, visitor);
		
		//optimazation
		//TODO add more optimazation
		//TODO maybe we should do this in treewalker?
		if (conditionIsAlwayTrue(if_condition_)) {
			if_body_.accept(visitor);
			return;
		}
		
		accept_with_no_optimazation(visitor);	
	}
	
	private void accept_with_no_optimazation(CodeVisitor visitor) {
		if_condition_.accept(visitor);
		Object next_label = visitor.visitAfterIfCondition();

		if_body_.accept(visitor);
		final Object end_label = visitor.visitAfterIfBody(next_label, null);

		for (Elseif elsif : elsifs) {
			elsif.accept(visitor, end_label);
		}
		
		else_body_.accept(visitor);
		visitor.visitAfterIfBody(null, end_label);
	}

}
