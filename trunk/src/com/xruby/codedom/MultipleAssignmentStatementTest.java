/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;


public class MultipleAssignmentStatementTest extends TestingAstTestCase {

	public void test_no_asterisk() {
		Program p = getProgram("a = 1; b = 2;   a, b = 1, 2");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
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
			"0\n" +
			"1\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk() {
		Program p = getProgram("a, *b = 1, *[2, 3]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
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
			"0\n" +
			"1*\n" +
			"b //=\n" +
			"a //=\n" +
			"end MultipleAssignment\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
}
