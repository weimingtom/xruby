package com.xruby.compiler.codedom;

public class CurrentNamespaceConstantExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "ABC";
		
		String expected_result = 
			"ABC\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
