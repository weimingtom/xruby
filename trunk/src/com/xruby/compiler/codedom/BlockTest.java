/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;


public class BlockTest extends TestingAstTestCase {
	public void test_parameter() {
		String program_text = "f {|a, b, c|   puts a  }";
		
		String expected_result = 
			"self\n" +
			"block:3:false:0\n" +
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
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_dot_time() {
		String program_text = "3.times {print 'Ho!'}";
		
		String expected_result = 
			"3\n" +
			"block:0:false:0\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"Ho!\n" +
			"]\n" +
			"print:false\n" +
			"end block:true\n" +
			"times:true\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk_parameter() {
		String program_text = "f {|a, b, *c|   puts c  }";
		
		String expected_result = 
			"self\n" +
			"block:2:true:0\n" +
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
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk_parameter_no_name() {
		String program_text = "f {|a, *|   puts a  }";
		
		String expected_result = 
			"self\n" +
			"block:1:false:0\n" +
			"parameter:a\n" +
			"self\n" +
			"[:1\n" +
			"[\n" +
			"a\n" +
			"]\n" +
			"puts:false\n" +
			"end block:true\n" +
			"f:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_break_in_block() {
		String program_text = "loop do break; end";
		
		String expected_result = 
			"self\n" +
			"block:0:false:0\n" +
			"nil\n" +
			"break\n" +
			"end block:false\n" +
			"loop:false\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_do_end_is_same_as_curly_braces() {
		String program_text1 = "f {|a, b, *c|   puts c  }";
		
		String program_text2 = "f do |a, b, *c|   puts c  end";
		
		assertAstEquals(program_text1, program_text2);
	}
	
	
}
