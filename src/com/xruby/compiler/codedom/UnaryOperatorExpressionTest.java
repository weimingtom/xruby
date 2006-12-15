/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class UnaryOperatorExpressionTest extends TestingAstTestCase {
	public void test_negative_one() {
		String program_text = "-1";
		
		String expected_result = 
			"1\n" +
			"-@\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test_precedence_minus() {
		String program_text1 = "-1.to_s";
		String program_text2 = "(-1).to_s";
		assertAstEquals(program_text1, program_text2);
	}
	
	public void test_precedence_not() {
		String program_text1 = "!false.to_s";
		String program_text2 = "!(false.to_s)";
		assertAstEquals(program_text1, program_text2);
	}

}
