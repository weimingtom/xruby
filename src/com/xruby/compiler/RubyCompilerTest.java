/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import junit.framework.*;
import java.io.*;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;
import com.xruby.compiler.codegen.*;

public class RubyCompilerTest extends TestCase {

	public void setUp() {
		RubyRuntime.initBuiltin();
	}
	
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
				assertTrue("Error at " + i + ": " + e.toString(), false);
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

				assertEquals("Failed at " + i, outputs[i], output.toString());
			} catch (RubyException e) {
				assertTrue("RubyException at " + i + ": " + e.toString(), false);
			} catch (RecognitionException e) {
				assertTrue("RecognitionException at " + i + ": " + e.toString(), false);
			} catch (TokenStreamException e) {
				assertTrue("TokenStreamException at " + i + ": " + e.toString(), false);
			} catch (CompilerException e) {
				assertTrue("CompilerException at " + i + ": " + e.toString(), false);
			} catch (InstantiationException e) {
				assertTrue("InstantiationException at " + i + ": " + e.toString(), false);
			} catch (IllegalAccessException e) {
				assertTrue("IllegalAccessException at " + i + ": " + e.toString(), false);
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
				"1 + 2 + 3 -0 + 100", "6- 5 *2 + 100 - 6", "4.div 2", };
		int[] results = { 4, 100, 0, 664320, 256, -2, 30, 50, 0, 1, 106, 90, 2};

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
		String[] program_texts = { "1.to_i", "0.to_int", "123.to_i.to_int.to_i",  "\"500\".to_i"};
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
			assertTrue("Error : " + e.toString(), false);
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
				
				"def f(a); a; end; print f('yyy')",
		};

		String[] outputs = {
				"123",
				"456",
				"xxx",
				"nil",
				"123",
				"yyy",
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

				"def f(a); a = 1; end;  x = 100; f(x); print x",
				"def f(x); x= 5; print x; end; f(4)",
		};

		String[] outputs = {
				"123",
				":)",
				"888:)",
				"100",
				"5",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_class() {
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
	
	public void test_class_inheritence() {
		String[] program_texts = {
			"class B\n" +
			"	def say\n" +
			"		print 7654\n" +
			"	end\n" +
			"end\n" +
			"\n" +
			"class S < B\n" +
			"end\n" +
			"\n" +
			"S.new.say",
			
			"def B\n" +
			"	print 999\n" +
			"end\n" +
			"\n" +
			"class B\n" +
			"	def hello\n" +
			"		print 7654\n" +
			"	end\n" +
			"end\n" +
			"\n" +
			"class S < B\n" +
			"end\n" +
			"\n" +
			"S.new.hello\n" +
			"B()",
			
			"def B\n" +
			"	print 999\n" +
			"end\n" +
			"\n" +
			"class B\n" +
			"	def hello\n" +
			"		print 4567\n" +
			"	end\n" +
			"end\n" +
			"\n" +
			"class S < B\n" +
			"end\n" +
			"\n" +
			"S.new.hello\n" +
			"B",    //<-- B should resolved as class B, not method B() 
			
		};
		
		
		
		String[] outputs = {
				"7654",
				"7654999",
				"4567",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_class_inheritence_exception() {
		String[] program_texts = {
				"B = 1\n" +
				"class S < B\n" +
				"end\n" +
				"\n" +
				"S.new.hello",
				
				"class C;end; class C < String;end",
		};
		
		RubyException[] exceptions = {
			new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (Fixnum given)"),
			new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class C"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
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

				"if false then" +
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

				"a =unless true then" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end\n" +
				"\n" +
				"print a",
				
				"$bad = false; unless $x == $x; $bad = true; end; print $bad"
		};

		String[] outputs = {
				"111",
				"222",
				
				"false",
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
	
	public void test_not_equal() {
		String[] program_texts = {
				"print 'abc'!=123",
				"print 'abc'!='abc'",
		};
		
		String[] outputs = {
				"true",
				"false",
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
				"$x = '0'; print $x == $x",
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
				"true && (print 'xxx')",
				"false && (print 'xxx')",
				"false || (print 'xxx')",
				"true || (print 'xxx')",
		};

		String[] outputs = {
				"nil",
				"xxx",
				"1",
				"5678",
				"xxx",
				"",
				"xxx",
				"",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_not() {
		String[] program_texts = {
				"print !true",
				"print !false",
		};

		String[] outputs = {
				"false",
				"true",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_symbol() {
		String[] program_texts = {
				"print :hello1.id2name",
				"print :hello2.to_a",
				"print :fred.inspect",
				"print :next.to_a",
				"print :<<",
				"print :eql?",
		};

		String[] outputs = {
				"hello1",
				"hello2",
				":fred",
				"next",
				"<<",
				"eql?",
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
				"a = 'java -y';print `#{a}`",
		};

		String[] outputs = {
				"Unrecognized option: -x\nCould not create the Java virtual machine.\n",
				"Unrecognized option: -y\nCould not create the Java virtual machine.\n",
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
		String program_text1 = "print 'xxxxx'; REQUIRE_2_FILES = 1";
		RubyCompiler compiler1 = new RubyCompiler();
		CompilationResults codes1 = compiler1.compile(new StringReader(program_text1));
		File file1 = new File("test_require1.jar");
		assertFalse(file1.exists());
		codes1.save("test_require1");
		assertTrue(file1.exists());

		String program_text2 = "print 'yyyyy', REQUIRE_2_FILES";
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
					"xxxxxyyyyy1",
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
				
				"3.times {|x, y| print x, y}",
		};

		String[] outputs = {
				"haha",
				"Ho!Ho!Ho!",
				"01234",
				"5nil",
				"6699",
				"0nil1nil2nil",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_yield_in_block() {
		String[] program_texts = {
				"def f; 2.times {yield} ; end;   f {print '5'}",
				"def f; 2.times { 3.times {yield}} ; end;   f {print '5'}",
		};
		
		String[] outputs = {
				"55",
				"555555",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_block_binding_scope() {
		String[] program_texts = {
				"a=1;   4.times {print a}",
				"def f(a); 1.times {print a} end; f 101",
				"a = 1; 5.times {|a| print a;}; print a",
				"5.times {b = 3; print b;}",
				"a=1;   4.times {a=2; print a};  print a",
				"a = 1; 5.times {a = 9}; print a",
				"a = 1; 5.times {|a| a = 9; print a;}; print a",
				"a = 1; 5.times {|a| print a; a = 9; print a;}; print a",
				"a = 1; 5.times {|a| print a; if false; a = 9; end; print a;}; print a",
				"a = 1; 5.times {|*a| print a}; print a",
				"a = 1; 4.times {|*a| a = 6; print a}; print a",
				
				"def f(x); 1.times { x = 5} ; print x;  end;   f(1)",
		};
		
		String[] outputs = {
				"1111",
				"101",
				"012344",
				"33333",
				"22222",
				"9",
				"999999",
				"09192939499",
				"00112233444",
				"012344",
				"66666",
				
				"5",
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
				"def e; print 'bbb'; end; alias :f :e ; f",

				"class TestAliasMethod\n" +
				"	def f\n" +
				"		print \"~~~~\"\n" +
				"	end\n" +
				"	alias g f\n" +
				"end\n" +
				"TestAliasMethod.new.f",

				"class TestAliasMethod2\n" +
				"	def f\n" +
				"		print \"3333\"\n" +
				"	end\n" +
				"	alias g f\n" +
				"end\n" +
				"TestAliasMethod2.new.g",
		};

		String[] outputs = {
				"qqq",
				"aaa",
				"bbb",
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
				"def b; print 'qqq'; end; undef :b; b",

		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.NameErrorClass, "public method 'f123' can not be found in 'CTest'"),
			new RubyException(RubyRuntime.NameErrorClass, "method 'a' can not be found in 'Object'"),
			new RubyException(RubyRuntime.NameErrorClass, "method 'b' can not be found in 'Object'"),
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
				
				"print self",
		};

		String[] outputs = {
				"2",
				"4",
				"Object",
				"Class",
				"main",
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
				
				" class MyClass\n" +
				"   @one = 1\n" +
				"   def do_something\n" +
				"     @one = 2\n" +
				"   end\n" +
				"   def output\n" +
				"     print @one\n" +
				"   end\n" +
				" end\n" +
				" instance = MyClass.new\n" +
				" instance.output\n" +
				" instance.do_something\n" +
				" instance.output",
		};

		String[] outputs = {
				"nil",
				"234",
				"123",
				"nil2",
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
				
				" class MyClass\n" +
				"   @@value = 1\n" +
				"   def add_one\n" +
				"     @@value= @@value + 1\n" +
				"   end\n" +
				"   \n" +
				"   def value\n" +
				"     @@value\n" +
				"   end\n" +
				" end\n" +
				" instanceOne = MyClass.new\n" +
				" instanceTwo = MyClass.new\n" +
				" print instanceOne.value\n" +
				" instanceOne.add_one\n" +
				" print instanceOne.value\n" +
				" print instanceTwo.value",
		};

		String[] outputs = {
				"567",
				"123",
				"122",
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
				
				"a,=*[1]; print a, a.class",
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
				
				"1Fixnum",
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
	
	public void test_nested_assignment() {
		String[] program_texts = {
				"b, (c, d), e = 1,2,3,4; print b, c, d, e",
				"b, (c, d), e = 1,[2,3,4],5; print b, c, d, e",
				"b, (c,*d), e = 1,[2,3,4],5; print b, c, d, d.class, e",
		};
		
		String[] outputs = {
				"12nil3",
				"1235",
				"1234Array5",
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

	public void test_loop_no_block_given() {
		String[] program_texts = {
				"loop",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.LocalJumpErrorClass, "in `loop': no block given"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}
	
	public void test_loop() {
		String[] program_texts = {
				"a = loop do break; end; print a",
		};
		
		String[] outputs = {
				"nil",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_next_in_block() {
		String[] program_texts = {
				"def f; a= yield; print a; end; f {next 1}",
				"def f; a= yield; print a, a.class; end; f {next *nil}",
		};
		
		String[] outputs = {
				"1",
				"nilNilClass",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_range_exception() {
		String[] program_texts = {
				"1 .. 'x'",
				"'x' ... 3",
				"'x' ... 'y'",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range"),
			new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range"),
			new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}

	public void test_range_case_equal() {
		String[] program_texts = {
				"a = 1..3; print a === 0",
				"a = 1..3; print a === 1",
				"a = 1..3; print a === 2",
				"a = 1..3; print a === 3",
				"a = 1..3; print a === 4",
				
				"a = 1...3; print a === 3",
				
				"a = 1...3; print a === 'x'",
				
		};
		
		String[] outputs = {
				"false",
				"true",
				"true",
				"true",
				"false",
				
				"false",
				
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_regex_case_equal() {
		String[] program_texts = {
				"print /^f.*r$/ === 'foobar'",
				"print /hello/ === '1234'",
				
		};
		
		String[] outputs = {
				"true",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_regex_match() {
		String[] program_texts = {
				"print /(.)(.)(\\d+)(\\d)/.match(\"THX1138.\")",
		};
		
		String[] outputs = {
				"HX1138",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_RegexpExpressionSubstitution() {
		String [] program_texts = {
				"print /^f#{}.*r#{   }$/ === 'foobar'",
				"a = 'f.*r'; print /^#{a}$/ === 'foobar'",
		};
		
		String[] outputs = {
				"true",
				"true",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	
	public void test__FILE__() {
		String [] program_texts = {
				"print __FILE__",
		};
		
		String[] outputs = {
				"-",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test__LINE__() {
		String [] program_texts = {
				"print __LINE__  \n print __LINE__   \n\n   print __LINE__",
		};
		
		String[] outputs = {
				"124",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_StringExpressionSubstitution() {
		String [] program_texts = {
				"print \"abc#{}opq#{   }xyz\"",
				"$a=1;$b= 2;print \"abc#$a opq#$b xyz\"",
				"a=3;b= 4;print \"abc#{a}opq#{  b }xyz\"",
				"a=1;print \"abc#{a=a+1}\"; print a",
		};
		
		String[] outputs = {
				"abcopqxyz",
				"abc1 opq2 xyz",
				"abc3opq4xyz",
				"abc22",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_File() {
		File file = new File("test_File.txt");
		file.delete();
		assert(!file.exists());
		
		String [] program_texts = {
				"f = open('test_File.txt', 'w'); print f.class; print f.close",
		};
		
		String[] outputs = {
				"Filenil",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
		
		assertTrue(file.exists());
		assertTrue(file.delete());
	}
	
	public void test_wrong_number_of_arguments() {
		String[] program_texts = {
				"def f(a) end; f",
				"def f(a, b, c) end; f(1)",
				"def f(a, b, c=2) end; f(1)",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)"),
			new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (1 for 3)"),
			new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (1 for 2)"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}

	public void test_default_argument() {
		String [] program_texts = {
				"def f(a = 5432) print a; end; f 666",
				"def f(a = 5432) print a; end; f",
				"def f(a = 111, b = 222) print a, b; end; f",
				"def f(a = 111, b = 222) print a, b; end; f 333",
				"def f(a = 111, b = 222) print a, b; end; f 333, 444",
				"def x; 99; end;  def f(a=x()) print a; end; f",
				"def f(a=x()) print a; end; print 'hi'; def x; print 'x';99; end;  f",
				"def f(a=x()) print a; end; print 'hi'; def x; print 'x';99; end;  f 88",
		};
		
		String[] outputs = {
				"666",
				"5432",
				"111222",
				"333222",
				"333444",
				"99",
				"hix99",
				"hi88",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_module() {
		String [] program_texts = {
				"module TestModule; end; print TestModule.class",
				"module TestModule; end; print TestModule",
		};
		
		String[] outputs = {
				"Module",
				"TestModule",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_top_level_include_module() {
		String [] program_texts = {
				"module TestTopLevelIncludeModule\n" +
				"	def test_top_level_include_module\n" +
				"		print 77777\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"include TestTopLevelIncludeModule\n" +
				"test_top_level_include_module",
				
				"module TestTopLevelIncludeModule\n" +
				"	@@var = 100\n" +
				"	\n" +
				"	def test_top_level_include_module\n" +
				"		print @@var\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"include TestTopLevelIncludeModule\n" +
				"test_top_level_include_module",
				
				"module TestTopLevelIncludeModule1\n" +
				"	def g\n" +
				"		print \"B1\"\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"module TestTopLevelIncludeModule2\n" +
				"	def g\n" +
				"		print \"B2\"\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"include TestTopLevelIncludeModule1\n" +
				"include TestTopLevelIncludeModule2\n" +
				"g",
				
				"module TestTopLevelIncludeModule3\n" +
				"end\n" +
				"\n" +
				"include TestTopLevelIncludeModule3\n" +
				"\n" +
				"module TestTopLevelIncludeModule3\n" +
				"	def test_top_level_include_module2\n" +
				"		print 8765\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"test_top_level_include_module2",
		};
		
		String[] outputs = {
				"77777",
				"100",
				"B2",
				"8765",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_include_wrong_type() {
		String[] program_texts = {
				"include 'x'",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type String (expected Module)"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}
	
	public void test_class_and_module_name_conflict() {
		String[] program_texts = {
				"module TestNameConflict;end; class  TestNameConflict;end",
				"class  TestNameConflict2;end; module TestNameConflict2;end;",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.TypeErrorClass, "TestNameConflict is not a class"),
			new RubyException(RubyRuntime.TypeErrorClass, "TestNameConflict2 is not a module"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}
	
	public void test_class_module_in_class_module() {
		String [] program_texts = {
				"module ConstantInModule\n" +
				"	class C\n" +
				"		def f\n" +
				"			print \"MCf\"\n" +
				"		end\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"ConstantInModule::C.new.f",
				
				"class ConstantInModule2\n" +
				"	class C\n" +
				"		def f\n" +
				"			print \"MCf2\"\n" +
				"		end\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"ConstantInModule2::C.new.f",
		};
		
		String[] outputs = {
				"MCf",
				"MCf2",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_constant_in_class_module() {
		String [] program_texts = {
				"TestConstant = 1999; print ::TestConstant",
				"::TestConstant0 = 9991; print ::TestConstant0",
				"module ConstantInModule; ABC = 123; end; print ConstantInModule::ABC",
				"C1 = 9;module TestConstant1;C1 = 10;print C1;end",
				"C2 = 9;module TestConstant2;C2 = 10;print ::C2;end",
				"C3 = 9;module TestConstant3;C3 = 11;print self::C3;end",
				"C4 = 8;module TestConstant4;print C4;end",
				
				"C5 = 5\n" +
				"class TestConstant5\n" +
				"	def f\n" +
				"		print C5\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"TestConstant5.new.f",
		};
		
		String[] outputs = {
				"1999",
				"9991",
				"123",
				"10",
				"9",
				"11",
				"8",
				
				"5",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_constant_in_module_exception() {
		String[] program_texts = {
				"CONSTANT_IN_MODULE_EXCEPTION_XXX",
				"module ConstantInModuleException; end; ConstantInModuleException::B",
				"a=1; a::B",
				"ConstantInModuleException2=9; ConstantInModuleException2::B",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant CONSTANT_IN_MODULE_EXCEPTION_XXX"),
			new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant ConstantInModuleException::B"),
			new RubyException(RubyRuntime.TypeErrorClass, "1 is not a class/module"),
			new RubyException(RubyRuntime.TypeErrorClass, "9 is not a class/module"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}
	
	public void test_initialize() {
		String [] program_texts = {
				"class TestInitialize\n" +
				"	def initialize\n" +
				"		print \"in initialize\"\n" +
				"	end\n" +
				"end\n" +
				"	\n" +
				"TestInitialize.new",
				
				"print String.new('xxx')",
		};
		
		String[] outputs = {
				"in initialize",
				
				"xxx",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_attr_reader() {
		String [] program_texts = {
				"class TestAttrReader\n" +
				"	attr_reader :a\n" +
				"\n" +
				"	def initialize\n" +
				"		@a = 5\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"print TestAttrReader.new.a",
				
				"class TestAttrReader2\n" +
				"	attr_reader 'a'\n" +
				"\n" +
				"	def initialize\n" +
				"		@a = 6\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"print TestAttrReader2.new.a",
		};
		
		String[] outputs = {
				"5",
				"6",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_attr_reader_exception() {
		String[] program_texts = {
				"module AttrReaderException; attr_reader 1; end",
		};

		RubyException[] exceptions = {
			new RubyException(RubyRuntime.ArgumentErrorClass, "1 is not a symbol"),
		};

		compile_run_and_catch_exception(program_texts, exceptions);
	}
	
	public void test_assignment_method() {
		String [] program_texts = {
				"class TestAssignmetMethod\n" +
				"	def a=(x)\n" +
				"		print \"fff\"\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"TestAssignmetMethod.new.a=4",
		};
		
		String[] outputs = {
				"fff",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_attr_writer() {
		String [] program_texts = {
				"class TestAttrWriter\n" +
				"	attr_writer :a\n" +
				"\n" +
				"	def get_a\n" +
				"		@a\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"x = TestAttrWriter.new; x.a = 5; print x.get_a",
		};
		
		String[] outputs = {
				"5",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_attr_accessor() {
		String [] program_texts = {
				"class TestAttrAccessor\n" +
				"	attr_accessor :a\n" +
				"end\n" +
				"\n" +
				"x = TestAttrAccessor.new; x.a = 5; print x.a",
		};
		
		String[] outputs = {
				"5",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_kind_of() {
		String [] program_texts = {
				"print(1.kind_of?(Object))",
				"print(1.kind_of?(Fixnum))",
				"print(1.kind_of?(Numeric))",
				"print(1.kind_of?(String))",
		};
		
		String[] outputs = {
				"true",
				"true",
				"true",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_instance_of() {
		String [] program_texts = {
				"print(1.instance_of?(Object))",
				"print(1.instance_of?(Fixnum))",
				"print(1.instance_of?(Numeric))",
				"print(1.instance_of?(String))",
		};
		
		String[] outputs = {
				"false",
				"true",
				"false",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_respond_to() {
		String [] program_texts = {
				"print 1.respond_to?('to_s')",
				"print 1.respond_to?(:to_s)",
				"print 1.respond_to?('no_such_method_xxx')",
				"print 1.respond_to?(:no_such_method_xxx)",
				"print 1.respond_to?(:lambda, true)",
				"print 1.respond_to?(:lambda)",
		};
		
		String[] outputs = {
				"true",
				"true",
				"false",
				"false",
				"true",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_singleton_method() {
		String [] program_texts = {
				"a = 'x'; def a.ffff; print 9521 end; a.ffff",
				
				"class TestSingletonClass; end\n" +
				"def TestSingletonClass.new_method;print 4321;end\n" +
				"TestSingletonClass.new_method\n",
				
				"class Class\n" +
				"	def test_meta\n" +
				"		print \"Test meta\"\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"Module.test_meta", 
		};
		
		String[] outputs = {
				"9521",
				"4321",
				"Test meta",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_if_unless_modifier() {
		String [] program_texts = {
				"print 123 if true",
				"print 123 if false",
				"print 456 unless false",
				"print 456 unless true",
				"print 1 if true if true",
		};

		String[] outputs = {
				"123",
				"",
				"456",
				"",
				"1",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}

	public void test_send() {
		String [] program_texts = {
				"print 'xx'.send(:length)",
				"print 1.__send__('+', 2)",
		};

		String[] outputs = {
				"2",
				"3",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_mehtod_and_call() {
		String [] program_texts = {
				"m = 'xx'.method(:length); print m.call",
				"m = 1.method('+'); print m.call(2)",
				"m = 1.method('+'); print m",
		};

		String[] outputs = {
				"2",
				"3",
				"#<Method: Fixnum#+>",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_Kernel_methods() {
		String [] program_texts = {
				"print 1.methods.include?('methods')",
				"print 1.methods.include?('no_such_method_xxxx')",
		};

		String[] outputs = {
				"true",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_implicit_hash() {
		String [] program_texts = {
				"def f a; print a.class, a['a'], a['b']; end\n" +
				"f 'a' => 1, 'b' => 2",
		};

		String[] outputs = {
				"Hash12",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_block_arg() {
		String [] program_texts = {
				"def f &arg; print arg.class; end;   f {}",
				"def f &arg; print arg.class; end;   f",
				"def f(&arg); arg.call; end;   f {print 123}",
				"def f(&arg); arg.call(345); end;   f {|x| print x}",
				
				"def f\n" +
				"	yield\n" +
				"end\n" +
				"\n" +
				"def g &arg\n" +
				"	f &arg\n" +
				"end\n" +
				"\n" +
				"g {print 321}",
				
				"def f\n" +
				"	yield 222, 333\n" +
				"end\n" +
				"\n" +
				"def g &arg\n" +
				"	f &arg\n" +
				"end\n" +
				"\n" +
				"g {|x, y| print x, y}",
		};

		String[] outputs = {
				"Proc",
				"NilClass",
				"123",
				"345",
				
				"321",
				"222333",
		};

		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_super() {
		String [] program_texts = {
				"class MyString < String\n" +
				"	def to_s\n" +
				"		super\n" +
				"	end\n" +
				"end\n" +
				"print MyString.new(\"xxx\").to_s",
				
				"class TestSuper1\n" +
				"	def f\n" +
				"		yield\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"class TestSuper2 < TestSuper1\n" +
				"	def f\n" +
				"		super\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"TestSuper2.new.f {print \"yyy\"}",
				
				"class TestSuper3\n" +
				"	def f\n" +
				"		yield\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"class TestSuper4 < TestSuper3\n" +
				"	def f\n" +
				"		super {print \"zzz\"}\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"TestSuper4.new.f",
		};

		String[] outputs = {
				"xxx",
				"yyy",
				"zzz",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_heredoc() {
		String [] program_texts = {
				"print <<EOF\n" +
				"hey\n" +
				"EOF\n",
				
				"print <<EOF\n" +
				"  hey\n" +
				"EOF\n",
				
				"print <<-EOF\n" +
				"   hey\n" +
				" EOF\n",
				
				"print <<-EOF + 'xxx'\n" +
				"  hey\n" +
				" EOF\n",
				
				"print(<<EOF)\n" +
				" eee\n" +
				"EOF\n",
				
				"print <<-EOF + \"#{'yyy'}\"\n" +
				"  hey\n" +
				" EOF\n",
		};

		String[] outputs = {
				"hey\n",
				"  hey\n",
				"   hey\n",
				
				"  hey\n" +
				"xxx",
				
				" eee\n",
				
				"  hey\n" +
				"yyy",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_multiple_heredoc() {
		String [] program_texts = {
				"print <<EOF, 99, <<EOA\n" +
				" hey\n" +
				"EOF\n" +
				" there\n" +
				"EOA\n",
				
				"print <<-EOF, 99, <<-EOA\n" +
				" hello\n" +
				"  EOF\n" +
				" there\n" +
				"  EOA\n",
				
				"print <<-EOF + 'xxx' + <<-EOA\n" +
				" hello\n" +
				"  EOF\n" +
				" there\n" +
				"  EOA\n",
				
				"print <<-EOF + String.new('yyy') + <<-EOA\n" +
				" hello\n" +
				"  EOF\n" +
				" there\n" +
				"  EOA\n",
		};

		String[] outputs = {
				" hey\n" +
				"99 there\n",
				
				" hello\n" +
				"99 there\n",
				
				" hello\n" +
				"xxx there\n",
				
				" hello\n" +
				"yyy there\n",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_class_left_shift() {
		String [] program_texts = {
				"a = \"\"\n" +
				"class <<a\n" +
				"	def f\n" +
				"		99\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"print a.f",
				
				"class TestClassLeftShift\n" +
				"	class << self\n" +
				"		def f\n" +
				"			88\n" +
				"		end\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"print TestClassLeftShift.f",
				
				"class TestClassLeftShift\n" +
				"	class << TestClassLeftShift\n" +
				"		def f\n" +
				"			77\n" +
				"		end\n" +
				"	end\n" +
				"end\n" +
				"\n" +
				"print TestClassLeftShift.f",
		};

		String[] outputs = {
				"99",
				"88",
				"77",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_IO_gets() throws IOException {
		
		File f = new File("test_IO_gets.txt");
		PrintWriter out = new PrintWriter(new FileWriter(f));
		out.print("line 1\n");
		out.print("line 2");
		out.close();
		
		String [] program_texts = {
				"f = open(\"test_IO_gets.txt\"); print f.gets(nil); f.close",
				"f = open(\"test_IO_gets.txt\"); print f.gets; f.close",
		};
		
		String[] outputs = {
				"line 1\nline 2",
				"line 1",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
		
		assertTrue(f.delete());
	}
	
	public void test_IO_eof() throws IOException {
		File f = new File("test_IO_eof.txt");
		PrintWriter out = new PrintWriter(new FileWriter(f));
		out.print("line 1\n");
		out.print("line 2");
		out.close();
		
		String [] program_texts = {
				"f = open(\"test_IO_eof.txt\"); f.gets(nil); print f.eof?; f.close",
				"f = open(\"test_IO_eof.txt\"); print f.eof; f.close",
		};
		
		String[] outputs = {
				"true",
				"false",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
		
		assertTrue(f.delete());
	}
}
