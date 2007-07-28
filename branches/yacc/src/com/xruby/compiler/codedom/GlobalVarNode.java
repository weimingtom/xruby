package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * User: user
 * Date: 2007-7-28
 */
/**
 *	access to a global variable.
 * @author  jpetersen
 */
public class GlobalVarNode extends Node implements INameNode {
    static final long serialVersionUID = -8913633094119740033L;

    private String name;

    public GlobalVarNode(ISourcePosition position, String name) {
        super(position, NodeTypes.GLOBALVARNODE);
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
