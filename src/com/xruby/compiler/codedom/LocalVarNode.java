package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Access a local variable
 */
public class LocalVarNode extends Node implements INameNode {
    static final long serialVersionUID = 8562701804939317217L;

    // The name of the variable
    private String name;

    // A scoped location of this variable (high 16 bits is how many scopes down and low 16 bits
    // is what index in the right scope to set the value.
    private final int location;

    public LocalVarNode(ISourcePosition position, int location, String name) {
        super(position, NodeTypes.LOCALVARNODE);
        this.location = location;
        this.name = name;
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
     * What is the name of this variable
     *
     * @return the name of the variable
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this variable (for refactoring support)
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

}
