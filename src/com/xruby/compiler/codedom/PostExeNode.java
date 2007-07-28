package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class PostExeNode extends IterNode {
    static final long serialVersionUID = -2851659895226590014L;

    public PostExeNode(ISourcePosition position, Node body) {
        super(position, null, null, body, NodeTypes.POSTEXENODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }
}
