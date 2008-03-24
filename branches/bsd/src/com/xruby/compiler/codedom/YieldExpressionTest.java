/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codedom;

public class YieldExpressionTest extends TestingAstTestCase {
	public void test_nil() {
		String program_text = "yield nil";
		
		String expected_result = 
			"yield\n" +
			"nil\n" +
			"end yield\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk_nil() {
		String program_text = "yield *nil";
		
		String expected_result = 
			"yield\n" +
			"[:0:0:true\n" +
			"nil\n" +
			"[]*\n" +
			"]!\n" +
			"end yield\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
