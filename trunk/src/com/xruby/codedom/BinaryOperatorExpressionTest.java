/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class BinaryOperatorExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("2+4.5");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"2\n"	+
"4.5\n"	+
"+\n"	+
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}

	public void test1() {
		Program p = getProgram("2<4.5");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
"2\n"	+
"4.5\n"	+
"<\n"	+
"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test2() {
		Program p = getProgram("2+4-3");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"2\n" +
			"4\n" +
			"+\n" +
			"3\n" +
			"-\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_operator_assign() {
		Program p1 = getProgram("a=0; a+=4");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("a=0; a=a+4");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);

		assertEquals(CodePrinter1.toString(), CodePrinter2.toString());
	}

	public void test_operator_assign_2() {
		Program p1 = getProgram("a+=4");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("a=a+4");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);

		assertEquals(CodePrinter1.toString(), CodePrinter2.toString());
	}
	
	public void test_operator_assign_3() {
		Program p1 = getProgram("bb = bb || 25");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("bb ||= 25");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);

		assertEquals(CodePrinter1.toString(), CodePrinter2.toString());
	}
}
