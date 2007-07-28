package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** Represents a symbol (:symbol_name).
 *
 * @author  jpetersen
 */
public class SymbolNode extends Node implements ILiteralNode, INameNode {
    static final long serialVersionUID = 3168450881711346709L;

	private String name;

	public SymbolNode(ISourcePosition position, String name) {
	    super(position, NodeTypes.SYMBOLNODE);
	    this.name = name.intern();
	}

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        name = name.intern();
    }

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
