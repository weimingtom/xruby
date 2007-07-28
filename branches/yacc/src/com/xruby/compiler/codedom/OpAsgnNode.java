package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 *
 * @author  jpetersen
 */
public class OpAsgnNode extends Node {
    static final long serialVersionUID = -1950295226516487753L;

    private final Node receiverNode;
    private final Node valueNode;
    private String variableName;
    private String operatorName;
    private String variableNameAsgn;
    public final int index;

    public OpAsgnNode(ISourcePosition position, Node receiverNode, Node valueNode, String variableName, String methodName) {
        super(position, NodeTypes.OPASGNNODE);
        this.receiverNode = receiverNode;
        this.valueNode = valueNode;
        this.variableName = variableName.intern();
        this.operatorName = methodName.intern();
        this.variableNameAsgn = (variableName + "=").intern();
        this.index = MethodIndex.getIndex(this.operatorName);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        variableName = variableName.intern();
        operatorName = operatorName.intern();
        variableNameAsgn = variableNameAsgn.intern();
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the methodName.
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

    /**
     * Gets the varibaleName.
     * @return Returns a String
     */
    public String getVariableName() {
        return variableName;
    }

    public String getVariableNameAsgn() {
        return variableNameAsgn;
    }

}
