package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;
import java.util.List;

/**
 * Represents a method call with self as an implicit receiver.
 */
public class FCallNode extends Node implements INameNode, IArgumentNode, BlockAcceptingNode {
    static final long serialVersionUID = 3590332973770104094L;

    private String name;
    public final int index;
    private Node argsNode;
    private Node iterNode;

    public FCallNode(ISourcePosition position, String name, Node argsNode) {
        this(position, name, argsNode, null);
    }

    public FCallNode(ISourcePosition position, String name, Node argsNode, Node iterNode) {
        super(position, NodeTypes.FCALLNODE);
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

    /**
     * Get the node that represents a block or a block variable.
     */
    public Node getIterNode() {
        return iterNode;
    }

    public void setIterNode(Node iterNode) {
        this.iterNode = iterNode;
    }

    /**
     * Gets the argsNode.
     * @return Returns a Node
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
     * @return Returns a String
     */
    public String getName() {
        return name;
    }

    public List childNodes() {
        return createList(argsNode, iterNode);
    }

    public String toString() {
        return "FCallNode: " + getName();
    }
}
