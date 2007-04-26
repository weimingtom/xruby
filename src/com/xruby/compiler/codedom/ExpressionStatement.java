/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

public class ExpressionStatement extends Statement {
	private Expression expression;

	public ExpressionStatement(Expression exp) {
		expression = exp;
	}

	public Expression getExpression() {
		return expression;
	}

	public void accept(CodeVisitor visitor) {
        addLineNumberInfo(visitor);
        expression.accept(visitor);
	}

	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		expression.getNewlyAssignedVariables(symboltable, result);
	}

    private void addLineNumberInfo(CodeVisitor visitor) {
        if(expression.shouldlabelNewLine()) {
            // TODO: Add Line Number info
            int lineNumber = expression.getPosition();
            visitor.visitLineLabel(lineNumber);
        }
    }
}
