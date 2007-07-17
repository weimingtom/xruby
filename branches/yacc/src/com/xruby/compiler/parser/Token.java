package com.xruby.compiler.parser;

public class Token {
	ISourcePosition position = null;
	Object value;

	public Token(Object value, ISourcePosition position) {
		this.value = value;
		this.position = position;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public ISourcePosition getPosition() {
		return position;
	}

	public void setPosition(ISourcePosition position) {
		this.position = position;
	}

    public String toString() {
        return "Token { Value=" + value + ", Position=" + position + "}";
    }
}
