package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;


/**
 * a Dynamic String node.
 * A string which contains some dynamic elements which needs to be evaluated (introduced by #).
 * @author  jpetersen
 */
public class DStrNode extends ListNode implements ILiteralNode {
    static final long serialVersionUID = -1488812415812799395L;

    public DStrNode(ISourcePosition position) {
        super(position, NodeTypes.DSTRNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }
}
