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
	
	public static RubyValue createString(String value) {
		return new RubyValue(RubyRuntime.StringClass, new RubyString(value));
	}

	public static RubyValue createRegexp(String value) {
		return new RubyValue(RubyRuntime.RegexpClass, new RubyRegexp(value));
	}
	
	public static RubyValue createString(RubyString value) {
		return new RubyValue(RubyRuntime.StringClass, value);
	}
	
	public static RubyValue createSymbol(String value) {
		return new RubyValue(RubyRuntime.SymbolClass, value.intern());
	}

	public static RubyValue createFixnum(int value) {
		return new RubyValue(RubyRuntime.FixnumClass, new RubyFixnum(value));
	}

	public static RubyValue createFloat(double value) {
		return new RubyValue(RubyRuntime.FloatClass, new RubyFloat(value));
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
	
	public static RubyValue createHash(RubyHash value) {
		return new RubyValue(RubyRuntime.HashClass, value);
	}

	public static RubyValue createFile(String filename, String mode) {
		return new RubyValue(RubyRuntime.FileClass, new RubyIO(filename, mode));
	}
	
	public static RubyValue createMethod(RubyValue r, String s, RubyMethod m) {
		return new RubyValue(RubyRuntime.MethodClass, new MethodValue(r, s, m));
	}

	public static RubyValue createProc(RubyBlock block) {
		return new RubyValue(RubyRuntime.ProcClass, block);
	}
	
	public static RubyValue createTime(RubyTime t) {
		return new RubyValue(RubyRuntime.TimeClass, t);
	}
	
	public static RubyValue createRange(RubyValue left, RubyValue right, boolean isExclusive) {
		// test operator <=>
		RubyMethod m = left.findMethod("<=>");
		if (m == null){
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
		}
		RubyArray args = new RubyArray();
		args.add(right);
		try{
			RubyValue result = m.invoke(left, args, null);
			if (result == ObjectFactory.nilValue){
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
			}
		}catch(RubyException exception){
			if (exception.getRubyValue().getRubyClass() == RubyRuntime.ArgumentErrorClass){
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
			}
			throw exception;
		}
		return new RubyValue(RubyRuntime.RangeClass, new RubyRange(left, right, isExclusive));
	}

	public static RubyValue createMatchData(RubyMatchData m) {
		return new RubyValue(RubyRuntime.MatchDataClass, m);
	}

	public static RubyValue createBignum(BigInteger value) { 
		return new RubyValue(RubyRuntime.BignumClass, new BignumValue(value)); 
	}
	
	public static RubyValue createInteger(String value, int radix) {
		return BignumValue.bignorm(new BigInteger(value, radix));
	}
	
	public static RubyValue createBoolean(boolean value) {
		if (value){
			return trueValue;
		}
		return falseValue;
	}
}
