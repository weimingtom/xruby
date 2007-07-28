package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a false literal.
 *
 * @author  jpetersen
 */
public class FalseNode extends Node implements INameNode {
    static final long serialVersionUID = 8153681841075601779L;


    public FalseNode(ISourcePosition position) {
        super(position, NodeTypes.FALSENODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Name of false node.
     */
    public String getName() {
        return "false";
    }

    
}
