/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class CaseExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("case 1\n" +
				"	when 1\n" +
				"		2\n" +
				"	else\n" +
				"		3\n" +
				"end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"1\n" +
"case\n" +
"1\n" +
"when\n" +
"2\n" +
"end when\n" +
"3\n" +
"end when\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
