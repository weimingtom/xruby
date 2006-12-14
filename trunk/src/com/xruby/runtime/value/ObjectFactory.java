/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import java.math.BigInteger;
import java.util.Date;
import java.util.regex.Matcher;
import com.xruby.runtime.lang.*;

public class ObjectFactory {
	
	public static final RubyValue trueValue = new RubyObject(RubyRuntime.TrueClassClass);
	public static final RubyValue falseValue = new RubyObject(RubyRuntime.FalseClassClass);
	public static final RubyValue nilValue = new RubyObject(RubyRuntime.NilClassClass);
	public static final RubyValue topLevelSelfValue = new RubyObject(RubyRuntime.ObjectClass);

	//For preformance reason, some frequently used numbers are predefined here.
	public static final RubyFixnum fixnum0 = new RubyFixnum(0);
	public static final RubyFixnum fixnum1 = new RubyFixnum(1);
	public static final RubyFixnum fixnum2 = new RubyFixnum(2);
	public static final RubyFixnum fixnum3 = new RubyFixnum(3);
	public static final RubyFixnum fixnum4 = new RubyFixnum(4);
	public static final RubyFixnum fixnum5 = new RubyFixnum(5);
	public static final RubyFixnum fixnum6 = new RubyFixnum(6);
	public static final RubyFixnum fixnum7 = new RubyFixnum(7);
	public static final RubyFixnum fixnum8 = new RubyFixnum(8);
	public static final RubyFixnum fixnum9 = new RubyFixnum(9);
	public static final RubyFixnum fixnum10 = new RubyFixnum(10);

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
	
	public static RubySymbol createSymbol(String value) {
		return new RubySymbol(value);
	}

	public static RubyFixnum createFixnum(int value) {
		return new RubyFixnum(value);
	}

	public static RubyFloat createFloat(double value) {
		return new RubyFloat(value);
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

	public static RubyProc createProc(RubyBlock block) {
		return new RubyProc(block);
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

	public static RubyBignum createBignum(String value) {
		return new RubyBignum(new BigInteger(value));
	}
	
	public static RubyValue createBoolean(boolean value) {
		if (value){
			return trueValue;
		}
		return falseValue;
	}
}
