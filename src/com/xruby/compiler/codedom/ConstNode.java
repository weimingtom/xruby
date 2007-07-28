package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * The access to a Constant.
 *
 * @author  jpetersen
 */
public class ConstNode extends Node implements INameNode {
    static final long serialVersionUID = -5190161028130457944L;

    private String name;

    public ConstNode(ISourcePosition position, String name) {
        super(position, NodeTypes.CONSTNODE);
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

    public String toString() {
        return "ConstNode [" + name + "]";
    }

	public void setName(String name) {
		this.name = name;
	}

}
