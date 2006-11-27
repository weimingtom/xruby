package com.xruby.compiler.codedom;

public class RegexpExpressionWithExpressionSubstitutionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("/^f#{}.*r#{   }$/");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"visitStringExpressionWithExpressionSubstitutionBegin\n" +
			"^f\n" +
			".*r\n" +
			"$\n" +
			"RegexExpressionWithExpressionSubstitutionEnd\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
