package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * A 'for' statement.  This is implemented using iter and that is how MRI does things,
 * but 'for's do not have their own stack, so doing this way is mildly painful.
 *
 * @see IterNode
 */
public class ForNode extends IterNode {
    static final long serialVersionUID = -8319863477790150586L;
    private Node iterNode;

    public ForNode(ISourcePosition position, Node varNode, Node bodyNode, Node iterNode) {
        // For nodes do not have their own scope so we pass null to indicate this.
        // 'For's are implemented as blocks in evaluation, but they have no scope so we
        // just deal with this lack of scope throughout its lifespan.  We should probably
        // change the way this works to get rid of multiple null checks.
        super(position, varNode, null, bodyNode, NodeTypes.FORNODE);

        this.iterNode = iterNode;
    }

    public Node getIterNode() {
        return iterNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

}
