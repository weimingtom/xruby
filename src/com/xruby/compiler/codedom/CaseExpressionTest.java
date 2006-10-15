/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class CaseExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("case 1\n" +
				"	when 1\n" +
				"		2\n" +
				"	else\n" +
				"		3\n" +
				"end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
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
		assertEquals(expected_result, cp.toString());
	}
}
