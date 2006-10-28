/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser;

import java.io.*;
import java.lang.reflect.*;
import junit.framework.*;
import antlr.Token;
import antlr.TokenStreamException;
import antlr.RecognitionException;
import com.xruby.compiler.parser.symboltable.SymbolTableManager;

public class RubyParserTest extends TestCase
{
	/// @param[in]e	Can be null
	private String build_error_string(String program_text, Exception exception)
	{
		assert(null != program_text);

		//Dump text and exception(if any)
		StringBuilder debug_message = new StringBuilder();
		debug_message.append("\"");
		debug_message.append(program_text);
		debug_message.append("\" ");
		if (null != exception)
		{
			debug_message.append(exception.toString());
		}

		//Dump token streams;
		SymbolTableManager stm = new SymbolTableManager();
		RubyLexer lexter = new RubyLexer(new StringReader(program_text), stm);
		debug_message.append("\nToken stream is:");
		try
		{
			Token token = lexter.nextToken();
			while (Token.EOF_TYPE != token.getType())
			{
				debug_message.append(token.getText());
				debug_message.append("(");
				debug_message.append(token.getType());
				debug_message.append(")\t");

				token = lexter.nextToken();
			}
		}
		catch (TokenStreamException e)
		{
		}
		debug_message.append("\n");

		return debug_message.toString(); 
	}

	private void invoke_method_with_reflection(String program_text, String method_name) throws RecognitionException, TokenStreamException
	{
		assert(null != program_text);
		assert(null != method_name);

		RubyParser parser = new RubyParser(new StringReader(program_text));
		Class c = parser.getClass();
		
		Method method = null;
		try 
		{
			method = c.getMethod(method_name);
		}
		catch (NoSuchMethodException e)
		{
			assertTrue("No such method: " + method_name, false);
		}
		
		try
		{
			method.invoke(parser);
		}
		catch (IllegalAccessException e)
		{
			assertTrue(false);
		}
		catch (IllegalArgumentException e)
		{
			assertTrue(false);
		}
		catch (InvocationTargetException e)
		{
			Throwable cause = e.getCause();
			if (cause instanceof RecognitionException)
			{
				throw (RecognitionException)cause;
			}
			else if (cause instanceof TokenStreamException)
			{
				throw (TokenStreamException)cause;
			}
			else
			{
				cause.printStackTrace();
				assertTrue(cause.toString(), false);
			}
		}

		//Ensure there are no more tokens left
		assertEquals(program_text + " There are tokens left: " + parser.LT(1).toString() + ", ",
					Token.EOF_TYPE, parser.LT(1).getType());
	}
	
	private void parse(String[] program_texts, String method_name)
	{
		for (int i = 0; i < program_texts.length; ++i)
		{
			try
			{
				invoke_method_with_reflection(program_texts[i], method_name);
			}
			catch (RecognitionException e)
			{
				assertTrue(build_error_string(program_texts[i], e), false);
			}
			catch (TokenStreamException e)
			{
				assertTrue(build_error_string(program_texts[i], e), false);
			}
		}
	}

	public void test_terminal()
	{
		String[] program_texts = {
			";",
			";;;;;;;;;;;",
			"\n\n\n\n;;;;;;;;;;;",
			//"\n",
		};
		
		parse(program_texts, "terminal");
	}
	
	public void test_bad_program_RecognitionException() {
		String[] program_texts = {
				//(rejected in tree parser's action) "yield {|x| }",
				//(rejected in tree parser's action) "defined?(f, g)",
				"puts (a = *nil)",
				"alias $a b",
				"alias a $b",
				"1::1",
				"puts() 1",
				"1[1]",
				"1 (2)",
				"'hello' ()",
				"1 + * 2",
				"a (",
				"def test",
				"class test",
				"module test end end",
				"123 abc",
				"[1](1)",
				"def f(&arg, a) end",
		};

		for (String program_text : program_texts) {
			RubyParser parser = new RubyParser(new StringReader(program_text));
			try {
				parser.createAST();
				assertTrue(program_text + " should fail", false);//should not reach here
			} catch (RecognitionException e) {
				//expected
			} catch (TokenStreamException e) {
				assertTrue(program_text + " should not throw TokenStreamException", false);
			}
		}
	}

	public void test_bad_program_TokenStreamException() {
		String[] program_texts = {
		};

		for (String program_text : program_texts) {
			RubyParser parser = new RubyParser(new StringReader(program_text));
			try {
				parser.createAST();
				assertTrue(program_text + " should fail", false);//should not reach here
			} catch (RecognitionException e) {
				assertTrue(program_text + " should not throw RecognitionException", false);
			} catch (TokenStreamException e) {
				//expected
			}
		}
	}

	public void test_command_output()
	{
		String[] program_texts = {
				"%x/hey there #{myname}/",
		};
		
		parse(program_texts, "command_output");
	}

