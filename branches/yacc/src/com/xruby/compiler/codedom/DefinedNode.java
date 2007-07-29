package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * a defined statement.
 * @author  jpetersen
 */
public class DefinedNode extends Node {
    static final long serialVersionUID = -6942286690645861964L;

    private final Node expressionNode;

    public DefinedNode(ISourcePosition position, Node expressionNode) {
        super(position, NodeTypes.DEFINEDNODE);
        this.expressionNode = expressionNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the expressionNode.
     * @return Returns a Node
     */
    public Node getExpressionNode() {
        return expressionNode;
    }

}
