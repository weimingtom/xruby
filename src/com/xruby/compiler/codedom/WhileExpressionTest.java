/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class WhileExpressionTest extends TestingAstTestCase {
	public void test_while() {
		String program_text = "while true\n true end";
		
		String expected_result = 
			"while condition\n" +
			"true\n" +
			"end while condition\n" +
			"true\n" +
			"end while\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_optimazation() {
		String program_text = "while false\n true end";
		
		String expected_result = 
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_while_more() {
		String program_text = 
				"a = 2\n" +
				"while a > 1\n" +
				"true\n" +
				"end";
		
		String expected_result = 
			"2\n" +
			"a =\n" +
			";\n" +
			"while condition\n" +
			"a\n" +
			"1\n" +
			">\n" +
			"end while condition\n" +
			"true\n" +
			"end while\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
}
