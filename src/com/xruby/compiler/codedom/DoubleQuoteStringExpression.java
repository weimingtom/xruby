package com.xruby.compiler.codedom;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class DoubleQuoteStringExpression extends StringExpression {
    private String value;

    public DoubleQuoteStringExpression(String value) {
        if (value.startsWith("\"")) {
            this.value = value.substring(1, value.length() - 1);
        } else if (value.startsWith("%Q")) {
            this.value = value.substring(3, value.length() - 1);
        } else if (value.startsWith("%")) {
            this.value = value.substring(2, value.length() - 1);
        }
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value.toString());
    }
}
