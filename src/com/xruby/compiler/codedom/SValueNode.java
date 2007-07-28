package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

public class SValueNode extends Node {
	private static final long serialVersionUID = 3834587720830891576L;

	private final Node node;

    public SValueNode(ISourcePosition position, Node node) {
        super(position, NodeTypes.SVALUENODE);
        this.node = node;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getValue() {
        return node;
    }

}
