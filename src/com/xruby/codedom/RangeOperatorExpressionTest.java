package com.xruby.codedom;

public class RangeOperatorExpressionTest extends TestingAstTestCase {
	public void test_inclusive() {
		Program p = getProgram("1..2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"2\n" +
".. operator\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_exclusive() {
		Program p = getProgram("1...2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"1\n" +
"2\n" +
"... operator\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
}