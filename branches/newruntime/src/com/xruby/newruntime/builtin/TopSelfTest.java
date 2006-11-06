package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyString;

import junit.framework.TestCase;

public class TopSelfTest extends TestCase {
	public void testMainToS() {
		RubyValue s = RubyRuntime.topSelf.callMethod("to_s");
		assertTrue(s instanceof RubyString);
		assertEquals("main", ((RubyString)s).getString());
	}
}
