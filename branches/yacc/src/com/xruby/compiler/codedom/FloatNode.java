package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a float literal.
 *
 * @author  jpetersen
 */
public class FloatNode extends Node implements ILiteralNode {
    static final long serialVersionUID = -6358513813684285950L;

    private double value;

    public FloatNode(ISourcePosition position, double value) {
        this.position = position;
        this.value = value;
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitFloatExpression(value);
    }



    /**
     * Gets the value.
     * @return Returns a double
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value
     * @param value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

}
