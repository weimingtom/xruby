package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class RedoNode extends Node {
    static final long serialVersionUID = -356433067591852187L;

    public RedoNode(ISourcePosition position) {
        super(position, NodeTypes.REDONODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

}
