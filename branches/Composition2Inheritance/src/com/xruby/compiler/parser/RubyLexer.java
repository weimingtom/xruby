/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser;

import java.util.*;
import java.io.Reader;
import antlr.*;
import com.xruby.compiler.parser.symboltable.SymbolTableManager;

class StringDelimiter
{
	private char delimiter_;
	private int count_;

	public StringDelimiter(char delimiter, int count) {
		delimiter_ = delimiter;
		count_ = count;
	}

	public char getDelimiter() {
		return delimiter_;
	}

	public int getCount() {
		return count_;
	}

	public void setCount(int value) {
		count_ = value;
	}
}

/**
 * I do not want my lexer be coupled with parser (even through it can not be avoid),
 * so my lexer does a little bit of parsing itself.
 * Even though this makes the lexer become more complicated, it is easier to test.
 */
public class RubyLexer extends RubyLexerBase
{
	private SymbolTableManager stm_;
	private Token token_before_last_token_ = new Token();//create a new toekn with invalid type
	private Token last_token_ = new Token();//create a new toekn with invalid type
	private ArrayList<String> heredoc_delimiters_ = new ArrayList<String>();
	private boolean allow_asignment_ = true;
	private boolean allow_block_parameter_ = false;
	private boolean allow_for_expression_parameter_ = false;
	private boolean seen_whitespace_ = true;
	private boolean is_in_condition = false;
	private boolean just_finished_parsing_regex_expression_substituation_ = false;
	private boolean just_finished_parsing_string_expression_substituation_ = false;
	private boolean just_finished_parsing_symbol_ = false;
	private Stack<StringDelimiter> current_special_string_delimiter_ = new Stack<StringDelimiter>();
	private Queue<String> heredocs_ = new LinkedList<String>();

	public RubyLexer(Reader in, SymbolTableManager stm)
	{
		super(in);
		stm_ = stm;
	}

	SymbolTableManager getSymbolTableManager()
	{
		return stm_;	
	}

	Queue<String> getHereDocs() {
		return heredocs_;
	}

	protected void set_current_special_string_delimiter(char delimiter, int delimiter_count)
	{
		current_special_string_delimiter_.push(new StringDelimiter(delimiter, delimiter_count));
	}

	protected void update_current_special_string_delimiter_count(int delimiter_count)
	{
		StringDelimiter delimiter = current_special_string_delimiter_.peek();
		delimiter.setCount(delimiter_count);
	}

	void set_just_finished_parsing_string_expression_substituation()
	{
		just_finished_parsing_string_expression_substituation_ = true;
		just_finished_parsing_regex_expression_substituation_ = false;
	}

	void set_just_finished_parsing_regex_expression_substituation()
	{
		just_finished_parsing_regex_expression_substituation_ = true;
		just_finished_parsing_string_expression_substituation_ = false;
	}

	//Parser will call this method to help lexer understand things like "def f() /regex/ end"
	void set_last_token_to_be_RPAREN_IN_METHOD_DEFINATION()
	{
		assert(RPAREN == last_token_.getType());
		last_token_.setType(RPAREN_IN_METHOD_DEFINATION);
	}

	void set_just_finished_parsing_symbol()
	{
		just_finished_parsing_symbol_ = true;
	}

	protected boolean just_seen_whitespace()
	{
		return seen_whitespace_;
	}

