package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * an 'if' statement.
 * @author  jpetersen
 */
public class IfNode extends Node {
    static final long serialVersionUID = -163780144332979551L;

    private final Node condition;
    private final Node thenBody;
    private final Node elseBody;

    public IfNode(ISourcePosition position, Node condition, Node thenBody, Node elseBody) {
        super(position, NodeTypes.IFNODE);
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the condition.
     * @return Returns a Node
     */
    public Node getCondition() {
        return condition;
    }

    /**
     * Gets the elseBody.
     * @return Returns a Node
     */
    public Node getElseBody() {
        return elseBody;
    }

    /**
     * Gets the thenBody.
     * @return Returns a Node
     */
    public Node getThenBody() {
        return thenBody;
    }

}
