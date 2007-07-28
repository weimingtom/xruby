package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Class variable declaration.
 *
 * @author  jpetersen
 */
public class ClassVarDeclNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = -6227934966029974915L;

    private String name;

    public ClassVarDeclNode(ISourcePosition position, String name, Node valueNode) {
        super(position, NodeTypes.CLASSVARDECLNODE);

        this.name = name.intern();

        setValueNode(valueNode);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        name = name.intern();
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the name.
     * @return Returns a String
     */
    public String getName() {
        return name;
    }

}