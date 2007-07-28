package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class Match2Node extends Node {
    static final long serialVersionUID = -5637326290741724784L;

    private final Node receiverNode;
    private final Node valueNode;

    public Match2Node(ISourcePosition position, Node receiverNode, Node valueNode) {
        super(position, NodeTypes.MATCH2NODE);

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