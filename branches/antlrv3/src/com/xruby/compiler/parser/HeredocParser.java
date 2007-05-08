package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import com.xruby.compiler.codedom.ExpressionList;
import com.xruby.compiler.codedom.StringBufferExpression;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 * parsing heredoc is a lot of resemblance in JRuby, so we just port it from JRuby.
 */
public class HeredocParser {
    private Rubyv3Parser parser;
    private CharStream input;
    private int func;
    private String delimiter;
    private boolean indent;

    public HeredocParser(Rubyv3Parser parser, CharStream input, int func, String delimiter, boolean indent) {
        this.parser = parser;
        this.input = input;
        this.func = func;
        this.delimiter = delimiter;
        this.indent = indent;
        consumeHeredocToEndOfLine();
    }

    private void consumeHeredocToEndOfLine() {
        boolean inComment = false;
        while (true) {
            int c = input.LT(1);
            if (c == '\n') {
                input.consume();
                break;
            } else if (Character.isWhitespace(c)) {
                input.consume();
            } else if (c == '#') {
                inComment = true;
                input.consume();
            } else if (inComment) {
                input.consume();
            } else { //not inComment, but meet some invalid char
                throw new SyntaxException("syntax error");
            }
        }
    }

    private void consumeLastLine() {
        while (true) {
            int c = input.LT(1);
            if (c == '\n') {
                //input.consume(); //leave this for terminal+ matching
                return;
            } else if (c == Token.EOF) {
                return;
            } else {
                input.consume();
            }
        }

    }

    public Expression parseString() {

        int c;
        //nested = 1; //initialized instance varialbe nested here.
        ExpressionList expressionList = new ExpressionList();
        StringBuffer tokens = new StringBuffer();
        Expression currentExpression = new StringBufferExpression(tokens);
        while (true) {
            if (input.LT(1) == Token.EOF) {
                throw new SyntaxException("can't find string \"" + delimiter + "\" anywhere before EOF");
            }
            if (input.getCharPositionInLine() == 0 && matchString(delimiter + '\n', indent)) {
                expressionList.addExpression(currentExpression);
                consumeLastLine();
                return expressionList;
            } else {
                tokens.append(readLine());
            }

        }

    }


    private StringBuffer readLine() {
        int c;
        StringBuffer result = new StringBuffer();
        while (true) {
            c = input.LT(1);
            if (c == '\n' || c == Token.EOF) {
                if (c == '\n') {
                    result.append((char) c);
                    input.consume(); //we consume this newline char
                }
                break;
            }
            result.append((char) c);
            input.consume();
        }
        return result;
    }


    private boolean matchString(String src, boolean indent) {
        int length = src.length();
        StringBuffer buffer = new StringBuffer(length + 20);
        int index = 0;
        if (indent) {
            int c;
            while ((c = input.LT(index + 1)) != Token.EOF) {
                if (!Character.isWhitespace(c)) {
                    break;
                }
                //buffer.append((char) c);
                index++;
            }
        } //for handling indent

        for (int i = 0; i < length; i++) {
            int c = input.LT(i + index + 1);
            //buffer.append((char) c);
            if (src.charAt(i) != c) {
                //unreadMany(buffer);
                if (src.charAt(i) == '\n' && c == Token.EOF) { //&& i is last character of src
                    return true;
                }
                return false;
            }
            //input.consume();
        }
        return true;
    }
}
