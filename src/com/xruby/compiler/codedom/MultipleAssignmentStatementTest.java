/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;


public class MultipleAssignmentStatementTest extends TestingAstTestCase {

	public void test_no_asterisk() {
		Program p = getProgram("a = 1; b = 2;   a, b = 1, 2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"[:2\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"begin MultipleAssignment:false:false\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_asterisk() {
		Program p = getProgram("a, *b = 1, *[2, 3]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"[:1\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"[:2\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"[\n" +
			"3\n" +
			"]\n" +
			"]!\n" +
			"]*\n" +
			"begin MultipleAssignment:false:false\n" +
			"mrhs:0\n" +
			"mrhs:1*\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_nested() {
		Program p = getProgram("b, (c, d), e = 1,2,3,4;b;c;d;e");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"[:4\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"[\n" +
			"3\n" +
			"]\n" +
			"[\n" +
			"4\n" +
			"]\n" +
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
		
		assertEquals(expected_result, cp.toString());
	}
}
