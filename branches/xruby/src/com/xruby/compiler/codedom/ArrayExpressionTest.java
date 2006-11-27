/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ArrayExpressionTest extends TestingAstTestCase {
	public void test_array() {
		Program p = getProgram("[1, 'xxx', 1.2]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"[:3\n" +
"[\n1\n]\n" +
"[\nxxx\n]\n" +
"[\n1.2\n]\n" +
"]!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_empty() {
		Program p = getProgram("[ ]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"[:0\n]!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_empty2() {
		Program p = getProgram("[]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"[:0\n]!\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_asterisk() {
		Program p = getProgram("[*[1, 2]]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"[:0\n" +
			"[\n" +
			"[:2\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"]!\n" +
			"]*\n" +
			"]!\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
