/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;


public class BlockTest extends TestingAstTestCase {
	public void test_parameter() {
		String program_text = "f {|a, b, c|   puts a  }";

		String expected_result =
			"self\n" +
			"block:3:false:0\n" +
			"MultipleAssignment:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"mrhs:2\n" +
			"c //=\n" +
			"b //=\n" +
			"a //=\n" +
			";\n" +
			"self\n" +
			"a\n" +
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
			"block:-1:false:0\n" +
			"MultipleAssignment:false:false\n" +
			";\n" +
			"self\n" +
			"Ho!\n" +
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
			"MultipleAssignment:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"mrhs:2*\n" +
			"c //=\n" +
			"b //=\n" +
			"a //=\n" +
			";\n" +
			"self\n" +
			"c\n" +
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
			"MultipleAssignment:true:true\n" +
			"a //=\n" +
			";\n" +
			"self\n" +
			"a\n" +
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
			"block:-1:false:0\n" +
			"MultipleAssignment:false:false\n" +
			";\n" +
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
