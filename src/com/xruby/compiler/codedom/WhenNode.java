package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class WhenNode extends Node {
    static final long serialVersionUID = 9099987602002276708L;

    private final Node expressionNodes;
    private final Node bodyNode;
    private final Node nextCase;

    public WhenNode(ISourcePosition position, Node expressionNodes, Node bodyNode, Node nextCase) {
        super(position, NodeTypes.WHENNODE);
        this.expressionNodes = expressionNodes;
        this.bodyNode = bodyNode;
        this.nextCase = nextCase;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the bodyNode.
     * @return Returns a INode
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    /**
     * Gets the next case node (if any).
     */
    public Node getNextCase() {
        return nextCase;
    }

    /**
     * Get the expressionNode(s).
     */
    public Node getExpressionNodes() {
        return expressionNodes;
    }

}
