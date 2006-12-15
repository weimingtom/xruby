/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ReturnExpressionTest extends TestingAstTestCase {
	public void test_return_1() {
		String program_text = "return 1";
		
		String expected_result = 
"1\n" +
"return\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return() {
		String program_text = "return";
		
		String expected_result = 
"nil\n" +
"return\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return_1_2_3() {
		String program_text = "return 1, 2, 3";
		
		String expected_result = 
"[:3\n" +
"[\n1\n]\n" +
"[\n2\n]\n" +
"[\n3\n]\n" +
"]!\n" +
"return\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return_asterisk_nil() {
		String program_text = "return *nil";
		
		String expected_result = 
			"*[:0\n" +
			"[\n" +
			"nil\n" +
			"]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return_asterisk_empty_array() {
		String program_text = "return *[]";
		
		String expected_result = 
			"*[:0\n" +
			"[\n" +
			"[:0\n" +
			"]!\n" +
			"]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
