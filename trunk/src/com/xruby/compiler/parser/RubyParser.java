/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser;

import com.xruby.compiler.parser.symboltable.SymbolTableManager;
import com.xruby.compiler.codedom.Program;

import java.io.Reader;

import antlr.Token;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;

public class RubyParser extends RubyParserBase {
	private RubyLexer lexer_;

	public RubyParser(RubyLexer lexer) {
		super(lexer);
		lexer_ = lexer;
	}

	public RubyParser(Reader in) {
		this(in, null);
	}
	
	public RubyParser(Reader in, String[] pre_defined) {
		this(new RubyLexer(in, new SymbolTableManager(pre_defined)));
	}

	/// @return AST
	AST createAST() throws RecognitionException, TokenStreamException {
		setASTNodeClass("com.xruby.compiler.parser.ASTWithLineNumber");
		program();
		return getAST();
	}

	public Program parse(String filename) throws RecognitionException, TokenStreamException {
		RubyTreeParser treeparser = new RubyTreeParser();
		return treeparser.parse(createAST(), filename);
	}

	protected void tellLexerWeHaveFinishedParsingMethodparameters() {
		lexer_.setLastTokenToBe_RPAREN_IN_METHOD_DEFINATION();
	}

	protected void tellLexerWeHaveFinishedParsingSymbol() {
		lexer_.setJustFinishedParsingSymbol();
	}

	protected void tellLexerWeHaveFinishedParsingStringExpressionSubstituation() {
		lexer_.setJustFinishedParsingStringExpressionSubstituation();
	}

	protected void tellLexerWeHaveFinishedParsingRegexExpressionSubstituation() {
		lexer_.setJustFinishedParsingRegexExpressionSubstituation();
	}

	protected void tellLexerWeHaveFinishedParsingHeredocExpressionSubstituation() {
		lexer_.setJustFinishedParsingHeredocExpressionSubstituation();
	}
	
	protected void enterClass() {
		lexer_.getSymbolTableManager().enterClass();
	}

	protected void enterMethod() {
		lexer_.getSymbolTableManager().enterMethod();
	}

	protected void enterModule() {
		lexer_.getSymbolTableManager().enterModule();
	}

	protected void enterBlock() {
		lexer_.getSymbolTableManager().enterBlock();
	}

	protected void leaveClass() {
		lexer_.getSymbolTableManager().leaveClass();
	}

	protected void leaveMethod() {
		lexer_.getSymbolTableManager().leaveMethod();
	}

	protected void leaveModule() {
		lexer_.getSymbolTableManager().leaveModule();
	}

	protected void leaveBlock() {
		lexer_.getSymbolTableManager().leaveBlock();
	}

	protected void addMethodParameter(Token id) {
		lexer_.getSymbolTableManager().addParameter(id.getText());
	}

	protected void addLocalVariable(Token id) {
		lexer_.getSymbolTableManager().addLocalVarible(id.getText());
	}
}
