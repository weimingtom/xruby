package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Simple Node that allows editor projects to keep position info in AST
 * (evaluation does not need this).
 */
public class ArgumentNode extends Node implements INameNode {
    private static final long serialVersionUID = -6375678995811376530L;
    private String identifier;

    public ArgumentNode(ISourcePosition position, String identifier) {
        super(position, NodeTypes.ARGUMENTNODE);

        this.identifier = identifier.intern();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        identifier = identifier.intern();
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return identifier;
    }

    public void setName(String name) {
        this.identifier = name;
    }

}

