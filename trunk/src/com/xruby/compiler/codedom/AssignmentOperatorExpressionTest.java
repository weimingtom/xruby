/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class AssignmentOperatorExpressionTest extends TestingAstTestCase {
	public void test_assignment() {
		String program_text = "a = 1";
		
		String expected_result = 
"1\n" +
"a =\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_array_assignment() {
		String program_text = "a=[]; a[0] = 1";
		
		String expected_result = 
			"[:0:0:false\n" +
			"]!\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"0\n" +
			"1\n" +
			"[]=:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test_array_assignment2() {
		String program_text1 = "a=[]; a[0] = a[0] || 1";
		String program_text2 = "a=[]; a[0] ||= 1";
		assertAstEquals(program_text1, program_text2);
	}
	
	public void test_assignment_global() {
		String program_text = "$a = 1";
		
		String expected_result = 
"1\n" +
"$a =\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}

	public void test_more_assignment() {
		String program_text = "a = b = c = 1";
		
		String expected_result = 
"1\n" +
"c =\n" +
"b =\n" +
"a =\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_assignment_compstmt() {
		String program_text = "a = (b = 2) + 3";
		
		
		String expected_result = 
"2\n" +
"b =\n" +
"3\n" +
"+\n" +
"a =\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
