package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyString;

import junit.framework.TestCase;

public class ArrayTest extends TestCase {
	public void testInit() {
		RubyValue value = RubyRuntime.arrayClass.newInstance();
		assertTrue(value instanceof RubyArray);
		RubyArray array = (RubyArray)value;
		assertEquals(0, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(RubyConstant.QTRUE, array.callMethod("empty?"));
		assertEquals(array, array.callMethod("to_ary"));
		assertEquals(RubyConstant.QTRUE, array.callMethod("==", new RubyArray(array)));
		assertEquals("", ((RubyString)array.callMethod("to_s")).getString());
	}
	
	public void testAccess() {
		// 0 element
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		RubyFixnum index0 = RubyFixnum.int2Fix(0);
		RubyValue value0 = RubyFixnum.int2Fix(0);
		assertEquals(RubyConstant.QNIL, array.callMethod("[]", index0));
		
		// 1 element
		array.callMethod("[]=", new RubyArray(index0, value0));
		assertEquals(1, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(RubyConstant.QFALSE, array.callMethod("empty?"));
		assertEquals(value0, array.callMethod("[]", index0));
		assertEquals("0", ((RubyString)array.callMethod("to_s")).getString());
		
		// 2 elements
		RubyFixnum index1 = RubyFixnum.int2Fix(1);
		RubyFixnum index2 = RubyFixnum.int2Fix(2);
		RubyValue value2 = RubyFixnum.int2Fix(2);
		array.callMethod("[]=", new RubyArray(index2, value2));
		assertEquals(3, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(RubyConstant.QNIL, array.callMethod("[]", index1));
		assertEquals(value2, array.callMethod("[]", index2));
		assertEquals("02", ((RubyString)array.callMethod("to_s")).getString());
	}
	
	public void testEquals() {
		RubyValue array0 = RubyRuntime.arrayClass.newInstance();
		assertEquals(RubyConstant.QTRUE, array0.callMethod("==", array0));
		
		RubyValue array1 = RubyRuntime.arrayClass.newInstance();		
		array1.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(1)));
		assertEquals(RubyConstant.QFALSE, array0.callMethod("==", array1));
	}
	
	public void testConcat() {
		RubyValue array0 = RubyRuntime.arrayClass.newInstance();
		array0.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		RubyValue array1 = RubyRuntime.arrayClass.newInstance();		
		array1.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(1)));
		
		RubyValue result = array0.callMethod("concat", array1);
		assertEquals(array0, result);
		assertEquals(2, ((RubyFixnum)array0.callMethod("length")).longValue());
		assertEquals(0, ((RubyFixnum)array0.callMethod("[]", RubyFixnum.int2Fix(0))).longValue());
		assertEquals(1, ((RubyFixnum)array0.callMethod("[]", RubyFixnum.int2Fix(1))).longValue());
	}
	
	public void testPlus() {
		RubyValue array0 = RubyRuntime.arrayClass.newInstance();
		array0.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		RubyValue array1 = RubyRuntime.arrayClass.newInstance();		
		array1.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(1)));
		
		RubyValue result = array0.callMethod("+", array1);
		
		assertEquals(2, ((RubyFixnum)result.callMethod("length")).longValue());
		assertEquals(0, ((RubyFixnum)result.callMethod("[]", RubyFixnum.int2Fix(0))).longValue());
		assertEquals(1, ((RubyFixnum)result.callMethod("[]", RubyFixnum.int2Fix(1))).longValue());
		
		assertEquals(1, ((RubyFixnum)array0.callMethod("length")).longValue());
	}
	
	public void testTimes() {
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		array.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		RubyValue result = array.callMethod("*", RubyFixnum.int2Fix(2));
		
		assertEquals(2, ((RubyFixnum)result.callMethod("length")).longValue());
		assertEquals(0, ((RubyFixnum)result.callMethod("[]", RubyFixnum.int2Fix(0))).longValue());
		assertEquals(0, ((RubyFixnum)result.callMethod("[]", RubyFixnum.int2Fix(1))).longValue());
		
		assertEquals(1, ((RubyFixnum)array.callMethod("length")).longValue());
	}
	
	public void testPush() {
		// single push
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		array.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		RubyFixnum pushValue = RubyFixnum.int2Fix(2);
		RubyValue result = array.callMethod("push", pushValue);
		assertEquals(result, array);
		assertEquals(2, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(pushValue, array.callMethod("[]", RubyFixnum.int2Fix(1)));
		
		// multi push
		array = RubyRuntime.arrayClass.newInstance();
		array.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		RubyFixnum pushValue0 = RubyFixnum.int2Fix(0);
		RubyFixnum pushValue1 = RubyFixnum.int2Fix(1);
		result = array.callMethod("push", new RubyArray(pushValue0, pushValue1));
		assertEquals(result, array);
		assertEquals(3, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(pushValue0, array.callMethod("[]", RubyFixnum.int2Fix(1)));
		assertEquals(pushValue1, array.callMethod("[]", RubyFixnum.int2Fix(2)));
		
		// <<
		array = RubyRuntime.arrayClass.newInstance();
		array.callMethod("[]=", new RubyArray(RubyFixnum.int2Fix(0), RubyFixnum.int2Fix(0)));
		
		pushValue = RubyFixnum.int2Fix(2);
		result = array.callMethod("<<", pushValue);
		assertEquals(result, array);
		assertEquals(2, ((RubyFixnum)array.callMethod("length")).longValue());
		assertEquals(pushValue, array.callMethod("[]", RubyFixnum.int2Fix(1)));		
	}
	
	public void testPop() {
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		RubyFixnum popValue = RubyFixnum.int2Fix(0);
		array.callMethod("[]=", new RubyArray(popValue, popValue));
		assertEquals(popValue, array.callMethod("pop"));
		assertEquals(RubyConstant.QNIL, array.callMethod("pop"));
	}
	
	public void testDelete() {
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		RubyFixnum popValue = RubyFixnum.int2Fix(0);
		array.callMethod("[]=", new RubyArray(popValue, popValue));
		assertEquals(popValue, array.callMethod("delete_at", RubyFixnum.int2Fix(0)));
		assertEquals(RubyConstant.QNIL, array.callMethod("delete_at", RubyFixnum.int2Fix(0)));
	}
	
	public void testInclude() {
		RubyValue array = RubyRuntime.arrayClass.newInstance();
		RubyFixnum includeValue = RubyFixnum.int2Fix(0);
		array.callMethod("[]=", new RubyArray(includeValue, includeValue));
		assertEquals(RubyConstant.QTRUE, array.callMethod("include?", includeValue));
		assertEquals(RubyConstant.QFALSE, array.callMethod("include?", RubyFixnum.int2Fix(1)));
	}
}
