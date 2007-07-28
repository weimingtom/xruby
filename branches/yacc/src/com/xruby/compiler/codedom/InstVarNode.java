package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Represents an instance variable accessor.
 */
public class InstVarNode extends Node implements IArityNode, INameNode {
    static final long serialVersionUID = 6839063763576230282L;

    private String name;

    public InstVarNode(ISourcePosition position, String name) {
        super(position, NodeTypes.INSTVARNODE);
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
	 * A variable accessor takes no arguments.
	 */
	public Arity getArity() {
		return Arity.noArguments();
	}

    /**
     * Gets the name.
     * @return Returns a String
     */
    public String getName() {
        return name;
    }

    public void setName(String name){
    		this.name = name;
    }

}
