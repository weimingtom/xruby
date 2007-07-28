package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * A call to super(...) with arguments to a method.
 */
public class SuperNode extends Node implements BlockAcceptingNode {
    static final long serialVersionUID = 5158689332796676417L;

    private final Node argsNode;
    private Node iterNode;

    public SuperNode(ISourcePosition position, Node argsNode) {
        this(position, argsNode, null);
    }

    public SuperNode(ISourcePosition position, Node argsNode, Node iterNode) {
        super(position, NodeTypes.SUPERNODE);
        this.argsNode = argsNode;
        this.iterNode = iterNode;
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
     * @return Returns a Node
     */
    public Node getArgsNode() {
        return argsNode;
    }

    public Node getIterNode() {
        return iterNode;
    }

    public void setIterNode(Node iterNode) {
        this.iterNode = iterNode;
    }

}
