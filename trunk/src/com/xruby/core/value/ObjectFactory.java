/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.value;

import com.xruby.core.lang.*;

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
	public static final RubyValue ClassClassValue = new RubyValue(RubyRuntime.ClassClass, RubyRuntime.ClassClass);

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
				name.equals("ClassClass")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static RubyValue createString(String value) {
		return new RubyValue(RubyRuntime.StringClass, new StringValue(value));
	}
	
	public static RubyValue createString(StringValue value) {
		return new RubyValue(RubyRuntime.StringClass, value);
	}
	
	public static RubyValue createSymbol(String value) {
		return new RubyValue(RubyRuntime.SymbolClass, value.intern());
	}

	public static RubyValue createFixnum(int value) {
		return new RubyValue(RubyRuntime.FixnumClass, value);
	}

	public static RubyValue createFloat(float value) {
		return new RubyValue(RubyRuntime.FloatClass, value);
	}
	
	public static RubyValue createClass(RubyClass value) {
		return new RubyValue(RubyRuntime.ClassClass, value);
	}

	public static RubyValue createArray(ArrayValue value) {
		return new RubyValue(RubyRuntime.ArrayClass, value);
	}

	public static RubyValue createEmptyArray() {
		return new RubyValue(RubyRuntime.ArrayClass, new ArrayValue(0, true));
	}
	
	public static RubyValue createHash(HashValue value) {
		return new RubyValue(RubyRuntime.HashClass, value);
	}
}
