/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class MethodCallExpressionTest extends TestingAstTestCase {

	public void test3() {
		Program p = getProgram("puts 2.class");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:1\n" +
			"(\n" +
			"0:2\n" +
			"parameters:0\n" +
			"class:true:false\n" +
			")\n" +
			"puts:false:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	public void test4() {
		Program p = getProgram("puts(1.class())");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:1\n" +
			"(\n" +
			"0:1\n" +
			"parameters:0\n" +
			"class:true:false\n" +
			")\n" +
			"puts:false:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test5() {
		Program p = getProgram("puts");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:0\n" +
			"puts:false:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	public void test6() {
		Program p = getProgram("puts 1, 2");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:2\n" +
			"(\n" +
			"0:1\n" +
			")\n" +
			"(\n" +
			"1:2\n" +
			")\n" +
			"puts:false:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_array_access() {
		Program p = getProgram("a[1]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:0\n" +
			"a:false:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:1\n" +
			")\n" +
			"[]:true:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_array_access_2() {
		Program p = getProgram("a=1; a[1]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"parameters:1\n" +
			"(\n" +
			"0:1\n" +
			")\n" +
			"[]:true:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_more_array_access() {
		Program p = getProgram("a[-1]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"parameters:0\n" +
			"a:false:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:1\n" +
			"-@\n" +
			")\n" +
			"[]:true:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	
	public void test_command() {
		Program p = getProgram("puts `java -x`");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result =
			"self\n" +
			"parameters:1\n" +
			"(\n" +
			"0:`java -x`\n" +
			")\n" +
			"puts:false:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
