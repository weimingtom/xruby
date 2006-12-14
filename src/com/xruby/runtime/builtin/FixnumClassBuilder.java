/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Fixnum_operator_right_shift extends RubyMethod {
	public Fixnum_operator_right_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		int value2 = RubyTypesUtil.convertToFixnum(args.get(0)).intValue();
		if (value2 < 0){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			bigValue1 = bigValue1.shiftLeft(-value2);
			return RubyBignum.bignorm(bigValue1);
		}
		return ObjectFactory.createFixnum(value1.intValue() >> value2);
	}
}

class Fixnum_operator_left_shift extends RubyMethod {
	public Fixnum_operator_left_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		int value2 = RubyTypesUtil.convertToFixnum(args.get(0)).intValue();
		if (value2 <= 0){
			return ObjectFactory.createFixnum(value1.intValue() >> -value2);
		}
		BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
		return RubyBignum.bignorm(bigValue1.shiftLeft(value2));
	}
}

class Fixnum_operator_equal extends RubyMethod {
	public Fixnum_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value = args.get(0);
		boolean result = false;
		if (value instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value).doubleValue();
			result = (floatValue1 == floatValue2);
		}
		else if (value instanceof RubyFixnum){
			RubyFixnum value2 = (RubyFixnum)args.get(0);
			result = (value1.intValue() == value2.intValue());
		}

		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}

//C Ruby does not need this function since it can compare integer directly
class Fixnum_operator_case_equal extends Fixnum_operator_equal {
}

class Fixnum_operator_less_or_equal extends RubyMethod {
	public Fixnum_operator_less_or_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		boolean result = false;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign > 0);
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			result = (value1.intValue() <= fixnumValue2.intValue());
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			result = (floatValue1 <= floatValue2);
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "comparison of Fixnum with " + args.get(0).getRubyClass().getName() + " failed");
		}
		
		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}


class Fixnum_operator_less_than extends RubyMethod {
	public Fixnum_operator_less_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		boolean result = false;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign > 0);
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			result = (value1.intValue() < fixnumValue2.intValue());
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			result = (floatValue1 < floatValue2);
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "comparison of Fixnum with " + args.get(0).getRubyClass().getName() + " failed");
		}
		
		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}

class Fixnum_operator_compare extends RubyMethod {
	public Fixnum_operator_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		int result = 0;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			int sign = bigValue2.signum();
			assert sign != 0;
			if (sign > 0){
				result = -1;
			}else if(sign < 0){
				result = 1;
			}
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			result = (value1.intValue() - fixnumValue2.intValue());
			if (result < 0){
				result = -1;
			}else if (result > 0){
				result = 1;
			}			
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			if (floatValue1 < floatValue2){
				result = -1;
			}else if(floatValue1 > floatValue2){
				result = 1;
			}
		}
		else{
			return ObjectFactory.nilValue;
		}
		return ObjectFactory.createFixnum(result);
	}
}


class Fixnum_operator_greater_than extends RubyMethod {
	public Fixnum_operator_greater_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		boolean result = false;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign < 0);
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			result = (value1.intValue() > fixnumValue2.intValue());
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			result = (floatValue1 > floatValue2);
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "comparison of Fixnum with " + args.get(0).getRubyClass().getName() + " failed");
		}
		
		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}

class Fixnum_operator_greater_or_equal extends RubyMethod {
	public Fixnum_operator_greater_or_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		boolean result = false;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign < 0);
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			result = (value1.intValue() >= fixnumValue2.intValue());
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			result = (floatValue1 >= floatValue2);
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "comparison of Fixnum with " + args.get(0).getRubyClass().getName() + " failed");
		}
		
		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}

class Fixnum_operator_plus extends RubyMethod {
	public Fixnum_operator_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			return RubyBignum.bignorm(bigValue1.add(bigValue2));
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			long result = (long)value1.intValue() + (long)fixnumValue2.intValue();
			return RubyBignum.bignorm(result);
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 + floatValue2);
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't be coersed into Fixnum");
	}
}

class Fixnum_operator_minus extends RubyMethod {
	public Fixnum_operator_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			return RubyBignum.bignorm(bigValue1.subtract(bigValue2));
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum fixnumValue2 = (RubyFixnum)value2;
			long result = (long)value1.intValue() - (long)fixnumValue2.intValue();
			return RubyBignum.bignorm(result);
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 - floatValue2);
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't be coersed into Fixnum");
	}
}

class Fixnum_operator_div extends RubyMethod {
	public Fixnum_operator_div() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			return RubyBignum.bignorm(bigValue1.divide(bigValue2));
		}
		else if (value2 instanceof RubyFixnum){
			int intValue2 = ((RubyFixnum)value2).intValue();
			return RubyBignum.bignorm((long)value1.intValue() / (long)(intValue2));
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 / floatValue2);
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't be coersed into Fixnum");
	}
}

class Fixnum_operator_mod extends RubyMethod {
	public Fixnum_operator_mod() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			return RubyBignum.bignorm(bigValue1.mod(bigValue2));
		}
		else if (value2 instanceof RubyFixnum){
			RubyFixnum intValue2 = (RubyFixnum)value2;
			return ObjectFactory.createFixnum(value1.intValue() % intValue2.intValue());
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 % floatValue2);
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't be coersed into Fixnum");
	}
}

