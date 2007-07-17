package com.xruby.compiler.parser;

public class SyntaxException extends RuntimeException {
	private static final long serialVersionUID = -2130930815167932274L;

    private ISourcePosition position;

    public SyntaxException(ISourcePosition position, String message) {
        super(message);

        this.position = position;
    }

    public ISourcePosition getPosition() {
        return position;
    }
}
