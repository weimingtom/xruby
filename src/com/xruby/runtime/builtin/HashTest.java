package com.xruby.runtime.builtin;

import junit.framework.TestCase;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyHash;
import com.xruby.runtime.value.RubyArray;

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
		hash.callMethod("[]=", new RubyArray(key, value));
		assertEquals(value, hash.callMethod("[]", key));
	}
}
