package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class OpAsgnAndNode extends Node implements BinaryOperatorNode {
    static final long serialVersionUID = 7366271929271260664L;

    private final Node firstNode;
    private final Node secondNode;

    public OpAsgnAndNode(ISourcePosition position, Node headNode, Node valueNode) {
        super(position, NodeTypes.OPASGNANDNODE);
        firstNode = headNode;
        secondNode = valueNode;
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