	public void test_string()
	{
		String[] program_texts = {
				"\"abc#{}opq#{   }xyz\"",
				
"\":in `#{id.id2name}'\"",
"%Q[def #{ali}(*opts)\n" +
"                          @shell.__send__(:#{command},\n" +
"                                          *(CommandProcessor.alias_map[:#{ali}].call *opts))\n" +
"	                end]",

"%[\n" +
"	  def #{cmd_name}(*opts, &b)\n" +
"	    require \"#{load_file}\"\n" +
"	    eval %[\n" +
"	      def #{cmd_name}(*opts, &b)\n" +
"		ExtendCommand::#{cmd_class}.execute(irb_context, *opts, &b)\n" +
"	      end\n" +
"	    ]\n" +
"	    send :#{cmd_name}, *opts, &b\n" +
"	  end\n" +
"	]",
			
"%{#{COMMON_HEADERS}\n" +
"#{includes}\n" +
"#include <stdio.h>\n" +
"/*top*/\n" +
"int conftest_const = (int)(#{const});\n" +
"int main() {printf(\"%d\\n\", conftest_const); return 0;}\n" +
"}",

	
"%{\n" +
"        def #{m}(*args)\n" +
"          warn(\"\\#{caller(1)[0]}: #{m} is deprecated; use Base64.#{m} instead\")\n" +
"          super\n" +
"        end\n" +
"      }",
			
			"%Q[%Q[#{rss}]]",
"%{\n" +
"	def #{d}(*a) \n" +
"	  catch_exception do\n" +
"	    @handle.#{d}(*a) \n" +
"	  end\n" +
"	end\n" +
"      }",

			"%Q&Seconds/day: #{24*60*60}&",

			"\"{ alert('RJS error:\\n\\n' + e.toString()); alert('#{source.gsub(/\\r\\n|\\n|\\r/, \"\\n\").gsub(/[\"']/) { |m| \"\\#{m}\" }}'); throw e }\"",
			"\"!ruby/time#{ if self.class != ::Time; \":#{ self.class }\"; end }\"",
			"\"string#{a}\"",
			"\"string#@a \"",
			"\"string#$a \"",
			"\"string#{a}string\"",
			"\"string#{a}#{b}string#{c + 2}\"",
		};

		parse(program_texts, "string");
	}

	/*
	public void test_operatorAsMethodName()
	{
		String[] program_texts = {
			"^",
			"|",
			//"&",
			"<=>",
			"==",
			"===",
			"<<",
			">>",
			"+",
			"-",
			//"*",
			//"/",
			//"%",
			"**",
			"~",
			"[]",
			"[]=",
			//"`",
		};

		parse(program_texts, "operatorAsMethodName");
	}*/

	public void test_literal()
	{
		String[] program_texts = {
			"%w(folder openfold)",
		};

		parse(program_texts, "literal");
	}

	public void test_numeric()
	{
		String[] program_texts = {
			"0",
			"2",
			"12.34",
			/*"-0.1",
			"-0",
			"-2",
			"-12.34",
			"-0.1",*/
			"0xa",
			"10e10",
			"5e-10",
			"0xAF",
		};

		parse(program_texts, "numeric");
	}

	/*
	public void test_variable()
	{
		String[] program_texts = {
			"a",
			"abc",
			"ABC",
			"$abC",
			"@abc",
			"@@abc1",
			"nil",
			//"self",
			"true",
			"false",
			"__FILE__",
			"__LINE__",
		};

		parse(program_texts, "variable");
	}
	*/

	public void test_program()
	{
		String[] program_texts = {
			"if $0==__FILE__	\n	end\n",
			"#nothing but comment",
			"#nothing but comment\n",
		};

		parse(program_texts, "program");
	}

	public void test_className()
	{
		String[] program_texts = {
			"XMLRetry",
			"XML::Parser ",
			"::SOAP::RPC::Driver",
		};

		parse(program_texts, "className");
	}

	public void test_compoundStatement2()
	{
		String[] program_texts = {
				"   methods += <<-BEGIN + nn_element_def(element) + <<-END\n" +
				"          def #{element.downcase}(attributes = {})\n" +
				"        BEGIN\n" +
				"          end\n" +
				"        END\n",
		};
		
		parse(program_texts, "compoundStatement");
	}
	
	public void test_compoundStatement()
	{
		String[] program_texts = {

" alias eql? ==\n" +
"  def compare_by_row_vectors(rows)\n" +
"  end",

"b = 1\n" +
"a = 2\n" +
"test_ok(b + -7 == (-a).modulo(b))",

			"  try_link(<<\"SRC\", libs, &b) or try_link(<<\"SRC\", libs, &b)\n" +
"/*top*/\n" +
"int main() { return 0; }\n" +
"int t() {return 0; }\n" +
"SRC\n" +
"/*top*/\n" +
"int main() { return 0; }\n" +
"int t() { void ((*volatile p)()); p = (void ((*)()))\n" +
"SRC\n",



			"TkPhotoImage.new(:data=><<'EOD')\nEOD\n",
			"TkMessage.new(:text => <<EOM).pack\nEOM\n",

"p = XML::Parser.new\n" +
"if p.respond_to?(:useForeignDTD)\n" +
"  p p.useForeignDTD(ARGV[0].to_i)\n" +
"else\n" +
"  puts \"XML::Parser#useForeignDTD requires expat-1.95.5 or later\"\n" +
"end\n",

			"deriv = []\nderiv <<= (fxNew[j]-fx[j])/dx",
			"1;	if $0==__FILE__	\n	end",
			"date=1;        @base_slot.data = data if data",
			"dst.push @last while /A *z/ =~ (@last = @file.gets)\n	break\n",
			"; print \"%02X\" % c",
			"@cookies = []	\n	@accept = []\n",
			"class XMLRetry<Exception; end     \n class SampleParser<XML::Parser \n end\n",
			"123;",
			"1+2\n",
			"1+2\n2\n",
			"1+2;3-3;;;;",
			"1+2;3-4\n\n\n; 3 * 6\n\n\n",
			"puts \"hello\";\n\n\n;",
		};

		parse(program_texts, "compoundStatement");
	}

	public void test_alias()
	{
		String[] program_texts = {
			"alias / quo",
			"alias quo /",
			"alias value= nodeValue=",
			"alias class :type",
			"alias eql? ==",
			"alias === ==",
			"alias :<< :push",
			"  alias Fail Raise",
			"alias get in",
			"alias $ERROR_INFO              $!",
			"alias :old_enc= 	\n		:encoding=",
			"alias :old_enc= \n	\n\n	\n	:encoding=",
			"alias :a :b if true if false",
			"alias :a :b if true",
			"alias :old_enc :encoding",
			"alias\n:old_enc\n:encoding",
			"alias	\n :local_name \n	:name",
		};

		parse(program_texts, "statement");
	}

	public void test_undef()
	{
		String[] program_texts = {
			"   undef :default=",
			"undef a while false",
			"undef a=",
			"undef a,b, c  ,\n d",
		};

		parse(program_texts, "statement");
	}

