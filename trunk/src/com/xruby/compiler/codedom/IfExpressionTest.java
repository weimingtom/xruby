/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codedom;

public class IfExpressionTest extends TestingAstTestCase {
	public void test_if_else() {
		String program_text = "if false\n 1 else 2 end";
		
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"2\n" +
"end if\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test_ternaryIfThenElseExpression() {
		String program_text = "false ? 1 : 2";
		
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"2\n" +
"end if\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_optimazation() {
		String program_text = "if true\n 1 elsif true\n 2 else 3 end";
		
		String expected_result = 
"1\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_elsif() {
		String program_text = "if false\n 1 elsif true\n 2 elsif true\n 3 else 4 end";
		
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"true\n" +
"if\n" +
"2\n" +
"end if\n" +
"true\n" +
"if\n" +
"3\n" +
"end if\n" +
"4\n" +
"end if\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
