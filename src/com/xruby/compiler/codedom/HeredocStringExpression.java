package com.xruby.compiler.codedom;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class HeredocStringExpression extends StringExpression {
    private String value;

    public HeredocStringExpression(String value) {
        this.value = value;
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value.toString());
    }
}
