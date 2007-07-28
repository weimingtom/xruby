package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** Represents an operator assignment to an element.
 *
 * This could be for example:
 *
 * <pre>
 * a[4] += 5
 * a[3] &&= true
 * </pre>
 *
 * @author  jpetersen
 */
public class OpElementAsgnNode extends Node {
    static final long serialVersionUID = 1509701560452403776L;

    private final Node receiverNode;
    private String operatorName;
    private final Node argsNode;
    private final Node valueNode;
    public final int index;

    public OpElementAsgnNode(ISourcePosition position, Node receiverNode, String operatorName, Node argsNode, Node valueNode) {
        super(position, NodeTypes.OPELEMENTASGNNODE);
        this.receiverNode = receiverNode;
        this.operatorName = operatorName.intern();
        this.argsNode = argsNode;
        this.valueNode = valueNode;
        this.index = MethodIndex.getIndex(this.operatorName);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        operatorName = operatorName.intern();
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

    /**
     * Gets the operatorName.
     * @return Returns a String
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Gets the receiverNode.
     * @return Returns a Node
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

    /**
     * Gets the valueNode.
     * @return Returns a Node
     */
    public Node getValueNode() {
        return valueNode;
    }

}
