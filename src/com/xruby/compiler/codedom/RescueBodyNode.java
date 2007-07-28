package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class RescueBodyNode extends Node {
    static final long serialVersionUID = -6414517081810625663L;

    private final Node exceptionNodes;
    private final Node bodyNode;
    private final RescueBodyNode optRescueNode;

    public RescueBodyNode(ISourcePosition position, Node exceptionNodes, Node bodyNode, RescueBodyNode optRescueNode) {
        super(position, NodeTypes.RESCUEBODYNODE);
        this.exceptionNodes = exceptionNodes;
        this.bodyNode = bodyNode;
        this.optRescueNode = optRescueNode;
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
     * Get the next rescue node (if any).
     */
    public RescueBodyNode getOptRescueNode() {
        return optRescueNode;
    }

    /**
     * Gets the exceptionNodes.
     * @return Returns a Node
     */
    public Node getExceptionNodes() {
        return exceptionNodes;
    }

}
