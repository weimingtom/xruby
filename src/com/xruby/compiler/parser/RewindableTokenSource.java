package com.xruby.compiler.parser;

import org.antlr.runtime.TokenSource;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public interface RewindableTokenSource extends TokenSource {
    int mark();

    int index();

    void rewind(int marker);

    void rewind();
    //void release(int marker);
}
