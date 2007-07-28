package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.BlockNode;
import com.xruby.compiler.codedom.CommentNode;
import com.xruby.compiler.codedom.Node;

import java.util.ArrayList;
import java.util.List;

public class RubyParserResult {
    private final List beginNodes = new ArrayList();
    private Node ast;
    private boolean endSeen;
    private List commentNodes = new ArrayList();
    private DynamicScope scope;

    public List getCommentNodes() {
        return commentNodes;
    }

    public Node getAST() {
        return ast;
    }

    public DynamicScope getScope() {
        return scope;
    }

    public void setScope(DynamicScope scope) {
        this.scope = scope;
    }

    /**
     * Sets the ast.
     * @param ast The ast to set
     */
    public void setAST(Node ast) {
        this.ast = ast;
    }

    public void addComment(CommentNode node) {
        commentNodes.add(node);
    }

    public void addBeginNode(StaticScope scope, Node node) {
        // FIXME: We need to add BEGIN nodes properly
    	beginNodes.add(node);
    }

    public void addAppendBeginNodes() {
    	if (beginNodes.isEmpty()) return;

        BlockNode n;
    	if (getAST() != null) {
    		n = new BlockNode(getAST().getPosition());
    	} else {
    		n = new BlockNode(((Node) beginNodes.get(0)).getPosition());
    	}
    	for (int i = 0; i < beginNodes.size(); i++) {
    		n.add((Node) beginNodes.get(i));
    	}
    	if (getAST() != null) n.add(getAST());

    	setAST(n);
    }

    public boolean isEndSeen() {
    	return endSeen;
    }

    public void setEndSeen(boolean endSeen) {
    	this.endSeen = endSeen;
    }
}
