/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class IfExpressionTest extends TestingAstTestCase {
	public void test_if_else() {
		Program p = getProgram("if false\n 1 else 2 end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"2\n" +
"end if\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test_ternaryIfThenElseExpression() {
		Program p = getProgram("false ? 1 : 2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"2\n" +
"end if\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_optimazation() {
		Program p = getProgram("if true\n 1 elsif true\n 2 else 3 end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_elsif() {
		Program p = getProgram("if false\n 1 elsif true\n 2 elsif true\n 3 else 4 end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"false\n" +
"if\n" +
"1\n" +
"end if\n" +
"true\n" +
"if\n" +
"2\n" +
"end if\n" +
"true\n" +
"if\n" +
"3\n" +
"end if\n" +
"4\n" +
"end if\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
