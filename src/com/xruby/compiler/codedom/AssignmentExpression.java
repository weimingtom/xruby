package com.xruby.compiler.codedom;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class AssignmentExpression extends Expression {
    private VariableExpression lhs;
    private Expression rhs;

    public AssignmentExpression(VariableExpression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void accept(CodeVisitor visitor) {
        rhs.accept(visitor);
        lhs.acceptAsAssignment(visitor,
                rhs instanceof MethodCallExpression || rhs instanceof YieldExpression,
                false);
    }

}
