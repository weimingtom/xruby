package com.xruby.compiler.codedom;

public class RegexpExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "/hello/";
		
		String expected_result = 
"/hello/\n" +
"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
