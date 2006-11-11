package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyFixnum;

public class RubyUtil {	
	public static long valueToLong(RubyValue value) {
		if (value instanceof RubyFixnum) {
			return ((RubyFixnum)value).longValue();
		}
		
		if (value == RubyConstant.QNIL) {
			RubyRuntime.raise(RubyRuntime.typeError, "no implicit conversion from nil to integer");
		}
		
		// FIXME: convert
		return 0;
	}
	
	public static int valueToInt(RubyValue value) {
		return (int)valueToLong(value);
	}
	
	public static boolean equal(RubyValue value1, RubyValue value2) {
		if (value1 == value2) {
			return true;
		}
		
		if (value1 == null) {
			return false;
		}
		
		return RubyUtil.test(value1.callMethod("==", value2));
	}

	public static boolean test(RubyValue value) {
		return value != RubyConstant.QNIL && value != RubyConstant.QFALSE; 
	}

	public static RubyConstant test(boolean value) {
		return value ? RubyConstant.QTRUE : RubyConstant.QFALSE; 
	}

	public static RubyClass classof(RubyValue value) {
		if (value == RubyConstant.QTRUE) {
			return RubyRuntime.trueClass;
		} 
		
		if (value == RubyConstant.QFALSE) {
			return RubyRuntime.falseClass;
		}
		
		if (value == RubyConstant.QNIL) {
			return RubyRuntime.nilClass;
		}
		
		if (value instanceof RubyFixnum) {
			return RubyRuntime.fixnumClass;
		}
		
		RubyBasic basic = (RubyBasic)value;
		return basic.getRubyClass();
	}
}
