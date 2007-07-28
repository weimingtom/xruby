package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class RescueNode extends Node {
    static final long serialVersionUID = -4757038578511808125L;

    private final Node bodyNode;
    private final RescueBodyNode rescueNode;
    private final Node elseNode;

    public RescueNode(ISourcePosition position, Node bodyNode, RescueBodyNode rescueNode, Node elseNode) {
        super(position, NodeTypes.RESCUENODE);
        this.bodyNode = bodyNode;
        this.rescueNode = rescueNode;
        this.elseNode = elseNode;
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
     * @return Returns a Node
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    /**
     * Gets the elseNode.
     * @return Returns a Node
     */
    public Node getElseNode() {
        return elseNode;
    }

    /**
     * Gets the first rescueNode.
     * @return Returns a Node
     */
    public RescueBodyNode getRescueNode() {
        return rescueNode;
    }

}
