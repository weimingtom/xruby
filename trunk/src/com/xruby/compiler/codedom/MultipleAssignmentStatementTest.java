/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;


public class MultipleAssignmentStatementTest extends TestingAstTestCase {

	public void test_no_asterisk() {
		String program_text = "a = 1; b = 2;   a, b = 1, 2";
		
		String expected_result = 
			"1\n" +
			"a =\n" +
			";\n" +
			"2\n" +
			"b =\n" +
			";\n" +
			"[:2:2:false\n" +
			"1\n" +
			"2\n" +
			"]!\n" +
			"MultipleAssignment:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_asterisk() {
		String program_text = "a, *b = 1, *[2, 3]";
		
		String expected_result = 
			"[:1:1:true\n" +
			"1\n" +
			"[:2:0:false\n" +
			"2\n" +
			"3\n" +
			"]!\n" +
			"[]*\n" +
			"]!\n" +
			"MultipleAssignment:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1*\n" +
			"b //=\n" +
			"a //=\n" +
			"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_nested() {
		String program_text = "b, (c, d), e = 1,2,3,4;b;c;d;e";
		
		String expected_result = 
			"[:4:4:false\n" +
			"1\n" +
			"2\n" +
			"3\n" +
			"4\n" +
			"]!\n" +
			"MultipleAssignment:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"mrhs:2\n" +
			"e //=\n" +
			"NestedVariable:false:true\n" +
			"mrhs:0\n" +
			"mrhs:1\n" +
			"d //=\n" +
			"c //=\n" +
			"b //=\n" +
			";\n" +
			"b\n;\n" +
			"c\n;\n" +
			"d\n;\n" +
			"e\n" +
			"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
