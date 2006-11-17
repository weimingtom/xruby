package com.xruby.runtime.value;

import java.math.BigInteger;
import com.xruby.runtime.lang.*;

public class ObjectFactory {
	public static RubyString createString(String v) {
		return new RubyString(v);
	}
	
	public static RubyString createString(char v) {
		return new RubyString(v);
	}

	public static RubyFixnum createFixnum(int v) {
		return RubyFixnum.int2Fix(v);
	}

	public static RubyFloat createFloat(double v) {
		return new RubyFloat(v);
	}
	
	public static RubyValue createBignum(BigInteger value) { 
		return new RubyBignum(value); 
	}
	
	public static RubyValue createInteger(String value, int radix) {
		return RubyBignum.bignorm(new BigInteger(value, radix));
	}
	
}
