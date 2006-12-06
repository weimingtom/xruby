package com.xruby.compiler.codedom;

public class CurrentNamespaceConstantExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("ABC");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"ABC\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
