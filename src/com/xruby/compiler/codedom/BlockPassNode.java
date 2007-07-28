package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Block passed explicitly as an argument in a method call.
 * A block passing argument in a method call (last argument prefixed by an ampersand).
 *
 * @author  jpetersen
 */
public class BlockPassNode extends Node {
    static final long serialVersionUID = 7201862349971094217L;

    private final Node bodyNode;

    /** Used by the arg_blk_pass and new_call, new_fcall and new_super
     * methods in ParserSupport to temporary save the args node.
     */
    private Node argsNode;

    public BlockPassNode(ISourcePosition position, Node bodyNode) {
        super(position, NodeTypes.BLOCKPASSNODE);
        this.bodyNode = bodyNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the bodyNode.
     * @return Returns a Node
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    /**
     * Gets the argsNode.
     * @return Returns a IListNode
     */
    public Node getArgsNode() {
        return argsNode;
    }

    /**
     * Sets the argsNode.
     * @param argsNode The argsNode to set
     */
    public void setArgsNode(Node argsNode) {
        this.argsNode = argsNode;
    }

}
