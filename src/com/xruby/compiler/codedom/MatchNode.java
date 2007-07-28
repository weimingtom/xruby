package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class MatchNode extends Node {
    static final long serialVersionUID = 9098121695708691474L;

    private final Node regexpNode;

    public MatchNode(ISourcePosition position, Node regexpNode) {
        super(position, NodeTypes.MATCHNODE);
        this.regexpNode = regexpNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the regexpNode.
     * @return Returns a Node
     */
    public Node getRegexpNode() {
        return regexpNode;
    }

}
