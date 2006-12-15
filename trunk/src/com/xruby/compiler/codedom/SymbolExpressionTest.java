/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class SymbolExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = ":hello";
		String expected_result = 
":hello\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
