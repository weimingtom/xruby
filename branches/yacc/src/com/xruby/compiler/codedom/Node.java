package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;


/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public abstract class Node implements Visitable {
    protected ISourcePosition position;
}
