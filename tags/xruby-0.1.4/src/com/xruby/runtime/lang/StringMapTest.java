/** 
 * Copyright 2005-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;

public class StringMapTest extends TestCase {
	public void testIntern() {
		String text = "test";
		
		RubyID id = StringMap.intern(text);
		assertEquals(text, StringMap.id2name(id));		
		assertEquals(id, StringMap.intern(text));
	}
}
