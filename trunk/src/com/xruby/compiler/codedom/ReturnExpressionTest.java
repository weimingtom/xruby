/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
"[:3:3:false\n" +
"1\n" +
"2\n" +
"3\n" +
"]!\n" +
"return\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return_asterisk_nil() {
		String program_text = "return *nil";
		
		String expected_result = 
			"[:0:0:true\n" +
			"nil\n" +
			"[]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_return_asterisk_empty_array() {
		String program_text = "return *[]";
		
		String expected_result = 
			"[:0:0:true\n" +
			"[:0:0:false\n" +
			"]!\n" +
			"[]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