class Fixnum_operator_star_star extends RubyMethod {
	public Fixnum_operator_star_star () {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		int value1 = ((RubyFixnum)receiver).intValue();
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			assert (bigValue2.signum() != 0);
			if (value1 == 1){
				if (bigValue2.signum() > 0){
					return ObjectFactory.fixnum1;
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}else if (value1 == 0){
				if (bigValue2.signum() > 0){
					return ObjectFactory.fixnum0;
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}else if (value1 == -1){
				if (bigValue2.signum() > 0){
					if (bigValue2.intValue() % 2 == 0){
						return ObjectFactory.fixnum1;
					}else{
						return ObjectFactory.createFixnum(-1);
					}
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}
		}else if(value2 instanceof RubyFixnum){
			RubyFixnum intValue2 = (RubyFixnum)value2;
			BigInteger bigValue1 = BigInteger.valueOf(value1);
			BigInteger result = bigValue1.pow(intValue2.intValue());
			return RubyBignum.bignorm(result);
		}else if(value2 instanceof RubyFloat){
			double floatValue1 = value1;
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(Math.pow(floatValue1, floatValue2));
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't coerced into Fixnum");
	}
}

class Fixnum_operator_bor extends RubyMethod {
	public Fixnum_operator_bor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			return ((RubyBignum)value2).op_bor(receiver);
		}
		else if (value2 instanceof RubyFixnum){
			return ObjectFactory.createFixnum(value1.intValue() | ((RubyFixnum)value2).intValue());
		}
		else if (value2 instanceof RubyFloat){
			RubyFloat floatValue2 = (RubyFloat)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() | intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return RubyBignum.bignorm(BigInteger.valueOf(value1.intValue()).or(bigValue2));
			}
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + args.get(0).getRubyClass().getName() + " to Integer");
	}
}

class Fixnum_operator_band extends RubyMethod {
	public Fixnum_operator_band() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			return ((RubyBignum)value2).op_band(receiver);
		}
		else if (value2 instanceof RubyFixnum){
			return ObjectFactory.createFixnum(value1.intValue() & ((RubyFixnum)value2).intValue());
		}
		else if (value2 instanceof RubyFloat){
			RubyFloat floatValue2 = (RubyFloat)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() & intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return RubyBignum.bignorm(BigInteger.valueOf(value1.intValue()).and(bigValue2));
			}
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + args.get(0).getRubyClass().getName() + " to Integer");
	}
}

class Fixnum_operator_bxor extends RubyMethod {
	public Fixnum_operator_bxor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			return ((RubyBignum)value2).op_bxor(receiver);
		}
		else if (value2 instanceof RubyFixnum){
			return ObjectFactory.createFixnum(value1.intValue() ^ ((RubyFixnum)value2).intValue());
		}
		else if (value2 instanceof RubyFloat){
			RubyFloat floatValue2 = (RubyFloat)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() ^ intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return RubyBignum.bignorm(BigInteger.valueOf(value1.intValue()).xor(bigValue2));
			}
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + args.get(0).getRubyClass().getName() + " to Integer");
	}
}


class Fixnum_operator_bnot extends RubyMethod {
	public Fixnum_operator_bnot() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		return ObjectFactory.createFixnum(~value1.intValue());
	}
}

class Fixnum_operator_star extends RubyMethod {
	public Fixnum_operator_star() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		Object value2 = args.get(0);
		if (value2 instanceof RubyBignum){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			return RubyBignum.bignorm(bigValue1.multiply(bigValue2));
		}
		else if (value2 instanceof RubyFixnum){
			int intValue2 = ((RubyFixnum)value2).intValue();
			return RubyBignum.bignorm((long)value1.intValue() * (long)(intValue2));
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((RubyFloat)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 * floatValue2);
		}
		throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't coerced into Fixnum");
	}
}

class Fixnum_to_f extends RubyMethod {
	public Fixnum_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value1 = (RubyFixnum)receiver;
		return ObjectFactory.createFloat(value1.intValue());
	}
}


class Fixnum_to_s extends RubyMethod {
	public Fixnum_to_s() {
		super(1, false, 1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum value = (RubyFixnum)receiver;
		RubyValue radixValue = args.get(0);
		int radix = 10;
		
		if (radixValue != null && radixValue != ObjectFactory.nilValue){
			radix = RubyTypesUtil.convertToJavaInt(radixValue);
			if (radix < 2 || radix > 36){
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "illegal radix " + radix);
			}
		}
		
		return ObjectFactory.createString(value.toString(radix));
	}
}

public class FixnumClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.FixnumClass;
		c.defineMethod(">>", new Fixnum_operator_right_shift());
		c.defineMethod("<<", new Fixnum_operator_left_shift());
		c.defineMethod("==", new Fixnum_operator_equal());
		c.defineMethod("===", new Fixnum_operator_case_equal());
		c.defineMethod("+", new Fixnum_operator_plus());
		c.defineMethod("<=", new Fixnum_operator_less_or_equal());
		c.defineMethod("-", new Fixnum_operator_minus());
		c.defineMethod("/", new Fixnum_operator_div());
		c.defineMethod("to_s", new Fixnum_to_s());
		c.defineMethod("%", new Fixnum_operator_mod());
		c.defineMethod("|", new Fixnum_operator_bor());
		c.defineMethod("&", new Fixnum_operator_band());
		c.defineMethod("<", new Fixnum_operator_less_than());
		c.defineMethod("div", new Fixnum_operator_div());
		c.defineMethod("<=>", new Fixnum_operator_compare());
		c.defineMethod("^", new Fixnum_operator_bxor());
		c.defineMethod(">", new Fixnum_operator_greater_than());
		c.defineMethod(">=", new Fixnum_operator_greater_or_equal());
		c.defineMethod("*", new Fixnum_operator_star());
		c.defineMethod("to_f", new Fixnum_to_f());
		c.defineMethod("**", new Fixnum_operator_star_star());
		c.defineMethod("~", new Fixnum_operator_bnot());
	}
}
