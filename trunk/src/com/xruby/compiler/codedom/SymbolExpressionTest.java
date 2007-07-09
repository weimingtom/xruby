/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class SymbolExpressionTest extends TestingAstTestCase {
	public void test() {
		String program_text = ":hello";
		String expected_result = 
":hello\n" +
"EOF";
		assertAstOutput(program_text, expected_result);
	}
}
