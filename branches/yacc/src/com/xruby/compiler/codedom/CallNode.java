package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * A method or operator call.
 *
 * @author  jpetersen
 */
public final class CallNode extends Node implements INameNode, IArgumentNode, BlockAcceptingNode {
    static final long serialVersionUID = -1993752395320088525L;

    private final Node receiverNode;
    private String name;
    private Node argsNode;
    private Node iterNode;
    public final int index;

    public CallNode(ISourcePosition position, Node receiverNode, String name, Node argsNode) {
        this(position, receiverNode, name, argsNode, null);
    }

    public CallNode(ISourcePosition position, Node receiverNode, String name, Node argsNode,
            Node iterNode) {
        super(position, NodeTypes.CALLNODE);
        this.receiverNode = receiverNode;
        this.name = name.intern();
        setArgsNode(argsNode);
        this.iterNode = iterNode;
        this.index = MethodIndex.getIndex(this.name);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        name = name.intern();
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getIterNode() {
        return iterNode;
    }

    public void setIterNode(Node iterNode) {
        this.iterNode = iterNode;
    }

    /**
     * Gets the argsNode representing the method's arguments' value for this call.
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
        // If we have more than one arg, make sure the array created to contain them is not ObjectSpaced
        if (argsNode instanceof ArrayNode) {
            ((ArrayNode)argsNode).setLightweight(true);
        }
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

    public String toString() {
        return "CallNode: " + getName();
    }
}
