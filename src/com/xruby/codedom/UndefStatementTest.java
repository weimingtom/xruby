/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class UndefStatementTest extends TestingAstTestCase {
	public void test_one() {
		Program p = getProgram("undef a");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"undef a\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_more() {
		Program p = getProgram("undef a, b, c");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"undef a\n" +
"undef b\n" +
"undef c\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
