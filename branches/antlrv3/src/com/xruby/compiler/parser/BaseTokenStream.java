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

    public BaseTokenStream(RewindableTokenSource tokenSource) {
        this.tokenSource = tokenSource;
    }

    public Token LT(int k) {
        if (p + k > initializedIndex) {//need to initialize on
            while (initializedIndex < p + k) {
                tokens.add(tokenSource.nextToken());
                initializedIndex++;
            }
        }

        return (Token) tokens.get(p + k);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Token get(int i) {
        return (Token) tokens.get(i);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TokenSource getTokenSource() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString(int start, int stop) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString(Token start, Token stop) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void consume() {
        p++;
    }

    public int LA(int i) {
        return LT(i).getType();
    }

    public int mark() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int index() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void rewind(int marker) {
//To change body of implemented methods use File | Settings | File Templates.
    }

    public void rewind() {
//To change body of implemented methods use File | Settings | File Templates.
    }

    public void release(int marker) {
//To change body of implemented methods use File | Settings | File Templates.
    }

    public void seek(int index) {
//To change body of implemented methods use File | Settings | File Templates.
    }

    public int size() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
