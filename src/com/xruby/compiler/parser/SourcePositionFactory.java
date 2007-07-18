package com.xruby.compiler.parser;

public class SourcePositionFactory implements ISourcePositionFactory {
    // Position of last token returned.
    private SourcePosition lastPosition;
    private LexerSource source;

    public SourcePositionFactory(LexerSource source, int line) {
        this.source = source;
        lastPosition = new SourcePosition("", line, line);
    }

    public ISourcePosition getPosition(ISourcePosition startPosition, boolean inclusive) {

        if (startPosition == null) {
            lastPosition = new SourcePosition(source.getFilename(), lastPosition.getEndLine(),
                    source.getLine(), lastPosition.getEndOffset(), source.getOffset());
        } else if (inclusive) {
            lastPosition = new SourcePosition(source.getFilename(), startPosition.getStartLine(),
                    source.getLine(), startPosition.getStartOffset(), source.getOffset());
        } else {
            lastPosition = new SourcePosition(source.getFilename(), startPosition.getEndLine(),
                    source.getLine(), startPosition.getEndOffset(), source.getOffset());
        }

        return lastPosition;
	}

    public ISourcePosition getDummyPosition() {
        return new SourcePosition("", -1, -1, 0, 0);
    }
}
