package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

public class ToAryNode extends Node {
	private static final long serialVersionUID = 3256723961709802546L;

	private final Node node;

    public ToAryNode(ISourcePosition position, Node node) {
        super(position, NodeTypes.TOARYNODE);

        this.node = node;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getValue() {
        return node;
    }

}