/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class MethodDefinationExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "def my_methods() end";
		
		String expected_result = 
"def my_methods:0:false:0:false\n" +
"end def:false\n" +
"EOF";
		assertAstOutput(program_text, expected_result);		
	}
	
	public void test_default_parameter() {
		String program_text = "def my_methods(a, b = 1, c = 2) end";
		
		String expected_result = 
"def my_methods:3:false:2:false\n" +
"parameter:a\n" +
"parameter:b\n" +
"parameter:c\n" +
"DefaultParameterBegin:1\n" +
"1\n" +
"DefaultParameterEnd\n" +
"DefaultParameterBegin:2\n" +
"2\n" +
"DefaultParameterEnd\n" +
"end def:false\n" +
"EOF";
		assertAstOutput(program_text, expected_result);		
	}

	public void test_return() {
		String program_text = "def my_methods() return end";
		
		String expected_result = 
"def my_methods:0:false:0:false\n" +
"nil\n" +
"return\n" +
"end def:false\n" +
"EOF";
		assertAstOutput(program_text, expected_result);		
	}
	
	public void test_operator() {
		String program_text = "def &(anObject) end";
		
		String expected_result = 
"def &:1:false:0:false\n" +
"parameter:anObject\n" +
"end def:false\n" +
"EOF";
		assertAstOutput(program_text, expected_result);		
	}

	public void test2() {
		String program_text = "def my_methods() \n puts 123 \n yield\n  end     \n  my_methods";
		
		String expected_result = 
			"def my_methods:0:false:0:false\n" +
			"self\n" +
			"123\n" +
			"puts:false\n" +
			";\n" +
			"yield\n" +
			"end yield\n" +
			"end def:true\n" +
			";\n" +
			"self\n" +
			"my_methods:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_parameter() {
		String program_text = "def my_methods(a, b, c) \n  puts a  \n end";
		
		String expected_result = 
			"def my_methods:3:false:0:false\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"parameter:c\n" +
			"self\n" +
			"a\n" +
			"puts:false\n" +
			"end def:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_method_call_without_parameter() {
		String program_text1 = "def f\n" +
				" 123\n" +
				"end\n" +
				"print f()";
		
		String program_text2 = "def f\n" +
				" 123\n" +
				"end\n" +
				"print f";
		
		assertAstEquals(program_text1, program_text2);	
	}
	
	public void test_asterisk_parameter() {
		String program_text = "def my_methods(a, b, *c) \n  puts c  \n end";
		
		String expected_result = 
			"def my_methods:2:true:0:false\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"*parameter:c\n" +
			"self\n" +
			"c\n" +
			"puts:false\n" +
			"end def:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);		
	}
	
	public void test_astersisk_and_block_parameter() {
		String program_text = "def assert_raises(*args, &block) \n end";
		
		String expected_result = 
			"def assert_raises:0:true:0:false\n" +
			"*parameter:args\n" +
			"&parameter:block\n" +
			"end def:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);	
	}

}
