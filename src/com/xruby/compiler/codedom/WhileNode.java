package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a while stetement. This could be the both versions:
 *
 * while &lt;condition&gt;
 *    &lt;body&gt;
 * end
 *
 * and
 *
 * &lt;body&gt; 'while' &lt;condition&gt;
 *
 * @author  jpetersen
 */
public class WhileNode extends Node {
    static final long serialVersionUID = -5355364190446060873L;

    private final Node conditionNode;
    private final Node bodyNode;
    private final boolean evaluateAtStart;

    public WhileNode(ISourcePosition position, Node conditionNode, Node bodyNode) {
	this(position, conditionNode, bodyNode, true);
    }

    public WhileNode(ISourcePosition position, Node conditionNode, Node bodyNode,
            boolean evalAtStart) {
        super(position, NodeTypes.WHILENODE);
        this.conditionNode = conditionNode;
        this.bodyNode = bodyNode;
        this.evaluateAtStart = evalAtStart;
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
