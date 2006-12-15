/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class UnaryOperatorExpressionTest extends TestingAstTestCase {
	public void test_negative_one() {
		String program_text = "-1";
		
		String expected_result = 
			"1\n" +
			"-@\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}

}
