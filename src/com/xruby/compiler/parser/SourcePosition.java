package com.xruby.compiler.parser;

import java.io.Serializable;

/**
 *
 * Position within a source.  This could have column as well, but it currently
 * does not.  A normal ruby intrepretter does not use this information in
 * error/warning information.  An IDE using this may need it though.  This is
 * trivially added if need be.
 * 
 * @see
 */
public class SourcePosition implements ISourcePosition, Serializable {
    private static final long serialVersionUID = 3762529027281400377L;

    // The file of the source
    private final String file;

    // The state/end rows of the source
    private final int startLine;
    private final int endLine;

    // The start/end offsets of the source
    private int startOffset;
    private final int endOffset;

    /**
     * Creates a default source position - required for serialization.
     */
    public SourcePosition() {
    	this("", 0, 0);
    }

    /**
     * Creates a new source position.
     *
     * @param file location of the source (must not be null)
     * @param endLine what line within the source
     */
	public SourcePosition(String file, int startLine, int endLine) {
		if (file == null) { //otherwise equals() and getInstance() will fail
			throw new NullPointerException();
		}
		this.file = file;
		this.startLine = startLine;
		this.endLine = endLine;
		this.startOffset = 0;
		this.endOffset = 0;
	}

    /**
     * Creates a new source position.
     *
     * @param file location of the source (must not be null)
     * line what line within the source
     */
	public SourcePosition(String file, int startLine, int endLine, int startOffset, int endOffset) {
		if (file == null) { //otherwise equals() and getInstance() will fail
			throw new NullPointerException();
		}
		this.file = file;
		this.startLine = startLine;
		this.endLine = endLine;
		this.startOffset = startOffset;
		this.endOffset = endOffset;
	}


    public String getFile() {
        return file;
    }


    public int getStartLine() {
    	return startLine;
    }


    public int getEndLine() {
        return endLine;
    }

    /**
     * @param object the object which should be compared
     * @return simple Object.equals() implementation
     */
    public boolean equals(Object object) {
    	if (object == this) {
    		return true;
    	}
        if (!(object instanceof SourcePosition)) {
        	return false;
        }

        SourcePosition other = (SourcePosition) object;

        return file.equals(other.file) && endLine == other.endLine;
    }

    /**
     * Something we can use for identity in hashing, etc...
     *
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return file.hashCode() ^ endLine;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return file + ":[" + startLine + "," + endLine + "]:[" +
            getStartOffset() + "," + getEndOffset() + "]";
    }


    public void adjustStartOffset(int relativeValue) {
        startOffset += relativeValue;
        if(startOffset < 0) startOffset = 0;
    }


    public int getStartOffset() {
    	return startOffset;
    }


    public int getEndOffset() {
    	return endOffset;
    }


    public ISourcePosition union(ISourcePosition other) {
        // Enebo: All AST nodes but IterNode are in ascending order position-wise.  We should not
        // need to safe-guard that other is a smaller source position
        return new SourcePosition(file, startLine, other.getEndLine(), startOffset, other.getEndOffset());
    }

    /**
     * Not used in interpreter
     * Creates a new position the encloses both parameter positions.
     *
     * param the positions providing the boundaries for the new position.
     */
    public static SourcePosition combinePosition(ISourcePosition firstPos, ISourcePosition secondPos){
        String fileName = firstPos.getFile();
        int startOffset = firstPos.getStartOffset();
        int endOffset = firstPos.getEndOffset();
        int startLine = firstPos.getStartLine();
        int endLine = firstPos.getEndLine();

        if(startOffset > secondPos.getStartOffset()){
            startOffset = secondPos.getStartOffset();
            startLine = secondPos.getStartLine();
        }

        if(endOffset < secondPos.getEndOffset()){
            endOffset = secondPos.getEndOffset();
            endLine = secondPos.getEndLine();
        }

        SourcePosition combinedPosition = new SourcePosition(fileName, startLine, endLine, startOffset, endOffset);

        return combinedPosition;
    }
}
