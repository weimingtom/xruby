package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * a Literal Hash.
 * this can represent either a {a=&amp;b, c=&amp;d} type expression or the list of default
 * values in a method call.
 * @author  jpetersen
 */
public class HashNode extends Node {
    static final long serialVersionUID = -7554050553303344025L;

    private final ListNode listNode;

    public HashNode(ISourcePosition position, ListNode listNode) {
        super(position, NodeTypes.HASHNODE);
        this.listNode = listNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the listNode.
     * @return Returns a IListNode
     */
    public ListNode getListNode() {
        return listNode;
    }

}
