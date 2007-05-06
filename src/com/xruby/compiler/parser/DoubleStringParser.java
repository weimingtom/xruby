package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class DoubleStringParser {
    private Rubyv3Parser parser;
    private CharStream input;
    private int begin;
    private int end;
    int nested; //put up as instance variable for octal escape and hex escape to judge if meets string end

    //is it good here? or just pass it down thru several method invocations?
    public DoubleStringParser(Rubyv3Parser parser, CharStream input, int end, int begin) {
        this.parser = parser;
        this.input = input;
        this.end = end;
        this.begin = begin;
    }

    public Expression parseString() {
        int c;
        nested = 1; //initialized instance varialbe nested here.
        ExpressionList expressionList = new ExpressionList();
        StringBuffer tokens = new StringBuffer();
        Expression currentExpression = new StringBufferExpression(tokens);
        while (true) {
            c = input.LT(1);
            if (c == Token.EOF) {
                throw new SyntaxException("unterminated string meets end of file");
            } else if (c == '\\') {
                input.consume();
                read_escape(tokens);

                //escape input.LT(2);
            } else if (c == end) {
                nested--;
                input.consume();
                if (nested == 0) {
                    break;
                } //end of string
                tokens.append((char) c);
            } else if (c == begin) { //nested string
                nested++;
                tokens.append((char) c);
                input.consume();
            } else if (c == '#') {
                input.consume();
                int d = input.LT(1); //next char of '#'
                if (meetEnd()) {
                    tokens.append((char) c);
                } else if (d == '$') { //todo

                } else if (d == '@') { //todo

                } else if (d == '{') {
                    input.consume();
                    expressionList.addExpression(currentExpression);
                    expressionList.add(parseStatementInString());
                    tokens = new StringBuffer();
                    currentExpression = new StringBufferExpression(tokens);
                }
            } else { //normal
                tokens.append((char) c);
                input.consume();
            }
        }

        expressionList.addExpression(currentExpression);
        return expressionList;
    }

    private CompoundStatement parseStatementInString() {


        try {
            Rubyv3Lexer lexer = new Rubyv3Lexer(input);
            //BaseTokenStream tokens = new BaseTokenStream(lexer);
            BaseTokenStream tokens = new BaseTokenStream(lexer);
            Rubyv3Parser parser = new Rubyv3Parser(tokens, this.parser);
            Rubyv3Parser.program_return result = null;

            result = parser.program(); //this line may produce RecognitionException

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(result.getTree());
            //System.out.println(((CommonTree) result.getTree()).toStringTree());
// AST nodes have payloads that point into token stream
            nodes.setTokenStream(tokens);
            Rubyv3TreeParser treeParser = new Rubyv3TreeParser(nodes);
            Program program = treeParser.program();
            //System.out.println(program.getStatementList());
            return program.getCompoundStatement();
        } catch (RecognitionException e) {
            throw new SyntaxException(e);
        }
    }

    private void read_escape(StringBuffer tokens) {
        int c = input.LT(1);
        if (c == Token.EOF) {
            throw new SyntaxException("unterminated string meets end of file");
        } else if (c == '\\') {
            tokens.append('\\');
            input.consume();
        } else if (c == 'n') {
            tokens.append('\n');
            input.consume();
        } else if (c == 'r') {
            tokens.append('\r');
            input.consume();
        } else if (c == 't') {
            tokens.append('\t');
            input.consume();
        } else if (c == 'f') {
            tokens.append('\f');
            input.consume();
        } else if (c == 'v') {
            tokens.append('\u0013');
            input.consume();
        } else if (c == 'a') {
            tokens.append('\u0007');
            input.consume();
        } else if (c == 'e') {
            tokens.append('\u0033');
            input.consume();
        } else if (c == 'b') {
            tokens.append('\010');
            input.consume();
        } else if (c == 's') {
            tokens.append(' ');
            input.consume();
        } else if (c >= '0' && c <= '7') {
            scanOct(tokens, 3);
        } else if (c == 'x') {
            input.consume(); //consume this 'x' char
            scanHex(tokens, 2);
        } else if (c == begin || c == end) {
            tokens.append((char) c);
            input.consume();
        }
    }


    private void scanOct(StringBuffer tokens, int count) {
        char value = '\0';

        for (int i = 0; i < count; i++) {
            if (meetEnd()) {
                break;
            }
            /*if (index == text.length()) {
                break;
            }*/
            int c = input.LT(1);

            if (!isOctChar(c)) {
                return;
            }

            value <<= 3;
            value |= Integer.parseInt("" + (char) c, 8);
            input.consume();
        }
        if (value > 255) {
            value = 255;
        }
        tokens.append(value);

    }

    private void scanHex(StringBuffer tokens, int count) {
        char value = '\0';

        for (int i = 0; i < count; i++) {
            if (meetEnd()) {
                break;
            }
            int c = input.LT(1);

            if (!isHexChar(c)) {
                return;
            }

            value <<= 4;
            value |= Integer.parseInt("" + (char) c, 16) & 15;
            input.consume();
        }
        tokens.append(value);

    }

    private boolean meetEnd() {
        if (input.LT(1) == end) { //actually I found no need to judge nested here, so just ignore it..
            return true;
        }
        if (input.LT(1) == Token.EOF) {
            throw new SyntaxException("unterminated string meets end of file"); //we judge it in escape,
            //so if meets EOF prematurely, that means an error
        }
        return false;
    }

    private boolean isHexChar(int c) {
        return Character.isDigit(c) || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    private boolean isOctChar(int c) {
        return '0' <= c && c <= '7';
    }

}
