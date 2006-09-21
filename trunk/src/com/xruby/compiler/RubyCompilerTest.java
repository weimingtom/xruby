/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import junit.framework.*;
import java.io.*;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

public class RubyCompilerTest extends TestCase {

	private void compile_run_and_compare_result(String[] program_texts, int[] results) {
		assertEquals("the number of 'results' should match 'program_texts'",
				program_texts.length, results.length);

		for (int i = 0; i < program_texts.length; ++i) {
			RubyCompiler compiler = new RubyCompiler();

			try {
				CompilationResults codes = compiler.compile(new StringReader(program_texts[i]));
				assertTrue(null != codes);
				RubyValue v = codes.run();
				IntegerValue r = (IntegerValue)v.getValue();
				assertEquals(results[i], r.intValue());
			} catch (Exception e) {
				assertTrue("Error at " + i + ": " + e.getMessage(), false);
			}
		}
	}

	private void compile_run_and_catch_exception(String[] program_texts, RubyException[] exceptions) {
		assertEquals("the number of 'exception' should match 'program_texts'",
				program_texts.length, exceptions.length);

		for (int i = 0; i < program_texts.length; ++i) {
			RubyCompiler compiler = new RubyCompiler();

			try {
				CompilationResults codes = compiler.compile(new StringReader(program_texts[i]));
				assertTrue(null != codes);
				codes.run();
				assertTrue("Error at " + i + ": should throw RubyException", false);
			} catch (RubyException e) {
				assertEquals(exceptions[i], e);
				continue;
			} catch (Exception e) {
				assertTrue("Error at " + i + ": should throw RubyException, not exception", false);
			}
		}
	}

	private void compile_run_and_compare_output(String[] program_texts, String[] outputs) {
		assertEquals("the number of 'outputs' should match 'program_texts'",
				program_texts.length, outputs.length);

		for (int i = 0; i < program_texts.length; ++i) {
			RubyCompiler compiler = new RubyCompiler();

			try {
				CompilationResults codes = compiler.compile(new StringReader(program_texts[i]));
				assertTrue(null != codes);

				ByteArrayOutputStream output = new ByteArrayOutputStream();
				PrintStream original = System.out;
				System.setOut(new PrintStream(output));

				codes.run();

				System.setOut(original);

				assertEquals(outputs[i], output.toString());
			} catch (RubyException e) {
				assertTrue("RubyException at " + i + ": " + e.getMessage(), false);
			} catch (RecognitionException e) {
				assertTrue("RecognitionException at " + i + ": " + e.getMessage(), false);
			} catch (TokenStreamException e) {
				assertTrue("TokenStreamException at " + i + ": " + e.getMessage(), false);
			} catch (CompilerException e) {
				assertTrue("CompilerException at " + i + ": " + e.getMessage(), false);
			} catch (InstantiationException e) {
				assertTrue("InstantiationException at " + i + ": " + e.getMessage(), false);
			} catch (IllegalAccessException e) {
				assertTrue("IllegalAccessException at " + i + ": " + e.getMessage(), false);
			}
		}
	}

	public void test_raise() throws RecognitionException, TokenStreamException, CompilerException, InstantiationException, IllegalAccessException {
		String program_texts = "raise 'test'";
		RubyCompiler compiler = new RubyCompiler();
		CompilationResults codes = compiler.compile(new StringReader(program_texts));
		assertTrue(null != codes);
		try {
			codes.run();
		} catch (RubyException e) {
			RubyValue v = e.getRubyValue();
			assertEquals(v.getRubyClass(), RubyRuntime.RuntimeErrorClass);
			String s = (String)v.getValue();
			assertEquals("test", s);
			return;
		}

		assertTrue("You should not reach here!", false);
	}

	public void test_simple_integer() {
		String[] program_texts = { "2", "0", "123456", "0b1100110", "0xFF",
				"070", "+9", "-100"};
		int[] results = { 2, 0, 123456, 102, 255, 56, 9, -100};

		compile_run_and_compare_result(program_texts, results);
	}

	public void test_BinaryOperatorExpression() {
		String[] program_texts = { "2+2", "0 + 100", "0 + 0", "654321 + 9999",
				"0xFF + 1", "3 - 5", "3 * 5 * 2", "100/2", "4%2", "7%3",
				"1 + 2 + 3 -0 + 100", "6- 5 *2 + 100 - 6" };
		int[] results = { 4, 100, 0, 664320, 256, -2, 30, 50, 0, 1, 106, 90, };

		compile_run_and_compare_result(program_texts, results);
	}

