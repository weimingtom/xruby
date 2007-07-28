package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.io.IOException;

/**
 * RubyMethod call without any arguments
 *
 * @author  jpetersen
 */
public class VCallNode extends Node implements INameNode {
    static final long serialVersionUID = -7678578490000574578L;

    private String name;
    public final int index;

    public VCallNode(ISourcePosition position, String name) {
        super(position, NodeTypes.VCALLNODE);
        this.name = name.intern();
        this.index = MethodIndex.getIndex(this.name);
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
     * Gets the methodName.
     * @return Returns a String
     */
    public String getName() {
        return name;
    }

}
