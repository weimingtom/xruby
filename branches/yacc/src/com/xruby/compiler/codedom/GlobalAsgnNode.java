package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * Represents an assignment to a global variable.
 *
 * @author  jpetersen
 */
public class GlobalAsgnNode extends AssignableNode implements INameNode {
    static final long serialVersionUID = 2278414591762936906L;

    private String name;

    public GlobalAsgnNode(ISourcePosition position, String name, Node valueNode) {
        super(position, NodeTypes.GLOBALASGNNODE);

        this.name = name.intern();
        setValueNode(valueNode);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // deserialized strings are not interned; intern it now
        name = name.intern();
    }

    /**
     * RubyMethod used by visitors.
     * accepts the visitor
     * @param iVisitor the visitor to accept
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
