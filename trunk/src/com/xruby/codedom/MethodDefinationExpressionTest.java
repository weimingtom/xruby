/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class MethodDefinationExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("def my_methods() end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def my_methods:0:false\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());		
	}

	public void test_return() {
		Program p = getProgram("def my_methods() return end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def my_methods:0:false\n" +
"nil\n" +
"return\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());		
	}
	
	public void test_operator() {
		Program p = getProgram("def &(anObject) end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def &:1:false\n" +
"parameter:anObject\n" +
"end def:false\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());		
	}

	public void test2() {
		Program p = getProgram("def my_methods() \n puts 123 \n yield\n  end     \n  my_methods");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def my_methods:0:false\n" +
"self\n" +
"parameters:1\n" +
"(\n" +
"0:123\n" +
")\n" +
"puts:false:false\n" +
";\n" +
"yield\n" +
"parameters:0\n" +
"end yield\n" +
"end def:true\n" +
";\n" +
"self\n" +
"parameters:0\n" +
"my_methods:false:false\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_parameter() {
		Program p = getProgram("def my_methods(a, b, c) \n  puts a  \n end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def my_methods:3:false\n" +
"parameter:a\n" +
"parameter:b\n" +
"parameter:c\n" +
"self\n" +
"parameters:1\n" +
"(\n" +
"0:a\n" +
")\n" +
"puts:false:false\n" +
"end def:true\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_method_call_without_parameter() {
		Program p1 = getProgram("def f\n" +
				" 123\n" +
				"end\n" +
				"print f()");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("def f\n" +
				" 123\n" +
				"end\n" +
				"print f");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);
		
		assertEquals(CodePrinter1.toString(), CodePrinter2.toString());	
	}
	
	public void test_asterisk_parameter() {
		Program p = getProgram("def my_methods(a, b, *c) \n  puts c  \n end");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"def my_methods:2:true\n" +
"parameter:a\n" +
"parameter:b\n" +
"*parameter:c\n" +
"self\n" +
"parameters:1\n" +
"(\n" +
"0:c\n" +
")\n" +
"puts:false:false\n" +
"end def:true\n" +
"EOF";
		assertEquals(expected_result, CodePrinter.toString());		
	}

}
