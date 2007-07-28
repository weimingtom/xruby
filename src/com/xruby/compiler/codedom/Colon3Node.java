package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Global scope node.
 * Node produced when using :: without a scope in front.
 * This is used to gain access to the global scope (that of the Object class)
 * when refering to a constant or method.  This is the same as a Colon2Node but with
 * no leftNode which implicitly uses the Object class as a left node.
 *
 * @author  jpetersen
 */
public class Colon3Node extends Node implements INameNode {
    static final long serialVersionUID = 8860717109371016871L;

    private String name;

    public Colon3Node(ISourcePosition position, String name) {
        super(position, NodeTypes.COLON3NODE);
        this.name = name.intern();
    }

    public Colon3Node(ISourcePosition position, int id, String name) {
        super(position, id);
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
