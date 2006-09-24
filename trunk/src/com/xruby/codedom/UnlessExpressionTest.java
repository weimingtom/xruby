/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class UnlessExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("unless true\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"true\n" +
"unless\n" +
"111\n" +
"end unless\n" +
"222\n" +
"end unless\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_optimazation() {
		Program p = getProgram("unless false\n" +
				"	111\n" +
				"else\n" +
				"	222\n" +
				"end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"111\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
