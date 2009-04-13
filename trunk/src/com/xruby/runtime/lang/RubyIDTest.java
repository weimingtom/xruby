/** 
 * Copyright 2005-2007 Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;

public class RubyIDTest extends TestCase {
	public void testIntern() {
		String text = "test";
		
		RubyID id = RubyID.intern(text);
		assertEquals(text, id.toString());		
		assertEquals(id, RubyID.intern(text));
	}
}
