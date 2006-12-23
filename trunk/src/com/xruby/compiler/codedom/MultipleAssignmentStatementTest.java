/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;


public class MultipleAssignmentStatementTest extends TestingAstTestCase {

	public void test_no_asterisk() {
		String program_text = "a = 1; b = 2;   a, b = 1, 2";
		
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"[:2\n" +
			"1\n" +
			"2\n" +
			"begin MultipleAssignment:false:false\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk() {
		String program_text = "a, *b = 1, *[2, 3]";
		
		String expected_result = 
			"[:1\n" +
			"1\n" +
			"[:2\n" +
			"2\n" +
			"3\n" +
			"]!\n" +
			"[]*\n" +
			"begin MultipleAssignment:false:false\n" +
			"mrhs:0\n" +
			"mrhs:1*\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_nested() {
		String program_text = "b, (c, d), e = 1,2,3,4;b;c;d;e";
		
		String expected_result = 
			"[:4\n" +
			"1\n" +
			"2\n" +
			"3\n" +
			"4\n" +
			"begin MultipleAssignment:false:false\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"mrhs:2\n" +
			"e //=\n" +
			"begin NestedVariable\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"d //=\n" +
			"c //=\n" +
			"end NestedVariable\n" +
			"b //=\n" +
			"end MultipleAssignment\n" +
			"b\n;\n" +
			"c\n;\n" +
			"d\n;\n" +
			"e\n" +
			"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
