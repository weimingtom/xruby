package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents an until statement.
 *
 * @author  jpetersen
 */
public class UntilNode extends Node {
    static final long serialVersionUID = -2929327250252365636L;

    private final Node conditionNode;
    private final Node bodyNode;
    private final boolean evaluateAtStart;

    public UntilNode(ISourcePosition position, Node conditionNode, Node bodyNode) {
        this(position, conditionNode, bodyNode, true);
    }

    public UntilNode(ISourcePosition position, Node conditionNode, Node bodyNode, boolean evaluateAtStart) {
        super(position, NodeTypes.UNTILNODE);
        this.conditionNode = conditionNode;
        this.bodyNode = bodyNode;
        this.evaluateAtStart = evaluateAtStart;
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
     * Gets the conditionNode.
     * @return Returns a Node
     */
    public Node getConditionNode() {
        return conditionNode;
    }

    /**
     * Determine whether this is while or do while
     * @return true if you are a while, false if do while
     */
    public boolean evaluateAtStart() {
        return evaluateAtStart;
    }
}
