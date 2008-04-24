/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codedom;

public class ClassDefinitionExpressionTest extends TestingAstTestCase {
	public void test_class_defination() {
		String program_text = 
				"class C\n" +
				"	def f\n" +
				"		puts \"~~~~\"\n" +
				"	end\n" +
				"end\n" +
				"C.new.f";
		
		String expected_result = 
			"class C\n" +
			"ClassDefinition2\n" +
			"def f:0:false:0:false\n" +
			"self\n" +
			"~~~~\n" +
			"puts:false\n" +
			"end def:true\n" +
			"end:true\n" +
			";\n" +
			"C\n" +
			"new:true\n" +
			"f:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_class_defination2() {
		String program_text = 
				"class C < Integer\n" +
				"end";
		
		String expected_result = 
			"class C\n" +
			"Integer\n" +
			"ClassDefinition2\n" +
			"end:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
}