	public void test_BinaryOperatorExpression2() {
		String[] program_texts = {
				"print 2 > 1",
				"print 2 == 1",
				"print 1 >= 0",
				"print 1 <=> 0",
				"print 9 <=> 9",
				"print 1 <=> 2",
				"print 1 <= 2",
		};

		String[] outputs = {
				"true",
				"false",
				"true",
				"1",
				"0",
				"-1",
				"true",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}


	public void test_simple_methodcall() {
		String[] program_texts = { "1.to_i", "0.to_i", "123.to_i.to_i.to_i",  "\"500\".to_i"};
		int[] results = { 1, 0, 123, 500};

		compile_run_and_compare_result(program_texts, results);
	}

	public void test_array() {
		String[] program_texts = { "[1, 'xxx', 1.2].length", "[].length",};
		int[] results = { 3, 0,};

		compile_run_and_compare_result(program_texts, results);
	}

	public void test_array_access() {
		String[] program_texts = {
				"[1.8, 24, 55][-1]",
				"[123][0]",
				"[1.8, 24, 35][2]",
				"a = [0, 9];a[1]",

		};
		int[] results = {
				55,
				123,
				35,
				9,
		};

		compile_run_and_compare_result(program_texts, results);
	}

	public void test_array_assignment() {
		String[] program_texts = {
				"a = [1, 2, 3];  a[0] = 9; print a[0]",
		};

		String[] outputs = {
				"9",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_array_expand() {
		String[] program_texts = {				
				"a = [5,6,[1, 2]]; print a, a.length",
				"a = [5,6,*[1, 2]]; print a, a.length",
				"a = [5,6,*1]; print a, a.length ",
				"a = [5,6,*nil]; print a, a.length",
				"a = [*nil]; print a, '|', a.length, a[0].class",
				"a = [*[1, 2]]; print a, '|', a.length, a[0].class",
		};

		String[] outputs = {
				"56123",
				"56124",
				"5613",
				"563",
				"|1NilClass",
				"12|2Fixnum",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_UNARY_PLUS_MINUS_METHOD_NAME() {
		String[] program_texts = {
				"print 1.-@",
				"print 2.-@ {}",
		};
		
		String[] outputs = {
				"-1",
				"-2",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_print() {
		String[] program_texts = {
				"print \"hello, world!\"",
				"print 2*3*10",
				"print 'x', 'y', 123",
				
				"print",
				"$_ = 'hello';   print;    $_ = nil",
				"$, = '|';    print 1,2,3;   $, = nil",
				"$\\ = '!';    print 1,2,3;   $\\ = nil",
				
				"print [5,6,7]",
				"print [ nil ]",
				"print [ nil ][0];",
		};

		String[] outputs = {
				"hello, world!",
				"60",
				"xy123",
				
				"nil",
				"hello",
				"1|2|3",
				"123!",
				
				"567",
				"",
				"nil",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_method_compile() {
		String program_texts =
			"def f\n" +
			"	print 123\n" +
			"end\n" +
			"f";
		RubyCompiler compiler = new RubyCompiler();

		try {
			CompilationResults codes = compiler.compile(new StringReader(program_texts));
			assertEquals(2, codes.size());
		} catch (Exception e) {
			assertTrue("Error : " + e.getMessage(), false);
		}
	}

	public void test_duplicate_method_run() {
		String[] program_texts = {
				"def f\n" +
				"	print 123\n" +
				"end\n" +
				"def f\n" +
				"	print 456\n" +
				"end\n" +
				"f",
		};

		String[] outputs = {
				"456",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_method_return() {
		String[] program_texts = {
				"def f\n" +
				" 123\n" +
				"end\n" +
				"print f()",

				"def f1\n" +
				" 456\n" +
				"end\n" +
				"print f1",

				"def f2\n" +
				"	return 'xxx'\n" +
				"end\n" +
				"print f2",
				
				"def r; return; end; a = r(); print a",
				
				"def f\n" +
				" return 1, 2, 3\n" +
				"end\n" +
				"print f()",
		};

		String[] outputs = {
				"123",
				"456",
				"xxx",
				"nil",
				"123",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_asterisk_parameter() {
		String[] program_texts = {
				"def my_print(*a)\n" +
				"	print a\n" +
				"end\n" +
				"my_print ':)', 5634 , 888",
				
				"def my_print(a, *b)\n" +
				"	print b, a\n" +
				"end\n" +
				"my_print ':)', 5634 , 888",
				
				"def my_print(*a)\n" +
				"	print a, a\n" +
				"end\n" +
				"my_print ':)', 5634 , 888",
		};

		String[] outputs = {
				":)5634888",
				"5634888:)",
				":)5634888:)5634888",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_method_run() {
		String[] program_texts = {

				"def f\n" +
				"	print 123\n" +
				"end\n" +
				"f",

				"def my_print(a)\n" +
				"	print a\n" +
				"end\n" +
				"my_print ':)'",

				"def my_print(a, b, c)\n" +
				"	print c\n" +
				"	print a\n" +
				"end\n" +
				"my_print ':)', 5634 , 888",
		};

		String[] outputs = {
				"123",
				":)",
				"888:)",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_class_run() {
		String[] program_texts = {
				"class C\n" +
				"	def f\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"C.new.f",

				"class C1\n" +
				"	def f\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"	def f\n" +
				"		print \"!!!\"\n" +
				"	end\n" +
				"end\n" +
				"C1.new.f",

				"class C2\n" +
				"	def f\n" +
				"		print \"????\"\n" +
				"	end\n" +
				"end\n" +
				"class C2\n" +
				"	def f2\n" +
				"		print \"*****\"\n" +
				"	end\n" +
				"end\n" +
				"C2.new.f2",

				"class C3\n" +
				"	def f1\n" +
				"		print \"????\"\n" +
				"	end\n" +
				"end\n" +
				"class C3\n" +
				"	def f2\n" +
				"		print \"*****\"\n" +
				"	end\n" +
				"end\n" +
				"C3.new.f1",
		};

		String[] outputs = {
				"~~~~",
				"!!!",
				"*****",
				"????",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_dot_class_method() {
		String[] program_texts = {
				"print 1.class\n" +
				"print 0.1.class\n" +
				"print 'hello'.class\n" +
				"print true.class\n" +
				"print false.class\n" +
				"print nil.class\n" +
				"print String.class",
				"print 1.class.class",
		};

		String[] outputs = {
				"Fixnum" +
				"Float" +
				"String" +
				"TrueClass" +
				"FalseClass" +
				"NilClass" +
				"Class",
				"Class",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_assign() {
		String[] program_texts = {
				"a = b = 12\n" +
				"print a\n",

				//"a = b = 'xxx'\n" +
				//"print b\n",

				"a = 999\n" +
				"print a\n",

				"a = b = 888\n" +
				"print a, b\n",

				"a = 777\n" +
				"a = 666\n" +
				"print a\n",

				"a = 555\n" +
				"b = a\n" +
				"print b\n",

				"a=5; a+=6; print a",
				"a = b = 1 + 2 + 3; print a, b ",
				"a = (b = 1 + 2) + 3; print a, b ",
		};

		String[] outputs = {
				"12",
				//"xxx",
				"999",
				"888888",
				"666",
				"555",
				"11",
				"66",
				"63",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_if() {
		String[] program_texts = {
				"if true\n" +
				"	print 1\n" +
				"else\n" +
				"	print 2\n" +
				"end",

				"if false\n" +
				"	print 1\n" +
				"else\n" +
				"	print 2\n" +
				"end",

				"if true\n" +
				"	print 'xxx'\n" +
				"end",

				"if false\n" +
				"	print 1\n" +
				"elsif true\n" +
				"	print 2\n" +
				"else\n" +
				"	print 3\n" +
				"end",
		};

		String[] outputs = {
				"1",
				"2",
				"xxx",
				"2",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_ternaryIfThenElseExpression() {
		String[] program_texts = {
				"print true ? 1: 2",
				"print false ? 1 : 2",
		};

		String[] outputs = {
				"1",
				"2",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_case() {
		String[] program_texts = {
				"print case 1\n" +
				"	when 1\n" +
				"		1234\n" +
				"	else\n" +
				"		2345\n" +
				"end",

				"print case 100\n" +
				"	when 1\n" +
				"		123\n" +
				"	when 2\n" +
				"		234\n" +
				"	when 3\n" +
				"		34\n" +
				"	else\n" +
				"		2245\n" +
				"end",

				"print case 3\n" +
				"	when 1\n" +
				"		123\n" +
				"	when 2\n" +
				"		234\n" +
				"	when 3\n" +
				"		34\n" +
				"	else\n" +
				"		2245\n" +
				"end",
		};

		String[] outputs = {
				"1234",
				"2245",
				"34",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_unless() {
		String[] program_texts = {
				"a =unless false\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end\n" +
				"\n" +
				"print a",

				"a =unless true\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end\n" +
				"\n" +
				"print a",
		};

		String[] outputs = {
				"111",
				"222",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_exception() {
		String[] program_texts = {
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"rescue RuntimeError\n" +
				"	print \"xxx\"\n" +
				"end",	

				"begin\n" +
				"	raise \"!!!!\"\n" +
				"rescue RuntimeError\n" +
				"	print \"aaa\"\n" +
				"end\n" +
				"print 'bbb'",

				"begin\n" +
				"	print 'zzz'\n" +
				"rescue RuntimeError\n" +
				"	print \"ccc\"\n" +
				"end\n" +
				"print 'ddd'",

				"begin\n" +
				"	raise \"!!!!\"\n" +
				"rescue RuntimeError\n" +
				"	print \"111\"\n" +
				"rescue RuntimeError\n" +
				"	print \"222\"\n" +
				"end",

				/*
				//FIXME 
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue RuntimeError => e\n" +
				"		print e\n" +
				"end",
				 */
		};

		String[] outputs = {
				"xxx",
				"aaabbb",
				"zzzddd",
				"111",
				//"!!!!",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_eval() {
		String[] program_texts = {
				"eval('print 54321')",	
		};

		String[] outputs = {
				"54321",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_equal() {
		String[] program_texts = {
				"print 'abc'==123",
				"print 'abc'=='abc'",
				"print 'abc'=='abcd'",
				"a = 'xxx'; b = 'xxx'; print a==b",
				"print nil==nil",
				"print 1==1",
				"print []==[]",
				"print [1, 2, 3]==[1, 2, 3]",
				"print [1, 2, 3]==[1, 2, 3, 4]",
				"a = nil; print a==nil",
				//"print :s == :s",
		};

		String[] outputs = {
				"false",
				"true",
				"false",
				"true",
				"true",
				"true",
				"true",
				"true",
				"false",
				"true",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_and_or() {
		String[] program_texts = {
				"print nil and 'xxx'",
				"print true && 'xxx'",
				"print 1 or 'yyyy'",
				"print false || 5678",
		};

		String[] outputs = {
				"nil",
				"xxx",
				"1",
				"5678",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_symbol() {
		String[] program_texts = {
				"print :hello1.id2name",
				"print :fred.inspect",
		};

		String[] outputs = {
				"hello1",
				":fred",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_global_variable() {
		String[] program_texts = {
				"$a = 1234; print $a",
				"$B = 'xyz'; print $B",
				"print $NO_SUCH_VARIABLE",
				"print $a0 = 'xxx'",

				"def f\n" +
				"	$G = 123\n" +
				"end\n" +
				"f\n" +
				"print $G",

				"def f\n" +
				"	$F0 = 123\n" +
				"end\n" +
				"print $F0",
		};

		String[] outputs = {
				"1234",
				"xyz",
				"nil",
				"xxx",
				"123",
				"nil",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_command_output() {
		String[] program_texts = {
				"print `java -x`",
		};

		String[] outputs = {
				"Unrecognized option: -x\nCould not create the Java virtual machine.\n",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_require() throws RecognitionException, TokenStreamException, CompilerException, FileNotFoundException, IOException {
		String program_text = "print 'xxxxx'";
		RubyCompiler compiler = new RubyCompiler();
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		File file = new File("test_require.jar");
		assertFalse(file.exists());
		codes.save("test_require");
		assertTrue(file.exists());

		try {
			String[] program_texts = {
					"require 'test_require'",
			};

			String[] outputs = {
					"xxxxx",
			};

			compile_run_and_compare_output(program_texts, outputs);
		} finally {
			assertTrue(file.delete());
		}
	}

	public void test_require_2_files() throws RecognitionException, TokenStreamException, CompilerException, FileNotFoundException, IOException {
		String program_text1 = "print 'xxxxx'";
		RubyCompiler compiler1 = new RubyCompiler();
		CompilationResults codes1 = compiler1.compile(new StringReader(program_text1));
		File file1 = new File("test_require1.jar");
		assertFalse(file1.exists());
		codes1.save("test_require1");
		assertTrue(file1.exists());

		String program_text2 = "print 'yyyyy'";
		RubyCompiler compiler2 = new RubyCompiler();
		CompilationResults codes2 = compiler2.compile(new StringReader(program_text2));
		File file2 = new File("test_require2.jar");
		assertFalse(file2.exists());
		codes2.save("test_require2");
		assertTrue(file2.exists());

		try {
			String[] program_texts = {
					"require 'test_require1';  require 'test_require2'",
			};

			String[] outputs = {
					"xxxxxyyyyy",
			};

			compile_run_and_compare_output(program_texts, outputs);
		} finally {
			assertTrue(file1.delete());
			assertTrue(file2.delete());
		}
	}

	public void test_require_2_files_with_global() throws RecognitionException, TokenStreamException, CompilerException, FileNotFoundException, IOException {
		String program_text1 = "$G010 = 'cccc'";
		RubyCompiler compiler1 = new RubyCompiler();
		CompilationResults codes1 = compiler1.compile(new StringReader(program_text1));
		File file1 = new File("test_require1.jar");
		assertFalse(file1.exists());
		codes1.save("test_require1");
		assertTrue(file1.exists());

		String program_text2 = "print $G010";
		RubyCompiler compiler2 = new RubyCompiler();
		CompilationResults codes2 = compiler2.compile(new StringReader(program_text2));
		File file2 = new File("test_require2.jar");
		assertFalse(file2.exists());
		codes2.save("test_require2");
		assertTrue(file2.exists());

		try {
			String[] program_texts = {
					"require 'test_require1';  require 'test_require2'",
			};

			String[] outputs = {
					"cccc",
			};

			compile_run_and_compare_output(program_texts, outputs);
		} finally {
			assertTrue(file1.delete());
			assertTrue(file2.delete());
		}
	}
	
	public void test_yield() {
		String[] program_texts = {
				"def f; yield *[[]]; end; f {|a| print a.class, a.length}",//a == []
				"def f; yield [[]]; end; f {|a| print a.class, a.length}",
				"def f; yield [[]]; end; f {|a,b,*c| print a,'!',b,'!',c}",
				"def f; yield *[[]]; end; f {|a,b,*c| print a,'|',b,'|',c}",//a == []
				
				"def f; yield []; end; f {|a,b,*c| print a, b, c, 3}",
				"def f; yield []; end; f {|a| print a, a.class}",
				"def f; yield []; end; f {|*a| print a, a.class, a.length, a[0].class}", //a == [[]]
				"def f; yield; end; f {|*a| print a}",
				"def f; yield; end; f {|a,b,*c| print a, b, c, 1}",
				"def f; yield nil; end; f {|a,b,*c| print a, b, c, 2}",
				"def f; ar = [1, 2,3,4]; yield ar; end; f {|a,b,*c| print c}",
				
				"def f; yield 1, 2; end; f {|a| print a, a.class}",
				"def f; yield 1, 2; end; f {|a, b| print a, b}",
				"def f; yield *[3, 4]; end; f {|a, b| print a, b}",
				"def f; yield [1]; end; f {|a| print a, a.class}",
				
				"def f; yield [nil]; end; f {|a| print a, a.class, '|', a.length}",
				"def f; yield nil; end; f {|a| print a}",
				"def f; yield *nil; end; f {|a| print a, a.class}",
		};

		String[] outputs = {
				"Array0",
				"Array1",
				"!nil!",
				"|nil|",

				"nilnil3",
				"Array",
				"Array1Array",
				"",
				"nilnil1",
				"nilnil2",
				"34",
				
				"12Array",
				"12",
				"34",
				"1Array",
				
				"Array|1",
				"nil",
				"nilNilClass",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_block() {
		String[] program_texts = {
				"def a\n" +
				"	yield(\"haha\")\n" +
				"end\n" +
				"a {|x| print x}",

				"3.times {print 'Ho!'}",

				"5.times do |i|\n" +
				"  print i\n" +
				"end",

				"def a\n" +
				"	print yield(5)\n" +
				"end\n" +
				"a {|x| print x}",

				"def a\n" +
				"	print yield(66)\n" +
				"end\n" +
				"a {|x| print x; 99}",

				/*FIXME
				"a=1;   4.times {print a}",
				"a=1;   4.times {a=2; print a};  puts a",
				"a = 1; 5.times {|a| print a;}",
				*/
		};

		String[] outputs = {
				"haha",
				"Ho!Ho!Ho!",
				"01234",
				"5nil",
				"6699",
				
				/*
				"1111",
				"22222",
				"01234",
				*/
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_alias_global_variable() {
		String[] program_texts = {
				"$a = 1234; alias $b $a; print $a",
				"$A = 'xyz'; alias $B $A; print $B",
				"$A = 'xyz'; alias $B $A; print $C",
				"$A = 'abcd'; alias $B $A; alias $C $B; print $C",
				"$X = 1234; alias $Y $X; $X = 2345; print $X",
				"$X = 1234; alias $Y $X; $X = 2345; print $Y",
		};

		String[] outputs = {
				"1234",
				"xyz",
				"nil",
				"abcd",
				"2345",
				"1234",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_alias_method() {
		String[] program_texts = {
				"def a; print 'qqq'; end; alias b a ; a",
				"def c; print 'aaa'; end; alias d c ; d",

				"class C\n" +
				"	def f\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"	alias g f\n" +
				"end\n" +
				"C.new.f",

				"class B\n" +
				"	def f\n" +
				"		print \"3333\"\n" +
				"	end\n" +
				"	alias g f\n" +
				"end\n" +
				"B.new.g",
		};

		String[] outputs = {
				"qqq",
				"aaa",
				"~~~~",
				"3333",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_undef_method() {
		String[] program_texts = {
				"class CTest\n" +
				"	def f123\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"	undef f123\n" +
				"end\n" +
				"CTest.new.f123",

				"def a; print 'qqq'; end; undef a; a",


		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.NameErrorClass, "public method 'f123' can not be found in 'CTest'"),
			new RubyException(RubyRuntime.NameErrorClass, "method 'a' can not be found in 'Object'"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}

	public void test_hash() {
		String[] program_texts = {
				//"print {}",
				//"h1 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h1",
				"h4 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h4.length",
				"h3 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h3['NO_SUCH_THING']",
				"h2 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h2['a']",
				"h5 = {'a' => 'xxxx', 1 => 'yyyy'}; print h5[1]",
				"h6 = {'a' => 'xxxx', 1 => 'yyyy'}; h6['a'] = 'zzz'; print h6['a']",
				"h7 = {}; h7['c'] = 1234; print h7['c']",
		};

		String[] outputs = {
				//"nil",
				//"axxxxbyyyy",
				"2",
				"nil",
				"xxxx",
				"yyyy",
				"zzz",
				"1234",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_while() {

		String[] program_texts = {
				"while false; print 'xxx'; end",
				"until true; print 'xxx'; end",

				"a = 0\n" +
				"while a > 1\n" +
				"    print 'xxx'\n" +
				"    a = 1\n" +
				"end",

				"a = 2\n" +
				"while a > 1\n" +
				"    print 'xxx'\n" +
				"    a = 1\n" +
				"end",
		};

		String[] outputs = {
				"",
				"",
				"",
				"xxx",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_self() {
		String[] program_texts = {
				"print 1.next",
				"print 2.next.next",
				"print self.class",

				"class A\n" +
				"	print self.class\n" +
				"end",
		};

		String[] outputs = {
				"2",
				"4",
				"Object",
				"Class",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_printf() {
		String[] program_texts = {
				"printf '%d %d %s', 1, 2, 'vvv'",
				"printf '###'",
				"printf '\\n'",
				"printf \"\\n\"",
		};

		String[] outputs = {
				"1 2 vvv",
				"###",
				"\\n",
				"\n",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_to_a() {
		String[] program_texts = {
				"print 1.to_a.class",
				"print 1.to_a",
				"print [1, 2, 3].to_a",
				"print nil.to_a.length",
		};

		String[] outputs = {
				"Array",
				"1",
				"123",
				"0",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_scope() {
		String[] program_texts = {
				"a = 5\n" +
				"class A\n" +
				"	a=9\n" +
				"	print a\n" +
				"end\n" +
				"print a",

		};

		String[] outputs = {
				"95",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_public() {
		String[] program_texts = {
				"class TestPublic1\n" +
				"	public\n" +
				"	def f\n" +
				"		print \"1111\"\n" +
				"	end\n" +
				"end\n" +
				"TestPublic1.new.f",
				
				"class TestPublic2\n" +
				"	private\n" +
				"	def f\n" +
				"		print \"2222\"\n" +
				"	end\n" +
				"	public :f\n" +
				"end\n" +
				"TestPublic2.new.f",
				
				"class TestPublic3\n" +
				"	private\n" +
				"	def f\n" +
				"		print \"3333\"\n" +
				"	end\n" +
				"	public 'f'\n" +
				"end\n" +
				"TestPublic3.new.f",
		};

		String[] outputs = {
				"1111",
				"2222",
				"3333",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_private_protected() {
		String[] bad_program_texts = {
	
				"class TestPrivateProtected1\n" +
				"	private\n" +
				"	def f\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"TestPrivateProtected1.new.pf",

				"class TestPrivateProtected2\n" +
				"	protected\n" +
				"	def test_private_protected2\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"TestPrivateProtected2.new.test_private_protected2",
				
				"class TestPrivateProtected3\n" +
				"	def tpp1\n" +
				"		print \"1111\"\n" +
				"	end\n" +
				"	private :tpp1\n" +
				"end\n" +
				"TestPrivateProtected3.new.tpp1",
				
				"class TestPrivateProtected4\n" +
				"	def test_private_protected4\n" +
				"		print \"1111\"\n" +
				"	end\n" +
				"	private :no_such_method\n" +
				"end\n",	
				
				"def test_private_protected5; end\n" +
				"Object.new.test_private_protected5",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.NameErrorClass, "public method 'pf' can not be found in 'TestPrivateProtected1'"),
			new RubyException(RubyRuntime.NameErrorClass, "public method 'test_private_protected2' can not be found in 'TestPrivateProtected2'"),
			new RubyException(RubyRuntime.NameErrorClass, "public method 'tpp1' can not be found in 'TestPrivateProtected3'"),
			new RubyException(RubyRuntime.NameErrorClass, "undefined method `no_such_method` for class `TestPrivateProtected4`"),
			new RubyException(RubyRuntime.NameErrorClass, "public method 'test_private_protected5' can not be found in 'Object'"),
		};

		compile_run_and_catch_exception(bad_program_texts, exceptions);
	}

	public void test_defined() {
		String[] program_texts = {
				"print defined? nil",
				"print defined? 123",
		};

		String[] outputs = {
				"nil",
				"expression",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_Array_concat() {
		String[] program_texts = {
				"x = [ 'a', 'b' ].concat( ['c', 'd'] ); print x, x.length",
		};

		String[] outputs = {
				"abcd4",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_instance_variable() {
		String[] program_texts = {
				"print @a",
				"@a= 234; print @a",
				
				"class TestInstanceVariable\n" +
				"	def f\n" +
				"		@a = 123\n" +
				"	end\n" +
				"	\n" +
				"	def display\n" +
				"		print @a\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"a = TestInstanceVariable.new\n" +
				"a.f\n" +
				"a.display",
		};

		String[] outputs = {
				"nil",
				"234",
				"123",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_class_variable() {
		String[] program_texts = {

				"@@a= 567; print @@a",
				
				"class TestClassVariable\n" +
				"	def f\n" +
				"		@@a = 123\n" +
				"	end\n" +
				"	\n" +
				"	def display\n" +
				"		print @@a\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"a = TestClassVariable.new\n" +
				"a.f\n" +
				"a.display",
		};

		String[] outputs = {
				"567",
				"123",
		};

		compile_run_and_compare_output(program_texts, outputs);
		
		String[] bad_program_texts = {
				"print @@no_scuh_variable",
		};
		
		RubyException[] exceptions = {
			new RubyException(RubyRuntime.NameErrorClass, "uninitialized class variable @@no_scuh_variable in Object"),	
		};
		
		compile_run_and_catch_exception(bad_program_texts, exceptions);
	}
	
	public void test_multiple_assignment_no_asterisk() {
		String[] program_texts = {
				"a, b = 3, 4; print a, b",
				"a = 1; b = 2;   a, b = b, a; print a, b",
				"a = 1; b = 2; c = 3;   a, b, c = b, a; print a, b, c",
				"a = 1; b = 2;   a, b = b, a, print(3); print a, b",
				
				"a = 1, 2, 3; print a.class, a",
				"a = 1, 2.5; print a",
		};
		
		String[] outputs = {
				"34",
				"21",
				"21nil",
				"321",
				"Array123",
				"12.5",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_multiple_assignment_asterisk_only_on_the_left() {
		String[] program_texts = {
			"*a = nil; print a.class, a.length, a[0]",
			"a, b, *c = 1, 2, 3, 4, 5; print a, b, c.class, c",
			"a,b,*c = nil; print a, b, c, c.class, c.length",
			"*a = 1, 2, 3, 4, 5; print a",
			"a, *b = 88, 99; print a, b, b.class",
			
			"a,b,*c = []; print a, '|', b, '|', c",
			"a,b,*c = [1, 2, 3]; print a, '|', b, '|', c",
			"*a = []; print a[0].class",
		};
		
		String[] outputs = {
			"Array1nil",
			"12Array345",
			"nilnilArray0",
			"12345",
			"8899Array",
			"nil|nil|",
			"1|2|3",
			"Array",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_multiple_assignment_asterisk_only_on_the_right() {
		String[] program_texts = {
				"a = *nil; print a",
				"a = *123; print a",
				"a = 1; b = *a; print b",
				"a = []; b = *a; print b, b.class",
				
				"x = [1, 2, 3]; a, b, c = *x; print a, ',', b, ',', c",
				"x = [1, 2, 3]; a, b = *x; print a, ',', b",
				"x = [1, 2, 3]; a = *x; print a, a.class, a.length",
				
				"x = [1, 2, 3]; a, b = 99, *x; print a, ',', b",
				"x = [1, 2, 3]; a, b = 88, 99, *x; print a, ',', b",
		};
		
		String[] outputs = {
				"nil",
				"123",
				"1",
				"nilNilClass",
				
				"1,2,3",
				"1,2",
				"123Array3",
				
				"99,1",
				"88,99",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_multiple_assignment_asterisk_on_both_sides() {
		String[] program_texts = {
				"a, *b = 1, *[2, 3]; print a, ',', b",
				"a, *b = 1, *2; print a, ',', b, b.class",
				"*a = *1; print a, a.class",
				"*a = *nil; print a, a.class",
				
				"*a = 1, 2, *[3, 4]; print a, '|', a.length",
				"a, *b = 1, 2, *[3, 4]; print a, '|', b, '|', b.length",
				
				"a, b, *c = 1, *[2, 3]; print a, '|', b, '|', c",
				"a, b, *c = 1, *[2, 3, 4]; print a, '|', b, '|', c",
				
				"a,b,*c = *[[]]; print a, b, c",
				
				
				
		};

		String[] outputs = {
				"1,23",
				"1,2Array",
				"1Array",
				"Array",
				
				"1234|4",
				"1|234|3",
				
				"1|2|3",
				"1|2|34",
				
				"nil",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_return() {
		String[] program_texts = {
				"def r; return 1;  end; a = r(); print 1",
				"def r; return *1; end; a = r(); print a, a.class",
				"def r; return []; end; a = r(); print a, a.class",
				"def r; return [*[]]; end; a = r(); print a, a.class, '*'",
				"def r; return *[[]]; end; a = *r(); print a",
				"def r; return *nil; end; *a = r(); print a.class, a.length, a[0]",	//a == [nil]
		};

		String[] outputs = {
				"1",
				"1Fixnum",
				"Array",
				"Array*",
				"nil",
				"Array1nil",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_lamda_proc() {
		String[] program_texts = {
				"a = lambda {print 'xxx'}; a.call",
				"a = lambda {|x| print x}; a.call('yyy')",
				"a = proc {|x, y| print x, y}; a.call(1, 2)",
				
				//FIXME "a = lambda {print self}; a.call",
				
		};

		String[] outputs = {
				"xxx",
				"yyy",
				"12",
				
				//FIXME "self",
				
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
}
