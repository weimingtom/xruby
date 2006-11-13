/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

import junit.framework.TestCase;

public class RubyArrayTest extends TestCase {
	public void test() {
		RubyArray a = new RubyArray(0, true);
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
		RubyArray a = new RubyArray(1, true);
		a.add(ObjectFactory.nilValue);
		
		RubyValue v = a.collect(0);
		RubyArray r = (RubyArray)v.getValue();
		assertEquals(1, r.size());
		assertEquals(ObjectFactory.nilValue, r.get(0));
	}
	
	public void test_collect_empty() {
		RubyArray a = new RubyArray(0, true);
		
		RubyValue v = a.collect(0);
		RubyArray r = (RubyArray)v.getValue();
		assertEquals(0, r.size());
	}
	
	public void test_expand() {
		RubyArray a = new RubyArray(1, true);
		a.add(ObjectFactory.createFixnum(1));
		
		RubyArray b = new RubyArray(2, true);
		b.add(ObjectFactory.createFixnum(2));
		b.add(ObjectFactory.createFixnum(3));
		
		a.expand(ObjectFactory.createArray(b));
		assertEquals(3, a.size());
	}
	
	public void test_subarray() {
		// a = [1, 2, 3]
		RubyArray a = new RubyArray();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		a.add(ObjectFactory.createFixnum(3));
		
		// a[1, 2]
		RubyArray b = a.subarray(1, 2);
		assertEquals(2, b.size());
		assertEquals(2, ((RubyFixnum)b.get(0).getValue()).intValue());
		assertEquals(3, ((RubyFixnum)b.get(1).getValue()).intValue());
		
		// begin > array size
		b = a.subarray(4, 2);
		assertNull(b);
		
		// begin < 0
		b = a.subarray(-1, 1);
		assertEquals(1, b.size());
		assertEquals(3, ((RubyFixnum)b.get(0).getValue()).intValue());
		
		// length < 0
		b = a.subarray(0, -1);
		assertNull(b);
	}
	
	public void test_plus() {
		// a = [1, 2]
		RubyArray a = new RubyArray();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		// b = [3, 4]
		RubyArray b = new RubyArray();
		a.add(ObjectFactory.createFixnum(3));
		a.add(ObjectFactory.createFixnum(4));
		
		// [1, 2, 3, 4]
		RubyArray newArray = a.plus(b);
		assertEquals(4, newArray.size());
		assertEquals(1, ((RubyFixnum)newArray.get(0).getValue()).intValue());
		assertEquals(2, ((RubyFixnum)newArray.get(1).getValue()).intValue());
		assertEquals(3, ((RubyFixnum)newArray.get(2).getValue()).intValue());
		assertEquals(4, ((RubyFixnum)newArray.get(3).getValue()).intValue());
	}
	
	public void test_times() {
		// a = [1, 2]
		RubyArray a = new RubyArray();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		// [1, 2, 1, 2]
		RubyArray newArray = a.times(2);
		assertEquals(4, newArray.size());
		assertEquals(1, ((RubyFixnum)newArray.get(0).getValue()).intValue());
		assertEquals(2, ((RubyFixnum)newArray.get(1).getValue()).intValue());
		assertEquals(1, ((RubyFixnum)newArray.get(2).getValue()).intValue());
		assertEquals(2, ((RubyFixnum)newArray.get(3).getValue()).intValue());
		
		// []
		newArray = a.times(0);
		assertEquals(0, newArray.size());
		
		try {
			a.times(-1);
			fail("exception should be thrown");
		} catch (RubyException re) {			
		}
	}
	
	public void test_remove() {
		// a = [1, 2]
		RubyArray a = new RubyArray();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		RubyValue v = a.remove(0);
		assertEquals(1, a.size());
		assertEquals(1, ((RubyFixnum)v.getValue()).intValue());
		assertEquals(2, ((RubyFixnum)a.get(0).getValue()).intValue());

		RubyArray b = new RubyArray();
		v = b.remove(1);
		assertEquals(ObjectFactory.nilValue, v);
		
		// remove negative index
		RubyArray c = new RubyArray();
		v = c.remove(-1);
		assertEquals(ObjectFactory.nilValue, v);
	}

	public void test_includes() {
		RubyArray a = new RubyArray();
		RubyValue i1 = ObjectFactory.createFixnum(1);
		RubyValue i2 = ObjectFactory.createFixnum(2);
		RubyValue i3 = ObjectFactory.createFixnum(2);
		RubyValue i4 = ObjectFactory.createFixnum(4);

		assertTrue(!a.include(i1));
		assertTrue(!a.include(i2));
		assertTrue(!a.include(i3));
		assertTrue(!a.include(i4));

		a.add(i1);
		a.add(i2);

		assertTrue(a.include(i1));
		assertTrue(a.include(i2));
		assertTrue(a.include(i3));
		assertTrue(!a.include(i4));
	}
}
