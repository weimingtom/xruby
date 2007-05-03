package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.SyntaxException;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class DoubleQuoteStringExpression extends StringExpressionWithExpressionSubstitution {


    public DoubleQuoteStringExpression(String value) {

        String text = null;
        if (value.startsWith("\"")) {
            text = value.substring(1, value.length() - 1);
        } else if (value.startsWith("%Q")) {
            text = value.substring(3, value.length() - 1);
        } else if (value.startsWith("%")) {
            text = value.substring(2, value.length() - 1);
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
                //c = text.charAt(i);
                i = read_escape(text, i, tokens);
            } else if (c == '#' && i < text.length() - 1) {
                i++;
                c = text.charAt(i);
                if (c == '{') {
                    //read_statements();
                } //todo: more on this c=='@', c=='$'
            } else {
                tokens.append(c);
            }
        }
        stmts_.add(tokens.toString());
    }

    //port from JRuby
    /**
     * @param text
     * @param index
     * @param tokens
     * @return new Index after we read escape
     */
    private int read_escape(String text, int index, StringBuffer tokens) {
        char c;
        switch (c = text.charAt(index)) {
            case 'n':
                tokens.append('\n');
                return ++index;
            case 'r':
                tokens.append('\r');
                return ++index;
            case '\\': // backslash
                tokens.append('\\');
                return ++index;
            case 't': // horizontal tab
                tokens.append('\t');
                return ++index;
            case 'f': // form feed
                tokens.append('\f');
                return ++index;
            case 'v': // vertical tab
                tokens.append('\u0013');
                return ++index;
            case 'a': // alarm(bell)
                tokens.append('\u0007');
                return ++index;
            case 'e': // escape
                tokens.append('\u0033');
                return ++index;
            case 'b': // backspace
                tokens.append('\010');
                return ++index;
            case 's': // space
                tokens.append(' ');
                return ++index;
            case '0':
            case '1':
            case '2':
            case '3': // octal constant
            case '4':
            case '5':
            case '6':
            case '7':
                return scanOct(text, index, tokens, 3);
            case 'x':
                return scanHex(text, index + 1, tokens, 2);
            default:
                tokens.append(c);
                return ++index;
        }

    }

    private int scanOct(String text, int index, StringBuffer tokens, int count) {
        char value = '\0';

        for (int i = 0; i < count; i++) {
            if (index == text.length()) {
                break;
            }
            char c = text.charAt(index++);

            if (!isOctChar(c)) {
                index--;
                break;
            }

            value <<= 3;
            value |= Integer.parseInt("" + c, 8);
        }
        if (value > 255) {
            value = 255;
        }
        tokens.append(value);
        return index;
    }

    private int scanHex(String text, int index, StringBuffer tokens, int count) {
        char value = '\0';

        for (int i = 0; i < count; i++) {
            if (index == text.length()) {
                break;
            }
            char c = text.charAt(index++);

            if (!isHexChar(c)) {
                index--;
                break;
            }

            value <<= 4;
            value |= Integer.parseInt("" + c, 16) & 15;
        }
        tokens.append(value);
        return index;
    }

    private boolean isHexChar(char c) {
        return Character.isDigit(c) || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    private boolean isOctChar(char c) {
        return '0' <= c && c <= '7';
    }

}
