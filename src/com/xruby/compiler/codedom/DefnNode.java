package com.xruby.compiler.codedom;

import com.xruby.Visibility;
import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

/**
 * method definition node.
 *
 * @author  jpetersen
 */
public class DefnNode extends MethodDefNode implements INameNode {
    static final long serialVersionUID = -7634791007500033454L;

    private final Visibility visibility;

    public DefnNode(ISourcePosition position, ArgumentNode nameNode, ArgsNode argsNode,
            StaticScope scope, Node bodyNode, Visibility visibility) {
        super(position, nameNode, argsNode, scope, bodyNode, NodeTypes.DEFNNODE);

        this.visibility = visibility;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the noex.
     * @return Returns a int
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Get the name of this method
     */
    public String getName() {
        return nameNode.getName();
    }
}