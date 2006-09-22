/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser;

import java.io.*;

import com.xruby.parser.symboltable.SymbolTableManager;

import junit.framework.*;
import antlr.Token;
import antlr.TokenStreamException;
import antlr.CommonToken;

class TestingCommonToken extends CommonToken
{
	public TestingCommonToken(int t, String txt)
	{
		super(t, txt);
		setLine(1);
	}

	public TestingCommonToken(int t, String txt, int line)
	{
		super(t, txt);
		setLine(line);
	}
}

public class RubyLexerTest extends TestCase implements RubyTokenTypes
{
	private void assert_type(String[] program_texts, int expected_type, String[] expected_texts)
	{
		assertEquals("Length mismatch, setup expected_texts properly!", program_texts.length, expected_texts.length);

		for (int i = 0; i < program_texts.length; ++i)
		{
			try
			{
				SymbolTableManager stm = new SymbolTableManager();
				RubyLexer lexter = new RubyLexer(new StringReader(program_texts[i]), stm);
				Token token = lexter.nextToken();
				assertEquals(program_texts[i], expected_type, token.getType());

				/*if (expected_texts[i] != token.getText())
				{
					System.out.println(expected_texts[i]);
					System.out.println(token.getText());
				}*/
				assertEquals(program_texts[i], expected_texts[i], token.getText());

				// should contain only one token
				if (Token.EOF_TYPE == token.getType())
				{
					Token next_token = lexter.nextToken();
					assertEquals(program_texts[i] + "contains multiple tokens!", Token.EOF_TYPE, next_token.getType());
				}
			}
			catch (TokenStreamException e)
			{
				assertTrue(program_texts[i]+ e.getMessage(), false);
			}
		}
	}

	private void assert_type(String[] program_texts, int expected_type)
	{
		assert_type(program_texts, expected_type, program_texts);
	}

	private void assert_type(String program_text, int expected_type, String expected_text)
	{
		try
		{
			SymbolTableManager stm = new SymbolTableManager();
			RubyLexer lexter = new RubyLexer(new StringReader(program_text), stm);
			Token token = lexter.nextToken();
			assertEquals(program_text, expected_type, token.getType());
			assertEquals(program_text, expected_text, token.getText());
		}
		catch (TokenStreamException e)
		{
			assertTrue(program_text + e.getMessage(), false);
		}
		
	}

	private void assert_type(String program_text, TestingCommonToken[] tokens)
	{
		try
		{
			SymbolTableManager stm = new SymbolTableManager();
			RubyLexer lexter = new RubyLexer(new StringReader(program_text), stm);

			for (int i = 0; i < tokens.length; ++i)
			{
				Token token = lexter.nextToken();
				assertEquals(i + " " + token.getText() + " has wrong type!", tokens[i].getType(), token.getType());
				assertEquals(i + " " + token.getText() + " has wrong text!", tokens[i].getText(), token.getText());
				assertEquals(i + " " + token.getText() + " has wrong position!", tokens[i].getLine(), token.getLine());
			}

			Token token = lexter.nextToken();
			assertEquals("should have no token left!", token.getType(), Token.EOF_TYPE);
		}
		catch (TokenStreamException e)
		{
			assertTrue(program_text + e.getMessage(), false);
		}
	}

	private void assert_type(String program_text, int expected_type)
	{
		assert_type(program_text, expected_type, program_text);
	}

