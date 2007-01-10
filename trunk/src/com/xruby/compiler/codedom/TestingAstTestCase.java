/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.io.StringReader;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.compiler.parser.RubyParser;

import junit.framework.TestCase;

class TestingAstTestCase extends TestCase {

	private Program getProgram(String program_text) {
		assertTrue(null != program_text);

		RubyParser parser = new RubyParser(new StringReader(program_text), null);

		Program p = null;
		try {
			p = parser.parse("TestingAstTestCase.rb");
		} catch (TokenStreamException e) {
			assertTrue(e.toString(), false);
		} catch (RecognitionException e) {
			e.printStackTrace();
			assertTrue(e.toString(), false);
		}

		return p;
	}

	protected void assertAstOutput(String program_text, String expected_result) {
		Program p = getProgram(program_text);
		CodePrinter cp = new CodePrinter();
		p.accept(cp);

		assertEquals(expected_result, cp.toString());
	}

	protected void assertAstEquals(String program_text1, String program_text2) {
		Program p1 = getProgram(program_text1);
		CodePrinter cp1 = new CodePrinter();
		p1.accept(cp1);
		
		Program p2 = getProgram(program_text2);
		CodePrinter cp2 = new CodePrinter();
		p2.accept(cp2);
		
		assertEquals(cp1.toString(), cp2.toString());
	}
	
}