	public void test_statementWithoutModifier()
	{
		String[] program_texts = {
			"marshal_equal(:`)   #`",
			"a,=*[1]",
			"a =1, 2",
			"y, m = clfloor(year * 12 + (mon - 1) + n, 12)",
			"x, (y, z) = 1, 2, 3",
			"self.year, self.month, self.day = year, month, day",
			" canon, sw, * = candidates[0]",
			"  @re_string, @handler = \n 1",
			"session_id, = request.cookies[session_key]",
			"b, *c = a",
			"b, *c = 99, *a",
			"a, b = 1, 2",
			"a, b,c =1, 2",
			"a, b,c =1, 2,3,b,@a",
			"*a = nil",
		};

		parse(program_texts, "statementWithoutModifier");
	}

	public void test_statement()
	{
		String[] program_texts = {
			"alias_method :regular_writer, :[]= unless method_defined?(:regular_writer)",
			"return (method.cast_returns(return_value.dup) rescue return_value) if ok",
			"method.cast_returns(return_value.dup) rescue return_value",
			"raise ::TypeError, \"must be a Float\" unless num.is_a? Float",
			"redo if count == 3",
			"  dir.close if dir rescue nil ",
			"    return EUCHandler.new if name =~ /^euc-jp$/i",
			"return -1 if i < 160 or i == 255",

			"@attr.each do |a|  ## self.attributes do |a|\n" +
"        attr += a.to_s + \", \"\n" +
"      end if @attr",

			"private :character",
			"retry",
			"next if data =~ /^<\\?xml /",
			"File.delete(newfile) rescue nil",
			"ipaddr = ipaddr.ipv4_mapped if @pat[1].ipv6? && ipaddr.ipv4?",
			"File.join(srcdir, libdir) if srcdir",
			"5.times {puts 'A'}",
			"class XMLRetry<Exception; end",
			"puts(\"hello\") if true",
			"puts(\"hello\") until /^\\s*#/",
			"puts(\"hello\") unless 5",
			"puts(\"hello\") while true",
			"require 'xml/dom/builder'",
			":msg",
			"print :msg",
			"BEGIN { 1\n }",
			"END { 1; }",
			"BEGIN { 1;2\n3; }",
			"END { 1+2+3+4;4;\n }",
			
		};

		parse(program_texts, "statement");
	}

	public void test_primaryExpression()
	{
		String[] program_texts = {
			"(method.cast_returns(return_value.dup) rescue return_value)",
			"::TypeError",
			"(0..xs.size / n - 1)",
			"(@_vr_c_order.size>0)",
			"(fheight.to_f / @_vr_c_order.size) ",
			"(print ARGV.options; exit)",
			" (LAYOUT_SIDE_LEFT|LAYOUT_FILL_X|LAYOUT_FILL_Y|TABBOOK_BOTTOMTABS)",
			"/^\\s*#/",
			"123",
			"(123)",
			"(1+2)",
			"(1-2*3/4)",
			"(3==((2^3) and (4**5)))",
			"\"string\"",
			":symbol",
		};

		parse(program_texts, "primaryExpression");
	}

	public void test_powerExpression()
	{
		String[] program_texts = {
			"@denominator ** -other",
			"123",
			"2**3",
			"123**2**3**4",
		};

		parse(program_texts, "powerExpression");
	}
	

	public void test_unaryExpression()
	{
		String[] program_texts = {
			"!!true",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
		};

		parse(program_texts, "unaryExpression");
	}

	
	public void test_multiplicativeExpression()
	{
		String[] program_texts = {
			"1 / 2",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "multiplicativeExpression");
	}

	public void test_additiveExpression()
	{
		String[] program_texts = {
			"2 + -1",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "additiveExpression");
	}

	
	public void test_shiftExpression()
	{
		String[] program_texts = {
			"@plugin.log_debug << \"#{self.class.to_s} component created for #{@base_slot.name}\"",
			"$stdout << 99 << \" red balloons\" << endl",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "shiftExpression");
	}

	public void test_andExpression()
	{
		String[] program_texts = {
			"in_assigned.map{|i| i.name} & out_vars.map{|i| i.name}",
			"/b/&/c/",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "andExpression");
	}

	public void test_orExpression()
	{
		String[] program_texts = {
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "orExpression");
	}

	public void test_relationalExpression()
	{
		String[] program_texts = {
			"xl < -hdw",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "relationalExpression");
	}

	public void test_equalityExpression()
	{
		String[] program_texts = {
			"a.nodeType == XML::DOM::Node::ELEMENT_NODE",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "equalityExpression");
	}

	public void test_logicalAndExpression()
	{
		String[] program_texts = {
			"@pat[1].ipv6? && ipaddr.ipv4?",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"(+123)",
			"-(123)",
			"~(123)",
			"(!123)",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "logicalAndExpression");
	}

	public void test_logicalOrExpression()
	{
		String[] program_texts = {
			"1 || 2",
			"1+2 || 2 && 3 || 4",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"((1) + (2))",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "logicalOrExpression");
	}

	public void test_rangeExpression()
	{
		String[] program_texts = {
			"1...3",
			"1..param_size",
			"1.. 2",
			"1 ...2",
			"1 .. 2...3 .. 4",
			"1 || 2",
			"1+2 || (2 && 3) || 4",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "rangeExpression");
	}

	public void test_ternaryIfThenElseExpression()
	{
		String[] program_texts = {
			"id ? \":in `#{id.id2name}'\":\"\"",
			"@pubid.include?('\"')?\"'\":'\"'",
			"@charset ?\n		XSD::Charset.encoding_to_xml(data.to_s, @charset) : data.to_s",
			"a ? (a) : fheight",
			"a ? -1 : -2",
			" idattr ? attr[idattr] : nil",
		};

		parse(program_texts, "ternaryIfThenElseExpression");
	}

