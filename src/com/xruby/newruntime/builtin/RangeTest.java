package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyArray;
import com.xruby.newruntime.value.RubyFixnum;
import com.xruby.newruntime.value.RubyRange;
import com.xruby.newruntime.value.RubyString;

import junit.framework.TestCase;

public class RangeTest extends TestCase {
	public void testInit() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyValue value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, end));
		assertTrue(value instanceof RubyRange);
		RubyRange range = (RubyRange)value;
		assertEquals(begin.intValue(), range.getBegin());
		assertEquals(end.intValue(), range.getEnd());
	}
	
	public void testInclude() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyValue value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, end));
		RubyRange range = (RubyRange)value;
		
		assertEquals(RubyConstant.QTRUE, range.callMethod("===", begin));
		assertEquals(RubyConstant.QTRUE, range.callMethod("member?", begin));
		assertEquals(RubyConstant.QTRUE, range.callMethod("include?", begin));		
	}
	
	public void testToS() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyValue value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, end));
		RubyRange range = (RubyRange)value;
		
		assertEquals("1...2", ((RubyString)range.callMethod("to_s")).getString());		
	}
	
	public void testBeginEnd() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyValue value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, end));
		RubyRange range = (RubyRange)value;
		
		assertEquals(begin, range.callMethod("begin"));
		assertEquals(end, range.callMethod("end"));
		assertEquals(begin, range.callMethod("first"));
		assertEquals(end, range.callMethod("last"));
	}
	
	public void testExcludeEnd() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyArray args = new RubyArray();
		args.add(begin);
		args.add(end);
		args.add(RubyConstant.QTRUE);
		RubyValue value = RubyRuntime.rangeClass.newInstance(args);
		RubyRange range = (RubyRange)value;
		assertEquals(true, range.isExcludeEnd());
		
		assertEquals(RubyConstant.QTRUE, range.callMethod("exclude_end?"));
	}
	
	public void testEqual() {
		RubyFixnum begin = RubyFixnum.int2Fix(1);
		RubyFixnum end = RubyFixnum.int2Fix(2);
		RubyValue value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, end));
		RubyRange range = (RubyRange)value;
		assertEquals(RubyConstant.QTRUE, range.callMethod("==", value));
		
		value = RubyRuntime.rangeClass.newInstance(new RubyArray(begin, RubyFixnum.int2Fix(3)));
		assertEquals(RubyConstant.QFALSE, range.callMethod("==", value));
	}
}
