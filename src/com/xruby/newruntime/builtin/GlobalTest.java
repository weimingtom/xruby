package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyException;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.value.ObjectFactory;

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
