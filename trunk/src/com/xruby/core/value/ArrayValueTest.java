/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.value;

import com.xruby.core.lang.*;

import junit.framework.TestCase;

public class ArrayValueTest extends TestCase {
	public void test() throws RubyException {
		ArrayValue a = new ArrayValue(0, true);
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
		ArrayValue a = new ArrayValue(1, true);
		a.add(ObjectFactory.nilValue);
		
		RubyValue v = a.collect(0);
		ArrayValue r = (ArrayValue)v.getValue();
		assertEquals(1, r.size());
		assertEquals(ObjectFactory.nilValue, r.get(0));
	}
	
	public void test_collect_empty() {
		ArrayValue a = new ArrayValue(0, true);
		
		RubyValue v = a.collect(0);
		ArrayValue r = (ArrayValue)v.getValue();
		assertEquals(0, r.size());
	}
	
	public void test_expand() {
		ArrayValue a = new ArrayValue(1, true);
		a.add(ObjectFactory.createFixnum(1));
		
		ArrayValue b = new ArrayValue(2, true);
		b.add(ObjectFactory.createFixnum(2));
		b.add(ObjectFactory.createFixnum(3));
		
		a.expand(ObjectFactory.createArray(b));
		assertEquals(3, a.size());
	}
	
	public void test_range_subarray() {
		// a = [1, 2]
		ArrayValue a = new ArrayValue(1, true);
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		// [0..1]
		RangeValue stdRange = new RangeValue(0, 1, false);
		ArrayValue rangeArray = a.subarray(stdRange);
		assertEquals(2, rangeArray.size());
		assertEquals(1, ((IntegerValue)rangeArray.get(0).getValue()).intValue());
		assertEquals(2, ((IntegerValue)rangeArray.get(1).getValue()).intValue());
		
		// [0..-1]
		RangeValue negRange = new RangeValue(0, -1, false);
		rangeArray = a.subarray(negRange);
		assertEquals(2, rangeArray.size());
		assertEquals(1, ((IntegerValue)rangeArray.get(0).getValue()).intValue());
		assertEquals(2, ((IntegerValue)rangeArray.get(1).getValue()).intValue());
		
		// [2..0]
		RangeValue oppositeRange = new RangeValue(2, 0, false);
		rangeArray = a.subarray(oppositeRange);
		assertEquals(0, rangeArray.size());
	}
	
	public void test_subarray() throws RubyException {
		// a = [1, 2, 3]
		ArrayValue a = new ArrayValue();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		a.add(ObjectFactory.createFixnum(3));
		
		// a[1, 2]
		ArrayValue b = a.subarray(1, 2);
		assertEquals(2, b.size());
		assertEquals(2, ((IntegerValue)b.get(0).getValue()).intValue());
		assertEquals(3, ((IntegerValue)b.get(1).getValue()).intValue());
		
		// begin > array size
		b = a.subarray(4, 2);
		assertNull(b);
		
		// begin < 0
		b = a.subarray(-1, 1);
		assertEquals(1, b.size());
		assertEquals(3, ((IntegerValue)b.get(0).getValue()).intValue());
		
		// length < 0
		b = a.subarray(0, -1);
		assertNull(b);
	}
	
	public void test_plus() {
		// a = [1, 2]
		ArrayValue a = new ArrayValue();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		// b = [3, 4]
		ArrayValue b = new ArrayValue();
		a.add(ObjectFactory.createFixnum(3));
		a.add(ObjectFactory.createFixnum(4));
		
		// [1, 2, 3, 4]
		ArrayValue newArray = a.plus(b);
		assertEquals(4, newArray.size());
		assertEquals(1, ((IntegerValue)newArray.get(0).getValue()).intValue());
		assertEquals(2, ((IntegerValue)newArray.get(1).getValue()).intValue());
		assertEquals(3, ((IntegerValue)newArray.get(2).getValue()).intValue());
		assertEquals(4, ((IntegerValue)newArray.get(3).getValue()).intValue());
	}
	
	public void test_times() throws RubyException {
		// a = [1, 2]
		ArrayValue a = new ArrayValue();
		a.add(ObjectFactory.createFixnum(1));
		a.add(ObjectFactory.createFixnum(2));
		
		// [1, 2, 1, 2]
		ArrayValue newArray = a.times(2);
		assertEquals(4, newArray.size());
		assertEquals(1, ((IntegerValue)newArray.get(0).getValue()).intValue());
		assertEquals(2, ((IntegerValue)newArray.get(1).getValue()).intValue());
		assertEquals(1, ((IntegerValue)newArray.get(2).getValue()).intValue());
		assertEquals(2, ((IntegerValue)newArray.get(3).getValue()).intValue());
		
		// []
		newArray = a.times(0);
		assertEquals(0, newArray.size());
		
		try {
			a.times(-1);
			fail("exception should be thrown");
		} catch (RubyException re) {			
		}
	}
}
