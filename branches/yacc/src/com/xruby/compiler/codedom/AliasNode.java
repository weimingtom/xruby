package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** An AliasNode represents an alias statement.
 * ast node for the
 * <code>alias newName oldName</code>
 * @author  jpetersen
 */
public class AliasNode extends Node {
    static final long serialVersionUID = -498707070925086399L;

    private String oldName;
    private String newName;

    public AliasNode(ISourcePosition position, String newName, String oldName) {
        super(position, NodeTypes.ALIASNODE);
        this.oldName = oldName.intern();
        this.newName = newName.intern();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        oldName = oldName.intern();
        newName = newName.intern();
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the newName.
     * @return the newName as in the alias statement :  <code> alias <b>newName</b> oldName </code>
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Gets the oldName.
     * @return the oldName as in the alias statement :  <code> alias newName <b>oldName</b></code>
     */
    public String getOldName() {
        return oldName;
    }

}
