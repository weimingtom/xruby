/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;


public class BlockTest extends TestingAstTestCase {
	public void test_parameter() {
		Program p = getProgram("f {|a, b, c|   puts a  }");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
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
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_dot_time() {
		Program p = getProgram("3.times {print 'Ho!'}");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
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
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_asterisk_parameter() {
		Program p = getProgram("f {|a, b, *c|   puts c  }");
		CodePrinter codeprinter = new CodePrinter();
		p.accept(codeprinter);
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
		assertEquals(expected_result, codeprinter.toString());
	}
	
	public void test_do_end_is_same_as_curly_braces() {
		Program p1 = getProgram("f {|a, b, *c|   puts c  }");
		CodePrinter cp1 = new CodePrinter();
		p1.accept(cp1);
		
		Program p2 = getProgram("f do |a, b, *c|   puts c  end");
		CodePrinter cp2 = new CodePrinter();
		p2.accept(cp2);
		
		assertEquals(cp1.toString(), cp2.toString());
	}
}
