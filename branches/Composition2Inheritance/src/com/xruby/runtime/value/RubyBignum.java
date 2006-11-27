package com.xruby.runtime.value;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyBignum {
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
	
	public String to_s(){
		return value_.toString(10);
	}
	
	public String to_s(int radix){
		return value_.toString(radix);
	}
	
	public BigInteger getValue(){
		return value_;
	}
	
	public void setValue(BigInteger value){
		value_ = value;
	}
	
	public RubyValue op_mul(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().multiply(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().multiply(bigValue);
		}
		else if (value instanceof RubyFloat){
			RubyFloat floatValue = (RubyFloat)value;
			double ret = getValue().doubleValue() * floatValue.doubleValue();
			return ObjectFactory.createFloat(ret);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().getName() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_div(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().divide(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().divide(bigValue);
		}
		else if (value instanceof RubyFloat){
			RubyFloat floatValue = (RubyFloat)value;
			double ret = getValue().doubleValue() / floatValue.doubleValue();
			return ObjectFactory.createFloat(ret);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_add(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().add(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().add(bigValue);
		}
		else if (value instanceof RubyFloat){
			RubyFloat floatValue = (RubyFloat)value;
			double ret = getValue().doubleValue() + floatValue.doubleValue();
			return ObjectFactory.createFloat(ret);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_sub(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().subtract(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().subtract(bigValue);
		}
		else if (value instanceof RubyFloat){
			RubyFloat floatValue = (RubyFloat)value;
			double ret = getValue().doubleValue() - floatValue.doubleValue();
			return ObjectFactory.createFloat(ret);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_mod(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().mod(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().mod(bigValue);
		}
		else if (value instanceof RubyFloat){
			double floatValue1 = getValue().doubleValue();
			double floatValue2 = ((RubyFloat)value).doubleValue();
			return ObjectFactory.createFloat(floatValue1 % floatValue2);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_band(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().and(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().and(bigValue);
		}
		else if (value instanceof RubyFloat){
			double floatValue = ((RubyFloat)value).doubleValue();
			BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
			result = getValue().and(bigValue);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_bor(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().or(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().or(bigValue);
		}
		else if (value instanceof RubyFloat){
			double floatValue = ((RubyFloat)value).doubleValue();
			BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
			result = getValue().or(bigValue);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public RubyValue op_bxor(RubyValue v) {
		Object value = v.getValue();
		BigInteger result;
		if (value instanceof RubyBignum){
			RubyBignum bigValue = (RubyBignum)value;
			result = getValue().xor(bigValue.getValue());
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum intValue = (RubyFixnum)value;
			BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
			result = getValue().xor(bigValue);
		}
		else if (value instanceof RubyFloat){
			double floatValue = ((RubyFloat)value).doubleValue();
			BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
			result = getValue().xor(bigValue);
		}
		else{
			throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().toString() + " not expected");
		}
		return bignorm(result);
	}
	
	public static RubyValue bignorm(BigInteger value){
		if (value.compareTo(FIXNUM_MAX) > 0 || value.compareTo(FIXNUM_MIN) < 0)
			return ObjectFactory.createBignum(value);
		return ObjectFactory.createFixnum(value.intValue());
	}
	
	public static RubyValue bignorm(long value){
		if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE)
			return ObjectFactory.createBignum(BigInteger.valueOf(value));
		return ObjectFactory.createFixnum((int)value);
	}
}
