/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import junit.framework.TestCase;

public class RubyRegexpTest extends TestCase {
	public void test_match() {
		assertTrue((new RubyRegexp("^f.*r$")).caseEqual("foobar"));
		assertTrue((new RubyRegexp("hello")).caseEqual("hello"));
		assertTrue(!(new RubyRegexp("hellxxx")).caseEqual("hello"));
		assertTrue((new RubyRegexp("(.)(.)(\\d+)(\\d)")).caseEqual("THX1138."));
		assertEquals(1, (new RubyRegexp("(.)(.)(\\d+)(\\d)")).matchPosition("THX1138."));
		assertEquals(-1, (new RubyRegexp("(.)(.)(\\d+)(\\d)")).matchPosition("THX1."));
		assertEquals(0, (new RubyRegexp("^$")).matchPosition(""));
	}
}
