package com.xruby.compiler.parser;

/**
 * This interface is the combination of two needs:  1) A Ruby interpreter position (for warnings
 * and errors).  The interpreter only cares about filename and endLine.  2) A IDE position (offsets
 * for showing ranges of grammatical elements).
 *
 * The offsets represent positions 'between' characters.  So a variable 'abc' has a startOffset
 * of 0 and an endOffset of 3 ( 0a1b2c3 ).
 *
 */
public interface ISourcePosition {
    /**
     * Which file does this source position live in?
     *
     * @return name of the source file.
     */
	public String getFile();

    /**
     * Which is the first(start) line that this source position occurs on (zero-based)
     * @return
     */
	public int getStartLine();

    /**
     * Which is the last(end) line that this source position occurs on (zero-based)
     *
     * @return the line
     */
	public int getEndLine();

    /**
     * Modify startOffset by a relativeValue.  At times our grammar and lexer do not give us
     * the exact positions we need so we need to manually tweak position.  The bummer of this
     * is this requires ISourcePosition implementations are mutable.
     *
     * @param relativeValue to nudge startOffset up or down
     */
    public void adjustStartOffset(int relativeValue);

    /**
     * Get offset (relative to beginning of source file) immediately before first character
     * represented by this source position.
     *
     * @return the offset
     */
	public int getStartOffset();

    /**
     * Get offset (relative to beginning of source file) immediately after the last character
     * represented by this source position
     *
     * @return the offset
     */
	public int getEndOffset();

    /**
     * Calculates the logical union of the two positions and creates a new resulting position
     *
     * @param position to be unioned against this position
     * @return a new position
     */
    public ISourcePosition union(ISourcePosition position);
}
