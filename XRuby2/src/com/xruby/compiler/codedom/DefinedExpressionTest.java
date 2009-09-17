/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
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
