/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class CaseExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "case 1\n" +
				"	when 1\n" +
				"		2\n" +
				"	else\n" +
				"		3\n" +
				"end";
		
		String expected_result = 
"1\n" +
"case\n" +
"1\n" +
"when\n" +
"2\n" +
"end when\n" +
"3\n" +
"end when\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
