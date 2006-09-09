/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import junit.framework.TestCase;

public class DefinedExpressionTest extends TestingAstTestCase {
	public void test() {
		Program p = getProgram("defined? nil");
		CodePrinter CodePrinter = new CodePrinter();
		p.accept(CodePrinter);
		String expected_result = 
			"nil\n" +
			"EOF";
		assertEquals(expected_result, CodePrinter.toString());
	}
}
