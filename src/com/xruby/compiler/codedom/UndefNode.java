package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** Represents an undef statement.
 *
 * @author  jpetersen
 */
public class UndefNode extends Node {
    static final long serialVersionUID = -8829084073375820727L;

    private String name;

    public UndefNode(ISourcePosition position, String name) {
        super(position, NodeTypes.UNDEFNODE);
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

}