package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/**
 * Represents a block.
 *
 */
public class IterNode extends Node {
    static final long serialVersionUID = -9181965000180892184L;

    private final Node varNode;
    private final Node bodyNode;

    // What static scoping relationship exists when it comes into being.
    private StaticScope scope;

    public IterNode(ISourcePosition position, Node varNode, StaticScope scope, Node bodyNode) {
        this(position, varNode, scope, bodyNode, NodeTypes.ITERNODE);
    }

    public IterNode(ISourcePosition position, Node varNode, StaticScope scope, Node bodyNode,
            int id) {
        super(position, id);
        this.varNode = varNode;
        this.scope = scope;
        this.bodyNode = bodyNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public StaticScope getScope() {
        return scope;
    }

    /**
     * Gets the bodyNode.
     * @return Returns a Node
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    /**
     * Gets the varNode.
     * @return Returns a Node
     */
    public Node getVarNode() {
        return varNode;
    }

}