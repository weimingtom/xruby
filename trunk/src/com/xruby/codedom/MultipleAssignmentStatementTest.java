/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;


public class MultipleAssignmentStatementTest extends TestingAstTestCase {

	public void setUp() {
		NameFactory.reset();
	}
	
	public void test_equal_number_on_left_right() {
		Program p = getProgram("a = 1; b = 2;   a, b = b, a");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"b\n" +
			"a\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_more_lvalues_than_rvalues() {
		Program p = getProgram("a = 1; b = 2; c = 3;  a, b, c= b, a");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"3\n" +
			"c =\n" +
			";\n" +
			"b\n" +
			"a\n" +
			"nil\n" +
			"c //=\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_more_rvalues_than_lvalues() {
		Program p = getProgram("a = 1; b = 2;   a, b = b, a, puts(3)");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"b\n" +
			"a\n" +
			"self\n" +
			"parameters:1\n" +
			"(\n" +
			"0:3\n" +
			")\n" +
			"puts:false:false\n" +
			";\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_one_lvalue_more_than_one_rvalue() {
		Program p = getProgram("a = 1, 2, 3");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		
		String expected_result = 
		"[:3\n" +
		"[\n1\n]\n" +
		"[\n2\n]\n" +
		"[\n3\n]\n" +
		"]!\n" +
		"a //=\n" +
		"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk() {
		Program p = getProgram("a = *nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"nil\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:0\n" +
			"length:true:false\n" +
			"1\n" +
			">\n" +
			"if\n" +
			"nil\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"end if\n" +
			"nil\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"[]:true:false\n" +
			"end if!\n"+
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk2() {
		Program p = getProgram("a = *1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:0\n" +
			"length:true:false\n" +
			"1\n" +
			">\n" +
			"if\n" +
			"1\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"end if\n" +
			"1\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"[]:true:false\n" +
			"end if!\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk3() {
		Program p = getProgram("a = *[1,2]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:0\n" +
			"length:true:false\n" +
			"1\n" +
			">\n" +
			"if\n" +
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"end if\n" +
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"[]:true:false\n" +
			"end if!\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk4() {
		Program p = getProgram("a = *[*[1,2]]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:0\n" +
			"length:true:false\n" +
			"1\n" +
			">\n" +
			"if\n" +
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"end if\n" +
			"[:2\n" +
			"[\n1\n]\n" +
			"[\n2\n]\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"[]:true:false\n" +
			"end if!\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk_on_the_left() {
		Program p = getProgram("*a = nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"[:1\n" +
			"[\nnil\n]\n" +
			"]!\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_more_lvalue_than_rvalue() {
		Program p = getProgram("a, b = 1");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"nil\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_more_lvalue_than_rvalue_and_asterisk_on_the_left() {
		Program p = getProgram("a,b,*c = nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"nil\n" +
			"nil\n" +
			"[:0\n" +
			"]!\n" +
			"c //=\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_one_rvalue() {
		Program p1 = getProgram("a, b = []");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("a, b = nil");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);
		
		assertEquals(CodePrinter2.toString(), CodePrinter1.toString());
	}
	
	public void test_one_rvalue_2() {
		Program p1 = getProgram("a, b = [1, 2]");
		CodePrinter CodePrinter1 = new CodePrinter();
		p1.accept(CodePrinter1);
		
		Program p2 = getProgram("a, b = 1, 2");
		CodePrinter CodePrinter2 = new CodePrinter();
		p2.accept(CodePrinter2);
		
		assertEquals(CodePrinter2.toString(), CodePrinter1.toString());
	}
	
	public void test_asterisk_on_both_side() {
		Program p = getProgram("a,b,*c = *[]");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"[:0\n" +
			"]!\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"tmp$0 =\n" +
			"parameters:1\n" +
			"(\n0:0\n)\n" +
			"[]:true:false\n" +
			"tmp$0\n" +
			"parameters:1\n" +
			"(\n0:1\n)\n" +
			"[]:true:false\n" +
			"[:0\n" +
			"]!\n" +
			"c //=\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk_expand() {
		Program p = getProgram("a = 1; b = *a");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"a\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:0\n" +
			"length:true:false\n" +
			"1\n" +
			">\n" +
			"if\n" +
			"a\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"end if\n" +
			"a\n" +
			"parameters:0\n" +
			"to_a:true:false\n" +
			"parameters:1\n" +
			"(\n" +
			"0:0\n" +
			")\n" +
			"[]:true:false\n" +
			"end if!\n"+
			"b //=\n" +
			"EOF";
		
		assertEquals(expected_result, CodePrinter.toString());
	}

}
