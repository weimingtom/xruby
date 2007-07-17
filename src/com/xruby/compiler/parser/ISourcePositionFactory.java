package com.xruby.compiler.parser;

public interface ISourcePositionFactory {
    public ISourcePosition getDummyPosition();
    public ISourcePosition getPosition(ISourcePosition startPosition, boolean inclusive);
}
