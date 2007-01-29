/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;

public class RubyRuntimeTest extends TestCase {
	public void test_isBuiltinClass() {
		assertTrue(RubyRuntime.isBuiltinClass("Binding"));
		assertTrue(RubyRuntime.isBuiltinClass("Class"));
		assertTrue(!RubyRuntime.isBuiltinClass("XXXX"));
		assertTrue(!RubyRuntime.isBuiltinClass("class"));
	}
}
