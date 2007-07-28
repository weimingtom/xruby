package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * zero length list
 *
 * @author  jpetersen
 */
public class ZArrayNode extends Node implements ILiteralNode {
    static final long serialVersionUID = -5004157166982016917L;


    public ZArrayNode(ISourcePosition position) {
        super(position, NodeTypes.ZARRAYNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

}
