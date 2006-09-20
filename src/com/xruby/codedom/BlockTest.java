/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;


public class BlockTest extends TestingAstTestCase {
	public void test_parameter() {
		Program p = getProgram("f {|a, b, c|   puts a  }");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"block:3:false\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"parameter:c\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"a\n" +
			"]\n" +
			"puts:false\n" +
			"end block:true\n" +
			"f:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_dot_time() {
		Program p = getProgram("3.times {print 'Ho!'}");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"3\n" +
			"block:0:false\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"Ho!\n" +
			"]\n" +
			"print:false\n" +
			"end block:true\n" +
			"times:true\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
	
	public void test_asterisk_parameter() {
		Program p = getProgram("f {|a, b, *c|   puts c  }");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"self\n" +
			"block:2:true\n" +
			"parameter:a\n" +
			"parameter:b\n" +
			"*parameter:c\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"c\n" +
			"]\n" +
			"puts:false\n" +
			"end block:true\n" +
			"f:false\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
