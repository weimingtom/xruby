package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Class variable assignment node.
 *
 * @author  jpetersen
 */
public class ClassVarAsgnNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = -2960487069128667341L;

    private String name;

    /**
     * @param name id of the class variable to assign to
     * @param valueNode  Node used to compute the new value when the assignment is evaled
     */
    public ClassVarAsgnNode(ISourcePosition position, String name, Node valueNode) {
        super(position, NodeTypes.CLASSVARASGNNODE);
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
