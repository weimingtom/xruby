package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class MyToken extends CommonToken {
    protected Expression expression; // custom field

    public MyToken(CharStream input, int type, int channel,
                   int start, int stop) {
        super(input, type, channel, start, stop);
    }

    public String toString() {
        return super.toString() + ",expression=" + expression;
    }
}

