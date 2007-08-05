package com.xruby.compiler.parser;

import java.util.*;
import org.antlr.runtime.*;

public class Rubyv3Lexer extends Rubyv3BaseLexer implements TokenStream {

    public Rubyv3Lexer(CharStream input, SymbolTableManager stm, boolean strip){
        super(input);
    }

    protected boolean isAsciiValueTerminator(char value) {
        switch (value) {
        case '\t':
        case ' ':
        case '\f':
        case '\13':
        case '\r':
        case '\n':
        case (char)Rubyv3Lexer.EOF:
        case ')': // while(ARGV[0] && ARGV[0][0] == ?-)
        case ',': // [?d, ?s, :date]
        case ']': // [?a]
        case ';': // $state[n*2] = ?|;
        case '.': // unless (?A..?Z) === klass[0]
            return true;
        default:
            return false;
        }
    }

    protected int trackDelimiterCount(char next_char, char delimeter, int delimeter_count) {
        if (delimeter == translateDelimiter(delimeter)) {
            if (delimeter == next_char) {
                --delimeter_count;
                assert (delimeter_count >= 0);
            }
        } else {
            if (delimeter == next_char) {
                ++delimeter_count;
            } else if (next_char == translateDelimiter(delimeter)) {
                --delimeter_count;
                assert (delimeter_count >= 0);
            }
        }

        return delimeter_count;
    }

    private char translateDelimiter(char in) {
        switch (in) {
        case '{':
            return '}';
        case '[':
            return ']';
        case '(':
            return ')';
        case '<':
            return '>';
        default:
            return in;
        }
    }

    private List<Token> tokens = new ArrayList<Token>();
    private int p = -1; //actually, no need for p=-1 for juding preload
    private int initializedIndex = -1; //how far do we go?

    public Token LT(int k) {
        if (p + k > initializedIndex) {//need to initialize on
            while (initializedIndex < p + k) {
                Token token = nextToken();
                initializedIndex++;
                token.setTokenIndex(initializedIndex);
                tokens.add(token);
            }
        }
        /*if (k < 0) {
            return LB(-k);
        }*/
        //System.out.println("p+k" + (p + k));
        if (p + k < 0) {
            return null;
        }

        return (Token) tokens.get(p + k);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int LA(int i) {
        return LT(i).getType();
    }

    public void consume() {
        p++;
    }
    
    public Token get(int arg0) {
        throw new Error("get is not implemented");
    }

    public TokenSource getTokenSource() {
        throw new Error("getTokenSource is not implemented");
    }

    public String toString(int arg0, int arg1) {
        throw new Error("toString is not implemented");
    }

    public String toString(Token arg0, Token arg1) {
        throw new Error("toString2 is not implemented");
    }

    public int index() {
        throw new Error("release is not implemented");
    }

    public int mark() {
        throw new Error("release is not implemented");
    }

    public void release(int arg0) {
        throw new Error("release is not implemented");
    }

    public void rewind() {
        throw new Error("rewind is not implemented");
    }

    public void rewind(int arg0) {
        throw new Error("rewind(int) is not implemented");
    }

    public void seek(int arg0) {
        throw new Error("seek is not implemented");
    }

    public int size() {
        throw new Error("size is not implemented");
    }




}
