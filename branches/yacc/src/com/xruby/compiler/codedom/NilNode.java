package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class NilNode extends Node implements INameNode {
    static final long serialVersionUID = -8702073984472296708L;

    public NilNode(ISourcePosition position) {
        super(position, NodeTypes.NILNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Name of nil node.
     **/
    public String getName() {
        return "nil";
    }

}
