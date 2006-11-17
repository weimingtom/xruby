package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.RubyString;

import junit.framework.TestCase;

public class TopSelfTest extends TestCase {
	public void testMainToS() {
		RubyValue s = RubyRuntime.topSelf.callMethod("to_s");
		assertTrue(s instanceof RubyString);
		assertEquals("main", ((RubyString)s).getString());
	}
}
