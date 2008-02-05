package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class BaseTokenStream implements TokenStream {

    private RewindableTokenSource tokenSource;
    private List tokens = new ArrayList();

    private Map<Integer, VirtualToken> virtualTokens = new HashMap<Integer, VirtualToken>();
    /**
     * The index into the tokens list of the current token (next token
     * to consume).  p==-1 indicates that the tokens list is empty
     */
    private int p = -1; //actually, no need for p=-1 for juding preload
    private int initializedIndex = -1; //how far do we go?

    protected int lastMarker;
    private boolean debug = false;

    public BaseTokenStream(RewindableTokenSource tokenSource) {
        this.tokenSource = tokenSource;
    }

    public void addVirtualToken(int index, VirtualToken token) {
        virtualTokens.put(index, token);
    }

    public Token LT(int k) {
        if (p + k > initializedIndex) {//need to initialize on
            while (initializedIndex < p + k) {
                Token token = tokenSource.nextToken();
                initializedIndex++;
                token.setTokenIndex(initializedIndex);
                tokens.add(token);

                //modify token in place.
                //affect tokens collection
                if(k>=2) {
                    log("we are in lookahead with k bigger than 2, k:" + k);
                }
                inPlaceModifying(token);

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

    private void log(String str) {
        if(debug) System.out.println(str);
    }

    private void inPlaceModifying(Token token) {
        
        if (token.getType() == Rubyv3Lexer.HEREDOC_BEGIN) {
            int index = token.getTokenIndex() - 1;
            if (index >= 0) {
                Token previous = (Token) tokens.get(index);
                if (((Rubyv3Lexer) tokenSource).getParser().isDefinedVar(previous.getText())) {
                    token.setType(Rubyv3Lexer.LEFT_SHIFT); //modify type in place
                }
            }
        }
        if (token.getType() == Rubyv3Lexer.HEREDOC_BEGIN || token.getType() == Rubyv3Lexer.HEREDOC_INDENT_BEGIN) { //heredoc Begin
            Expression expression = null;

            if (token.getType() == Rubyv3Lexer.HEREDOC_BEGIN) {
                expression = ((Rubyv3Lexer) tokenSource).mHEREDOC_CONTENT(false);
            } else { //Rubyv3Lexer.HEREDOC_INDENT_BEGIN
                expression = ((Rubyv3Lexer) tokenSource).mHEREDOC_CONTENT(true);
            }

            if (expression != null) { //we are heredoc string   
                token.setType(Rubyv3Lexer.HEREDOC_STRING);
                ((MyToken) token).expression = expression;
            } //todo: else , is not actually heredoc
        } else if(token.getType() == Rubyv3Lexer.QUESTION) { //see if we are in escape_int
            VirtualToken virtualToken = getPreviousVirtualToken(token);
            Token token1 = getPreviousToken(token);
            System.out.println("previous token:" + token1);
            if(virtualToken == VirtualToken.EXPR_END) {
              //do nothing, we are QEUSTION  
            } else if(isExpressionBegin(token1)) {
                try {
                    token.setType(Rubyv3Lexer.INT);
                    int beginIndex = tokenSource.index();  //charIndex in CharStream
                    ((Rubyv3Lexer) tokenSource).mESCAPE_INT();
                    int endIndex = tokenSource.index();
                    token.setText("?" + ((Rubyv3Lexer) tokenSource).getInput().substring(beginIndex, endIndex-1));
                } catch (RecognitionException e) {
                    throw new SyntaxException(e);
                }


            } else { //judge in arg , arg_end etc
                //do nothing, we are QEUSTION
            }
        }
    }

    private boolean isExpressionBegin(Token token) {
        return token == null || token.getType() == Rubyv3Lexer.POWER || token.getType() == Rubyv3Lexer.SEMI || token.getType() == Rubyv3Lexer.LINE_BREAK
                || token.getType() == Rubyv3Lexer.ASSIGN || token.getType() == Rubyv3Lexer.MOD_ASSIGN|| token.getType() == Rubyv3Lexer.COMPLEMENT_ASSIGN||token.getType() == Rubyv3Lexer.DIV_ASSIGN
                ||token.getType() == Rubyv3Lexer.MINUS_ASSIGN||token.getType() == Rubyv3Lexer.PLUS_ASSIGN||token.getType() == Rubyv3Lexer.BOR_ASSIGN||token.getType() == Rubyv3Lexer.BAND_ASSIGN
                ||token.getType() == Rubyv3Lexer.LEFT_SHIFT_ASSIGN||token.getType() == Rubyv3Lexer.RIGHT_SHIFT_ASSIGN||token.getType() == Rubyv3Lexer.STAR_ASSIGN||token.getType() == Rubyv3Lexer.LOGICAL_AND_ASSIGN
                ||token.getType() == Rubyv3Lexer.LOGICAL_OR_ASSIGN||token.getType() == Rubyv3Lexer.POWER_ASSIGN; //todo: add more to this or simplify this
    }

    /*private boolean isExpressionEnd(Token token) {
        return token == null || token.getType() == Rubyv3Lexer.SEMI;
    }*/

    private Token getPreviousToken(Token token) {
        int index = token.getTokenIndex() - 1;
        if (index >= 0) {
            return (Token) tokens.get(index);
        }
        return null;
    }

    private VirtualToken getPreviousVirtualToken(Token token) {
        int index = token.getTokenIndex() - 1;
        if (index >= 0) {
            return virtualTokens.get(index);
        }
        return null;
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