	public void test_assignmentExpression()
	{
		String[] program_texts = {
			"a = yield()",
			"a=b=1",
			"match = @current.next(event)",
			//"a = *nil",
			"(scales =1) <<= one.div(nrmrow,prec)",
			"af = (@sock.peeraddr)[0]",
			"path = []",
			"AUTO = ::NKF::AUTO",
			"options = {}",
			"@duration = 2",
			"1 = 2",
			"1 += 2",
			"1 -= 2",
			"1 *= 2",
			"1 /= 2",
			"1 %= 2",
			"1 &= 2",
			"1 |= 2",
			"1 ^= 2",
			"1 <<= 2",
			"1 >>= 2",
			"1 &&= 2",
			"1 ||= 2",
			"12**= 2",
			"1 = (2= 3)-= 4 += 5",
			"1..2",
			"1...2",
			"1..2 ... 3 ..4",
			"1 || 2",
			"1+2 || 2 && 3 || 4",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&(1&3)&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
			"@msg = \"Hello, World\"",
		};

		parse(program_texts, "assignmentExpression");
	}

	public void test_notExpression()
	{
		String[] program_texts = {
			"not 1",
			"not not not 1",
			"not 1 + 2",
			"1 = 2",
			"1 += 2",
			"1 -= 2",
			"1 *= 2",
			"1 /= 2",
			"1 %= 2",
			"1 &= 2",
			"1 |= 2",
			"1 ^= 2",
			"1 <<= 2",
			"1 >>= 2",
			"1 = 2= 3-= 4 += 5",
			"1 .. 2",
			"1 ... 2",
			"1 .. 2 ... 3 .. 4",
			"1 || 2",
			"1+2 || 2 && 3 || 4",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"100 >= 200",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"(1+2)<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"(!123)",
			"1*2",
			"1%200",
			"-1*+200/(123)%~123*!123",
		};

		parse(program_texts, "notExpression");
	}

	public void test_expression()
	{
		String[] program_texts = {
			" /A *z/ =~ (@last = @file.gets)",
			"class XMLRetry<Exception; end",
			"    puts (:msg ) ",
			"\"hello\"",
			"a = Hello.new",
			":msg",
		};

		parse(program_texts, "expression");
	}


	public void test_andorExpression()
	{
		String[] program_texts = {
			"have_library(\"gdbm\") or return false",
			":msg",
			"1 and 2",
			"1 or 2",
			"1 and 2 or not 3 and not 4",
			"not 1",
			"not not not 1",
			"not 1 + 2",
			"1 = 2",
			"1 += 2",
			"1 -= 2",
			"1 *= 2",
			"1 /= 2",
			"1 %= 2",
			"1 &= 2",
			"1 |= 2",
			"1 ^= 2",
			"1 <<= 2",
			"1 >>= 2",
			"1 = 2= 3-= 4 += 5",
			"1 .. 2",
			"1 ... 2",
			"1 .. 2 ... 3 .. 4",
			"1 || 2",
			"1+2 || 2 && 3 || 4",
			"1 && 2",
			"1+2 && 2 && 3 && 4",
			"1 <=> 2",
			"1 == 2",
			"1 === 2",
			"1 != 2",
			"1 =~ 2",
			"1 !~ 2",
			"1 !~ 2 =~ 100 != 10 === 0 == 1 <=> 3333",
			"1 < 2",
			"1 > 2",
			"(100 >= 200)",
			"100 <= 200",
			"100 >= 2+3 < 3&6 > 4 <=5",
			"1 ^ 2",
			"1 | 2",
			"1 ^ 2",
			"1 ^ 2 |3|4^5+1%6",
			"1 & 2",
			" 2&1&3&1+2<<3",
			"1 << 2",
			" 2>>1",
			"1+2<<1>>300+1*5",
			"1 + 2",
			"1 -2 ",
			"1 + 2 - 2 + 4 ",
			"123",
			"+123",
			"-123",
			"~123",
			"!123",
			"1*2",
			"1%200",
			"-1*+200/123%~123*!123",
		};

		parse(program_texts, "andorExpression");
	}

	public void test_ifExpression()
	{
		String[] program_texts = {
"if arg.kind_of? String\n" +
"	@string = arg.clone\n" +
"elsif arg.kind_of? Text\n" +
"	@string = arg.to_s\n" +
"	@raw = arg.raw\n" +
"elsif\n" +
"	raise Exception.new( \"Illegal argument\" )\n" +
"end",

			"if bool then -1 else 0 end",

			" if @sessionid\n      { \"sessionid\" => @sessionid }\n	end",
" if /A *z/ =~ @last then\n" +
"        dst.push @last\n" +
"        dst.push @last while /A *z/ =~ (@last = @file.gets)\n" +
"        break\n" +
"      elsif /A +([a-z][a-z])|(?: | *$)/ =~ @last then\n" +
"        break unless $1 == lang\n" +
"        dst.push $'\n" +
"      else\n" +
"        break if lang\n" +
"        dst.push @last\n" +
"      end",
			"if 1==2 then 1+1\n2;3; end",
			"if 1==2 \n 1+1; end",
			"if @sessionid ;then 1+1\n end",
			"if 1 then 1; elsif 1 then 1 \nend",
			"if 1 then 1; elsif 1 then 1\n else 1; end",
			"if 1 then 1; elsif 1 then 1; elsif 1\n then 1; elsif 1 ; 1; elsif 1 \nthen 1\n else 1 \n end",
		};

		parse(program_texts, "ifExpression");
	}

	public void test_unlessExpression()
	{
		String[] program_texts = {
			"unless defined? Thread\n  fail \"Thread not available for this ruby interpreter\"		\n	end",
			"unless %w(i4 int boolean string double dateTime.iso8601 base64).include? node.nodeName		\n	end",
			
"unless files.include?(\"freebase.yaml\")	\n"	+
"          raise \"Could not locate default.yaml in #{dir}\" unless files.include?(\"default.yaml\")	\n"	+
"        end",
			"unless 1==2 then 1+1; end",
			"unless 1==2 \n 1+1\nend",
			"unless 1==2 ;then 1+1 ;end",
			"unless 1 then 1; else 1;2\n3; end",
		};

		parse(program_texts, "unlessExpression");
	}

