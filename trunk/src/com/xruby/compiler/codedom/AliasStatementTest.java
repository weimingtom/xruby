/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class AliasStatementTest extends TestingAstTestCase {
	public void test() {
		String program_text = "alias $a $b";
		
		String expected_result = 
"alias $a $b\n" +
"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
