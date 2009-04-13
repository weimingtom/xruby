/**
 * Copyright 2007 Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.builtin;

import junit.framework.TestCase;

public class RubyFixnumTest extends TestCase {
	public void testPow() {
		assertEquals(ObjectFactory.FIXNUM8, 
				ObjectFactory.FIXNUM2.pow(ObjectFactory.FIXNUM3));
		assertEquals(ObjectFactory.createFloat(0.5), 
				ObjectFactory.FIXNUM2.pow(ObjectFactory.createFixnum(-1)));
		assertEquals(ObjectFactory.createFloat(1.4142135623731).toFloat(),
				ObjectFactory.FIXNUM2.pow(ObjectFactory.createFloat(0.5)).toFloat(), 0.000000000001);
	}
}
