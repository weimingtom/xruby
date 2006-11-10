/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import java.math.BigInteger;

import com.xruby.runtime.lang.*;

public class ObjectFactory {
	
	public static final RubyValue trueValue = new RubyValue(RubyRuntime.TrueClassClass, null);
	public static final RubyValue falseValue = new RubyValue(RubyRuntime.FalseClassClass, null);
	public static final RubyValue nilValue = new RubyValue(RubyRuntime.NilClassClass, null);
	public static final RubyValue topLevelSelfValue = new RubyValue(RubyRuntime.ObjectClass, null);

	public static final RubyValue ObjectClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ObjectClass);
	public static final RubyValue NilClassClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.NilClassClass);
	public static final RubyValue TrueClassClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.TrueClassClass);
	public static final RubyValue FalseClassClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.FalseClassClass);
	public static final RubyValue NumericClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.NumericClass);
	public static final RubyValue IntegerClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.IntegerClass);
	public static final RubyValue FixnumClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.FixnumClass);
	public static final RubyValue FloatClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.FloatClass);
	public static final RubyValue StringClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.StringClass);
	public static final RubyValue ExceptionClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ExceptionClass);
	public static final RubyValue RuntimeErrorClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.RuntimeErrorClass);
	public static final RubyValue ArrayClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ArrayClass);
	public static final RubyValue HashClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.HashClass);
	public static final RubyValue ClassClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ClassClass);
	public static final RubyValue ModuleClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ModuleClass);
	public static final RubyValue IOClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.IOClass);
	public static final RubyValue ProcClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ProcClass);
	public static final RubyValue RangeClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.RangeClass);
	public static final RubyValue RegexpClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.RegexpClass);
	public static final RubyValue FileClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.FileClass);
	public static final RubyValue MethodClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.MethodClass);
	public static final RubyValue TimeClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.TimeClass);
	public static final RubyValue MatchDataClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.MatchDataClass);
	public static final RubyValue BignumClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.BignumClass);
	
	public static boolean isBuiltin(String name) {
		if (name.equals("Object") ||
				name.equals("NilClass") ||
				name.equals("TrueClass") ||
				name.equals("FalseClass") ||
				name.equals("Numeric") ||
				name.equals("Integer") ||
				name.equals("Fixnum") ||
				name.equals("Float") ||
				name.equals("String") ||
				name.equals("Exception") ||
				name.equals("RuntimeError") ||
				name.equals("Array") ||
				name.equals("Hash") ||
				name.equals("Class") ||
				name.equals("Module") ||
				name.equals("IO") ||
				name.equals("Proc") ||
				name.equals("Range") ||
				name.equals("Regexp") ||
				name.equals("File") ||
				name.equals("Method") ||
				name.equals("Time") ||
				name.equals("MatchDate") ||
				name.equals("Bignum")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static RubyValue createString(String value) {
		return new RubyValue(RubyRuntime.StringClass, new StringValue(value));
	}

	public static RubyValue createRegexp(String value) {
		return new RubyValue(RubyRuntime.RegexpClass, new RegexpValue(value));
	}
	
	public static RubyValue createString(StringValue value) {
		return new RubyValue(RubyRuntime.StringClass, value);
	}
	
	public static RubyValue createSymbol(String value) {
		return new RubyValue(RubyRuntime.SymbolClass, value.intern());
	}

	public static RubyValue createFixnum(int value) {
		return new RubyValue(RubyRuntime.FixnumClass, new IntegerValue(value));
	}

	public static RubyValue createFloat(double value) {
		return new RubyValue(RubyRuntime.FloatClass, new FloatValue(value));
	}
	
	public static RubyValue createClass(RubyClass value) {
		return new RubyValue(RubyRuntime.ClassClass, value);
	}

	public static RubyValue createModule(RubyModule value) {
		return new RubyValue(RubyRuntime.ModuleClass, value);
	}

	public static RubyValue createArray(RubyArray value) {
		return new RubyValue(RubyRuntime.ArrayClass, value);
	}

	public static RubyValue createEmptyArray() {
		return new RubyValue(RubyRuntime.ArrayClass, new RubyArray(0, true));
	}
	
	public static RubyValue createHash(HashValue value) {
		return new RubyValue(RubyRuntime.HashClass, value);
	}

	public static RubyValue createFile(String filename, String mode) {
		return new RubyValue(RubyRuntime.FileClass, new IOValue(filename, mode));
	}
	
	public static RubyValue createMethod(RubyValue r, String s, RubyMethod m) {
		return new RubyValue(RubyRuntime.MethodClass, new MethodValue(r, s, m));
	}

	public static RubyValue createProc(RubyBlock block) {
		return new RubyValue(RubyRuntime.ProcClass, block);
	}
	
	public static RubyValue createTime(TimeValue t) {
		return new RubyValue(RubyRuntime.TimeClass, t);
	}
	
	public static RubyValue createRange(RubyValue left, RubyValue right, boolean isExclusive) throws RubyException {
		Object l = left.getValue();
		Object r = right.getValue();
		if (!(l instanceof IntegerValue) ||
			!(r instanceof IntegerValue)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
		}
		
		return new RubyValue(RubyRuntime.RangeClass, 
			new RangeValue(((IntegerValue)l).intValue(),
				((IntegerValue)r).intValue(),
				isExclusive));
	}

	public static RubyValue createMatchData(MatchDataValue m) {
		return new RubyValue(RubyRuntime.MatchDataClass, m);
	}

	public static RubyValue createBignum(BigInteger value) { 
		return new RubyValue(RubyRuntime.BignumClass, new BignumValue(value)); 
	}
	
	public static RubyValue createInteger(String value, int radix) {
		return BignumValue.bignorm(new BigInteger(value, radix));
	}
}
