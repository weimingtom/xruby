/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class UnlessExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "unless true\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end";
		
		String expected_result = 
"true\n" +
"unless\n" +
"111\n" +
"end unless\n" +
"222\n" +
"end unless\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_optimazation() {
		String program_text = "unless false\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end";	
		
		String expected_result = 
"111\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
