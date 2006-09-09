/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.RubyException;
import com.xruby.core.lang.RubyValue;

import junit.framework.TestCase;

public class ArrayValueTest extends TestCase {
	public void test() throws RubyException {
		ArrayValue a = new ArrayValue(0);
		assertEquals(0, a.size());
		assertEquals(ObjectFactory.nilValue, a.get(-1));
		assertEquals(ObjectFactory.nilValue, a.get(0));
		assertEquals(ObjectFactory.nilValue, a.get(1));
		
		RubyValue i = ObjectFactory.createFixnum(999);
		assertEquals(i, a.set(0, i));
		assertEquals(1, a.size());
		
		RubyValue s = ObjectFactory.createString("xxx");
		assertEquals(s, a.set(4, s));
		assertEquals(5, a.size());
		
		assertEquals(i, a.get(0));
		assertEquals(ObjectFactory.nilValue, a.get(1));
		assertEquals(ObjectFactory.nilValue, a.get(2));
		assertEquals(ObjectFactory.nilValue, a.get(3));
		assertEquals(s, a.get(4));
		assertEquals(ObjectFactory.nilValue, a.get(5));
		
		assertEquals(s, a.get(-1));
		assertEquals(ObjectFactory.nilValue, a.get(-2));
		assertEquals(ObjectFactory.nilValue, a.get(-3));
		assertEquals(ObjectFactory.nilValue, a.get(-4));
		assertEquals(i, a.get(-5));
		assertEquals(ObjectFactory.nilValue, a.get(-6));
		
		RubyValue b = ObjectFactory.trueValue;
		assertEquals(b, a.set(-1, b));
		assertEquals(b, a.get(4));
	}
}
