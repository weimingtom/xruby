package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * A new (logical) source code line.
 * This is used to change the value of the ruby interpreter
 * source and line values.
 * There is one such node for each logical line.  Logical line differs
 * from physical line in that a ';' can be used to make several logical
 * line out of a physical line and a physical line if it is in a comment
 * or in a string does not necessarily correspond to a physical line.
 * This is normally a wrapper around another more significant node.
 * The parser generates such a node around each separate statement.
 *
 * @author  jpetersen
 */
public class NewlineNode extends Node {
    static final long serialVersionUID = -6180129177863553832L;

    private final Node nextNode;

    public NewlineNode(ISourcePosition position, Node nextNode) {
        super(position, NodeTypes.NEWLINENODE);

        this.nextNode = nextNode;
    }

    /**
     * RubyMethod used by visitors.
     * accepts the visitor
     * @param iVisitor the visitor to accept
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the nextNode.
     * @return Returns a Node
     */
    public Node getNextNode() {
        return nextNode;
    }

    


}