	public void test_token_stream1()
	{
		String program_text = "puts \"hello\";";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "puts"),
							new TestingCommonToken(DOUBLE_QUOTE_STRING, "hello"),
							new TestingCommonToken(SEMI, ""),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream2()
	{
		String program_text = "0.step";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(INTEGER, "0"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "step"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream3()
	{
		String program_text = "$?/256";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(GLOBAL_VARIABLE , "$?"),
							new TestingCommonToken(DIV, "/"),
							new TestingCommonToken(INTEGER, "256"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream4()
	{
		String program_text = " def /(item)";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_def, "def"),
							new TestingCommonToken(DIV, "/"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(FUNCTION, "item"),
							new TestingCommonToken(RPAREN, ")"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream5()
	{
		String program_text = "def -@(); end";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_def, "def"),
							new TestingCommonToken(UNARY_PLUS_MINUS_METHOD_NAME, "-@"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(RPAREN, ")"),
							new TestingCommonToken(SEMI, ""),
							new TestingCommonToken(LITERAL_end, "end"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream6()
	{
		String program_text = "$stderr.puts <<EOS\n" +
"Usage: #{myname} [--key keypair_file] name\n"	+
"  name ... ex. /C=JP/O=RRR/OU=CA/CN=NaHi/emailAddress=nahi@example.org\n" +
"EOS\n";
		TestingCommonToken[] token_types =  {
							new TestingCommonToken(GLOBAL_VARIABLE , "$stderr"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "puts"),
							new TestingCommonToken(HERE_DOC_BEGIN, "EOS"),
							new TestingCommonToken(LINE_BREAK, ""),
							//new TestingCommonToken(HERE_DOC_CONTENT, "Usage: #{myname} [--key keypair_file] name\n" +
//"  name ... ex. /C=JP/O=RRR/OU=CA/CN=NaHi/emailAddress=nahi@example.org\n"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream7()
	{
		String program_text = 
"    res.body =<<-_end_of_html_\r\n"	+
"      <HTML/>\n"	+
"    _end_of_html_\n";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "res"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "body"),
							new TestingCommonToken(ASSIGN, "="),
							new TestingCommonToken(HERE_DOC_BEGIN, "-_end_of_html_"),
							new TestingCommonToken(LINE_BREAK, ""),
							//new TestingCommonToken(HERE_DOC_CONTENT, "      <HTML/>\n"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream8()
	{
		String program_text = 
"\r\nres.body = <<-_end_of_html_\n"	+
"    _end_of_html_\n";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LINE_BREAK, "", 1),
							new TestingCommonToken(FUNCTION, "res", 2),
							new TestingCommonToken(DOT, ".", 2),
							new TestingCommonToken(FUNCTION, "body", 2),
							new TestingCommonToken(ASSIGN, "=", 2),
							new TestingCommonToken(HERE_DOC_BEGIN, "-_end_of_html_", 2),
							new TestingCommonToken(LINE_BREAK, "", 2),
							//new TestingCommonToken(HERE_DOC_CONTENT, "", 2),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream9()
	{
		String program_text = "\n\n\nunless /{$1}\\z/o =~ s";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LINE_BREAK, "", 1),
							new TestingCommonToken(LITERAL_unless, "unless", 4),
							new TestingCommonToken(REGEX, "{$1}\\z", 4),
							new TestingCommonToken(MATCH, "=~", 4),
							new TestingCommonToken(FUNCTION, "s", 4),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream10()
	{
		String program_text = "  when /^#/" +
"    raise \"unknown node type: '{ntype}'\"";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_when, "when"),
							new TestingCommonToken(REGEX, "^#"),
							new TestingCommonToken(FUNCTION, "raise"),
							new TestingCommonToken(DOUBLE_QUOTE_STRING, "unknown node type: '{ntype}'"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream11()
	{
		String program_text = "def log_src(src)\n"	+
"  Logging::puts <<\"EOM\", src\n"	+
"checked program was:\n"	+
"/* begin */\n"	+
"%s/* end */\n\n"+
"EOM\n"	+
"end";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_def, "def"),
							new TestingCommonToken(FUNCTION, "log_src"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(FUNCTION, "src"),
							new TestingCommonToken(RPAREN, ")"),
							new TestingCommonToken(LINE_BREAK, ""),
							new TestingCommonToken(FUNCTION, "Logging", 2),
							new TestingCommonToken(COLON2, "::", 2),
							new TestingCommonToken(FUNCTION, "puts", 2),
							new TestingCommonToken(HERE_DOC_BEGIN, "EOM", 2),
							new TestingCommonToken(COMMA, "", 2),
							new TestingCommonToken(IDENTIFIER, "src", 2),
							new TestingCommonToken(LINE_BREAK, "", 2),
							new TestingCommonToken(LITERAL_end, "end", 8),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream12()
	{
		String program_text = "1%200";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(MOD, "%"),
							new TestingCommonToken(INTEGER, "200"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream13()
	{
		String program_text = "; ;\t   ;";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(SEMI, ""),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream14()
	{
		String program_text = "a =1;a\n\n\n;;;;";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "a"),
							new TestingCommonToken(ASSIGN, "="),
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(SEMI, ""),
							new TestingCommonToken(IDENTIFIER, "a"),
							//new TestingCommonToken(LINE_BREAK, "\n"),
							new TestingCommonToken(SEMI, "", 1),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream15()
	{
		String program_text = "@numerator.to_f/@denominator.to_f";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(INSTANCE_VARIABLE, "@numerator"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "to_f"),
							new TestingCommonToken(DIV, "/"),
							new TestingCommonToken(INSTANCE_VARIABLE, "@denominator"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "to_f"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream16()
	{
		String program_text = "sprintf(\"Rational(%s, %s)\", @numerator.inspect, @denominator.inspect)";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "sprintf"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(DOUBLE_QUOTE_STRING, "Rational(%s, %s)"),
							new TestingCommonToken(COMMA, ""),
							new TestingCommonToken(INSTANCE_VARIABLE, "@numerator"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "inspect"),
							new TestingCommonToken(COMMA, ""),
							new TestingCommonToken(INSTANCE_VARIABLE, "@denominator"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "inspect"),
							new TestingCommonToken(RPAREN, ")"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream17()
	{
		String program_text = "subj.gsub! /\\n/, \"\"\n";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "subj"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "gsub!"),
							new TestingCommonToken(REGEX, "\\n"),
							new TestingCommonToken(COMMA, ""),
							new TestingCommonToken(DOUBLE_QUOTE_STRING, ""),
							new TestingCommonToken(LINE_BREAK, ""),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream18()
	{
		String program_text = "self / Rational.new!(a, 1)";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_self, "self"),
							new TestingCommonToken(DIV, "/"),
							new TestingCommonToken(FUNCTION, "Rational"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "new!"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(FUNCTION, "a"),
							new TestingCommonToken(COMMA, ""),
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(RPAREN, ")"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream19()
	{
		String program_text = "session['key'].class";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "session"),
							new TestingCommonToken(LBRACK_ARRAY_ACCESS, "["),
							new TestingCommonToken(SINGLE_QUOTE_STRING, "key"),
							new TestingCommonToken(RBRACK, "]"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(IDENTIFIER, "class"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream20()
	{
		String program_text = "$4.to_i.to_r / (10**$4.size)";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(GLOBAL_VARIABLE , "$4"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "to_i"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "to_r"),
							new TestingCommonToken(DIV, "/"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(INTEGER, "10"),
							new TestingCommonToken(POWER, "**"),
							new TestingCommonToken(GLOBAL_VARIABLE , "$4"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "size"),
							new TestingCommonToken(RPAREN, ")"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream21()
	{
		String program_text = "def check_response_auth( res )\n" +
"raise POPAuthenticationError, res unless /\\A\\+OK/i === res\n" +
"res\n" +
"end";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_def, "def"),
							new TestingCommonToken(FUNCTION, "check_response_auth"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(FUNCTION, "res"),
							new TestingCommonToken(RPAREN, ")"),
							new TestingCommonToken(LINE_BREAK, ""),
							new TestingCommonToken(FUNCTION, "raise", 2),
							new TestingCommonToken(FUNCTION, "POPAuthenticationError", 2),
							new TestingCommonToken(COMMA, "", 2),
							new TestingCommonToken(IDENTIFIER, "res", 2),
							new TestingCommonToken(UNLESS_MODIFIER, "unless", 2),
							new TestingCommonToken(REGEX, "\\A\\+OK", 2),
							new TestingCommonToken(CASE_EQUAL, "===", 2),
							new TestingCommonToken(IDENTIFIER, "res", 2),
							new TestingCommonToken(LINE_BREAK, "", 2),
							new TestingCommonToken(IDENTIFIER, "res", 3),
							new TestingCommonToken(LINE_BREAK, "", 3),
							new TestingCommonToken(LITERAL_end, "end", 4),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream22()
	{
		String program_text = "res.split(/ /)[1]";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "res"),
							new TestingCommonToken(DOT, "."),
							new TestingCommonToken(FUNCTION, "split"),
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(REGEX, " "),
							new TestingCommonToken(RPAREN, ")"),
							new TestingCommonToken(LBRACK_ARRAY_ACCESS, "["),
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(RBRACK, "]"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream23()
	{
		String program_text = "f(*a)";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "f"), 
							new TestingCommonToken(LPAREN, "("),
							new TestingCommonToken(REST_ARG_PREFIX, "*"),
							new TestingCommonToken(FUNCTION, "a"),
							new TestingCommonToken(RPAREN, ")"), 
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream24()
	{
		String program_text = "puts puts = 1";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "puts"), 
							new TestingCommonToken(FUNCTION, "puts"),
							new TestingCommonToken(ASSIGN, "="),
							new TestingCommonToken(INTEGER, "1"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream25()
	{
		String program_text = "def a; f do |element|\n"	+
"          klass.module_eval(<<-EOC, __FILE__, __LINE__)\n"	+
"          EOC\n"	+
"         end\n"	+
"     end";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_def, "def"), 
							new TestingCommonToken(FUNCTION, "a"),
							new TestingCommonToken(SEMI, ""),
							new TestingCommonToken(FUNCTION, "f"), 
							new TestingCommonToken(LITERAL_do, "do"),
							new TestingCommonToken(BOR, "|"),
							new TestingCommonToken(IDENTIFIER, "element"),
							new TestingCommonToken(BOR, "|"),
							new TestingCommonToken(LINE_BREAK, ""),
							new TestingCommonToken(FUNCTION, "klass", 2),
							new TestingCommonToken(DOT, ".", 2), 
							new TestingCommonToken(FUNCTION, "module_eval", 2),
							new TestingCommonToken(LPAREN, "(", 2),
							new TestingCommonToken(HERE_DOC_BEGIN, "-EOC", 2),
							new TestingCommonToken(COMMA, "", 2),
							new TestingCommonToken(LITERAL___FILE__, "__FILE__", 2),
							new TestingCommonToken(COMMA, "", 2),
							new TestingCommonToken(LITERAL___LINE__, "__LINE__", 2),
							new TestingCommonToken(RPAREN, ")", 2),
							new TestingCommonToken(LINE_BREAK, "", 2),
							new TestingCommonToken(LITERAL_end, "end", 4),
							new TestingCommonToken(LINE_BREAK, "", 4),
							new TestingCommonToken(LITERAL_end, "end", 5),
		};

		assert_type(program_text, token_types);
	}
	

	public void test_token_stream26()
	{
		String program_text = ";if true then end";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(SEMI, ""),
							new TestingCommonToken(LITERAL_if, "if"),
							new TestingCommonToken(LITERAL_true, "true"),
							new TestingCommonToken(LITERAL_then, "then"),
							new TestingCommonToken(LITERAL_end, "end"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream27()
	{
		String program_text = "module_eval <<-\"end_eval\"\n		end_eval\n";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "module_eval"),
							new TestingCommonToken(HERE_DOC_BEGIN, "-end_eval"),
							new TestingCommonToken(LINE_BREAK, ""),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream28()
	{
		String program_text = "1...3";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(EXCLUSIVE_RANGE, "..."),
							new TestingCommonToken(INTEGER, "3"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream29()
	{
		String program_text = "puts 1 rescue true";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(FUNCTION, "puts"),
							new TestingCommonToken(INTEGER, "1"),
							new TestingCommonToken(RESCUE_MODIFIER, "rescue"),
							new TestingCommonToken(LITERAL_true, "true"),
		};

		assert_type(program_text, token_types);
	}

	public void test_token_stream30()
	{
		String program_text = "alias quo /";

		TestingCommonToken[] token_types =  {
							new TestingCommonToken(LITERAL_alias, "alias"),
							new TestingCommonToken(FUNCTION, "quo"),
							new TestingCommonToken(DIV, "/"),
		};

		assert_type(program_text, token_types);
	}

	/*
	public void test_defined_question_mark()
	{
		String program_text = "defined?";
		assert_type(program_text, 89);
	}
	*/

	public void test_EmptyString()
	{
		String program_text = "";
		assert_type(program_text, Token.EOF_TYPE, null);
	}

	public void test_REGEX()
	{
		String[] program_texts = {
			"/\\r\\n\\r\\n/s",
			"/^#/",
			"/^Ruby the OOPL/",
			"/ruby/i",
			"/test|test/x",
			"/([\\300-\\367])/n",
		};

		String[] expected_texts = {
			"\\r\\n\\r\\n",
			"^#",
			"^Ruby the OOPL",
			"ruby",
			"test|test",
			"([\\300-\\367])",
		};

		assert_type(program_texts, REGEX, expected_texts);
	}

	public void test_R_REGEX()
	{
		String[] program_texts = {
			"%r{([^ \\t\\r\\n\\[\\{\\(])\\'}",
			"%r{test|test}",
			"%r/^Ruby the OOPL/",
			"%r|ruby|i",
			"%r/test|test/x",
			"%r{test|test}x",
			"%r(test|test)x",
			"%r[test|test]x",
			"%r(<b>(.*?)</b>)",
			"%r{}",
		};

		String[] expected_texts = {
			"([^ \\t\\r\\n\\[\\{\\(])\\'",
			"test|test",
			"^Ruby the OOPL",
			"ruby",
			"test|test",
			"test|test",
			"test|test",
			"test|test",
			"<b>(.*?)</b>",
			"",
		};

		assert_type(program_texts, REGEX, expected_texts);
	}
	/*
	public void test_SINGLE_QUOTA()
	{
		String program_text = "`";
		assert_type(program_text, SINGLE_QUOTA);
	}*/

	public void test_QUESTION()
	{
		String program_text = "?";
		assert_type(program_text, QUESTION);
	}

	public void test_LPAREN()
	{
		String program_text = "(";
		assert_type(program_text, LPAREN);
	}

	public void test_RPAREN()
	{
		String program_text = ")";
		assert_type(program_text, RPAREN);
	}

	public void test_LBRACK()
	{
		String program_text = "[";
		assert_type(program_text, LBRACK);
	}

	public void test_RBRACK()
	{
		String program_text = "]";
		assert_type(program_text, RBRACK);
	}

	public void test_LCURLY()
	{
		String program_text = "{";
		assert_type(program_text, LCURLY_HASH);
	}

	public void test_RCURLY()
	{
		String program_text = "}";
		assert_type(program_text, RCURLY);
	}

	public void test_COLON()
	{
		String program_text = ":";
		assert_type(program_text, COLON_WITH_NO_FOLLOWING_SPACE);
	}

	public void test_COMMA()
	{
		String[] program_texts = {
			",",
			", ",
			",\n",
			",   \n\n     \n",
		};

		String[] expected_texts = {
			"",
			"",
			"",
			"",
		};

		assert_type(program_texts, COMMA, expected_texts);
	}

	public void test_ASSIGN()
	{
		String program_text = "=";
		assert_type(program_text, ASSIGN);
	}

	public void test_PLUS_ASSIGN()
	{
		String program_text = "+=";
		assert_type(program_text, PLUS_ASSIGN);
	}
	
	public void test_MINUS_ASSIGN()
	{
		String program_text = "-=";
		assert_type(program_text, MINUS_ASSIGN);
	}

	public void test_STAR_ASSIGN()
	{
		String program_text = "*=";
		assert_type(program_text, STAR_ASSIGN);
	}

	/*
	public void test_DIV_ASSIGN()
	{
		String program_text = "/=";
		assert_type(program_text, DIV_ASSIGN);
	}
	*/

	public void test_MOD_ASSIGN()
	{
		String program_text = "%=";
		assert_type(program_text, MOD_ASSIGN);
	}

	public void test_POWER_ASSIGN()
	{
		String program_text = "**=";
		assert_type(program_text, POWER_ASSIGN);
	}

	public void test_BAND_ASSIGN()
	{
		String program_text = "&=";
		assert_type(program_text, BAND_ASSIGN);
	}

	public void test_BXOR_ASSIGNN()
	{
		String program_text = "^=";
		assert_type(program_text, BXOR_ASSIGN);
	}

	public void test_BOR_ASSIGNN()
	{
		String program_text = "|=";
		assert_type(program_text, BOR_ASSIGN);
	}

	/*
	public void test_LEFT_SHIFT_ASSIGN()
	{
		String program_text = "<<=";
		assert_type(program_text, LEFT_SHIFT_ASSIGN);
	}
	*/

	public void test_RIGHT_SHIFT_ASSIGN()
	{
		String program_text = ">>=";
		assert_type(program_text, RIGHT_SHIFT_ASSIGN);
	}

	public void test_LOGICAL_AND_ASSIGN()
	{
		String program_text = "&&=";
		assert_type(program_text, LOGICAL_AND_ASSIGN);
	}

	public void test_LOGICAL_OR_ASSIGN()
	{
		String program_text = "||=";
		assert_type(program_text, LOGICAL_OR_ASSIGN);
	}

	public void test_NOT()
	{
		String program_text = "!";
		assert_type(program_text, NOT);
	}

	public void test_BNOT()
	{
		String program_text = "~";
		assert_type(program_text, BNOT);
	}

	public void test_DIV()
	{
		String program_text = "/";
		assert_type(program_text, DIV);
	}

	public void test_PLUS()
	{
		String program_text = "+";
		assert_type(program_text, UNARY_PLUS);
	}

	/*
	public void test_MOD()
	{
		String program_text = "%";
		assert_type(program_text, MOD);
	}
	*/

	public void test_MINUS()
	{
		String program_text = "-";
		assert_type(program_text, UNARY_MINUS);
	}

	public void test_STAR()
	{
		String program_text = "*";
		assert_type(program_text, REST_ARG_PREFIX);
	}

	public void test_LESS_THAN()
	{
		String program_text = "<";
		assert_type(program_text, LESS_THAN);
	}

	public void test_GREATER_THAN()
	{
		String program_text = ">";
		assert_type(program_text, GREATER_THAN);
	}

	public void test_BXOR()
	{
		String program_text = "^";
		assert_type(program_text, BXOR);
	}

	public void test_BOR()
	{
		String program_text = "|";
		assert_type(program_text, BOR);
	}

	public void test_LOGICAL_OR()
	{
		String program_text = "||";
		assert_type(program_text, LOGICAL_OR);
	}

	public void test_LOGICAL_AND()
	{
		String program_text = "&&";
		assert_type(program_text, LOGICAL_AND);
	}

	public void test_BAND()
	{
		String program_text = "&";
		assert_type(program_text, BLOCK_ARG_PREFIX);
	}

	public void test_SEMI()
	{
		String[] program_texts = {
			"\n  \n\t\n\n;\n;",
			";",
			";;;",
			";\n\n\n",
			";;  ;;\n;;\n\n;;",
		};

		String[] expected_texts = {
			"",
			"",
			"",
			"",
			"",
		};

		assert_type(program_texts, SEMI, expected_texts);
	}

	public void test_ASSOC()
	{
		String program_text = "=>";
		assert_type(program_text, ASSOC);
	}

	public void test_INCLUSIVE_RANGE()
	{
		String program_text = "..";
		assert_type(program_text, INCLUSIVE_RANGE);
	}

	public void test_EXCLUSIVE_RANGE()
	{
		String program_text = "...";
		assert_type(program_text, EXCLUSIVE_RANGE);
	}

	public void test_POWER()
	{
		String program_text = "**";
		assert_type(program_text, POWER);
	}

	public void test_COMPARE()
	{
		String program_text = "<=>";
		assert_type(program_text, COMPARE);
	}

	public void test_GREATER_OR_EQUAL()
	{
		String program_text = ">=";
		assert_type(program_text, GREATER_OR_EQUAL);
	}

	public void test_LESS_OR_EQUAL()
	{
		String program_text = "<=";
		assert_type(program_text, LESS_OR_EQUAL);
	}

	public void test_EQUAL()
	{
		String program_text = "==";	
		assert_type(program_text, EQUAL);
	}

	public void test_CASE_EQUAL()
	{
		String program_text = "===";
		assert_type(program_text, CASE_EQUAL);
	}

	public void test_NOT_EQUAL()
	{
		String program_text = "!=";
		assert_type(program_text, NOT_EQUAL);
	}

	public void test_MATCH()
	{
		String program_text = "=~";
		assert_type(program_text, MATCH);
	}

	public void test_NOT_MATCH()
	{
		String program_text = "!~";
		assert_type(program_text, NOT_MATCH);
	}

	public void test_LEFT_SHIFT()
	{
		String program_text = "<<";
		assert_type(program_text, LEFT_SHIFT);
	}

	public void test_RIGHT_SHIFT()
	{
		String program_text = ">>";
		assert_type(program_text, RIGHT_SHIFT);
	}

	public void test_COLON2()
	{
		String program_text = "::";
		assert_type(program_text, LEADING_COLON2);
	}

	public void test_LINE_BREAK()
	{
		String[] program_texts = {
			"\r",
			"\n",
			"\r\n",
			"\n\n\n\n\n",
			"\r\n\n\r\n\n\n\r\n\r\n",
		};

		String[] expected_texts = {
			"",
			"",
			"",
			"",
			"",
		};

		assert_type(program_texts, LINE_BREAK, expected_texts);
	}

	public void test_FUNCTION()
	{
		String[] program_texts = {
			"puts",
			"print",
		};

		assert_type(program_texts, FUNCTION);
	}

	public void test_IDENTIFIER  ()
	{
		String[] program_texts = {
			"hey",
			"_",
			"_1",
			"_a",
			"abc123",
			"_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000",
			"_ab1",
		};

		assert_type(program_texts, FUNCTION);
	}

	public void test_PREDICATE_FUNCTION()
	{
		String[] program_texts = {
			"hey?",
			"_?",
			"_1?",
			"_a?",
			"_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000?",
			"_2b2abC?",
		};

		assert_type(program_texts, FUNCTION);
	}

	public void test_DESTRUCTIVE_FUNCTION()
	{
		String[] program_texts = {
			"hey!",
			"_!",
			"_1!",
			"_a!",
			"_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000!",
			"_1abC!",
		};

		assert_type(program_texts, FUNCTION);
	}

	public void test_GLOBAL_VARIABLE ()
	{
		String[] program_texts = {
			"$-K",
			"$A",
			"$a",
			"$aBC12_",
			"$_",
			"$__",
			"$a234",

			"$&",
			"$`",
			"$\\",
			"$+",

			"$1",
			"$2",
			"$3",
			"$4",
			"$5",
			"$6",
			"$7",
			"$8",
			"$9",
			"$123456",
		};

		assert_type(program_texts, GLOBAL_VARIABLE );
	}

	public void test_INSTANCE_VARIABLE()
	{
		String[] program_texts = {
			"@A",
			"@a",
			"@aBC12_",
			"@_",
		};

		assert_type(program_texts, INSTANCE_VARIABLE);
	}

	public void test_CLASS_VARIABLE()
	{
		String[] program_texts = {
			"@@A",
			"@@a",
			"@@aBC12_",
			"@@_",
		};

		assert_type(program_texts, CLASS_VARIABLE);
	}
	
	public void test_CONSTANT()
	{
		String[] program_texts = {
			"A",
			"Z",
			"A_",
			"Abc",
			"B2",
			"PI",
			"MyClass3",
		};

		assert_type(program_texts, FUNCTION);
	}

	public void test_INTEGER()
	{
		String[] program_texts = {
			"123456",
			"1",
			"543",
			"0",
			"123_456",
			"123_456_789_123_345_789",
		};

		String[] expected_texts = {
			"123456",
			"1",
			"543",
			"0",
			"123456",
			"123456789123345789",
		};

		assert_type(program_texts, INTEGER, expected_texts);
	}

	public void test_HEX()
	{
		String[] program_texts = {
			"0xaabbC",
			"0X0abb1",
		};

		String[] expected_texts = {
			"aabbC",
			"0abb1",
		};

		assert_type(program_texts, HEX, expected_texts);
	}

	public void test_OCTAL()
	{
		String[] program_texts = {
			"0377",
		};

		String[] expected_texts = {
			"377",
		};

		assert_type(program_texts, OCTAL, expected_texts);
	}

	public void test_BINARY()
	{
		String[] program_texts = {
			"0b1010",
			"0B0100",
			"0b001_001",
		};

		String[] expected_texts = {
			"1010",
			"0100",
			"001001",
		};

		assert_type(program_texts, BINARY, expected_texts);
	}
	
	public void test_ASCII_VALUE()
	{
		String[] program_texts = {
				"?&",
				"?a",
				"?\"",
				"?\\n",
				"?\\s",
				"?\\C-a",
				"?\\M-a",
				"?\\M-\\C-a",
				"?\\C-?",
			};

			assert_type(program_texts, ASCII_VALUE);
	}

	public void test_FLOAT()
	{
		String[] program_texts = {
			".1",
			".00",
			"12.34",
			"12.0",
			"0.2E2",
			".1234E2",
			".0234E+2",
			".1234e-2",
			"1234e-2",
			"1234E-21",
			"0.0",
			"1e3",
			"2e18",
			"2E-18",
		};

		assert_type(program_texts, FLOAT);
	}

	public void test_DOT()
	{
		String program_texts = ".";

		assert_type(program_texts, DOT);
	}

	public void test_DOUBLE_QUOTE_STRING_LITERAL()
	{
		
		String[] program_texts = {
			"\"Rational(%s, %s)\"",
			"\"%Y-%m-%d %H:%M:%S\"",
			"\"\"",
			"\" \"",
			"\"string\"",
			"\"hello\"",
			"\" this is a string \"",
			"\"2\"",
			"\"\\\\\"",
			"\"\\n\"",
			"\"/usr/local\"",
			"\"\\360\"",
			"\"hello\n    world\"",
		};

		String[] expected_texts = {
			"Rational(%s, %s)",
			"%Y-%m-%d %H:%M:%S",
			"",
			" ",
			"string",
			"hello",
			" this is a string ",
			"2",
			"\\\\",
			"\\n",
			"/usr/local",
			"\\360",
			"hello\n    world",
		};

		assert_type(program_texts, DOUBLE_QUOTE_STRING, expected_texts);
	}

	public void test_COMMAND_OUTPUT()
	{
		
		String[] program_texts = {
			"``",
			"` `",
			"`command`",
			"` this is a command `",
			"`2`",
			"`\\\\`",
			"`\\n`",
		};

		String[] expected_texts = {
			"",
			" ",
			"command",
			" this is a command ",
			"2",
			"\\\\",
			"\\n",
		};

		assert_type(program_texts, COMMAND_OUTPUT, expected_texts);
	}

	public void test_X_COMMAND_OUTPUT()
	{
		String[] program_texts = {
			"%x/^Ruby the OOPL/",
			"%x|ruby|",
			"%x/test|test/",
			"%x{test|test}",
			"%x(test|test)",
			"%x[test|test]",
		};

		String[] expected_texts = {
			"^Ruby the OOPL",
			"ruby",
			"test|test",
			"test|test",
			"test|test",
			"test|test",
		};

		assert_type(program_texts, COMMAND_OUTPUT, expected_texts);
	}


	public void test_SINGLE_QUOTE_STRING_LITERAL()
	{
		
		String[] program_texts = {
			"\'\'",
			"\' \'",
			"\'string\'",
			"\' this is a #@string \'",
			"\'2\'",
			"\'\\\\\'",
			"\'\\n\'",
			"\'hello\n    #{world}\'",
		};

		String[] expected_texts = {
			"",
			" ",
			"string",
			" this is a #@string ",
			"2",
			"\\\\",
			"\\n",
			"hello\n    #{world}",
		};

		assert_type(program_texts, SINGLE_QUOTE_STRING, expected_texts);
	}

	public void test_q_STRING()
	{
		String[] program_texts = {
			"%q!test string!",
			"%q//",
			"%q# #",
			"%q$string$'",
			"%q^ this is a string ^",
		};

		String[] expected_texts = {
			"test string",
			"",
			" ",
			"string",
			" this is a string ",
		};

		assert_type(program_texts, SINGLE_QUOTE_STRING, expected_texts);
	}
	public void test_Q_STRING()
	{
		String[] program_texts = {
			"%/test string/",
			"%Q/test string/",
			"%Q\ntest string\n",
			"%Q*2*",
			"%Q(\\\\)",
			"%Q{\\\\}",
			"%Q[\\\\]",
			"%Q]\\\\]",
			"%Q}\\\\}",
			"%Q)\\\\)",
			"%Q!\\n!",
		};

		String[] expected_texts = {
			"test string",
			"test string",
			"test string",
			"2",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\n",
		};

		assert_type(program_texts, DOUBLE_QUOTE_STRING, expected_texts);
	}

	public void test_COMMENT()
	{
		String[] program_texts = {
			"#",
			"# ",
			"#             ",
			"#12424scvdsfv",
			"#4r fgr rt",
			"#winClicker",
		};

		String[] expected_texts = {
			null,
			null,
			null,
			null,
			null,
			null,
		};

		assert_type(program_texts, Token.EOF_TYPE, expected_texts);
	}

	public void test_WHITE_SPACE()
	{
		String[] program_texts = {
			" ",
			"\t",
			"            ",
			"\t\t\t\t\t",
			" \t\t         \t",
		};

		String[] expected_texts = {
			null,
			null,
			null,
			null,
			null,
		};

		assert_type(program_texts, Token.EOF_TYPE, expected_texts);
	}

	public void test_LINE_CONTINUATION()
	{
		String[] program_texts = {
			"\\\n",
		};

		String[] expected_texts = {
			null,
		};

		assert_type(program_texts, Token.EOF_TYPE, expected_texts);
	}

	/*public void test_HERE_DOC_BEGIN()
	{
		String[] program_texts = {
			"<<EOF\nThe price is #{$Price}.\nEOF\n",
			"-<<123456\nThe\n price\n is #{$Price}.\n123456\n",
			"<<!@#$%^&*\nThe price is\n #{$Price}.\n!@#$%^&*\n",
		};

		String[] expected_texts = {
			"The price is #{$Price}.\n",
			"The\n price\n is #{$Price}.\n",
			"The price is\n #{$Price}.\n",
		};

		assert_type(program_texts, HERE_DOC_BEGIN, expected_texts);
	}*/

	public void test_RDOC()
	{
		String[] program_texts = {
			"=begin\n=end",
			"=begin\nwhatever\n=end",
			"=begin\nwha\n\n%^$%^$%$^&$%\n\n&tever\n=end",
		};

		String[] expected_texts = {
			null,
			null,
			null,
		};

		assert_type(program_texts, Token.EOF_TYPE, expected_texts);
	}

	public void test_W_ARRAY()
	{
		String[] program_texts = {
			"%w(folder openfold)",
			"%w/test string/",
			"%W!test string!",
			"%w\ntest string\n",
			"%W&Seconds/day: #{24*60*60}&",

			"%w//",
			"%w# #",
			"%w$string$'",
			"%W^ this is a string ^",
			"%W*2*",
			"%W(\\\\)",
			"%w{\\\\}",
			"%w[\\\\]",
			"%w]\\\\]",
			"%w}\\\\}",
			"%w)\\\\)",
			"%W!\\n!",
		};

		String[] expected_texts = {
			"folder openfold",
			"test string",
			"test string",
			"test string",
			"Seconds/day: #{24*60*60}",

			"",
			" ",
			"string",
			" this is a string ",
			"2",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\\\",
			"\\n",
		};

		assert_type(program_texts, W_ARRAY, expected_texts);
	}

	public void test_END_OF_FILE()
	{
		String[] program_texts = {
			"\0",
			"\004",
			"\032",
		};

		assert_type(program_texts, Token.EOF_TYPE);
	}

	public void test_EMPTY_ARRAY()
	{
		String[] program_texts = {
			"[]",
		};

		assert_type(program_texts, EMPTY_ARRAY);
	}
	

}


