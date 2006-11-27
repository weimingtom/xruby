/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class SymbolExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram(":hello");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
":hello\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
