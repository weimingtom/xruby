/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class AliasStatementTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("alias $a $b");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
"alias $a $b\n" +
"EOF";
		assertEquals(expected_result, cp.toString());
	}
}
