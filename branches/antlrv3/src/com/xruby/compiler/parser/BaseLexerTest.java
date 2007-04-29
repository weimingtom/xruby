package com.xruby.compiler.parser;

import junit.framework.TestCase;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
class TestCharLexer extends CharLexer {

    public TestCharLexer() {
    }

    public TestCharLexer(CharStream input) {
        super(input);
    }

    public Token nextToken() {
        if (mark) {
            rewind();
        }
        return super.nextToken();
    }
}

public class BaseLexerTest extends TestCase {
    public void test_something() throws Exception {
        RewindableTokenSource tokenSource = new TestCharLexer(new ANTLRStringStream("12345"));
        Token token = tokenSource.nextToken();
        assertEquals("1", token.getText());
        token = tokenSource.nextToken();
        assertEquals("2", token.getText());
        tokenSource.mark();
        token = tokenSource.nextToken();
        assertEquals("3", token.getText());
        token = tokenSource.nextToken();
        assertEquals("4", token.getText());
        tokenSource.rewind();
        token = tokenSource.nextToken();
        assertEquals("3", token.getText());

    }
}
