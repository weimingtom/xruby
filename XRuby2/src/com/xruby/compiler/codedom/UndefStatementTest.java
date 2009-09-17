/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class UndefStatementTest extends TestingAstTestCase {
	public void test_one() {
		String program_text = "undef a";
		
		String expected_result = 
"undef a\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_more() {
		String program_text = "undef a, b, c";
		
		String expected_result = 
"undef a\n" +
"undef b\n" +
"undef c\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
