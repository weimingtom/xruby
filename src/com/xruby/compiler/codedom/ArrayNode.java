package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Represents an array. This could be an array literal, quoted words or
 * some args stuff.
 *
 * @author  jpetersen
 */
public class ArrayNode extends ListNode implements ILiteralNode {
    static final long serialVersionUID = 6279246130032958596L;

    // This field is used during argument processing to avoid putting RubyArray
    // instances that are purely for utility purposes into ObjectSpace.
    private boolean lightweight = false;

    public ArrayNode(ISourcePosition position, Node firstNode) {
        super(position, NodeTypes.ARRAYNODE, firstNode);
    }

    public ArrayNode(ISourcePosition position) {
        super(position, NodeTypes.ARRAYNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public void setLightweight(boolean lightweight) {
        this.lightweight = lightweight;
    }

    public boolean isLightweight() {
        return lightweight;
    }
}
