package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** Represents an alias of a global variable.
 *
 * @author  jpetersen
 */
public class VAliasNode extends Node {
    static final long serialVersionUID = 8647860367861922838L;

    private String oldName;
    private String newName;

    public VAliasNode(ISourcePosition position, String newName, String oldName) {
        super(position, NodeTypes.VALIASNODE);
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
     * @return Returns a String
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Gets the oldName.
     * @return Returns a String
     */
    public String getOldName() {
        return oldName;
    }

}
