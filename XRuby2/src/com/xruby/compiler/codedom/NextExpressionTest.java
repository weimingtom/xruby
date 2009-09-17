/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class NextExpressionTest extends TestingAstTestCase {
	public void test_next_1() {
		String program_text = "next 1";
		
		String expected_result = 
			"1\n" +
			"next\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}