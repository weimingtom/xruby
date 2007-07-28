package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class TrueNode extends Node implements INameNode {
    static final long serialVersionUID = -8198252481133454778L;


    public TrueNode(ISourcePosition position) {
        super(position, NodeTypes.TRUENODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Name of the true node.
     */
    public String getName() {
        return "true";
    }

}
