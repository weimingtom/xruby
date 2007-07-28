package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

public class ArgsPushNode extends Node {
    private static final long serialVersionUID = 6442216183136232451L;
    private Node node1;
    private Node node2;

    public ArgsPushNode(ISourcePosition position, Node node1, Node node2) {
        super(position, NodeTypes.ARGSPUSHNODE);
        this.node1 = node1;
        this.node2 = node2;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getFirstNode() {
        return node1;
    }

    public Node getSecondNode() {
        return node2;
    }

}
