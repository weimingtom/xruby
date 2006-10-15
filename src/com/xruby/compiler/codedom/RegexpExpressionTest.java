package com.xruby.codedom;

public class RegexpExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("/hello/");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"/hello/\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