	public void test_caseExpression()
	{
		String[] program_texts = {
"   case\n" +
"    when true\n" +
"      assert(true)\n" +
"    when false, nil\n" +
"      assert(false)\n" +
"    else\n" +
"      assert(false)\n" +
"    end",

"case number.to_i % 10\n"	+
"when 1: \"true\"\n"	+
"else \"false\""	+
"end",

" case i\n"	+
"        when -1, Range, Array\n"	+
"          MessageSet.new(i)\n"	+
"        else\n"	+
"          i\n"	+
"        end",

			"case type   \n when XML::Parser::START_ELEM   \n   data.each do |key, value|#   \n     print Uconv.u8toeuc(\"A#{key} CDATA #{value}\")   \n     print \"A#{key} CDATA #{value}\"  \n    end   \n    #      print Uconv.u8toeuc(\"(#{name}\")   \n   print \"(#{name}\"   end",
			"case ivar; when *NOPRINTING_IVARS then 1+1\n2;3; end",
			"case 1==2\nwhen 2\n 1+1; else 2+2; end",
			"case 1==2 \n;when 2\n 1+1; when 2 then 1+1; when 2\nthen 1+1; else 2+2; end",
		};

		parse(program_texts, "caseExpression");
	}

	public void test_forExpression()
	{
		String[] program_texts = {
"    for i in 0...5 do\n" +
"      for j in 0...i do\n" +
"      end\n" +
"    end",

			"for th, in @thread_list\nend",
			" for fullname, logger in instance.loggers\n	end",
			"for x in 1==2 do 1+1; end",
			"for x in 1==2\n 1+1; end",
			"for x in 1==2 ; 1+1; end",
			"for x in 1==2 do 1+1;2; end",
			"for a in 1==2 do 3;1+1\nend",
		};

		parse(program_texts, "forExpression");
	}

	public void test_whileExpression()
	{
		String[] program_texts = {

"    while r.hitem do\n" +
"    end",


"    while(f) do\n" +
"    end",

			"while 1==2 do 1+1 ;end",
			"while 1==2 \n 1+1 ;end",
			"while 1==2 ; 1+1; end",
			"while 1==2 do 1+1;2\n\n\n end",
			"while 1==2 do 3;1+1;;;;;;;;;;;;;end",
		};

		parse(program_texts, "whileExpression");
	}

	public void test_untilExpression()
	{
		String[] program_texts = {
			"until 1==2 do 1+1;;end",
			"until 1==2 \n 1+1\n\nend",
			"until 1==2 ; 1+1;end",
			"until 1==2 do 1+1;2\nend",
			"until 1==2 do 3;1+1 ;end",
		};

		parse(program_texts, "untilExpression");
	}

	public void test_moduleDefination()
	{
		String[] program_texts = {
			"module Tk::Tcllib	\n	end",
			"module FreeIDE \n module GUI  \n  end   \n end # module FreeRIDE",
			"module Mod 1; end",
			"module Mod\n\n1\n end",
			"module A 1==2 \n 1+1; end",
		};

		parse(program_texts, "moduleDefination");
	}

	public void test_classDefination()
	{
		String[] program_texts = {


"  class PrivateType\n" +
"    ensure\n" +
"  end",

"  class Object\n" +
"    alias class :type\n" +
"  end",
			"class ExtArray<DelegateClass(Array)\n	end",
			"class << target\n	alias_method(:dc_date, :pubDate)\n		end",
			"class << @host; self; end",
			"class << @@resource_proc_class\nend",
			"class PreDefVirtEvent<self;end",
			"class ChannelBase; include SyndicationModel; end",
			"class AmazonSearchPort < ::SOAP::RPC::Driver	\n	end",
			"class << self		\n	end",
			"class << Tk::BLT::Table	\n	end",
			"class Tk::Tile::TLabel < TkLabel	\n	end",
			"class SampleParser<XML::Parser \n end",
			"class XMLRetry<Exception; end",
			"class C ;1; end",
			"class C; 1\nend",
			"class C\n1\nend",
			"class C \n\n\n1; end",
			"class Class; 1==2 \n 1+1; end",
			"class C < B\n  1==2 \n 1+1; end",
			"class C < B::A;  1==2 \n 1+1; end",
			"class C < B::A::C\n \t1==2 \n 1+1; end",
		};

		parse(program_texts, "classDefination");
	}

