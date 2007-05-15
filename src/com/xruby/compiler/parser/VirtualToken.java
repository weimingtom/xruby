/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.compiler.parser;

public class VirtualToken {
    public static final VirtualToken EXPR_END = new VirtualToken("EXPR_END");

    private final String myName; // for debug only

    private VirtualToken(String name) {
        myName = name;
    }

    public String toString() {
        return myName;
    }
}
