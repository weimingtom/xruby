package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.DynamicScope;
import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/**
 * Represents the top of the AST.  This is a node not present in MRI.  It was created to
 * hold the top-most static scope in an easy to grab way and it also exists to hold BEGIN
 * and END nodes.  These can then be interpreted/compiled in the same places as the rest
 * of the code.
 *
 */
// TODO: Store BEGIN and END information into this node
// TODO: Implement BEGIN and END logic so they get invoked at the correct time.
public class RootNode extends Node {
    private static final long serialVersionUID = 1754281364026417051L;

    private transient DynamicScope scope;
    private StaticScope staticScope;
    private Node bodyNode;

    public RootNode(ISourcePosition position, DynamicScope scope, Node bodyNode) {
        super(position, NodeTypes.ROOTNODE);

        this.scope = scope;
        this.staticScope = scope.getStaticScope();
        this.bodyNode = bodyNode;
    }

    /**
     * Return the dynamic scope for this AST.  The variable backed by this is transient so
     * for serialization this is null.  In that case we use staticScope to rebuild the dynamic
     * scope.  The real reason for this method is supporting bindings+eval.  We need to pass
     * our live dynamic scope in so when we eval we can use that dynamic scope.
     *
     * @return dynamic scope of this AST
     */
    public DynamicScope getScope() {
        return scope;
    }

    /**
     * The static scoping relationships that should get set first thing before interpretation
     * of the code represented by this AST.  Actually, we use getScope first since that also
     * can contain a live dynamic scope.  We rely on this method only for interpreting a root
     * node from a serialized format.
     *
     * @return the top static scope for the AST
     */
    public StaticScope getStaticScope() {
        return staticScope;
    }

    /**
     * First real AST node to be interpreted
     *
     * @return real top AST node
     */
    public Node getBodyNode() {
        return bodyNode;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }



}
