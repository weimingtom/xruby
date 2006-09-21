/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser;

import java.io.StringReader;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;
import junit.framework.TestCase;

public class RubyTreeParserTest extends TestCase {
	public void test_ast() throws RecognitionException, TokenStreamException {
		String[] program_texts = {
				"a,=*[1]",
				"a,b,*c = nil",
				"a, b = 1",
				"*a = nil",
				"a = *[*[1,2]]",
				"a = 1, 2, 3",
				"a = *nil",
				"a = 1; b = 2; a, b = b, a",
				
				"[*[1, 2]]",
				
				"1.-@",
				"3.times",
				"3.times {}",
					
				"a = 2\n" +
				"while a > 1\n" +
				"true\n" +
				"end",
			
				"while false\n true end",
				
				"def f2\n" +
				"	return 'xxx'\n" +
				"end\n",

				"a = b = 1;puts b",

				"[]",
				"[1]",
				"a",
				"a [1]",
				"a[1]",
				
				"case 1\n" +
				"	when 1\n" +
				"		1\n" +
				"	else\n" +
				"		2\n" +
				"end",

				"if true\n" +
				"elsif false\n" +
				"else\n" +
				"end",

				"true;false;nil",
				
				"class C\n" +
				"	def f\n" +
				"		puts \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"C.new.f",
	
				"class MyClass ; end",
				"def my_methods() end",
				"puts(1.class())",
				"puts 1, 'hello'",
				"puts '1234'",
				"1 + 2 - 3",
				"1 + 2 * 3",
				"a = 1",
				"a=1",
				"a = b = 1",
				"def f\n end",
				"a.b.c",
				"o.f(1, 2, 3)",
				};

		String[] expected_texts = {
				" ( COMPSTMT ( PARALLEL_ASSIGN ( CALL a ) ( MRHS * ( [ 1 ) ) ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN ( CALL a ) b * c ( MRHS nil ) ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN ( CALL a ) b ( MRHS 1 ) ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN * a ( MRHS nil ) ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN a ( MRHS * ( [ * ( [ 1 2 ) ) ) ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN ( = a 1 ) 2 3 ) )",
				" ( COMPSTMT ( PARALLEL_ASSIGN a ( MRHS * nil ) ) )",
				" ( COMPSTMT ( = a 1 ) ( = b 2 ) ( PARALLEL_ASSIGN a b ( MRHS b a ) ) )",
				" ( COMPSTMT ( [ * ( [ 1 2 ) ) )",
				
				" ( COMPSTMT ( . 1 -@ ) )",
				" ( COMPSTMT ( . 3 times ) )",
				" ( COMPSTMT ( . 3 ( CALL times BLOCK ) ) )",

				" ( COMPSTMT ( = a 2 ) ( while ( > a 1 ) ( COMPSTMT true ) ) )",
				" ( COMPSTMT ( while false ( COMPSTMT true ) ) )",
				" ( COMPSTMT ( def f2 ( BODY ( COMPSTMT ( return ( ARG xxx ) ) ) ) ) )",
				
				" ( COMPSTMT ( = a ( = b 1 ) ) ( CALL puts ( ARG b ) ) )",
				" ( COMPSTMT [] )",
				" ( COMPSTMT ( [ 1 ) )",
				" ( COMPSTMT ( CALL a ) )",
				" ( COMPSTMT ( CALL a ( ARG ( [ 1 ) ) ) )",
				" ( COMPSTMT ( [ ( CALL a ) 1 ) )",
				" ( COMPSTMT ( case 1 when ( MRHS 1 ) ( COMPSTMT 1 ) else ( COMPSTMT 2 ) ) )",
				" ( COMPSTMT ( if true elsif false else ) )",
				" ( COMPSTMT true false nil )",
				" ( COMPSTMT ( class C ( BODY ( COMPSTMT ( def f ( BODY ( COMPSTMT ( CALL puts ( ARG ~~~~ ) ) ) ) ) ) ) ) ( . ( . C new ) f ) )",
				" ( COMPSTMT ( class MyClass ) )",
				" ( COMPSTMT ( def my_methods ) )",
				" ( COMPSTMT ( CALL puts ( ARG ( . 1 ( CALL class ) ) ) ) )",
				" ( COMPSTMT ( CALL puts ( ARG 1 hello ) ) )",
				" ( COMPSTMT ( CALL puts ( ARG 1234 ) ) )",
				" ( COMPSTMT ( - ( + 1 2 ) 3 ) )",
				" ( COMPSTMT ( + 1 ( * 2 3 ) ) )",
				" ( COMPSTMT ( = a 1 ) )",
				" ( COMPSTMT ( = a 1 ) )",
				" ( COMPSTMT ( = a ( = b 1 ) ) )",
				" ( COMPSTMT ( def f ) )",
				" ( COMPSTMT ( . ( . a b ) c ) )",
				" ( COMPSTMT ( . o ( CALL f ( ARG 1 2 3 ) ) ) )",
		};
		
		assertEquals(expected_texts.length, program_texts.length);
		
		for (int i = 0; i < program_texts.length; ++i) {
			RubyParser parser = new RubyParser(new StringReader(program_texts[i]));
			parser.createAST();
			AST ast = parser.getAST();
			String result = ast.toStringList();
			assertEquals(expected_texts[i], result);
		}
		
	}
	
}
