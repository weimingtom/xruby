package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class SelfNode extends Node implements INameNode {
    static final long serialVersionUID = 7003057726029491707L;


    public SelfNode(ISourcePosition position) {
        super(position, NodeTypes.SELFNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Get name of self node.
     */
    public String getName() {
        return "self";
    }



}
