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
