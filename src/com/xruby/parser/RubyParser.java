/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby.parser;

import com.xruby.parser.symboltable.SymbolTableManager;
import com.xruby.codedom.Program;

import java.io.Reader;

import antlr.Token;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;

/**
 * @author sony
 *
 */
public class RubyParser extends RubyParserBase
{
	private RubyLexer lexer_;

	public RubyParser(RubyLexer lexer)
	{
		super(lexer);
		lexer_ = lexer;
	}

	public RubyParser(Reader in)
	{
		this(new RubyLexer(in, new SymbolTableManager()));
	}

	/// @return AST
	AST createAST() throws RecognitionException, TokenStreamException
	{
		program();
		return getAST();
	}

	public Program parse() throws RecognitionException, TokenStreamException
	{
		RubyTreeParser treeparser = new RubyTreeParser();
		return treeparser.parse(createAST());
	}

	protected void tell_lexer_we_have_finished_parsing_methodparameters()
	{
		lexer_.set_last_token_to_be_RPAREN_IN_METHOD_DEFINATION();
	}

	protected void tell_lexer_we_have_finished_parsing_symbol()
	{
		lexer_.set_just_finished_parsing_symbol();
	}

	protected void tell_lexer_we_have_finished_parsing_string_expression_substituation()
	{
		lexer_.set_just_finished_parsing_string_expression_substituation();
	}

	protected void tell_lexer_we_have_finished_parsing_regex_expression_substituation()
	{
		lexer_.set_just_finished_parsing_regex_expression_substituation();
	}

	protected void enterClass()
	{
		lexer_.getSymbolTableManager().enterClass();
	}

	protected void enterMethod()
	{
		lexer_.getSymbolTableManager().enterMethod();
	}

	protected void enterModule()
	{
		lexer_.getSymbolTableManager().enterModule();
	}

	protected void enterBlock()
	{
		lexer_.getSymbolTableManager().enterBlock();
	}

	protected void leaveClass()
	{
		lexer_.getSymbolTableManager().leaveClass();
	}

	protected void leaveMethod()
	{
		lexer_.getSymbolTableManager().leaveMethod();
	}

	protected void leaveModule()
	{
		lexer_.getSymbolTableManager().leaveModule();
	}

	protected void leaveBlock()
	{
		lexer_.getSymbolTableManager().leaveBlock();
	}

	protected void addMethodParameter(Token id)
	{
		lexer_.getSymbolTableManager().addParameter(id.getText());
	}
}

