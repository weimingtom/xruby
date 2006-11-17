package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.value.ObjectFactory;

import junit.framework.TestCase;

public class GlobalTest extends TestCase {
	public void testRaise() {
		try {
			RubyRuntime.topSelf.callMethod("raise", ObjectFactory.createString("raise exception"));
			fail("not reach here");
		} catch (RubyException e) {
		}
	}
}
