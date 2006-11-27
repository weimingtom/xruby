package com.xruby.compiler.parser;

import antlr.*;
import antlr.collections.*;

/**
 * CommonAST(default) from Antlr does not store line information.
 * So we extend it, so use setASTNodeClass() to set it up in parser. 
 */
public class ASTWithLineNumber extends CommonAST {

	private static final long serialVersionUID = 1L;
	private int line_ = 0;

	public void initialize(Token tok) {
		super.initialize(tok);
		line_ = tok.getLine();
	}

	public void initialize (AST ast) {
		super.initialize(ast);
		if (ast instanceof ASTWithLineNumber){
			line_ = ((ASTWithLineNumber)ast).getLine();
		}
	}

	public int getLine() {
		return line_;
	}
}
