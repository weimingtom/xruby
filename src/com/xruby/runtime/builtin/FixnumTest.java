package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyString;

import junit.framework.TestCase;

// RubyFixnum can't be initialized by new
public class FixnumTest extends TestCase {
	public void testToS() {
		RubyFixnum num0 = RubyFixnum.int2Fix(0);
		assertEquals("0", ((RubyString)num0.callMethod("to_s")).getString());
		
		RubyFixnum num6 = RubyFixnum.int2Fix(6);
		RubyFixnum radix = RubyFixnum.int2Fix(5);
		assertEquals("11", ((RubyString)num6.callMethod("to_s", radix)).getString());
	}
	
	public void testEquals() {
		RubyFixnum num0 = RubyFixnum.int2Fix(0);
		RubyFixnum num1 = RubyFixnum.int2Fix(1);
		assertEquals(RubyConstant.QTRUE, num0.callMethod("==", num0));
		assertEquals(RubyConstant.QFALSE, num0.callMethod("==", num1));
	}
	
	public void testShift() {
		// lshift
		RubyFixnum value = RubyFixnum.int2Fix(2);
		assertEquals(RubyFixnum.int2Fix(4), value.callMethod("<<", RubyFixnum.int2Fix(1)));
		
		// rshift
		assertEquals(RubyFixnum.int2Fix(1), value.callMethod(">>", RubyFixnum.int2Fix(1)));
	}
	
	public void testArithmeticOp() {
		RubyFixnum value = RubyFixnum.int2Fix(2);
		assertEquals(RubyFixnum.int2Fix(4), value.callMethod("+", value));
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("-", value));
		assertEquals(RubyFixnum.int2Fix(4), value.callMethod("*", value));
		assertEquals(RubyFixnum.int2Fix(1), value.callMethod("/", value));
		assertEquals(RubyFixnum.int2Fix(1), value.callMethod("div", value));
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("%", value));
		assertEquals(RubyFixnum.int2Fix(2), value.callMethod("abs"));
	}
	
	public void testRelationOp() {
		RubyFixnum value = RubyFixnum.int2Fix(2);
		RubyFixnum target = RubyFixnum.int2Fix(1);
		assertEquals(RubyConstant.QTRUE, value.callMethod(">", target));
		assertEquals(RubyConstant.QTRUE, value.callMethod(">=", target));
		assertEquals(RubyConstant.QFALSE, value.callMethod("<", target));
		assertEquals(RubyConstant.QFALSE, value.callMethod("<=", target));
	}
	
	public void testLogicOp() {
		RubyFixnum value = RubyFixnum.int2Fix(2);
		RubyFixnum target = RubyFixnum.int2Fix(0);
		assertEquals(RubyFixnum.int2Fix(-3), value.callMethod("~"));
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("&", target));
		assertEquals(RubyFixnum.int2Fix(2), value.callMethod("|", target));
		assertEquals(RubyFixnum.int2Fix(2), value.callMethod("^", target));
	}
	
	public void testCompare() {
		RubyFixnum value = RubyFixnum.int2Fix(2);
		RubyFixnum target = RubyFixnum.int2Fix(0);
		assertEquals(RubyFixnum.int2Fix(0), value.callMethod("<=>", value));
		assertEquals(RubyFixnum.int2Fix(1), value.callMethod("<=>", target));
		assertEquals(RubyFixnum.int2Fix(-1), target.callMethod("<=>", value));
	}
	
	public void testZero() {
		RubyFixnum value = RubyFixnum.int2Fix(2);
		RubyFixnum zero = RubyFixnum.int2Fix(0);
		
		assertEquals(RubyConstant.QFALSE, value.callMethod("zero?"));
		assertEquals(RubyConstant.QTRUE, zero.callMethod("zero?"));		
	}
}
