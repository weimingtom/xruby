/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codedom;

public class MethodCallExpressionTest extends TestingAstTestCase {

	public void test_dot() {
		String program_text = "4.div 2";
		
		String expected_result = 
			"4\n" +
			"2\n" +
			"div:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test3() {
		String program_text = "puts 2.class";
		
		String expected_result = 
			"self\n" +
			"2\n" +
			"class:true\n" +
			"puts:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test4() {
		String program_text = "puts(1.class())";
		
		String expected_result = 
			"self\n" +
			"1\n" +
			"class:true\n" +
			"puts:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test5() {
		String program_text = "puts";
		
		String expected_result = 
			"self\n" +
			"puts:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test6() {
		String program_text = "puts 1, 2";
		
		String expected_result = 
			"self\n" +
			"1\n" +
			"2\n" +
			"puts:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_array_access() {
		String program_text = "a[1]";
		
		String expected_result = 
			"self\n" +
			"a:false\n" +
			"1\n" +
			"[]:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_array_access_2() {
		String program_text = "a=1; a[1]";
	
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"1\n" +
			"[]:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_more_array_access() {
		String program_text = "a[-1]";
		
		String expected_result = 
			"self\n" +
			"a:false\n" +
			"1\n" +
			"-@\n" +
			"[]:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_self_array_access() {
		String program_text = "self[0]";
		
		String expected_result = 
			"self\n" +
			"0\n" +
			"[]:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

	
	public void test_command() {
		String program_text = "puts `java -x`";
		
		String expected_result =
			"self\n" +
			"`java -x`\n" +
			"puts:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_UNARY_PLUS_MINUS_METHOD_NAME() {
		String program_text = "1.-@";
		
		String expected_result =
			"1\n" +
			"-@:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_command_and_operator() {
		String program_text = "print /hello/ === 'xxxhello123'";
		
		String expected_result =
			"self\n" +
			"/hello/\n" +
			"xxxhello123\n" +
			"===\n" +
			"print:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);

	}
	
	public void test_implicit_hash() {
		String program_text1 = "f('a' => 1, 'b' => 2)";
		
		String program_text2 = "f({'a' => 1, 'b' => 2})";
		
		assertAstEquals(program_text1, program_text2);
	}
	
	/*FIXME
	public void test_command_and_operator() {
		String program_text = "print (1..3) === 0");
		
		
		String expected_result =
			"self\n" +
			"1\n" +
			"3\n" +
			".. operator\n" +
			"0\n" +
			"===\n" +
			"print\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}*/
}
