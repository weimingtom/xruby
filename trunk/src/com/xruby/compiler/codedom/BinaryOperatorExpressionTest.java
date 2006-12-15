/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class BinaryOperatorExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "2+4.5";
		
		String expected_result = 
"2\n"	+
"4.5\n"	+
"+\n"	+
"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test1() {
		String program_text = "2<4.5";
		
		String expected_result = 
"2\n"	+
"4.5\n"	+
"<\n"	+
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test2() {
		String program_text = "2+4-3";
		
		String expected_result = 
			"2\n" +
			"4\n" +
			"+\n" +
			"3\n" +
			"-\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_operator_assign() {
		String program_text1 = "a=0; a+=4";
		String program_text2 = "a=0; a=a+4";

		assertAstEquals(program_text1, program_text2);
	}

	public void test_operator_assign_2() {
		String program_text1 = "a+=4";
		String program_text2 = "a=a+4";

		assertAstEquals(program_text1, program_text2);
	}
	
	public void test_operator_assign_3() {
		String program_text1 = "bb = bb || 25";
		String program_text2 = "bb ||= 25";

		assertAstEquals(program_text1, program_text2);
	}
}
