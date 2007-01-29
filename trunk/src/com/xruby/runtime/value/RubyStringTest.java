/** 
 * Copyright 2005-2007 Xue Yong Zhi
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
}
