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
        int begin = 0;
        int end = 0;
        if (value.startsWith("'")) {
            text = value.substring(1, value.length() - 1);
            begin = '\'';
            end = '\'';
        } else if (value.startsWith("%q")) {
            if (value.length() <= 3) {
                throw new SyntaxException("unterminated string meets end of file");
            }
            text = value.substring(3, value.length() - 1);
            begin = value.charAt(2);
            end = value.charAt(value.length() - 1);
        }
        parseString(text, end, begin);
    }

    private void parseString(String text, int end, int begin) {
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
                } /*else if (c == '\'') { //should judge acording to begin, end
                    tokens.append(c);
                }*/
                else if (c == begin || c == end) {
                    tokens.append(c);
                } else {
                    tokens.append("\\");
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
