/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
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
