/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class BodyStatementTest extends TestingAstTestCase {
	public void test() {
		String program_text = 
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue RuntimeError\n" +
				"		print \"xxx\"\n" +
				"end";
		
		String expected_result = 
			"body begin\n" +
			"self\n" +
			"[:1\n" +
			"!!!!\n" +
			"raise:false\n" +
			"body end\n" +
			"visitPrepareEnsure\n" +
			"visitRescueBegin\n" +
			"[:1\n" +
			"RuntimeError\n" +
			"=>null\n" +
			"self\n" +
			"[:1\n" +
			"xxx\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"body after\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test2() {
		String program_text = 
				"begin\n" +
				"	raise \"!!!!\"\n" +
				"	rescue M::RuntimeError => e\n" +
				"		print e\n" +
				"end";
				
		String expected_result = 
			//TODO seems e is not handled correctly
			"body begin\n" +
			"self\n" +
			"[:1\n" +
			"!!!!\n" +
			"raise:false\n" +
			"body end\n" +
			"visitPrepareEnsure\n" +
			"visitRescueBegin\n" +
			"[:1\n" +
			"M\n" +
			"::RuntimeError\n" +
			"=>e\n" +
			"self\n" +
			"[:1\n" +
			"e\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"body after\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
