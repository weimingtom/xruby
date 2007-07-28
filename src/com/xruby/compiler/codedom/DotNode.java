package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a range literal.
 *
 * @author  jpetersen
 */
public class DotNode extends Node {
    static final long serialVersionUID = 2763797850980107429L;

    private final Node beginNode;
    private final Node endNode;
    private final boolean exclusive;

    public DotNode(ISourcePosition position, Node beginNode, Node endNode, boolean exclusive) {
        super(position, NodeTypes.DOTNODE);
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.exclusive = exclusive;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the beginNode.
     * @return Returns a Node
     */
    public Node getBeginNode() {
        return beginNode;
    }

    /**
     * Gets the endNode.
     * @return Returns a Node
     */
    public Node getEndNode() {
        return endNode;
    }

    /**
     * Gets the exclusive.
     * @return Returns a boolean
     */
    public boolean isExclusive() {
        return exclusive;
    }

}
