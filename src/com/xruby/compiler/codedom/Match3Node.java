package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * User: user
 * Date: 2007-7-28
 */
public class Match3Node extends Node {
    static final long serialVersionUID = -6147075329935023633L;

    private final Node receiverNode;
    private final Node valueNode;

    public Match3Node(ISourcePosition position, Node receiverNode, Node valueNode) {
        super(position, NodeTypes.MATCH3NODE);

        this.receiverNode = receiverNode;
        this.valueNode = valueNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the receiverNode.
     * @return Returns a Node
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

    /**
     * Gets the valueNode.
     * @return Returns a Node
     */
    public Node getValueNode() {
        return valueNode;
    }



}
