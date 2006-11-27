/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import java.math.BigInteger;
import java.util.Date;
import java.util.regex.Matcher;
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
	public static final RubyValue DirClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.DirClass);
	
	public static RubyString createString(String value) {
		return new RubyString(value);
	}
	
	public static RubyString createString() {
		return new RubyString("");
	}

	public static RubyRegexp createRegexp(String value) {
		return new RubyRegexp(value);
	}

	public static RubyRegexp createRegexp() {
		return new RubyRegexp();
	}
	
	public static RubyValue createSymbol(String value) {
		return new RubyValue(RubyRuntime.SymbolClass, value.intern());
	}

	public static RubyFixnum createFixnum(int value) {
		return new RubyFixnum(value);
	}

	public static RubyFloat createFloat(double value) {
		return new RubyFloat(value);
	}
	
	public static RubyValue createClass(RubyClass value) {
		return new RubyValue(RubyRuntime.ClassClass, value);
	}

	public static RubyValue createModule(RubyModule value) {
		return new RubyValue(RubyRuntime.ModuleClass, value);
	}

	public static RubyArray createArray(int size, boolean isNotSingleAsterisk) {
		return new RubyArray(size, isNotSingleAsterisk);
	}

	public static RubyHash createHash() {
		return new RubyHash();
	}

	public static RubyIO createFile(String filename, String mode) {
		return new RubyIO(filename, mode);
	}
	
	public static MethodValue createMethod(RubyValue r, String s, RubyMethod m) {
		return new MethodValue(r, s, m);
	}

	public static RubyData<RubyBlock> createProc(RubyBlock block) {
		return new RubyData<RubyBlock>(RubyRuntime.ProcClass, block);
	}
	
	public static RubyTime createTime(Date v) {
		return new RubyTime(v);
	}

	public static RubyTime createTime() {
		return new RubyTime();
	}

	public static RubyRange createRange() {
		return new RubyRange();
	}

	public static RubyRange createRange(RubyValue left, RubyValue right, boolean isExclusive) {
		RubyRange r = new RubyRange();
		r.setValue(left, right, isExclusive);
		return r;
	}

	public static RubyMatchData createMatchData(Matcher m) {
		return new RubyMatchData(m);
	}

	public static RubyBignum createBignum(BigInteger value) { 
		return new RubyBignum(value); 
	}
	
	public static RubyValue createInteger(String value, int radix) {
		return RubyBignum.bignorm(new BigInteger(value, radix));
	}
	
	public static RubyValue createBoolean(boolean value) {
		if (value){
			return trueValue;
		}
		return falseValue;
	}
}
