/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class RegexpExpressionWithExpressionSubstitutionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "/^f#{}.*r#{   }$/";
		
		String expected_result = 
			"visitStringExpressionWithExpressionSubstitutionBegin\n" +
			"^f\n" +
			".*r\n" +
			"$\n" +
			"RegexExpressionWithExpressionSubstitutionEnd\n" +
			"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
