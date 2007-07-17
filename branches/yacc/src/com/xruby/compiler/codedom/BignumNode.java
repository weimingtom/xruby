package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

import java.math.BigInteger;

/** Represents a big integer literal.
 *
 * @author  jpetersen
 */
public class BignumNode extends Node implements ILiteralNode {
    static final long serialVersionUID = -8646636291868912747L;

    private BigInteger value;

    public BignumNode(ISourcePosition position, BigInteger value) {
        this.position = position;
        this.value = value;
    }

     public void accept(CodeVisitor visitor) {
       visitor.visitBignumExpression(value);
    }

    /**
     * Gets the value.
     * @return Returns a BigInteger
     */
    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

}
