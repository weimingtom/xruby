package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/** Represents an instance variable assignment.
 *
 * @author  jpetersen
 */
public class InstAsgnNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = 64498126883104604L;

    private String name;

    /**
     * Construtor.
     * @param name the name of the instance variable
     * @param valueNode the value of the variable
     **/
    public InstAsgnNode(ISourcePosition position, String name, Node valueNode) {
        super(position, NodeTypes.INSTASGNNODE);
        this.name = name.intern();
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

    public void setName(String name) {
		this.name = name;
	}

}
