/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class AssignmentOperatorExpressionTest extends TestingAstTestCase {
	public void test_assignment() {
		Program p = getProgram("a = 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"1\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_array_assignment() {
		Program p = getProgram("a=[]; a[0] = 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"[:0\n" +
			"]!\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"parameters:2\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"(\n" +
			"1:1\n" +
			")\n" +
			"[]=:true:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	public void test_array_assignment2() {
		Program p1 = getProgram("a=[]; a[0] = a[0] || 1");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("a=[]; a[0] ||= 1");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);
		
		assertEquals(CodePrinter1.toString(), CodePrinter2.toString());
	}
	
	public void test_assignment_global() {
		Program p = getProgram("$a = 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"1\n" +
"$a =\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	public void test_more_assignment() {
		Program p = getProgram("a = b = c = 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"1\n" +
"c =\n" +
"b =\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_assignment_compstmt() {
		Program p = getProgram("a = (b = 2) + 3");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"2\n" +
"b =\n" +
"3\n" +
"+\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
