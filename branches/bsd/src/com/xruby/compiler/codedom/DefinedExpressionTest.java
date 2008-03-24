/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class DefinedExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = "defined? nil";
		
		String expected_result = 
			"nil\n" +
			"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
