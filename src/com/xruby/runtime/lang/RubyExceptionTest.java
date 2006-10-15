/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import junit.framework.TestCase;

public class RubyExceptionTest extends TestCase {
	public void test_equals() {
		RubyException a = new RubyException(RubyRuntime.NameErrorClass, "xxxxx");
		RubyException b = new RubyException(RubyRuntime.NameErrorClass, "xxxxx");
		assertEquals(a, b);
		
		RubyException c = new RubyException(RubyRuntime.NameErrorClass, "xxxxx");
		RubyException d = new RubyException(RubyRuntime.NameErrorClass, "yyyyy");
		assertTrue(!c.equals(d));
		
		RubyException e = new RubyException(RubyRuntime.NameErrorClass, "xxxxx");
		RubyException f = new RubyException(RubyRuntime.ArgumentErrorClass, "xxxxx");
		assertTrue(!e.equals(f));
	}
}
