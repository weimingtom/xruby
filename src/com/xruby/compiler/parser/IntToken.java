package com.xruby.compiler.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class IntToken extends CommonToken {
    private int value; //test

    public IntToken() {
        super(Rubyv3Lexer.INT);
        valueize();
    }

    public IntToken(CharStream input, int channel, int start, int stop) {
        super(input, Rubyv3Lexer.INT, channel, start, stop);
        valueize();
    }

    public IntToken(String text) {
        super(Rubyv3Lexer.INT, text);
        valueize();
    }

    public IntToken(Token oldToken) {
        super(oldToken);
        assert oldToken.getType() == Rubyv3Lexer.INT;
        valueize();
    }

    private void valueize() {
        value = Integer.parseInt(this.getText());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
