package com.xruby.compiler.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public abstract class BaseLexer extends Lexer implements RewindableTokenSource {
    protected boolean mark = false;

    protected BaseLexer() {
    }

    protected BaseLexer(CharStream input) {
        super(input);
    }
    public CharStream getInput() {
        return input;
    }

    public int mark() {
        mark = true;
        return input.mark();
    }

    public int index() {
        return input.index();
    }

    public void rewind(int marker) {
        mark = false;
        input.rewind(marker);
    }

    public void rewind() {
        mark = false;
        input.rewind();
    }

    public Token nextToken() {
        if (mark) {
            rewind();
        }
        return super.nextToken();
    }

    /*public void recover(RecognitionException re) {
		//System.out.println("consuming char "+(char)input.LA(1)+" during recovery");
		//re.printStackTrace();
		throw new SyntaxException(re);
	}*/
}
