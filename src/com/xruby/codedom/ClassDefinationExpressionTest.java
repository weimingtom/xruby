/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class ClassDefinationExpressionTest extends TestingAstTestCase {
	public void test_class_defination() {
		Program p = getProgram(
				"class C\n" +
				"	def f\n" +
				"		puts \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"C.new.f");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"class C < Object\n" +
			"def f:0:false\n" +
			"self\n" +
			"parameters:1\n" +
			"(\n" +
			"0:~~~~\n" +
			")\n" +
			"puts:false:false\n" +
			"end def:true\n" +
			"end C:true\n" +
			";\n" +
			"C\n" +
			"parameters:0\n" +
			"new:true:false\n" +
			"parameters:0\n" +
			"f:true:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_class_defination2() {
		Program p = getProgram(
				"class C < Integer\n" +
				"end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"class C < Integer\n" +
			"end C:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
}
