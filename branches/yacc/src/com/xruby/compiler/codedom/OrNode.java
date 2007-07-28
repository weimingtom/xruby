package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class OrNode extends Node implements BinaryOperatorNode {
    static final long serialVersionUID = 2822549471181976227L;

    private final Node firstNode;
    private final Node secondNode;

    public OrNode(ISourcePosition position, Node firstNode, Node secondNode) {
        super(position, NodeTypes.ORNODE);
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the firstNode.
     * @return Returns a Node
     */
    public Node getFirstNode() {
        return firstNode;
    }

    /**
     * Gets the secondNode.
     * @return Returns a Node
     */
    public Node getSecondNode() {
        return secondNode;
    }

}
