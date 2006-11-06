package com.xruby.newruntime.builtin;

import junit.framework.TestCase;

import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyFixnum;
import com.xruby.newruntime.value.RubyHash;

public class HashTest extends TestCase {
	public void testInit() {
		RubyValue value = RubyRuntime.hashClass.newInstance();
		assertTrue(value instanceof RubyHash);
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("size"));
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("length"));
		assertEquals(RubyConstant.QTRUE, value.callMethod("empty?"));
	}
	
	public void testAccess() {
		RubyValue hash = RubyRuntime.hashClass.newInstance();
		RubyFixnum key = RubyFixnum.int2Fix(0);
		assertEquals(RubyConstant.QNIL, hash.callMethod("[]", key));
		RubyFixnum value = RubyFixnum.int2Fix(1);
		hash.callMethod("[]=", new RubyValue[]{key, value});
		assertEquals(value, hash.callMethod("[]", key));
	}
}
