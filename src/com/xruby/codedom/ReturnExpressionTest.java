/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ReturnExpressionTest extends TestingAstTestCase {
	public void test_return_1() {
		Program p = getProgram("return 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"1\n" +
"return\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_return() {
		Program p = getProgram("return");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"nil\n" +
"return\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_return_1_2_3() {
		Program p = getProgram("return 1, 2, 3");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"[:3\n" +
"[\n1\n]\n" +
"[\n2\n]\n" +
"[\n3\n]\n" +
"]!\n" +
"return\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_return_asterisk_nil() {
		Program p = getProgram("return *nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"*[:0\n" +
			"[\n" +
			"nil\n" +
			"]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_return_asterisk_empty_array() {
		Program p = getProgram("return *[]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"*[:0\n" +
			"[\n" +
			"[:0\n" +
			"]!\n" +
			"]*\n" +
			"]!\n" +
			"return\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
