package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * User: user
 * Date: 2007-7-28
 */
public class ArgsCatNode extends Node {
	private static final long serialVersionUID = 3906082365066327860L;

	private final Node firstNode;
    private final Node secondNode;

    public ArgsCatNode(ISourcePosition position, Node firstNode, Node secondNode) {
        super(position, NodeTypes.ARGSCATNODE);
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    public void accept(CodeVisitor visitor) {
        throw new UnsupportedOperationException();
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getSecondNode() {
        return secondNode;
    }

}
