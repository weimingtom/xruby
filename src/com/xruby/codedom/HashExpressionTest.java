/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;


public class HashExpressionTest extends TestingAstTestCase {
	public void test_array() {
		Program p = getProgram("{'a' => 'xxxx', 'b' => 'yyyy'}");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"{!\n" +
"{\na\nxxxx\n}\n" +
"{\nb\nyyyy\n}\n" +
"}!\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_empty() {
		Program p = getProgram("{ }");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_empty2() {
		Program p = getProgram("{}");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
