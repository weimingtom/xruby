package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * An assignment to a dynamic variable (e.g. block scope local variable).
 */
public class DAsgnNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = 2396008643154044043L;

    // The name of the variable
    private String name;

    // A scoped location of this variable (high 16 bits is how many scopes down and low 16 bits
    // is what index in the right scope to set the value.
    private int location;

    public DAsgnNode(ISourcePosition position, String name, int location, Node valueNode) {
        super(position, NodeTypes.DASGNNODE);
        this.name = name.intern();
        this.location = location;
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

    public void setName(String name) {
        this.name = name;
    }

}
