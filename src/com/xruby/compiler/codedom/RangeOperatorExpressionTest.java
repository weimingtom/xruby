/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class RangeOperatorExpressionTest extends TestingAstTestCase {
	public void test_inclusive() {
		String program_text = "1..2";
		
		String expected_result = 
"1\n" +
"2\n" +
".. operator\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_exclusive() {
		String program_text = "1...2";
		
		String expected_result = 
"1\n" +
"2\n" +
"... operator\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
	
}