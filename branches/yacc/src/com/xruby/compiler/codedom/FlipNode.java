package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * a Range in a boolean expression.
 * named after a FlipFlop component in electronic I believe.
 *
 * @author  jpetersen
 */
public class FlipNode extends Node {
    static final long serialVersionUID = -4735579451657299802L;

    private final Node beginNode;
    private final Node endNode;
    private final boolean exclusive;
    // A scoped location of this variable (high 16 bits is how many scopes down and low 16 bits
    // is what index in the right scope to set the value.
    private final int location;

    public FlipNode(ISourcePosition position, Node beginNode, Node endNode, boolean exclusive, int location) {
        super(position, NodeTypes.FLIPNODE);
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.exclusive = exclusive;
        this.location = location;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the beginNode.
	 * beginNode will set the FlipFlop the first time it is true
     * @return Returns a Node
     */
    public Node getBeginNode() {
        return beginNode;
    }

    /**
     * Gets the endNode.
	 * endNode will reset the FlipFlop when it is true while the FlipFlop is set.
     * @return Returns a Node
     */
    public Node getEndNode() {
        return endNode;
    }

    /**
     * Gets the exclusive.
	 * if the range is a 2 dot range it is false if it is a three dot it is true
     * @return Returns a boolean
     */
    public boolean isExclusive() {
        return exclusive;
    }

    /**
     * How many scopes should we burrow down to until we need to set the block variable value.
     *
     * @return 0 for current scope, 1 for one down, ...
     */
    public int getDepth() {
        return location >> 16;
    }

    /**
     * Gets the index within the scope construct that actually holds the eval'd value
     * of this local variable
     *
     * @return Returns an int offset into storage structure
     */
    public int getIndex() {
        return location & 0xffff;
    }

}
