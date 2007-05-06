package com.xruby.compiler.codedom;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class ExpressionList extends Expression {
    private List expressions = new ArrayList();

    public void addExpression(Expression e) {
        expressions.add(e);
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpressionWithExpressionSubstitutionBegin();

        for (Object o : expressions) {
            if (o instanceof StringBufferExpression) {
                //((StringBufferExpression) o).accept(visitor);
                visitor.visitStringExpressionWithExpressionSubstitution(((StringBufferExpression) o).getValue());
            } else if (o instanceof InstanceVariableExpression) {
                ((InstanceVariableExpression) o).accept(visitor);
                visitor.visitStringExpressionWithExpressionSubstitution();
            } else if (o instanceof ClassVariableExpression) {
                ((ClassVariableExpression) o).accept(visitor);
                visitor.visitStringExpressionWithExpressionSubstitution();
            } else if (o instanceof GlobalVariableExpression) {
                ((GlobalVariableExpression) o).accept(visitor);
                visitor.visitStringExpressionWithExpressionSubstitution();
            } else if (o instanceof CompoundStatement) {
                ((CompoundStatement) o).accept(visitor);
                visitor.visitStringExpressionWithExpressionSubstitution();
            } else {
                assert (false);
            }
        }

        visitor.visitStringExpressionWithExpressionSubstitutionEnd();
    }

    public void add(CompoundStatement compoundStatement) {
        expressions.add(compoundStatement); //todo: because compoundStatement doesn't inherit from Expression,
          // we put different types in expressions.
    }
}
