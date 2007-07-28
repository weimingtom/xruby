package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a yield statement.
 *
 * @author  jpetersen
 */
public class YieldNode extends Node {
    static final long serialVersionUID = -4136185449481135660L;

    private final Node argsNode;
    private final boolean checkState;

    public YieldNode(ISourcePosition position, Node argsNode, boolean checkState) {
        super(position, NodeTypes.YIELDNODE);
        this.argsNode = argsNode;
        // If we have more than one arg, make sure the array created to contain them is not ObjectSpaced
        if (argsNode instanceof ArrayNode) {
            ((ArrayNode)argsNode).setLightweight(true);
        }
        this.checkState = checkState;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the argsNode.
     * @return Returns a Node
     */
    public Node getArgsNode() {
        return argsNode;
    }

    public boolean getCheckState() {
        return checkState;
    }

}
