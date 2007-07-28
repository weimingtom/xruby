package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/** Singleton class definition.
 *
 * <pre>
 * class &lt;&lt; anObject
 *
 * end
 * </pre>
 *
 * @author  jpetersen
 */
public class SClassNode extends Node {
    static final long serialVersionUID = -3706492163082062224L;

    private final Node receiverNode;
    private final StaticScope scope;
    private final Node bodyNode;

    public SClassNode(ISourcePosition position, Node recvNode, StaticScope scope, Node bodyNode) {
        super(position, NodeTypes.SCLASSNODE);
        this.receiverNode = recvNode;
        this.scope = scope;
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
     * Gets the body of this class.
     *
     * @return the contents
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    /**
     * Gets the scope of this class
     *
     * @return the scope
     */
    public StaticScope getScope() {
        return scope;
    }

    /**
     * Gets the receiverNode.
     * @return Returns a Node
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

}

