/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class UnaryOperatorExpressionTest extends TestingAstTestCase {
	public void test_negative_one() {
		Program p = getProgram("-1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"1\n" +
			"-@\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

}
