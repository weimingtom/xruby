package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** An AndNode represents a && operator.
 *
 * @author  jpetersen
 */
public class AndNode extends Node implements BinaryOperatorNode {
    static final long serialVersionUID = 1716928209521564017L;

    private final Node firstNode;
    private final Node secondNode;

    public AndNode(ISourcePosition position, Node firstNode, Node secondNode) {
        super(position, NodeTypes.ANDNODE);
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the secondNode.
     * @return Returns a Node
     */
    public Node getSecondNode() {
        return secondNode;
    }

    /**
     * Gets the firstNode.
     * @return Returns a Node
     */
    public Node getFirstNode() {
        return firstNode;
    }

    

}
