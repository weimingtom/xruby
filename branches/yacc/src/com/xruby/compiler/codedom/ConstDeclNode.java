package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.util.List;

/**
 * Declaration (and assignment) of a Constant.
 *
 * @author  jpetersen
 */
public class ConstDeclNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = -6260931203887158208L;

    private final String name;
    private final INameNode constNode;

    public ConstDeclNode(ISourcePosition position, String name, INameNode constNode, Node valueNode) {
        super(position, NodeTypes.CONSTDECLNODE);
        if (name != null) name.intern();
        this.name = name;
        this.constNode = constNode;
        setValueNode(valueNode);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the name (this is the rightmost element of lhs (in Foo::BAR it is BAR).
	 * name is the constant Name, it normally starts with a Capital
     * @return name
     */
    public String getName() {
    	return (name == null ? constNode.getName() : name);
    }

    /**
     * Get the path the name is associated with or null (in Foo::BAR it is Foo).
     * @return pathNode
     */
    public Node getConstNode() {
        return (Node) constNode;
    }

    public List childNodes() {
        return createList(getValueNode());
    }

}

