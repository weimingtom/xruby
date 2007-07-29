package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a return statement.
 *
 * @author  jpetersen
 */
public class ReturnNode extends Node {
    static final long serialVersionUID = -6549592319167820636L;

    private final Node valueNode;
    private Object target;

    public ReturnNode(ISourcePosition position, Node valueNode) {
        super(position, NodeTypes.RETURNNODE);
        this.valueNode = valueNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node getValueNode() {
        return valueNode;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

}
