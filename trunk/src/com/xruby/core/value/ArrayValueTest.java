/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.value;

import com.xruby.core.lang.*;

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
	
	public void test_collect() {
		ArrayValue a = new ArrayValue(1);
		a.add(ObjectFactory.nilValue);
		
		RubyValue v = a.collect(0);
		ArrayValue r = (ArrayValue)v.getValue();
		assertEquals(1, r.size());
		assertEquals(ObjectFactory.nilValue, r.get(0));
	}
	
	public void test_collect_empty() {
		ArrayValue a = new ArrayValue(0);
		
		RubyValue v = a.collect(0);
		ArrayValue r = (ArrayValue)v.getValue();
		assertEquals(0, r.size());
	}
	
	public void test_expand() {
		ArrayValue a = new ArrayValue(1);
		a.add(ObjectFactory.createFixnum(1));
		
		ArrayValue b = new ArrayValue(2);
		b.add(ObjectFactory.createFixnum(2));
		b.add(ObjectFactory.createFixnum(3));
		
		a.expand(ObjectFactory.createArray(b));
		assertEquals(3, a.size());
	}
}
