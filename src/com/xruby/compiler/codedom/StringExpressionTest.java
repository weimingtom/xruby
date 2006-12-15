/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class StringExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "'ab' 'cd'";
		String expected_result = 
			"abcd\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
