/**
 * Copyright 2007 Ye Zheng
 * Distributed under the BSD License
 */

package com.xruby.runtime.builtin;

import junit.framework.TestCase;

public class RubyNumericTest extends TestCase {
	public void testCoerce() {
		internalTestCoerce(ObjectFactory.FIXNUM1, ObjectFactory.createFloat(2.5), 2.5, 1.0);
		internalTestCoerce(ObjectFactory.createFloat(1.2), ObjectFactory.FIXNUM3, 3.0, 1.2);
		internalTestCoerce(ObjectFactory.FIXNUM1, ObjectFactory.FIXNUM2, 2, 1);
	}
	
	private void internalTestCoerce(RubyNumeric x, RubyNumeric y, double expected0, double expected1) {
		RubyArray a = x.coerce(y);
		assertEquals(expected0, a.get(0).toFloat());
		assertEquals(expected1, a.get(1).toFloat());
	}
	
	private void internalTestCoerce(RubyNumeric x, RubyNumeric y, int expected0, int expected1) {
		RubyArray a = x.coerce(y);
		assertEquals(expected0, a.get(0).toInt());
		assertEquals(expected1, a.get(1).toInt());
	}
}
