/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class AssignmentOperatorExpressionTest extends TestingAstTestCase {
	public void test_assignment() {
		Program p = getProgram("a = 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_array_assignment() {
		Program p = getProgram("a=[]; a[0] = 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"[:0\n" +
			"]!\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"[:2\n" +
			"[\n" +
			"0\n" +
			"]\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[]=:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test_array_assignment2() {
		Program p1 = getProgram("a=[]; a[0] = a[0] || 1");
		CodePrinter cp1 = new CodePrinter();
		p1.accept(cp1);
		
		Program p2 = getProgram("a=[]; a[0] ||= 1");
		CodePrinter cp2 = new CodePrinter();
		p2.accept(cp2);
		
		assertEquals(cp1.toString(), cp2.toString());
	}
	
	public void test_assignment_global() {
		Program p = getProgram("$a = 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"$a =\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test_more_assignment() {
		Program p = getProgram("a = b = c = 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"c =\n" +
"b =\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_assignment_compstmt() {
		Program p = getProgram("a = (b = 2) + 3");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"2\n" +
"b =\n" +
"3\n" +
"+\n" +
"a =\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
