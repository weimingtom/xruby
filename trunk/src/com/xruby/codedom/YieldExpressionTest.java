/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class YieldExpressionTest extends TestingAstTestCase {
	public void test_nil() {
		Program p = getProgram("yield nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:1\n" +
			"(\n" +
			"0:nil\n" +
			")\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk_nil() {
		Program p = getProgram("yield *nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:1\n" +
			"(\n" +
			"0:nil\n" +
			")\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_array() {
		Program p = getProgram("yield [1, 2]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:1\n" +
			"(\n" +
			"0:" +
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			")\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_empty_array() {
		Program p = getProgram("yield []");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:1\n" +
			"(\n" +
			"0:[:0\n]!\n" +
			")\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_empty_asterisk_array() {
		Program p = getProgram("yield *[]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:0\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk_array() {
		Program p = getProgram("yield *[1, 2]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"yield\n" +
			"parameters:2\n" +
			"(\n" +
			"0:1\n" +
			")\n" +
			"(\n" +
			"1:2\n" +
			")\n" +
			"end yield\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
}
