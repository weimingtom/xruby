/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class MethodCallExpressionTest extends TestingAstTestCase {

	public void test_dot() {
		Program p = getProgram("4.div 2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"4\n" +
			"[:1\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"div:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test3() {
		Program p = getProgram("puts 2.class");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"[:1\n" +
			"[\n" +
			"2\n" +
			"class:true\n" +
			"]()\n" +
			"puts:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test4() {
		Program p = getProgram("puts(1.class())");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"[:1\n" +
			"[\n" +
			"1\n" +
			"class:true\n" +
			"]()\n" +
			"puts:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test5() {
		Program p = getProgram("puts");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"puts:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

	public void test6() {
		Program p = getProgram("puts 1, 2");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"[:2\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[\n" +
			"2\n" +
			"]\n" +
			"puts:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_array_access() {
		Program p = getProgram("a[1]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"a:false\n" +
			"[:1\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[]:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_array_access_2() {
		Program p = getProgram("a=1; a[1]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"[:1\n" +
			"[\n" +
			"1\n" +
			"]\n" +
			"[]:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_more_array_access() {
		Program p = getProgram("a[-1]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"a:false\n" +
			"[:1\n" +
			"[\n" +
			"1\n" +
			"-@\n" +
			"]\n" +
			"[]:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_self_array_access() {
		Program p = getProgram("self[0]");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"self\n" +
			"[:1\n" +
			"[\n" +
			"0\n" +
			"]\n" +
			"[]:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}

	
	public void test_command() {
		Program p = getProgram("puts `java -x`");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result =
			"self\n" +
			"[:1\n" +
			"[\n" +
			"`java -x`\n" +
			"]\n" +
			"puts:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_UNARY_PLUS_MINUS_METHOD_NAME() {
		Program p = getProgram("1.-@");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result =
			"1\n" +
			"-@:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_command_and_operator() {
		Program p = getProgram("print /hello/ === 'xxxhello123'");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result =
			"self\n" +
			"[:1\n" +
			"[\n" +
			"/hello/\n" +
			"xxxhello123\n" +
			"===\n" +
			"]\n" +
			"print:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());

	}
	
	public void test_implicit_hash() {
		Program p1 = getProgram("f('a' => 1, 'b' => 2)");
		CodePrinter cp1 = new CodePrinter();
		p1.accept(cp1);
		
		Program p2 = getProgram("f({'a' => 1, 'b' => 2})");
		CodePrinter cp2 = new CodePrinter();
		p2.accept(cp2);
		
		assertEquals(cp1.toString(), cp2.toString());
	}
	
	/*FIXME
	public void test_command_and_operator() {
		Program p = getProgram("print (1..3) === 0");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result =
			"self\n" +
			"1\n" +
			"3\n" +
			".. operator\n" +
			"0\n" +
			"===\n" +
			"print\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}*/
}
