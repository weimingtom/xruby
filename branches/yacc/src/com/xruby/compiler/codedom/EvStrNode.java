package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents an #{} expression in a string. This Node is always a subnode
 * of a DStrNode, DXStrNode or a DRegexpNode.
 *
 * Before this Node is evaluated it contains the code as a String (value). After
 * the first evaluation this String is parsed into the evaluatedNode Node.
 *
 * @author  jpetersen
 */
public class EvStrNode extends Node {
    static final long serialVersionUID = 1681935012117120817L;

    private final Node body;

    public EvStrNode(ISourcePosition position, Node body) {
        super(position, NodeTypes.EVSTRNODE);
        this.body = body;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the evaluatedNode.
     * @return Returns a Node
     */
    public Node getBody() {
        return body;
    }

}
