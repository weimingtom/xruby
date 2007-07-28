package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.ISourcePositionHolder;


/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public abstract class Node implements Visitable, ISourcePositionHolder {
    protected ISourcePosition position;
    public final int nodeId;


    public Node(ISourcePosition position, int id) {
        this.position = position;
        this.nodeId = id;
    }


    public ISourcePosition getPosition() {
        return position;
    }

    public void setPosition(ISourcePosition position) {
        this.position = position;
    }
}
