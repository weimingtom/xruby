/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;
import antlr.RecognitionException;

public class CompoundStatement implements Visitable {
	protected ArrayList<Statement> statements_ = new ArrayList<Statement>();
    private int lastLine = 0;

    public void addStatement(Statement statement) {
		if (null != statement) {
			//optimazation: remove dead code
			if (statement instanceof ExpressionStatement) {
				Expression expression = ((ExpressionStatement) statement).getExpression();
				if (!expression.willNotBeExecuted()) {
					statements_.add(statement);
				}
                if(expression.shouldlabelNewLine() && expression.getPosition() > 0) {
                    lastLine = expression.getPosition();
                }
			} else {
				statements_.add(statement);
			}
		}
	}

	int size() {
		return statements_.size();
	}

    public int getLastLine() {
        return lastLine;
    }

	boolean lastStatementHasReturnValue() {
		if (statements_.isEmpty()) {
			return false;
		} else if (statements_.get(statements_.size() - 1) instanceof ExpressionStatement) {
			ExpressionStatement e = (ExpressionStatement)statements_.get(statements_.size() - 1);
			if (e.getExpression() instanceof ReturnExpression ||
				e.getExpression() instanceof BreakExpression ||
				e.getExpression() instanceof NextExpression ||
				e.getExpression() instanceof RedoExpression) {
				return false;
			} else {
				return true;
			}
		} else if (statements_.get(statements_.size() - 1) instanceof MultipleAssignmentStatement) {
			return true;
		} else {
			return false;
		}
	}

	void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (Statement s : statements_) {
			s.getNewlyAssignedVariables(symboltable, result);
		}
	}

	void ensureVariablesAreInitialized(CodeVisitor visitor) {
		//some vairiables appeare first in if's body, and they may not be excuted.
		ArrayList<String> vars = new ArrayList<String>();
		getNewlyAssignedVariables(visitor, vars);
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

		int i = 0;
		for (Statement statement : statements_) {
			++i;
			statement.accept(visitor);

			if ((statement instanceof ExpressionStatement || statement instanceof MultipleAssignmentStatement) && (i != statements_.size())) {
				visitor.visitTerminal();
			}
		}
	}
}
