package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/** Represents a module definition.
 *
 * @author  jpetersen
 */
public class ModuleNode extends Node implements IScopingNode {
    static final long serialVersionUID = 4938115602547834310L;

    private final Colon3Node cpath;
    private final StaticScope scope;
    private final Node bodyNode;

    public ModuleNode(ISourcePosition position, Colon3Node cpath, StaticScope scope, Node bodyNode) {
        super(position, NodeTypes.MODULENODE);
        this.cpath = cpath;
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
     * Get the static scoping information.
     *
     * @return the scoping info
     */
    public StaticScope getScope() {
        return scope;
    }

    /**
     * Gets the name.
     * @return Representation of the module path+name
     */
    public Colon3Node getCPath() {
        return cpath;
    }

}

