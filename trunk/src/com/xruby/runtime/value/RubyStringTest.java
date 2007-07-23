/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import junit.framework.TestCase;

public class RubyStringTest extends TestCase {
	public void test_equal() {
		RubyString a = new RubyString("xxx");
		RubyString b = new RubyString("xxx");
		RubyString c = new RubyString("yyy");
		assertTrue(a.equals(a));
		assertTrue(a.equals(b));
		assertTrue(!a.equals(c));
	}
	
	public void testToInt() {
		RubyString a = new RubyString("5");
		assertEquals(5, a.toInt());
	}
	
	public void test_chop() {
		RubyString x = new RubyString("x");
		x.chop();
		assertEquals("", x.toString());
		
		RubyString y = new RubyString("xyz");
		y.chop();
		assertEquals("xy", y.toString());
		
		RubyString z = new RubyString("xy\r\n");
		z.chop();
		assertEquals("xy", z.toString());
	}
	
	public void test_dump() {
		RubyString s = new RubyString("abc");
		assertEquals("\"abc\"", s.dump());
		
		s = new RubyString("123");
		assertEquals("\"123\"", s.dump());
		
		s = new RubyString("a\r\n");
		assertEquals("\"a\\r\\n\"", s.dump());
	}
}