	private Token _nextToken() throws TokenStreamException
	{
		try
		{
			try
			{
				if (just_finished_parsing_string_expression_substituation_ || just_finished_parsing_regex_expression_substituation_)
				{
					if (current_special_string_delimiter_.empty()) {
						throw new TokenStreamException("Delimiter mismatch!");
					}

					StringDelimiter delimiter = current_special_string_delimiter_.peek();
					mSTRING_BETWEEN_EXPRESSION_SUBSTITUTION(true, delimiter.getDelimiter(), delimiter.getCount());
					Token t = _returnToken;
					//System.out.println(t.getText());
					if (STRING_AFTER_EXPRESSION_SUBSTITUTION == t.getType()) {
						current_special_string_delimiter_.pop();
						if (just_finished_parsing_regex_expression_substituation_) {
							mREGEX_MODIFIER(false);
						}
					}
					just_finished_parsing_string_expression_substituation_ = false;
					just_finished_parsing_regex_expression_substituation_ = false;
					return t; 
				}

				switch(last_token_.getType())
				{
					case LINE_BREAK:
						while (heredoc_delimiters_.size() > 0)
						{
							//expect here doc
							//match it but skip the content, so that parser does not have to parse it (but we'd better save it to symbol table).
							mHERE_DOC_CONTENT(true, heredoc_delimiters_.get(0));
							heredocs_.add(_returnToken.getText());
							heredoc_delimiters_.remove(0);
						}
						return super.nextToken();
					default:
						return super.nextToken();
				}
			}
			catch (RecognitionException e)
			{
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException e)
		{
			if (e instanceof CharStreamIOException)
			{
				throw new TokenStreamIOException(((CharStreamIOException)e).io);
			}
			else
			{
				throw new TokenStreamException(e.toString());
			}
		}
	}

	private void updateSymbolTable(Token token) throws TokenStreamException
	{
		if (LITERAL_module == last_token_.getType() ||
						LITERAL_class == last_token_.getType()) {
			stm_.addLocalVarible(token.getText());
			return;
		}
		
		if (allow_for_expression_parameter_)
		{
			stm_.addLocalVarible(token.getText());
			return;
		}

		if (allow_block_parameter_)
		{
			stm_.addBlockParameter(token.getText());
			return;
		}

		//If not in symbol table yet (not assigned or being a parameter), set the type to FUNCTION
		if (null == stm_.getVariable(token.getText()))
		{
			//System.out.println("Can not find " + token.getText());
			token.setType(FUNCTION);
		}
		
	}

	protected boolean expect_heredoc_content()
	{
		return (heredoc_delimiters_.size() > 0);
	}

	private boolean expect_modifier()
	{
		switch (last_token_.getType())
		{
			case Token.INVALID_TYPE:
			case RPAREN_IN_METHOD_DEFINATION:
			case SEMI:
			case LINE_BREAK:
			case COMMA:
			case LPAREN:	//OPTION = (if ...
			case LCURLY_BLOCK:	//proc { if ...
			case LCURLY_HASH:
			case LBRACK:
			case LBRACK_ARRAY_ACCESS:
			case ASSOC:
			case LITERAL_do:
			case LITERAL_else: //else \n if ...
			case LITERAL_begin:
			case LITERAL_then:
			case LITERAL_ensure:
			case COLON_WITH_NO_FOLLOWING_SPACE:
				return false;
			default:
				return !is_operator(last_token_.getType()) || just_finished_parsing_symbol_;
		}
	}

	private boolean convertToModifierIfNeeded(Token token)
	{
		 if (expect_modifier())
		 {
		 	switch (token.getType())
			{
				case LITERAL_if:
					token.setType(IF_MODIFIER);
					break;
				case LITERAL_unless:
					token.setType(UNLESS_MODIFIER);
					break;
				case LITERAL_while:
					token.setType(WHILE_MODIFIER);
					break;
				case LITERAL_until:
					token.setType(UNTIL_MODIFIER);
					break;
				case LITERAL_rescue:
					token.setType(RESCUE_MODIFIER);
					break;
				default:
					assert(false);
		 	}

			return true;
		 }
		 else
		 {
		 	return false;
		 }
	}

	private boolean keywordOrOperatorToMethodName(Token token)
	{
		switch (token.getType())
		{
			case LITERAL___FILE__:
			case LITERAL_and:
			case LITERAL_def:
			case LITERAL_end:
			case LITERAL_in:
			case LITERAL_or:
			case LITERAL_self:
			case LITERAL_unless:
			case LITERAL___LINE__:
			case LITERAL_begin:
			//case LITERAL_defined?:
			case LITERAL_ensure:
			case LITERAL_module:
			case LITERAL_redo:
			case LITERAL_super:
			case LITERAL_until:
			case LITERAL_BEGIN:
			case LITERAL_break:
			case LITERAL_do:
			case LITERAL_false:
			case LITERAL_next:
			case LITERAL_rescue:
			case LITERAL_then:
			case LITERAL_when:
			case LITERAL_END:
			case LITERAL_case:
			case LITERAL_else:
			case LITERAL_for:
			case LITERAL_nil:
			case LITERAL_retry:
			case LITERAL_true:
			case LITERAL_while:
			case LITERAL_alias:
			case LITERAL_class:
			case LITERAL_elsif:
			case LITERAL_if:
			case LITERAL_not:
			case LITERAL_return:
			case LITERAL_undef:
			case LITERAL_yield:
			case BOR:
			case BXOR:
			case BAND:
			case COMPARE:
			case EQUAL:
			case CASE_EQUAL:
			case MATCH:
			case GREATER_THAN:
			case GREATER_OR_EQUAL:
			case LESS_THAN:
			case LESS_OR_EQUAL:
			case LEFT_SHIFT:
			case RIGHT_SHIFT:
			case PLUS:
			case MINUS:
			case STAR:
			case DIV:
			case MOD:
			case POWER:
			case BNOT:
				return doNotExpectKeywordAndOperator(token);
			default:
				return false;
		}
	}

	private boolean doNotExpectKeywordAndOperator(Token token)
	{
		//e.g.
		//a.do
		//undef do
		//alias do1 do
		//::new
		//NOTE alias, undef, def has been handled alreay as well.
		switch (last_token_.getType())
		{
			case COLON2:
			case DOT:
				token.setType(IDENTIFIER);
				return true;
			default:
				return false;
		}
	}

	public Token nextToken() throws TokenStreamException
	{
		Token token = _nextToken();

		//Even if there are rules for the following tokens, they should not show up here.
		assert(WHITE_SPACE != token.getType());
		assert(END_OF_FILE != token.getType());
		assert(COMMENT != token.getType());
		assert(RDOC != token.getType());
		assert(RPAREN_IN_METHOD_DEFINATION != token.getType());
		assert(Token.SKIP != token.getType());

		if (!keywordOrOperatorToMethodName(token))//Do not do anything if convertion is done.
		{
			switch (token.getType())
			{
				/*it is OK to do this error checking here, now we leave it to the parser.
				case LPAREN:
					switch (last_token_.getType()) {
						case INTEGER:
						case DOUBLE_QUOTE_STRING:
						case SINGLE_QUOTE_STRING:
						case REGEX:
						case STRING_AFTER_EXPRESSION_SUBSTITUTION:
						case FLOAT:
							throw new TokenStreamException("'(' is not expected");
					}
					break;
				*/
				case HERE_DOC_BEGIN:
					heredoc_delimiters_.add(token.getText());
					break;
				case SEMI:
				case LINE_BREAK:
					allow_asignment_ = true;
					is_in_condition = false;
					break;
				case RPAREN:
					allow_asignment_ = true;// def asctime() strftime('%c') end
				case COMMA:
				case ASSIGN:
				case ASSIGN_WITH_NO_LEADING_SPACE:
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case STAR_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case POWER_ASSIGN:
				case BAND_ASSIGN:
				case BXOR_ASSIGN:
				case BOR_ASSIGN:
				case LEFT_SHIFT_ASSIGN:
				case RIGHT_SHIFT_ASSIGN:
				case LOGICAL_AND_ASSIGN:
				case LOGICAL_OR_ASSIGN:
					//TODO we can not handle assignment in condition right now!
					//Check if this is an assignment to a varible. If so, add it to symbole table.
					//for example:
					// a = 1;
					// a=b=1;
					// a, b, c = 1, 2, 3
					// b, (c, d), e = 1,2,3,4
					//Be careful with a.b = 1, A::b = 1 etc
					if (allow_asignment_&&
						(DOT!= token_before_last_token_.getType())&&
						(COLON2!= token_before_last_token_.getType())&&
							(IDENTIFIER == last_token_.getType()||
							CONSTANT == last_token_.getType()||
							FUNCTION == last_token_.getType()
							)
						)
					{
						//System.out.println("Add " + last_token_.getText());
						stm_.addLocalVarible(last_token_.getText());
					}
					break;
				case IDENTIFIER:
				case FUNCTION:
					if (DOT != last_token_.getType() &&
						COLON2 != last_token_.getType())
					{
						updateSymbolTable(token);
					}
					break;
				case BOR:
					if (allow_block_parameter_)
					{
						allow_block_parameter_ = false;
					}
					else if ((last_token_.getType() == LCURLY_BLOCK) ||
						(last_token_.getType() == LITERAL_do))
					{
						allow_block_parameter_ = true;
					}
					break;
				case LITERAL_if:
				case LITERAL_unless:
				case LITERAL_rescue:
					convertToModifierIfNeeded(token);
					break;
				case LITERAL_while:
				case LITERAL_until:
					if (!convertToModifierIfNeeded(token))
					{
						is_in_condition = true;
					}
					break;
				case LITERAL_for:
					is_in_condition = true;
					allow_for_expression_parameter_ = true;
					break;
				case LITERAL_do:
					if (is_in_condition)
					{
						token.setType(DO_IN_CONDITION);
						is_in_condition = false;
					}
					break;
				case LITERAL_end:
					allow_asignment_ = true;
					break;
				case LITERAL_in:
					allow_for_expression_parameter_ = false;
					break;
			}
		}

		token_before_last_token_ = last_token_;
		last_token_ = token;
		seen_whitespace_ = false;
		just_finished_parsing_symbol_ = false;
		return token;
	}

	protected void set_seen_whitespace()
	{
		seen_whitespace_ = true;
	}

	protected boolean expect_array_access()
	{
		switch (last_token_.getType())
		{
			case IDENTIFIER:
			case CONSTANT:
			case INSTANCE_VARIABLE:
			case CLASS_VARIABLE:
			case GLOBAL_VARIABLE :
			case LITERAL_self:
			case LITERAL_nil:
			case LITERAL_false:
			case LITERAL_true:
			case RPAREN:
			case SINGLE_QUOTE_STRING:
			case DOUBLE_QUOTE_STRING:
			case STRING_AFTER_EXPRESSION_SUBSTITUTION:
			case RBRACK:
			case EMPTY_ARRAY:
			case EMPTY_ARRAY_ACCESS:
			case RCURLY:
			case W_ARRAY:
			case LITERAL_end:
				return true;
			case FUNCTION:
			case LITERAL_yield:
				return !seen_whitespace_;
			default:
				return false;
		}
	}

	protected boolean expect_heredoc()
	{
		//"<<" can be left shift operator or start of heredoc
		switch (last_token_.getType())
		{
			case Token.INVALID_TYPE:
			case FUNCTION:	//defines? <<EOF
			case LPAREN:		//puts(<<EOF
			case ASSOC:		//:text=><<EOL).pack(:side=>:top)
			case COMMA:		//insert('0.0', <<EOT)
			case SEMI:
			case RPAREN_IN_METHOD_DEFINATION:	//def key() :controller end
			case LINE_BREAK:	//def success\n	 <<-EOM ... <<EOM\n end
			case LBRACK:
			case LBRACK_ARRAY_ACCESS:
			case LCURLY_BLOCK:
			case LCURLY_HASH:

			case LITERAL_do:	//  c.def_method("foo") do <<-EOD
			case LITERAL_if:
			case LITERAL_while:
			case LITERAL_unless:
			case LITERAL_until:
			case LITERAL_then:
			case LITERAL_when:
			case LITERAL_else:
			case LITERAL_elsif:
			case LITERAL_return:
			case LITERAL_super:	//super :RubyGems
			case LITERAL_yield:	//yield :TOKEN, s
			case IF_MODIFIER:
			case WHILE_MODIFIER:
			case UNLESS_MODIFIER:
			case UNTIL_MODIFIER:
				return true;
			default:
				return is_operator(last_token_.getType());
		}
	}

	protected boolean expect_hash()
	{
		//@hash = @p['hash'] || {}
		//@SYM ||= {}
		//files << { "html_file_name" => f.path }
		//if slot != {}
		// methods.collect {|m| {'methodName' => m[0], 'params' => m[1..-1]} }
		//optobj.assign(self) + {:text=>'DDD'}
		switch (last_token_.getType())
		{
			case Token.INVALID_TYPE:
			case ASSIGN:
			case ASSIGN_WITH_NO_LEADING_SPACE:
			case COMMA:
			case LINE_BREAK:
			case SEMI:
			case LCURLY_HASH:	//{{}=>""}
			case ASSOC:		//{section=>{}}
			case LPAREN:		//waitfor({"Prompt" => match, "Timeout" => time_out})
			case LBRACK:		//@ns_stack = [{}]
			case LBRACK_ARRAY_ACCESS:		
			case LITERAL_return:	//return {'*'=>'id'}
			case LITERAL_when:
				return true;
			default:
				return is_operator(last_token_.getType());
		}
	}

	protected boolean space_is_next() throws CharStreamException
	{
		switch (LA(1))
		{
			case ' ':
			case '\t':
			case '\n':
			case '\r':
				return true;
			default:
				return false;
		}
	}

	protected boolean expression_substitution_is_next() throws CharStreamException
	{
		if (LA(1) != '#')
		{
			return false;
		}

		switch (LA(2))
		{
			case '{':
			case '$':
			case '@':
				return true;
			default:
				return false;
		}
	}

	private boolean is_operator(int type)
	{
		switch (type)
		{
			case LITERAL_and:
			case LITERAL_or:
			case LITERAL_not:
			case QUESTION:
			case COLON:
			case ASSIGN:
			case ASSIGN_WITH_NO_LEADING_SPACE:
			case PLUS_ASSIGN:
			case MINUS_ASSIGN:
			case STAR_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case POWER_ASSIGN:
			case BAND_ASSIGN:
			case BXOR_ASSIGN:
			case BOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case LOGICAL_AND_ASSIGN:
			case LOGICAL_OR_ASSIGN:
			case INCLUSIVE_RANGE:
			case EXCLUSIVE_RANGE:
			case LOGICAL_OR:
			case LOGICAL_AND:
			case COMPARE:
			case EQUAL:
			case CASE_EQUAL:
			case NOT_EQUAL:
			case MATCH:
			case NOT_MATCH:
			case LESS_THAN:
			case GREATER_THAN:
			case LESS_OR_EQUAL:
			case GREATER_OR_EQUAL:
			case BXOR:
			case BOR:
			case BAND:
			case LEFT_SHIFT:
			case RIGHT_SHIFT:
			case PLUS:
			case MINUS:
			case STAR:
			case DIV:
			case MOD:
			case POWER:
			case UNARY_PLUS:
			case UNARY_MINUS:
			case BNOT:
			case NOT:
				return true;
			default:
				return false;
		}
	}

	protected boolean expect_leading_colon2()
	{
		switch (last_token_.getType())
		{
			case LINE_BREAK:
			case SEMI:
			case COMMA:
			case LPAREN:
			case LBRACK:
			case LBRACK_ARRAY_ACCESS:
			case LCURLY_BLOCK:
			case LCURLY_HASH:
				return true;
			default:
				return seen_whitespace_|| is_operator(last_token_.getType());		
		}
	}

	protected boolean expect_operator(int k) throws CharStreamException
	{
		// We consider '/' is divide operator in the following contexts:
		// varible/2		varible<<2
		// array[1]/2		array[1]<<2
		// 1/2			1<<2
		// 1.2/3.4		1.2<<3.4
		// function()/2	function()<<2
		// self / Rational.new!(a, 1)
		// f.one/f.ten
		switch (last_token_.getType())
		{
			case FUNCTION:
				if (seen_whitespace_ &&
					((' ' != LA(k)) && ('\t' != LA(k))))
				{
					return false;
				}
			case CONSTANT:
			case IDENTIFIER:
			case SINGLE_QUOTE_STRING:
			case DOUBLE_QUOTE_STRING:
			case STRING_AFTER_EXPRESSION_SUBSTITUTION:
			case REGEX:
			case INSTANCE_VARIABLE:
			case CLASS_VARIABLE:
			case INTEGER:
			case FLOAT:
			case HEX:
			case OCTAL:
			case BINARY:
			case ASCII_VALUE:
			case RBRACK:
			case EMPTY_ARRAY:
			case EMPTY_ARRAY_ACCESS:
			case RPAREN:
			case RCURLY:
			case DOT:
			case GLOBAL_VARIABLE :
			case LITERAL_def:
			case LITERAL_alias://TODO this only work for the first parameter
			case LITERAL_undef://TODO this only work for the first parameter
			case LITERAL_self:
			case LITERAL_end:
			case COLON_WITH_NO_FOLLOWING_SPACE:
				return true;
			default:
				return false;
		}
	}

	protected boolean expect_unary() throws CharStreamException
	{
		// unary plus/minus can only appear as in the following examples:
		// a = -1;
		// 2 + (-1)
		// -1
		// ;+2
		// ,-1
		// 2+ -7
		// 1*-2
		// 4/+2
		// 2..-1
		// 2...-1
		// :from=>-0.1
		// args[-1]
		// {-1}
		// a > -1
		// a ? -1 : -2
		switch (last_token_.getType())
		{
			case LINE_BREAK:
			case SEMI:
			case COMMA:
			case Token.INVALID_TYPE:
			case ASSOC:
			case LBRACK:
			case LBRACK_ARRAY_ACCESS:
			case LCURLY_BLOCK:
			case LCURLY_HASH:
			case LPAREN:

			//TODO add more keywords
			case LITERAL_when:	// when -1, Range, Array
			case LITERAL_then:
			case LITERAL_if:
			case LITERAL_unless:
			case LITERAL_until:
			case LITERAL_while:
			case LITERAL_return:
			case LITERAL_rescue:

			case IF_MODIFIER:
			case UNLESS_MODIFIER:
			case WHILE_MODIFIER:
			case UNTIL_MODIFIER:
			case RESCUE_MODIFIER:
				return true;
			case FUNCTION:
				if (seen_whitespace_ &&
					((' ' != LA(1)) && ('\t' != LA(1))))
				{
					return true;
				}
				else
				{
					return false;
				}
			default:
				return is_operator(last_token_.getType());
		}
	}

	protected boolean last_token_is_dot_or_colon2()
	{
		return ((DOT == last_token_.getType())||
				(COLON2 == last_token_.getType())||
				(LEADING_COLON2 == last_token_.getType()));
	}

	protected boolean last_token_is_semi()
	{
		return (DOT == last_token_.getType());
	}

	protected boolean last_token_is_keyword_def_or_colon_with_no_following_space()
	{
		return (LITERAL_def == last_token_.getType() || 
			COLON_WITH_NO_FOLLOWING_SPACE == last_token_.getType());
	}

	protected boolean last_token_is_colon_with_no_following_space()
	{
		return (COLON_WITH_NO_FOLLOWING_SPACE == last_token_.getType());
	}

	/*
	 * lexer should keep linebreaks after operator.
	 * Even though most linebreak after operators can be ignored, but operators in ruby can be methodname sometime
	 * for example: "alias equal? =="
	 */
	protected boolean should_ignore_linebreak()
	{
		switch (last_token_.getType())
		{
			case COMMA:
			case DOT:
			case LBRACK:
			case LBRACK_ARRAY_ACCESS:
			case LCURLY_BLOCK:
			case LCURLY_HASH:
			case LPAREN:
			case SEMI:
			case LINE_BREAK:	//\n #comment \n
			case IF_MODIFIER:
			case UNLESS_MODIFIER:
			case WHILE_MODIFIER:
			case UNTIL_MODIFIER:
			case RESCUE_MODIFIER:
			case ASSOC:
				return true;
			default:
				return false;
		}
	}

	protected boolean is_delimiter(String next_line, String delimiter)
	{
		boolean r;
		if ('-' == delimiter.charAt(0))
		{
			//ignore whitespace
			String trimmed_next_line = "-" + next_line.trim();
			r = delimiter.equals(trimmed_next_line);
		}
		else
		{
			r = delimiter.equals(next_line);
		}

		return r;
	}

	protected boolean is_ascii_value_terminator(char value)
	{
		switch (value)
		{
			case '\t':
			case ' ':
			case '\f':
			case '\13':
			case '\r':
			case '\n':
			case EOF_CHAR:
			case ')':	//while(ARGV[0] && ARGV[0][0] == ?-)
			case ',':	//[?d, ?s, :date]
			case ']':	//[?a]
			case ';':	//$state[n*2] = ?|;
			case '.':	//unless (?A..?Z) === klass[0]
				return true;
			default:
				return false;
		}
	}

	protected int track_delimiter_count(char next_char, char delimeter, int delimeter_count)
	{
		if (delimeter == translate_delimiter(delimeter))
		{
			if (delimeter == next_char)
			{
				--delimeter_count;
				assert(delimeter_count >= 0);
			}
		}
		else
		{
			if (delimeter == next_char)
			{
				++delimeter_count;
			}
			else if (next_char == translate_delimiter(delimeter))
			{
				--delimeter_count;
				assert(delimeter_count >= 0);
			}
		}

		return delimeter_count;
	}

	private char translate_delimiter(char in)
	{
		switch (in)
		{
			case '{':
				return '}';
			case '[':
				return ']';
			case '(':
				return ')';
			case '<':
				return '>';
			default:
				return in;
		}
	}
}

