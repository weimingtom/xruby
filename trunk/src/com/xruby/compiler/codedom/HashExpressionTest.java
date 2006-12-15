/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;


public class HashExpressionTest extends TestingAstTestCase {
	public void test_array() {
		String program_text = "{'a' => 'xxxx', 'b' => 'yyyy'}";
		
		String expected_result = 
"{!\n" +
"{\na\nxxxx\n}\n" +
"{\nb\nyyyy\n}\n" +
"}!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty() {
		String program_text = "{ }";
		
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_empty2() {
		String program_text = "{}";
		
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
