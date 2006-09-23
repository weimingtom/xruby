package com.xruby.codedom;

public class NextExpressionTest extends TestingAstTestCase {
	public void test_next_1() {
		Program p = getProgram("next 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"begin next\n" +
			"1\n" +
			"end next\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}