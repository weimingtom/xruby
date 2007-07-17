package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Representation of a comment.  Note that comments are not part of evaluation so you do
 * not get the ability to visit this node as part of evaluation.  In theory we could add
 * this if we envisioned some wacky annotation system, but we have no crazy ideas yet.
 *
 */
public class CommentNode extends Node {
    private static final long serialVersionUID = -8304070370230933044L;

    // Textual data (this is missing newline as a single line comment and =begin..=end
    // comments do contain the intermediary newlines.
    String content;

    public CommentNode(ISourcePosition position, String content) {
        this. position = position;

        this.content = content;
    }

    public void accept(CodeVisitor visitor) {
       //do nothing: actually should delegate to visitor for some case like code printer
    }

    public String getContent() {
        return content;
    }

}
