package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubySymbol;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.lang.StringMap;

import junit.framework.TestCase;

public class KernelTest extends TestCase {
	public void testSend() {
		RubySymbol classSymbol = StringMap.intern("class").toSymbol();
		RubyValue objectClass = RubyRuntime.objectClass.callMethod("send", classSymbol);
		assertEquals(RubyRuntime.classClass, objectClass);		
	}
}