	public void test_methodDefination()
	{
		String[] program_texts = {

"def tt4 &block\n" +
"  tt2(raise(ArgumentError,\"\"),&block)\n" +
"end",

				"def RGB(r,g,b)\n" +
				"  return r+(g<<8)+(b<<16)\n" +
				"end",

				"def to_s indent=0	\n	end",
"def `(command) \n	end",

"  def test_cachesize=\n" +
"        assert_equal(@gdbm.cachesize = 1024, 1024)\n" +
"    end",
	
"def fmt.%(x)\n" +
"    x ? super : \"unknown\"\n" +
"  end",

"def ~\n"	+
"    return self.clone.set(addr_mask(~@addr))\n"	+
" end",
		
			"def (config = \"\").write(arg) end",
			"def @tk_cmd_tbl.[]=(idx,val)	end",

"        def convert(object)\n" +
"          case object\n" +
"            when Exception\n" +
"              <<EOM.chop\n" +
"Class: <{convert(object.class)}>\n" +
"Message: <{convert(object.message)}>\n" +
"---Backtrace---\n" +
"{filter_backtrace(object.backtrace).join(\"\n" +
"\")}\n" +
"---------------\n" +
"EOM\n" +
"          end\n" +
"        end",

			"  def $input_file_name.post_match\n  end",

"  def window_parent\n" +
"    a=self\n" +
"    while(! a.is_a?(SWin::Window) ) do\n" +
"      a = a.instance_eval(\"@parent\")\n" +
"    end\n" +
"    return a\n" +
"  end" ,
			"def splitterDragging(x,y) end",
			"def _vr_relayout() raise \"using base class #{self.class}\" end",

" def _vr_relayout( xs = (@_vr_lw*@ratio).to_i)\n" +
"    sh=(@separatorheight/2).to_i\n" +
"    @_vr_lxs,@_vr_lxe = @_vr_lx+xs-sh,@_vr_lx+xs+sh\n" +
"    @_vr_lys,@_vr_lye = @_vr_ly,@_vr_ly+@_vr_lh\n" +
"\n" +
"    @pane1.move @_vr_lx,@_vr_ly,  xs-sh,@_vr_lh\n" +
"    @pane2.move @_vr_lxs+@separatorheight,@_vr_ly, @_vr_lw-xs-sh,@_vr_lh\n" +
"  end",

			"def |(other)	\nend",
			"def search(gem_name, version_requirement=Version::Requirement.new(\">= 0\"))	\nend",
"def dfdxi(f,fx,x,i)\n" +
"    nRetry = 0\n" +
"    n = x.size\n" +
"    xSave = x[i]\n" +
"    ok = 0\n" +
"    ratio = f.ten*f.ten*f.ten\n" +
"    dx = x[i].abs/ratio\n" +
"    dx = fx[i].abs/ratio if isEqual(dx,f.zero,f.zero,f.eps)\n" +
"    dx = f.one/f.ten     if isEqual(dx,f.zero,f.zero,f.eps)\n" +
"    until ok>0 do\n" +
"      s = f.zero\n" +
"      deriv = []\n" +
"      if(nRetry>100) then\n" +
"         raize \"Singular Jacobian matrix. No change at x[\" + i.to_s + \"]\"\n" +
"      end\n" +
"      dx = dx*f.two\n" +
"      x[i] += dx\n" +
"      fxNew = f.values(x)\n" +
"      for j in 0...n do\n" +
"        if !isEqual(fxNew[j],fx[j],f.zero,f.eps) then\n" +
"           ok += 1\n" +
"           deriv <<= (fxNew[j]-fx[j])/dx\n" +
"        else\n" +
"           deriv <<= f.zero\n" +
"        end\n" +
"      end\n" +
"      x[i] = xSave\n" +
"    end\n" +
"    deriv\n" +
"  end",


" def jacobian(f,fx,x)\n" +
"    n = x.size\n" +
"    dfdx = Array::new(n*n)\n" +
"    for i in 0...n do\n" +
"      df = dfdxi(f,fx,x,i)\n" +
"      for j in 0...n do\n" +
"         dfdx[j*n+i] = df[j]\n" +
"      end\n" +
"    end\n" +
"    dfdx\n" +
"  end",

			"def nilnull(r) if r==0 then nil else r end end",
			"def _make_regex(str) /([#{Regexp.escape(str)}])/n end",
			"def self.valid_civil? (y, m, d, sg=ITALY)\n"	+
			"	clfloor(y * 12 + m, 12)\n"	+
			"end",

" def Win32API.new(dll,func,args,retval)\n" +
"    args = args.split(//) if args.is_a?(String)\n" +
"    super dll,func,args,retval\n" +
"  end",

"    def display_attributes\n" +
"      bit = 1\n" +
"      16.times do |bno|\n" +
"        line = \"\"\n" +
"        @str.length.times do |i|\n" +
"        end\n" +
"        puts(line) unless line =~ /^ *$/\n" +
"        bit <<= 1\n" +
"      end\n" +
"    end",		
	
"  def nlsolve()\n" +
"    e = 1\n" +
"    while 5 >= e do\n" +
"    end\n" +
"  end",
				"def ludecomp(a,n,zero=0,one=1)\n	scales = [];scales <<=	one.div()	\nend",
				"def write(writer, indent=0);end",
				"def >(other)\nend",
				"def nilnull(r) if r==0 then nil else r end end",
				"def run_test(*); end",
				"def Functions::not; end",
				" def MEMCOPY::Mem2Str(dst,src,len=dst.length)\n    Pmemcpy1.call(dst,src,len)\n  end",
				" def Mode=(value)\n    @mode = value\n  end",
				"def begin(drawable) ; end",

"def serve(io)  \n" +
"  rescue Exception => e\n" +
"    io << http_resp(500, \"Internal Server Error\")\n" +
"  end",

" def self.append_features(klass)\n"	+
"        ::RSS::SyndicationModel::ELEMENTS.each do |element|\n"	+
"          klass.module_eval(<<-EOC, __FILE__, __LINE__)\n"	+
"          EOC\n"	+
"        end\n"	+
"      end",

			"def @dumplog.log_dump(dir, x) \n	end",

"  def self::Binary(str)"	+
"    RawData.new(str)\n"	+
"  end",

"  def self.bwinclude(klass, subclass, subpath, *args)\n"	+
"    tk_call('Widget::bwinclude', klass, subclass, subpath, *args)\n"	+
"  end",

"def build_uncompressed_index\n"	+
"    puts \"Building yaml file\" if @options[:verbose]\n"	+
"end",

"def colorize(num)\n"	+
"  num = Integer(num)\n"	+
"  return 'colored' if (num > 0 && num % 2 == 1)\n"	+
"end",

			"def self.[](param); @@params[param] end",
			"def self.[]=(param, value); @@params[param] = value end",
			"def self.command=(cmd)	\n	end",
			"def to_s indent=0	\n	end",
			"def XPath::each element, path, &block	\n	end",
			"def Matrix.[](*rows)	\n	end",
			"def POP3.APOP( isapop )	\n	end",
			"def Config::expand(val, config = CONFIG)	\n	end",
			"def initialize(suite, output_level=NORMAL, io=STDOUT)	\n	end",
			"def \n add_indicator(keys={}, &b)   \n end",
			"def self.startup(dir)   \n       end",
			"def initialize(encoding = nil, nssep = nil)  \n end",
			"def duration=(newDuration)		\n	@duration = newDuration	\n  end",
			"def Mod.method1  \n  # module method    \n    CONST + 1      \n      end",
			"def regular(a, b, *c)    \n# ..\n      end",
			"def all(a, b, c, *d, &e) \n end",
			"def []=(index, value); end",
			"def +@(); end",
			" def /(item)\n end",
			"def f; 1; end",
			"def \n F;1\nend",
			"def F\n1\nend",
			"def aaaaaaaaaa \n\n\n1; end",
			"def function; 1==2 \n 1+1; end",
			"def F  \n\t1==2 \n 1+1; end",

		};

		parse(program_texts, "methodDefination");
	}

