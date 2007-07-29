package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a 'next' statement.
 *
 * @author  jpetersen
 */
public class NextNode extends Node {
    static final long serialVersionUID = -6688896555206419923L;

    private final Node valueNode;

    public NextNode(ISourcePosition position) {
        super(position, NodeTypes.NEXTNODE);
        valueNode = null;
    }

    public NextNode(ISourcePosition position, Node valueNode) {
        super(position, NodeTypes.NEXTNODE);
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