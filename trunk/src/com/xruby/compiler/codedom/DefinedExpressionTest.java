/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class DefinedExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "defined? nil";
		
		String expected_result = 
			"nil\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
