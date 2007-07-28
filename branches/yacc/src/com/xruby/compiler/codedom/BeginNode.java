package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Begin/End block.
 *  A Begin ... End block without rescue.
 *
 * @author  jpetersen
 */
public class BeginNode extends Node {
    static final long serialVersionUID = 7295877486186461712L;

    private final Node bodyNode;

    public BeginNode(ISourcePosition position, Node bodyNode) {
        super(position, NodeTypes.BEGINNODE);
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
     * @return Returns a INode
     */
    public Node getBodyNode() {
        return bodyNode;
    }

}
