/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class BodyStatementTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram(	"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue RuntimeError\n" +
				"		print \"xxx\"\n" +
				"end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"prepare rescue begin\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"!!!!\n" +
			"]\n" +
			"raise:false\n" +
			"prepare rescue end\n" +
			"[:1\n" +
			"[\n" +
			"RuntimeError\n" +
			"]\n" +
			"=>null\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"xxx\n" +
			"]\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
