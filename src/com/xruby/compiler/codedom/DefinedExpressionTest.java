/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class DefinedExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("defined? nil");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"nil\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