	public void test_exceptionHandlingExpression()
	{
		String[] program_texts = {

"begin\n" +
"  parser.parse(xml)\n" +
"rescue XMLRetry\n" +
"  newencoding = nil\n" +
"  e = $!.to_s\n" +
"  if e =~ /^iso-2022-jp$/i\n" +
"    xml = NKF.nkf(\"-Je\", xml)\n" +
"    newencoding = \"EUC-JP\"\n" +
"  end\n" +
"  parser = SampleParser.new(newencoding)\n" +
"  retry\n" +
"rescue XML::Parser::Error\n" +
"  line = parser.line\n" +
"  print \"Parse error(#{line}): #{$!}\n\"\n" +
"end",

			"begin\n      mu_lock\n      yield\n    ensure\n      mu_unlock\n    end",
			"begin\n          plugin[\"service\"].manager.shutdown		\n        rescue => detail	\n        end",
			"begin 1^2; rescue \n 1; end",
			"begin 1^2; rescue then 1; end",
			"begin 1^2; rescue Exception => err then 1; end",
			"begin 1^2; rescue SyntaxError, NameError => boom then 1; else 1; end",
			"begin 1^2; rescue XML::Parser::Error then 1\n ensure 1; end",
			"begin 1^2; rescue  @restart_signal then 1; else 1; ensure 2; end",
			"begin 1^2;2; rescue then 1; rescue Exception then 1; rescue Exception then 1; else 1\n ensure 2\n end",
		};

		parse(program_texts, "exceptionHandlingExpression");
	}
	
	public void test_arrayExpression()
	{
		String[] program_texts = {
"[\n" +
"      SCOPE_ONE = 'one',\n" +
"      SCOPE_SUB = 'sub',\n" +
"      SCOPE_BASE = 'base',\n" +
"    ]",
			"['1'=>1, '2'=>2, '3'=>3]",
			"[?a]",
			"['::blt::dnd', *id]",
			"['::blt::tile::button'.freeze\n]",
			"[ fred, 10, 3.14, \"This is a string\", barney(\"pebbles\"), ]",
			"[ ]",
			"[1, 2, 3, ]",
			"[1, 2, 3]",
			"[*a]",
			"[*a\n]",
		};

		parse(program_texts, "arrayExpression");
	}

	public void test_hashExpression()
	{
		String[] program_texts = {
			"{{}=>\"\"}",
"{\n" +
"      :TempDir        => ENV['TMPDIR'],\n" +
"    }",

			"{100, 'Continue'}",
			"{'*'=>'id'}",
			"{section=>{}}",
			"{\n      ListBase::BULLET =>  [ \"<ul>\", \"</ul>\" ]	\n}",
			"{ \"red\"   => 0xf00,\n \"green\" => 0x0f0,\n\t\"blue\"  => 0x00f\n}",
			"{123=>1,2=>3, 4=>5,}",
			"{123 =>1,  1.2=>4.5     ,0=>0      ,  }",
			" { 0                 =>               123456 \n }",
			"{}",
			"{  }",
		};

		parse(program_texts, "hashExpression");
	}

	/*
	public void test_block_var()
	{
		String[] program_texts = {
			"(orig, new)",
			"dir",
		};

		parse(program_texts, "block_var");
	}

	public void test_block_vars()
	{
		String[] program_texts = {
			"dir, (orig, new)",
		};

		parse(program_texts, "block_vars");
	}
	*/

	public void test_codeBlock()
	{
		String[] program_texts = {
			"do |dir, (orig, new)|  end",
			"do |(a_name, a_inf), (b_name, b_inf)|  \n    a_inf <=> b_inf	\nend",
			"do |method, *param| 	\n	end",
			"do |x,y| \n x+y end",
			"do x*y \n end",
			"do |x,| puts(x)  \nend",
		};

		parse(program_texts, "codeBlock");

		String[] program_texts2 = {
			"o.each {|(o, *v)| pattern[o] = v.fetch(0) {o}}",

			"[10, 12, 14, 18, 24].each {|sz|\n" +
"  TkRadioButton.new(f_left) {\n" +
"    text \"Point Size\"\n" +
"    variable size\n" +
"    relief 'flat'\n" +
"    value sz\n" +
"    tristatevalue 'multi'\n" +
"  }.pack('side'=>'top', 'pady'=>2, 'anchor'=>'w', 'fill'=>'x')\n" +
"}",

			"array.collect {|e, *| e.to_s}",
			"puts	{|*args|}",
			"5.times	{|options[:directory]|}",
			"a.each	{ || nil }",
			"puts	{ |c|; print \"%02X\" % c }",
			"puts	{ |x| puts(x)  \n}",
			"puts	{|x,y| x+y}",
			"puts	{x*y}",
			"puts	{|x| puts(x)  }",
			"node.global_vars.find_all(){|id| id.name == @old_var}.each do |id|\n"	+
"        @result << Replacer.new_from_id(id, @new_var)\n"	+
"      end",

			"  string(string).unpack('U*').collect { |c|\n"	+
"        if map.has_key? c then map[c] else c end\n"	+
"     }.compact.pack('U*')",
		};

		parse(program_texts2, "expression");
		
	}

