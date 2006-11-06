package com.xruby.compiler.codedom;

public class NextExpressionTest extends TestingAstTestCase {
	public void test_next_1() {
		Program p = getProgram("next 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"begin next\n" +
			"1\n" +
			"end next\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}