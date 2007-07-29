package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a '::' constant access or method call.
 *
 * @author  jpetersen
 */
public class Colon2Node extends Colon3Node implements INameNode {
    static final long serialVersionUID = -3250593470034657352L;

    private final Node leftNode;

    public Colon2Node(ISourcePosition position, Node leftNode, String name) {
        super(position, NodeTypes.COLON2NODE, name);
        this.leftNode = leftNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the leftNode.
     * @return Returns a Node
     */
    public Node getLeftNode() {
        return leftNode;
    }

    public String toString() {
        String result = "Colon2Node [";
        if (leftNode != null) result += leftNode;
        result += getName();
        return result + "]";
    }
}
