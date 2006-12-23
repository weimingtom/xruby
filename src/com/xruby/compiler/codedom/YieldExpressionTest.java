/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class YieldExpressionTest extends TestingAstTestCase {
	public void test_nil() {
		String program_text = "yield nil";
		
		String expected_result = 
			"yield\n" +
			"[:1\n" +
			"nil\n" +
			"end yield\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk_nil() {
		String program_text = "yield *nil";
		
		String expected_result = 
			"yield\n" +
			"*[:0\n" +
			"nil\n" +
			"[]*\n" +
			"end yield\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
}
