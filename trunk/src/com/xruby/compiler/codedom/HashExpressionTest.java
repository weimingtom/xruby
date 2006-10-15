/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;


public class HashExpressionTest extends TestingAstTestCase {
	public void test_array() {
		Program p = getProgram("{'a' => 'xxxx', 'b' => 'yyyy'}");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"{!\n" +
"{\na\nxxxx\n}\n" +
"{\nb\nyyyy\n}\n" +
"}!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_empty() {
		Program p = getProgram("{ }");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_empty2() {
		Program p = getProgram("{}");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"{!\n}!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
