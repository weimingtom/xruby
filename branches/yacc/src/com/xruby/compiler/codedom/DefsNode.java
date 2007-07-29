package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/** Represents a singleton method definition.
 *
 * @author  jpetersen
 */
public class DefsNode extends MethodDefNode implements INameNode {
    static final long serialVersionUID = -4472719020304670080L;

    private final Node receiverNode;
    public DefsNode(ISourcePosition position, Node receiverNode, ArgumentNode nameNode, ArgsNode argsNode,
            StaticScope scope, Node bodyNode) {
        super(position, nameNode, argsNode, scope, bodyNode, NodeTypes.DEFSNODE);

        this.receiverNode = receiverNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the receiverNode.
     * @return Returns a Node
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

    /**
     * Gets the name of this method
     */
    public String getName() {
        return nameNode.getName();
    }

}
