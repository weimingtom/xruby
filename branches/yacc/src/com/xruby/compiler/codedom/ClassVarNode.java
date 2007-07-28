package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Access to a class variable.
 *
 * @author  jpetersen
 */
public class ClassVarNode extends Node implements INameNode {
    static final long serialVersionUID = -228883683599457381L;

    private String name;

    public ClassVarNode(ISourcePosition position, String name) {
        super(position, NodeTypes.CLASSVARNODE);
        this.name = name.intern();
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

    public void setName(String name) {
    		this.name = name;
    }

}
