/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ArrayExpressionTest extends TestingAstTestCase {
	public void test_array() {
		String program_text = "[1, 'xxx', 1.2]";
		
		String expected_result = 
"[:3\n" +
"[\n1\n]\n" +
"[\nxxx\n]\n" +
"[\n1.2\n]\n" +
"]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty() {
		String program_text = "[ ]";
		String expected_result = 
"[:0\n]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty2() {
		String program_text = "[]";
		String expected_result = 
"[:0\n]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk() {
		String program_text = "[*[1, 2]]";
		
		String expected_result = 
			"[:0\n" +
			"[\n" +
			"[:2\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"]!\n" +
			"]*\n" +
			"]!\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
