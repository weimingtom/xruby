/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.io.StringReader;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.parser.RubyParser;

import junit.framework.TestCase;

class TestingAstTestCase extends TestCase {

	protected Program getProgram(String program_text) {
		assertTrue(null != program_text);

		RubyParser parser = new RubyParser(new StringReader(program_text));

		Program p = null;
		try {
			p = parser.parse();
		} catch (TokenStreamException e) {
			assertTrue(e.toString(), false);
		} catch (RecognitionException e) {
			e.printStackTrace();
			assertTrue(e.toString(), false);
		}

		return p;
	}
	
}
