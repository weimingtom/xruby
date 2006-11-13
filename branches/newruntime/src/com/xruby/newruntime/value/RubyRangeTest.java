package com.xruby.newruntime.value;

import junit.framework.TestCase;

public class RubyRangeTest extends TestCase {
	public void testInclude() {
		RubyRange range = new RubyRange();
		range.setBegin(1);
		range.setEnd(3);
		assertFalse(range.include(0));
		assertTrue(range.include(2));
		assertTrue(range.include(3));
		assertFalse(range.include(4));
		
		range.setExcludeEnd(true);
		assertFalse(range.include(3));
	}
	
	public void testToString() {
		RubyRange range = new RubyRange();
		range.setBegin(1);
		range.setEnd(3);
		assertEquals("1...3", range.toString());
	}
}
