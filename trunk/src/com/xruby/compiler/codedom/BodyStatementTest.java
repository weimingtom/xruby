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
			"!!!!\n" +
			"raise:false\n" +
			"body after\n" +
			"visitPrepareEnsure\n" +
			"visitRescueBegin\n" +
			"[:1\n" +
			"RuntimeError\n" +
			"]!\n" +
			"=>null\n" +
			"self\n" +
			"xxx\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"body end\n" +
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
			"!!!!\n" +
			"raise:false\n" +
			"body after\n" +
			"visitPrepareEnsure\n" +
			"visitRescueBegin\n" +
			"[:1\n" +
			"M\n" +
			"::RuntimeError\n" +
			"]!\n" +
			"=>e\n" +
			"self\n" +
			"e\n" +
			"print:false\n" +
			"end rescue\n" +
			"end rescue!\n" +
			"body end\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
