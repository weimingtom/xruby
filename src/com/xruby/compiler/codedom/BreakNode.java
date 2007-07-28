package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a 'break' statement.
 *
 * @author  jpetersen
 */
public class BreakNode extends Node {
    static final long serialVersionUID = 1491046888629861035L;

    private final Node valueNode;

    public BreakNode(ISourcePosition position) {
        super(position, NodeTypes.BREAKNODE);
        valueNode = null;
    }

    public BreakNode(ISourcePosition position, Node valueNode) {
        super(position, NodeTypes.BREAKNODE);
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
     * Gets the valueNode.
     * @return Returns a Node
     */
    public Node getValueNode() {
        return valueNode;
    }

}
