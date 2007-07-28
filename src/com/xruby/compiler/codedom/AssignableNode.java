package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Base class of any node which can be assigned to.
 */
public abstract class AssignableNode extends Node implements IArityNode {
    static final long serialVersionUID= 7997990944631594662L;

    private Node valueNode;

    public AssignableNode(ISourcePosition position, int id) {
        super(position, id);
    }

    /**
     * Gets the valueNode.
     * @return Returns a Node
     */
    public Node getValueNode() {
        return valueNode;
    }

    /**
     * Sets the valueNode.
     * @param valueNode The valueNode to set
     */
    public void setValueNode(Node valueNode) {
        this.valueNode = valueNode;
    }

    /**
     * Almost all assignables are only assigned a single value.
     */
    public Arity getArity() {
        return Arity.singleArgument();
    }
}
