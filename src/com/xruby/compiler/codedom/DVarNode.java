package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

public class DVarNode extends Node implements INameNode {
    static final long serialVersionUID = -8479281167248673970L;

    // The name of the variable
    private String name;

    // A scoped location of this variable (high 16 bits is how many scopes down and low 16 bits
    // is what index in the right scope to set the value.
    private int location;

    public DVarNode(ISourcePosition position, int location, String name) {
        super(position, NodeTypes.DVARNODE);
        this.location = location;
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
     * How many scopes should we burrow down to until we need to set the block variable value.
     *
     * @return 0 for current scope, 1 for one down, ...
     */
    public int getDepth() {
        return location >> 16;
    }

    /**
     * Gets the index within the scope construct that actually holds the eval'd value
     * of this local variable
     *
     * @return Returns an int offset into storage structure
     */
    public int getIndex() {
        return location & 0xffff;
    }


    /**
     * Gets the name.
     * @return Returns a String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this variable (for refactoring support)
     * @param name to set the variable to
     */
    public void setName(String name) {
        this.name = name;
    }

}

