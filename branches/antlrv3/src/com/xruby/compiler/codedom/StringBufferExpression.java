package com.xruby.compiler.codedom;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 * mean to replace StringExpression or find a way to merge with it
 */
public class StringBufferExpression extends StringExpression {
    private StringBuffer value;

    public StringBufferExpression(StringBuffer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value.toString());
    }
}
