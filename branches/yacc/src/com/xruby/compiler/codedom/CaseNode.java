package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * A Case statement.
 *
 * Represents a complete case statement, including the body with its
 * when statements.
 *
 * @author  jpetersen
 */
public class CaseNode extends Node {
    static final long serialVersionUID = -2824917272720800901L;

	/**
	 * the case expression.
	 **/
    private final Node caseNode;
	/**
	 * the body of the case.
	 */
    private final Node caseBody;

    public CaseNode(ISourcePosition position, Node caseNode, Node caseBody) {
        super(position, NodeTypes.CASENODE);
        this.caseNode = caseNode;
        this.caseBody = caseBody;
    }

 	/**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the caseNode.
	 * caseNode is the case expression
     * @return caseNode
     */
    public Node getCaseNode() {
        return caseNode;
    }

    /**
     * Gets the first whenNode.
	 * the body of the case statement, the first of a list of WhenNodes
     * @return whenNode
     */
    public Node getFirstWhenNode() {
        return caseBody;
    }

}
