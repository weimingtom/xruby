package com.xruby.compiler.codedom;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class SingleQuoteStringExpression extends StringExpression {
    private String value;

    public SingleQuoteStringExpression(String value) {
        if (value.startsWith("'")) {
            this.value = value.substring(1, value.length() - 1);
        } else if (value.startsWith("%q")) {
            this.value = value.substring(3, value.length() - 1);
        }
        //this.value = value;
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value.toString());
    }
}
