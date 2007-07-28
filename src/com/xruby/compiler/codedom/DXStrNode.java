package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Dynamic backquote string.
 * backquote strings are eXecuted using the shell, hence the X
 * or maybe the X is due to the %x general quote syntax
 * @author  jpetersen
 */
public class DXStrNode extends ListNode implements ILiteralNode {
    static final long serialVersionUID = 7165988969190553667L;

    public DXStrNode(ISourcePosition position, DStrNode node) {
        super(position, NodeTypes.DXSTRNODE);
        addAll(node);
    }

    public DXStrNode(ISourcePosition position) {
        super(position, NodeTypes.DXSTRNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }
}
