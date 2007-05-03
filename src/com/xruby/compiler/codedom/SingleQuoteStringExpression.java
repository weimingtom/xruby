package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.SyntaxException;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class SingleQuoteStringExpression extends StringExpression {
    private String value;

    public SingleQuoteStringExpression(String value) {
        String text = null;
        if (value.startsWith("'")) {
            text = value.substring(1, value.length() - 1);
        } else if (value.startsWith("%q")) {
            text = value.substring(3, value.length() - 1);
        }
        parseString(text);
    }

    private void parseString(String text) {
        StringBuffer tokens = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '\\') {
                if (i == text.length() - 1) {
                    throw new SyntaxException("unterminated string meets end of file");
                }
                i++;
                c = text.charAt(i);
                if (c == '\\') {
                    tokens.append(c);
                } else if (c == '\'') {
                    tokens.append(c);
                }
            } else {
                tokens.append(c);
            }
        }
        value = tokens.toString();
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value.toString());
    }
}
