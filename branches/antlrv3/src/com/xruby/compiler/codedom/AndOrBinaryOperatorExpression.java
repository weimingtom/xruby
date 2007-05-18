/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

// && and || are not as same as other binaray operators, they
//are not method calls and can not be overiden.
public class AndOrBinaryOperatorExpression extends BinaryOperatorExpression {

    public AndOrBinaryOperatorExpression(String operator, Expression left, Expression right) {
        super(operator, left, right);
    }

    private void ensureVariablesAreInitialized(CodeVisitor visitor) {
        //e.g. false or a = 1; print a
        ArrayList<String> vars = new ArrayList<String>();
        right_.getNewlyAssignedVariables(visitor, vars);
        if (vars.isEmpty()) {
            return;
        }

        CompoundStatement comp = new CompoundStatement();
        for (String var : vars) {
             comp.addStatement(new ExpressionStatement(new AssignmentOperatorExpression(new LocalVariableExpression(var, false), new NilExpression())));
        }
        comp.accept(visitor);
        visitor.visitTerminal();
    }

    public void accept(CodeVisitor visitor) {
        if (operator_.equals("&&") || operator_.equals("and")) {
            left_.accept(visitor);
            Object label = visitor.visitAndBinaryOperatorLeft();
            right_.accept(visitor);
            visitor.visitAndBinaryOperatorRight(label);
        } else {
            ensureVariablesAreInitialized(visitor);
            left_.accept(visitor);
            Object label = visitor.visitOrBinaryOperatorLeft();
            right_.accept(visitor);
            visitor.visitOrBinaryOperatorRight(label);
        }
    }
}
