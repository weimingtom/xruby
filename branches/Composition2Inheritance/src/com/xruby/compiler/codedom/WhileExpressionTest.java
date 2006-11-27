/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class WhileExpressionTest extends TestingAstTestCase {
	public void test_while() {
		Program p = getProgram("while true\n true end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"while condition\n" +
			"true\n" +
			"end while condition\n" +
			"true\n" +
			"end while\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_optimazation() {
		Program p = getProgram("while false\n true end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_while_more() {
		Program p = getProgram(
				"a = 2\n" +
				"while a > 1\n" +
				"true\n" +
				"end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"2\n" +
			"a =\n" +
			";\n" +
			"while condition\n" +
			"a\n" +
			"1\n" +
			">\n" +
			"end while condition\n" +
			"true\n" +
			"end while\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
}
