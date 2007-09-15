/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.compiler.codedom;

import java.util.ArrayList;

public class When {

    private final Expression condition_;
    private final boolean asterisk_;// when *[[1]]
    final CompoundStatement body_;

    public When(Expression condition, boolean asterisk, CompoundStatement body) {
        condition_ = condition;
        asterisk_ = asterisk;
        body_ = body;
    }

    public Object accept(CodeVisitor visitor, Object var, Object end_label) {
        condition_.accept(visitor);
        Object next_label = visitor.visitAfterWhenCondition(var, asterisk_);
        if (null != body_) {
            body_.accept(visitor);
        } else {
            visitor.visitNilExpression();
        }
        return visitor.visitAfterWhenBody(next_label, end_label);
    }

    void pullBlock(ArrayList<Block> result) {
        condition_.pullBlock(result);
        if (null != body_) {
            body_.pullBlock(result);
        }
    }

    void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
        condition_.getNewlyAssignedVariables(symboltable, result);
        if (null != body_) {
            body_.getNewlyAssignedVariables(symboltable, result);
        }
    }
}
