/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class ArrayExpressionTest extends TestingAstTestCase {
	public void test_array() {
		String program_text = "[1, 'xxx', 1.2]";
		
		String expected_result = 
"[:3:0:false\n" +
"1\n" +
"xxx\n" +
"1.2\n" +
"]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty() {
		String program_text = "[ ]";
		String expected_result = 
"[:0:0:false\n]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty2() {
		String program_text = "[]";
		String expected_result = 
"[:0:0:false\n]!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk() {
		String program_text = "[*[1, 2]]";
		
		String expected_result = 
			"[:0:0:false\n" +
			"[:2:0:false\n" +
			"1\n" +
			"2\n" +
			"]!\n" +
			"[]*\n" +
			"]!\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
