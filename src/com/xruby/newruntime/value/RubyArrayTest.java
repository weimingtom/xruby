package com.xruby.newruntime.value;

import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyException;

import junit.framework.TestCase;

public class RubyArrayTest extends TestCase {
	public void testInit() {
		RubyArray array = new RubyArray();
		assertEquals(0, array.length());
		assertTrue(array.isEmpty());
	}
	
	public void testAccess() {
		// 0 element
		RubyArray array = new RubyArray();
		assertEquals(RubyConstant.QNIL, array.get(0));
			
		// 1 element
		array.set(0, RubyFixnum.int2Fix(0));
		assertFalse(array.isEmpty());
		assertEquals(1, array.length());
		assertEquals(RubyFixnum.int2Fix(0), array.get(0));
		
		// 2 elements
		array.set(2, RubyFixnum.int2Fix(2));
		assertEquals(3, array.length());
		assertEquals(RubyFixnum.int2Fix(2), array.get(2));
		assertEquals(RubyConstant.QNIL, array.get(1));		
		assertEquals(RubyFixnum.int2Fix(2), array.get(-1));
		
		array.set(-1, RubyFixnum.int2Fix(3));
		assertEquals(3, array.length());
		assertEquals(RubyFixnum.int2Fix(3), array.get(2));
		assertEquals(RubyFixnum.int2Fix(3), array.get(-1));
		
		// exception test
		array = new RubyArray();
		try {
			array.set(-1, RubyFixnum.int2Fix(0));
		} catch (RubyException e) {
		}
	}
	
	public void testEquals() {
		RubyArray array0 = new RubyArray();
		assertTrue(array0.equals(array0));
		
		RubyArray array1 = new RubyArray();
		array1.set(0, RubyFixnum.int2Fix(0));
		assertFalse(array0.equals(array1));
	}
	
	
	public void testConcat() {
		RubyArray array0 = new RubyArray();
		array0.set(0, RubyFixnum.int2Fix(0));
		
		RubyArray array1 = new RubyArray();
		array1.set(0, RubyFixnum.int2Fix(1));
		
		array0.concat(array1);
		assertEquals(2, array0.length());
		assertEquals(0, ((RubyFixnum)array0.get(0)).longValue());
		assertEquals(1, ((RubyFixnum)array0.get(1)).longValue());
	}
	
	public void testPlus() {
		RubyArray array0 = new RubyArray();
		array0.set(0, RubyFixnum.int2Fix(0));
		
		RubyArray array1 = new RubyArray();
		array1.set(0, RubyFixnum.int2Fix(1));
		
		RubyArray array2 = array0.plus(array1);
		assertEquals(2, array2.length());
		assertEquals(0, ((RubyFixnum)array2.get(0)).longValue());
		assertEquals(1, ((RubyFixnum)array2.get(1)).longValue());
		
		assertEquals(1, array0.length());
	}
	
	public void testTimes() {
		RubyArray array = new RubyArray();
		array.set(0, RubyFixnum.int2Fix(0));
		
		RubyArray result = array.times(2);
		assertEquals(2, result.length());
		assertEquals(0, ((RubyFixnum)result.get(0)).longValue());
		assertEquals(0, ((RubyFixnum)result.get(1)).longValue());
		
		assertEquals(1, array.length());
		
		// 0 times
		result = array.times(0);
		assertEquals(0, result.length());
		
		// exception
		try {
			array.times(-1);
		} catch (RubyException e) {			
		}		
	}
	
	public void testIncludes() {
		RubyArray array = new RubyArray();
		RubyFixnum includeValue = RubyFixnum.int2Fix(0);
		array.set(0, includeValue);
		
		assertTrue(array.include(includeValue));
		assertFalse(array.include(RubyFixnum.int2Fix(1)));
		assertTrue(array.include(RubyFixnum.int2Fix(0)));
	}
	
	public void test_isNotSingleAsterisk() {
		RubyArray array = new RubyArray();
		assertTrue(array.isNotSingleAsterisk());
		
		array = new RubyArray(2);
		assertTrue(array.isNotSingleAsterisk());
		
		array = new RubyArray(3, true);
		assertTrue(array.isNotSingleAsterisk());
		
		array = new RubyArray(4, false);
		assertTrue(!array.isNotSingleAsterisk());
	}
}
