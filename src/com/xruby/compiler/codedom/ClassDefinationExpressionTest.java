/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class ClassDefinationExpressionTest extends TestingAstTestCase {
	public void test_class_defination() {
		Program p = getProgram(
				"class C\n" +
				"	def f\n" +
				"		puts \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"C.new.f");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"class C\n" +
			"::Object\n" +
			"<<<<<\n" +
			"def f:0:false:0\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"~~~~\n" +
			"]\n" +
			"puts:false\n" +
			"end def:true\n" +
			"end:true\n" +
			";\n" +
			"::C\n" +
			"new:true\n" +
			"f:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_class_defination2() {
		Program p = getProgram(
				"class C < Integer\n" +
				"end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"class C\n" +
			"::Integer\n" +
			"<<<<<\n" +
			"end:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
}
