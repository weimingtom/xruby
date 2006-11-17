package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubySymbol;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.StringMap;

import junit.framework.TestCase;

public class KernelTest extends TestCase {
	public void testSend() {
		RubySymbol classSymbol = StringMap.intern("class").toSymbol();
		RubyValue objectClass = RubyRuntime.objectClass.callMethod("send", classSymbol);
		assertEquals(RubyRuntime.classClass, objectClass);		
	}
}
