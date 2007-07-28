package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/**
 * A class statement.
 * A class statement is defined by its name, its supertype and its body.
 * The body is a separate naming scope.
 * This node is for a regular class definition, Singleton classes get their own
 * node, the SClassNode
 *
 * @author  jpetersen
 */
public class ClassNode extends Node implements IScopingNode {
    static final long serialVersionUID = -1369424045737867587L;

    private final Colon3Node cpath;
    private final StaticScope scope;
    private final Node bodyNode;
    private final Node superNode;

    public ClassNode(ISourcePosition position, Colon3Node cpath, StaticScope scope, Node bodyNode, Node superNode) {
        super(position, NodeTypes.CLASSNODE);
        this.cpath = cpath;
        this.scope = scope;
        this.bodyNode = bodyNode;
        this.superNode = superNode;
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
     * Get the static scoping information.
     *
     * @return the scoping info
     */
    public StaticScope getScope() {
        return scope;
    }

    /**
     * Gets the className.
     * @return Returns representation of class path+name
     */
    public Colon3Node getCPath() {
        return cpath;
    }

    /**
     * Gets the superNode.
     * @return Returns a Node
     */
    public Node getSuperNode() {
        return superNode;
    }

    public String toString() {
        return "ClassNode [" + cpath + "]";
    }

}
