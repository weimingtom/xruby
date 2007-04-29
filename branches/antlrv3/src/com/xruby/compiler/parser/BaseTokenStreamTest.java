package com.xruby.compiler.parser;

import junit.framework.TestCase;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class BaseTokenStreamTest extends TestCase {

    public void test_something() throws Exception {
        RewindableTokenSource tokenSource = new TestCharLexer(new ANTLRStringStream("12345"));


        BaseTokenStream tokenStream = new BaseTokenStream(tokenSource);
        Token token = tokenStream.LT(1);
        assertEquals("1", token.getText());
        token = tokenStream.LT(2);
        assertEquals("2", token.getText());
        token = tokenStream.LT(1);
        assertEquals("1", token.getText());

        tokenStream.consume();
        token = tokenStream.LT(1);
        assertEquals("2", token.getText());
        /*token = tokenStream.LT(-1);
       assertEquals("2", token.getText());*/

        tokenStream.consume();
        tokenStream.consume();
        tokenStream.consume();
        token = tokenStream.LT(1);
        assertEquals("5", token.getText());
        tokenStream.consume();
        token = tokenStream.LT(1);
        assertEquals(Token.EOF_TOKEN.getType(), token.getType());

        /*token = tokenStream.LT(2);
       assertEquals(Token.EOF_TOKEN.getType(), token.getType());*/

    }
}
