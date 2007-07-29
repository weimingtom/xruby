package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class NotNode extends Node {
    static final long serialVersionUID = -9044821606260233871L;

    private final Node conditionNode;

    public NotNode(ISourcePosition position, Node conditionNode) {
        super(position, NodeTypes.NOTNODE);
        this.conditionNode = conditionNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the conditionNode.
     * @return Returns a Node
     */
    public Node getConditionNode() {
        return conditionNode;
    }

}
