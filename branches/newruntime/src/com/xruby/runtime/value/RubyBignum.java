package com.xruby.runtime.value;

import java.math.BigInteger;
import com.xruby.runtime.lang.*;

public class RubyBignum extends RubyBasic {
	private static final BigInteger FIXNUM_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
	private static final BigInteger FIXNUM_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
	
	private BigInteger value_;
	
	public RubyBignum(String value, int radix){
		value_ = new BigInteger(value, radix);
	}
	
	public RubyBignum(String value){
		value_ = new BigInteger(value);
	}
	
	public RubyBignum(BigInteger value){
		value_ = value;
	}
	
	public static RubyValue bignorm(BigInteger value){
		if (value.compareTo(FIXNUM_MAX) > 0 || value.compareTo(FIXNUM_MIN) < 0)
			return ObjectFactory.createBignum(value);
		return ObjectFactory.createFixnum(value.intValue());
	}
}