	public void test_command()
	{
		String[] program_texts = {
			"yield 5",
			"printf 1+1",
			"printf id ? \":in `'\":\"\"",
			"assert_equal [], [mixins(:tree_without_order_1), mixins(:tree_without_order_2)] - TreeMixinWithoutOrder.roots",
			" @c.get_fields('my-header').push 'junk'",
			"yield elt",
			"assert_equal -99, param.faultCode",
			"raise ::TypeError, \"must be a Float\"",
			"print 'hello'",
			"require 'xml/dom/builder'",
			"p [a.nodeName, a._getNamespaces(nil)]",

			"dst.push @last",

"task :clean do\n" +
"  CLEAN.each { |fn| rm_r fn rescue nil }\n" +
"end",

		};

		parse(program_texts, "command");
	}

	public void test_block_var()
	{
		String[] program_texts = {
			"(orig, new)",
			"(name, )",
		};

		parse(program_texts, "block_var");
	}

	public void test_methodCall()
	{
		String[] program_texts = {
			"yield(5)",
			"yield()",
			"test(&:readonly?)",
			"load({[]=>\"\"}.to_yaml)",
			"gsub(%r{([^ \\t\\r\\n\\[\\{\\(])\\'})",
			"super(element, context, *rest)",
			"regular(1, *[2, 3, 4])",
			"block(&aProc)",
			"puts (\"hello\")",
			"puts() {}",
			"puts (1)",
			"puts (a,b,c)",
			"puts (:msg)",
			"puts (a)",
			"puts ((a))",
			"puts (a,b, 3)",
			"puts ((1),b, (c))",
			"f {}",
		};

		parse(program_texts, "methodCall");
	}

	public void test_dotColonOrArrayAccess()
	{
		String[] program_texts = {
			"1.-@",
			"yield[2]",
			"yield.to_s",
			"in_assigned.map{|i| i.name}",
			"out_vars.map{|i| i.name}",
			"(ARGV.shift || 9001).to_i",
			"Hello.new",
			"(1..param_size).collect { |i| \"p#{i}\" }",
			"%w(channel image textinput).each do |x|\n      install_have_child_element(x)\n    end",
			"'::blt::tile::button'.freeze",
			"refertence.end",
			"5.times {puts 'A'}",
			"var",
			"    puts (:msg ) ",
			"3",
			":symbol",

			//elementReference
			"get_val[][0]",
			"(@sock.peeraddr)[0]",
			"\"0123456789ABCDEF\"[(value>>4)&15,1]",
			"%w(folder openfold)[idx]",
			"args[-1]",
			"ARGV[0][0, pos + 1]",
			"a[0]",
			"properties[\"West/Width\"]",

			//colonAccess
			"@db_class::WidgetClassName",
			"Foo::Bar()",
			"self::class::RequestField",


			//dotAccess
			"@value.[]( *k )",
			"plugin[\"/system/ui/commands\"].manager",
			"@@services[host][port].stop",

"HelloWorldServer.new(\n" +
"    :SSLVerifyClient =>\n" +
"      OpenSSL::SSL::VERIFY_FAIL_IF_NO_PEER_CERT|OpenSSL::SSL::VERIFY_PEER,\n" +
"    :SSLClientCA => cert('files/ca.cert')\n" +
"  )",
			"GetoptLong.new(\n  [\"--file\", \"-f\", GetoptLong::REQUIRED_ARGUMENT ]		\n)",
			"opts.on_tail(\"--help\", \"show this message\") {puts opts; exit}",
			"c.unpack(\"U\")[0]",
			"extp.parse(open(systemId).read)",
			"File.dirname(@logFile)",
			"@plugin.properties[\"West/Width\"]",
			"File.dirname(@logFile).split(File::SEPARATOR)",
			"FreeBASE::Core.startup(\"freebase.yaml\", \"default.yaml\")",
			"Tk::Iwidgets::Watch.new(:state=>:disabled, :showampm=>:no)",
			"self.class::Racc_debug_parser",
			"(msg.backtrace || []).join(\"\n\")",
			"3.times (a)",
			"0 . times( 3)",
			"@handle.do(statement, *bindvars) ",
			"Foo.Bar()",
			"a._getNamespaces(nil)",
			"p.setBase(ARGV[0][0, pos + 1])",
			"self.<<(*args)",
			"5.times() {puts 'A'}",
			"[1..-1]",
			"[a.nodeName, a._getNamespaces(nil)]",
			"['::blt::tile::button'.freeze].freeze",

			"{ 'width'=>10 * v.width, "+
"                'arrowshape'=>[10*v.a, 10*v.b, 10*v.c], "+
"                'arrow'=>'last' "+
"              }.update(v.bigLineStyle)",
		};

		parse(program_texts, "dotColonOrArrayAccess");
	}

	public void test_symbol()
	{
		String[] program_texts = {
			":[]=",
			":#{cmd_name}",
			":`",
			":&",
			":true",
			":`",
			":+@",
			":-@",
			":'hello'",
			":\"#hello\"",
			":\"#{var}\"",
			":test=",
			":@@CONSTANT",
			":@var",
			":$a",
			":function?",
			":function!",
			":if",
			":var",
			":var?",
			":var!",
			":var1",
			":_var1",
			":def",
			":A",
			":Z",
			":A_",
			":Abc",
			":B2",
			":PI",
			":MyClass3",
			":hey",
			":_",
			":_1",
			":_a",
			":_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000",
		};

		parse(program_texts, "symbol");
	}

	public void test_regex()
	{
		String[] program_texts = {
			"/#{$/}\\z/o",
			"/\\A\\s*#{START}\\s/um",
			"/hey there #{myname}/o",
			"/#{IAC}(\n         (#{IAC}#{IAC}|[^#{IAC}])+#{IAC}#{SE})/",
			"%r/hey there #{myname}/o",
		};

		parse(program_texts, "regex");
	}
	
}


