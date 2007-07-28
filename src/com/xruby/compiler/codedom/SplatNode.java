package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

public class SplatNode extends Node {
    static final long serialVersionUID = -1649004231006940340L;

    private final Node node;

    public SplatNode(ISourcePosition position, Node node) {
        super(position, NodeTypes.SPLATNODE);
        this.node = node;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getValue() {
        return node;
    }

}
