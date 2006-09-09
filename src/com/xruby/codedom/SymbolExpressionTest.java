/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class SymbolExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram(":hello");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
":hello\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
