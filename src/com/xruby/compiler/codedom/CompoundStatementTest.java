/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class CompoundStatementTest extends TestingAstTestCase {

	public void test() {
		String program_text = "0;2;2.4\n  \"hello\" ; \"\\thello\\r\\n\" ; '\\thello\\r\\n' ";
		
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
		assertAstOutput(program_text, expected_result);
	}

	public void test_true_false_nil() {
		String program_text = "true;false;nil";
		
		String expected_result = 
			"true\n" +
			";\n" +
			"false\n" +
			";\n" +
			"nil\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
