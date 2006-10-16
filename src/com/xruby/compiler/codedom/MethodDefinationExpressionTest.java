/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class MethodDefinationExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("def my_methods() end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"def my_methods:0:false:0:false\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, cp.toString());		
	}
	
	public void test_default_parameter() {
		Program p = getProgram("def my_methods(a, b = 1, c = 2) end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"def my_methods:3:false:2:false\n" +
"parameter:a\n" +
"parameter:b\n" +
"parameter:c\n" +
"DefaultParameterBegin:1\n" +
"1\n" +
"DefaultParameterEnd\n" +
"DefaultParameterBegin:2\n" +
"2\n" +
"DefaultParameterEnd\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, cp.toString());		
	}

	public void test_return() {
		Program p = getProgram("def my_methods() return end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"def my_methods:0:false:0:false\n" +
"nil\n" +
"return\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, cp.toString());		
	}
	
	public void test_operator() {
		Program p = getProgram("def &(anObject) end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"def &:1:false:0:false\n" +
"parameter:anObject\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, cp.toString());		
	}

	public void test2() {
		Program p = getProgram("def my_methods() \n puts 123 \n yield\n  end     \n  my_methods");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"def my_methods:0:false:0:false\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"123\n" +
			"]\n" +
			"puts:false\n" +
			";\n" +
			"yield\n" +
			"end yield:false\n" +
			"end def:true\n" +
			";\n" +
			"self\n" +
			"my_methods:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_parameter() {
		Program p = getProgram("def my_methods(a, b, c) \n  puts a  \n end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"def my_methods:3:false:0:false\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"parameter:c\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"a\n" +
			"]\n" +
			"puts:false\n" +
			"end def:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_method_call_without_parameter() {
		Program p1 = getProgram("def f\n" +
				" 123\n" +
				"end\n" +
				"print f()");
		CodePrinter cp1 = new CodePrinter();
		p1.accept(cp1);
		
		Program p2 = getProgram("def f\n" +
				" 123\n" +
				"end\n" +
				"print f");
		CodePrinter cp2 = new CodePrinter();
		p2.accept(cp2);
		
		assertEquals(cp1.toString(), cp2.toString());	
	}
	
	public void test_asterisk_parameter() {
		Program p = getProgram("def my_methods(a, b, *c) \n  puts c  \n end");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"def my_methods:2:true:0:false\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"*parameter:c\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"c\n" +
			"]\n" +
			"puts:false\n" +
			"end def:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());		
	}

}
