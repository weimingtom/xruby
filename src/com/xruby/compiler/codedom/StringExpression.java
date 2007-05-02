/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class StringExpression extends Expression {
    protected final StringBuilder value_ = new StringBuilder();

    //for v3
    public StringExpression() {
    }

    public StringExpression(String value, boolean double_quote) {
        appendString(value, double_quote);
    }

    public String getValue() {
        return value_.toString();
    }

    static String convertDoubleQuoteString(String value) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < value.length(); ++i) {
            if (value.charAt(i) != '\\') {
                result.append(value.charAt(i));
                continue;
            }

            if (i == value.length() - 1) {
                //'\\' is the last char
                result.append('\\');
                break;
            }

            char next_char = value.charAt(i + 1);
            switch (next_char) {
                case 'n':
                    result.append('\n');
                    ++i;
                    break;
                case 't':
                    result.append('\t');
                    ++i;
                    break;
                case 'r':
                    result.append('\r');
                    ++i;
                    break;
                case '\\':
                    result.append('\\');
                    ++i;
                    break;
                case 'b':
                    result.append('\b');
                    ++i;
                    break;
                case 'f':
                    result.append('\f');
                    ++i;
                    break;
                case '\"':
                    result.append('\"');
                    ++i;
                    break;
                case '\'':
                    result.append('\'');
                    ++i;
                    break;
                case '#':
                    result.append('#');
                    ++i;
                    break;
                case 'x':
                    //e.g. "\x63"
                    String hex = value.substring(i + 2, i + 4);
                    char h = (char) Integer.parseInt(hex, 16);
                    result.append(h);
                    i += 3;
                    break;
                default:
                    if (Character.isDigit(next_char)) {
                        //e,g. "\142"
                        String oct = value.substring(i + 1, i + 4);
                        char o = (char) Integer.parseInt(oct, 8);
                        result.append(o);
                        i += 3;
                    } else {
                        result.append('\\');
                    }
            }
        }

        return result.toString();
    }

    public void appendString(String value, boolean double_quote) {
        if (double_quote) {
            value_.append(convertDoubleQuoteString(value));
        } else {
            value_.append(value);
        }
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitStringExpression(value_.toString());
    }
}
