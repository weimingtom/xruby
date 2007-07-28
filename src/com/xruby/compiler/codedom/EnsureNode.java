package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *	an ensure statement.
 * @author  jpetersen
 */
public class EnsureNode extends Node {
    static final long serialVersionUID = -409805241533215981L;

    private final Node bodyNode;
    private final Node ensureNode;

    public EnsureNode(ISourcePosition position, Node bodyNode, Node ensureNode) {
        super(position, NodeTypes.ENSURENODE);
        this.bodyNode = bodyNode;
        this.ensureNode = ensureNode;
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
     * Gets the ensureNode.
     * @return Returns a Node
     */
    public Node getEnsureNode() {
        return ensureNode;
    }

   
}
