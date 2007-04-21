package com.xruby.compiler.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class StringToken extends CommonToken {
    private String value;

    public StringToken() {
        super(Rubyv3Lexer.STRING);
    }

    public StringToken(CharStream input, int channel, int start, int stop) {
        super(input, Rubyv3Lexer.STRING, channel, start, stop);
    }

    public StringToken(String text) {
        super(Rubyv3Lexer.STRING, text);
    }

    public StringToken(Token oldToken) {
        super(oldToken);
        assert oldToken.getType() == Rubyv3Lexer.STRING;
    }

}
