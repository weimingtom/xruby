/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class CompoundStatementTest extends TestingAstTestCase {

	public void test() {
		Program p = getProgram("0;2;2.4\n  \"hello\" ; \"\\thello\\r\\n\" ; '\\thello\\r\\n' ");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"0\n" +
			";\n" +
			"2\n" +
			";\n" +
			"2.4\n" +
			";\n" +
			"hello\n" +
			";\n" +
			"\thello\r\n\n" +
			";\n" +
			"\\thello\\r\\n\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test_true_false_nil() {
		Program p = getProgram("true;false;nil");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"true\n" +
			";\n" +
			"false\n" +
			";\n" +
			"nil\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
