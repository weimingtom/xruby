package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Node that represents an assignment of either an array element or attribute.
 *
 */
public class AttrAssignNode extends Node implements INameNode, IArgumentNode {
    private static final long serialVersionUID = 4182783536358350118L;

    private final Node receiverNode;
    private String name;
    private Node argsNode;

    public AttrAssignNode(ISourcePosition position, Node receiverNode, String name, Node argsNode) {
        super(position, NodeTypes.ATTRASSIGNNODE);

        this.receiverNode = receiverNode;
        this.name = name.intern();
        this.argsNode = argsNode;
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        name = name.intern();
    }

    /**
     * Accept for the visitor pattern.
     * @param visitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the name.
     * name is the name of the method called
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the receiverNode.
     * receiverNode is the object on which the method is being called
     * @return receiverNode
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

    /**
     * Gets the argsNode.
     * argsNode representing the method's arguments' value for this call.
     * @return argsNode
     */
    public Node getArgsNode() {
        return argsNode;
    }

    /**
     * Set the argsNode
     *
     * @param argsNode set the arguments for this node.
     */
    public void setArgsNode(Node argsNode) {
        this.argsNode = argsNode;
    }


}
