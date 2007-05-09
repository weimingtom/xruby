package com.xruby.compiler.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class BaseTokenStream implements TokenStream {

    private RewindableTokenSource tokenSource;
    private List tokens = new ArrayList();

    /**
     * The index into the tokens list of the current token (next token
     * to consume).  p==-1 indicates that the tokens list is empty
     */
    private int p = -1; //actually, no need for p=-1 for juding preload
    private int initializedIndex = -1; //how far do we go?

    protected int lastMarker;

    public BaseTokenStream(RewindableTokenSource tokenSource) {
        this.tokenSource = tokenSource;
    }

    public Token LT(int k) {
        if (p + k > initializedIndex) {//need to initialize on
            while (initializedIndex < p + k) {
                Token token = tokenSource.nextToken();
                initializedIndex++;
                token.setTokenIndex(initializedIndex);
                tokens.add(token);

                //modify token in place.
                //System.out.println(token.getType() == Rubyv3Lexer.HEREDOC_BEGIN);
                if (token.getType() == Rubyv3Lexer.HEREDOC_BEGIN) {
                    int index = token.getTokenIndex() - 1;
                    if (index >= 0) {
                        Token previous = (Token) tokens.get(index);
                        if (((Rubyv3Lexer) tokenSource).getParser().isDefinedVar(previous.getText())) {
                            token.setType(Rubyv3Lexer.LEFT_SHIFT); //modify type in place
                        }
                    }
                }

            }
        }
        if (k < 0) {
            return LB(-k);
        }
        //System.out.println("p+k" + (p + k));
        if (p + k < 0) {
            return null;
        }

        return (Token) tokens.get(p + k);  //To change body of implemented methods use File | Settings | File Templates.
    }

    private Token LB(int k) {
        if (k == 0) {
            return null;
        }
        if ((p + 1 - k) < 0) {
            return null;
        }
        return (Token) tokens.get(p + 1 - k);
    }

    public Token get(int i) {
        if (p < i) {
            int index = p;
            while (index < i) {
                tokens.add(tokenSource.nextToken());
                initializedIndex++;
                index++;
            }
        }
        return (Token) tokens.get(i);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TokenSource getTokenSource() {
        return tokenSource;
    }

    public String toString(int start, int stop) {
        if (start < 0 || stop < 0) {
            return null;
        }

        /*if ( stop>=tokens.size() ) {
              stop = tokens.size()-1;
          }
           */
        if (stop > initializedIndex) {
            //stop = initializedIndex;
            throw new RuntimeException("stop passed initializedIndex"); //todo: check this later
        }

        StringBuffer buf = new StringBuffer();
        for (int i = start; i <= stop; i++) {
            Token t = (Token) tokens.get(i);
            buf.append(t.getText());
        }
        return buf.toString();
    }

    public String toString(Token start, Token stop) {
        if (start != null && stop != null) {
            return toString(start.getTokenIndex(), stop.getTokenIndex());
        }
        return null;
    }

    public void consume() {
        p++;
    }

    public int LA(int i) {
        return LT(i).getType();
    }

    public int mark() {
        lastMarker = index();
        return lastMarker;
    }

    public int index() {
        return p;
    }

    public void rewind(int marker) {
        seek(marker);
        //todo: also clears out initializeIndex, tokens to p
    }

    public void rewind() {
        seek(lastMarker);
    }

    public void seek(int index) {
        p = index;
    }

    public void release(int marker) {
        // no resources to release
    }

    public int size() {
        throw new UnsupportedOperationException("can't query size on a lazily initialized token stream"); //todo
    }
}
