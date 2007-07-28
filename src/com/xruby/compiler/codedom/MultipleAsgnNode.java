package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *
 * @author  jpetersen
 */
public class MultipleAsgnNode extends AssignableNode {
    static final long serialVersionUID = 5016291105152162748L;

    private final ListNode headNode;
    private final Node argsNode;

    public MultipleAsgnNode(ISourcePosition position, ListNode headNode, Node argsNode) {
        super(position, NodeTypes.MULTIPLEASGNNODE);
        this.headNode = headNode;
        this.argsNode = argsNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the argsNode.
     * @return Returns a INode
     */
    public Node getArgsNode() {
        return argsNode;
    }

    /**
     * Gets the headNode.
     * @return Returns a ListNode
     */
    public ListNode getHeadNode() {
        return headNode;
    }

    /**
     * Number of arguments is dependent on headNodes size
     */
    public Arity getArity() {
        if (argsNode != null) {
            return Arity.required(headNode == null ? 0 : headNode.size());
        }

        return Arity.fixed(headNode.size());
    }

}
