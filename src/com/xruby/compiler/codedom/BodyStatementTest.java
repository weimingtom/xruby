/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class BodyStatementTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram(
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue RuntimeError\n" +
				"		print \"xxx\"\n" +
				"end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"body begin\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"!!!!\n" +
			"]\n" +
			"raise:false\n" +
			"body end\n" +
			"visitPrepareEnsure2\n" +
			"visitRescueBegin\n" +
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
			"body after\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test2() {
		Program p = getProgram(
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue M::RuntimeError => e\n" +
				"		print e\n" +
				"end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			//TODO seems e is not handled correctly
			"body begin\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"!!!!\n" +
			"]\n" +
			"raise:false\n" +
			"body end\n" +
			"visitPrepareEnsure2\n" +
			"visitRescueBegin\n" +
			"[:1\n" +
			"[\n" +
			"M\n" +
			"::RuntimeError\n" +
			"]\n" +
			"=>e\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"e\n" +
			"]\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"body after\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
