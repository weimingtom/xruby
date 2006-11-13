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
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value2.intValue() < 0){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			bigValue1 = bigValue1.shiftLeft(-value2.intValue());
			return BignumValue.bignorm(bigValue1);
		}
		return ObjectFactory.createFixnum(value1.intValue() >> value2.intValue());
	}
}

class Fixnum_operator_left_shift extends RubyMethod {
	public Fixnum_operator_left_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value2.intValue() <= 0){
			return ObjectFactory.createFixnum(value1.intValue() >> -value2.intValue());
		}
		BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
		return BignumValue.bignorm(bigValue1.shiftLeft(value2.intValue()));
	}
}

class Fixnum_operator_equal extends RubyMethod {
	public Fixnum_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value = args.get(0).getValue();
		boolean result = false;
		if (value instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value).doubleValue();
			result = (floatValue1 == floatValue2);
		}
		else if (value instanceof IntegerValue){
			IntegerValue value2 = (IntegerValue)args.get(0).getValue();
			result = (value1.intValue() == value2.intValue());
		}

		if (result){
			return ObjectFactory.trueValue;
		}
			
		return ObjectFactory.falseValue;
	}
}

//C Ruby does not need this function since it can compare integer directly
class Fixnum_operator_case_equal extends RubyMethod {
	public Fixnum_operator_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() == value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_plus extends RubyMethod {
	public Fixnum_operator_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		long result = (long)value1.intValue() + (long)value2.intValue();
		return BignumValue.bignorm(result);
	}
}

class Fixnum_operator_less_or_equal extends RubyMethod {
	public Fixnum_operator_less_or_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		boolean result = false;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign > 0);
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			result = (value1.intValue() <= fixnumValue2.intValue());
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
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

class Fixnum_operator_minus extends RubyMethod {
	public Fixnum_operator_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			return BignumValue.bignorm(bigValue1.subtract(bigValue2));
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			long result = (long)value1.intValue() - (long)fixnumValue2.intValue();
			return BignumValue.bignorm(result);
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 - floatValue2);
		}
		// TODO: coerce args(0) into minus Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot minus with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_div extends RubyMethod {
	public Fixnum_operator_div() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			return BignumValue.bignorm(bigValue1.divide(bigValue2));
		}
		else if (value2 instanceof IntegerValue){
			int intValue2 = ((IntegerValue)value2).intValue();
			return BignumValue.bignorm((long)value1.intValue() / (long)(intValue2));
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 / floatValue2);
		}
		// TODO: coerce args(0) into divide Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot divide with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_to_s extends RubyMethod {
	public Fixnum_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value = (IntegerValue)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

class Fixnum_operator_mod extends RubyMethod {
	public Fixnum_operator_mod() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			return BignumValue.bignorm(bigValue1.mod(bigValue2));
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue intValue2 = (IntegerValue)value2;
			return ObjectFactory.createFixnum(value1.intValue() % intValue2.intValue());
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 % floatValue2);
		}
		// TODO: coerce args(0) into mod Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot mod with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_bor extends RubyMethod {
	public Fixnum_operator_bor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			return ((BignumValue)value2).op_bor(receiver);
		}
		else if (value2 instanceof IntegerValue){
			return ObjectFactory.createFixnum(value1.intValue() | ((IntegerValue)value2).intValue());
		}
		else if (value2 instanceof FloatValue){
			FloatValue floatValue2 = (FloatValue)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() | intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return BignumValue.bignorm(BigInteger.valueOf(value1.intValue()).or(bigValue2));
			}
		}
		// TODO: coerce args(0) into binary or Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot binary or with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_band extends RubyMethod {
	public Fixnum_operator_band() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			return ((BignumValue)value2).op_band(receiver);
		}
		else if (value2 instanceof IntegerValue){
			return ObjectFactory.createFixnum(value1.intValue() & ((IntegerValue)value2).intValue());
		}
		else if (value2 instanceof FloatValue){
			FloatValue floatValue2 = (FloatValue)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() & intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return BignumValue.bignorm(BigInteger.valueOf(value1.intValue()).and(bigValue2));
			}
		}
		// TODO: coerce args(0) into binary and Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot binary and with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_less_than extends RubyMethod {
	public Fixnum_operator_less_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		boolean result = false;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign > 0);
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			result = (value1.intValue() < fixnumValue2.intValue());
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
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
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		int result = 0;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			int sign = bigValue2.signum();
			assert sign != 0;
			if (sign > 0){
				result = -1;
			}else if(sign < 0){
				result = 1;
			}
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			result = (value1.intValue() - fixnumValue2.intValue());
			if (result < 0){
				result = -1;
			}else if (result > 0){
				result = 1;
			}			
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
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

class Fixnum_operator_bxor extends RubyMethod {
	public Fixnum_operator_bxor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			return ((BignumValue)value2).op_bxor(receiver);
		}
		else if (value2 instanceof IntegerValue){
			return ObjectFactory.createFixnum(value1.intValue() ^ ((IntegerValue)value2).intValue());
		}
		else if (value2 instanceof FloatValue){
			FloatValue floatValue2 = (FloatValue)value2;
			if (floatValue2.doubleValue() > Integer.MAX_VALUE ||
					floatValue2.doubleValue() < Integer.MIN_VALUE){
				int intValue2 = (int)floatValue2.doubleValue();
				return ObjectFactory.createFixnum(value1.intValue() ^ intValue2);
			}
			else{
				BigInteger bigValue2 = BigDecimal.valueOf(floatValue2.doubleValue()).toBigInteger();
				return BignumValue.bignorm(BigInteger.valueOf(value1.intValue()).xor(bigValue2));
			}
		}
		// TODO: coerce args(0) into binary xor Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot binary xor with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_greater_than extends RubyMethod {
	public Fixnum_operator_greater_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		boolean result = false;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign < 0);
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			result = (value1.intValue() > fixnumValue2.intValue());
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
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
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		boolean result = false;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			int sign = bigValue2.signum();
			assert sign != 0;
			result = (sign < 0);
		}
		else if (value2 instanceof IntegerValue){
			IntegerValue fixnumValue2 = (IntegerValue)value2;
			result = (value1.intValue() >= fixnumValue2.intValue());
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
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

class Fixnum_operator_star extends RubyMethod {
	public Fixnum_operator_star() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			BigInteger bigValue1 = BigInteger.valueOf(value1.intValue());
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			return BignumValue.bignorm(bigValue1.multiply(bigValue2));
		}
		else if (value2 instanceof IntegerValue){
			int intValue2 = ((IntegerValue)value2).intValue();
			return BignumValue.bignorm((long)value1.intValue() * (long)(intValue2));
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.intValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
			return ObjectFactory.createFloat(floatValue1 * floatValue2);
		}
		// TODO: coerce args(0) into multiply Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot multiply with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_to_f extends RubyMethod {
	public Fixnum_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		return ObjectFactory.createFloat(value1.intValue());
	}
}

class Fixnum_operator_star_star extends RubyMethod {
	public Fixnum_operator_star_star () {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		int value1 = ((IntegerValue)receiver.getValue()).intValue();
		Object value2 = args.get(0).getValue();
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			assert (bigValue2.signum() != 0);
			if (value1 == 1){
				if (bigValue2.signum() > 0){
					return ObjectFactory.createFixnum(1);
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}else if (value1 == 0){
				if (bigValue2.signum() > 0){
					return ObjectFactory.createFixnum(0);
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}else if (value1 == -1){
				if (bigValue2.signum() > 0){
					if (bigValue2.intValue() % 2 == 0){
						return ObjectFactory.createFixnum(1);
					}else{
						return ObjectFactory.createFixnum(-1);
					}
				}else{
					// TODO: return Rational
					throw new RubyException("return Rational value not implemented");
				}
			}
		}else if(value2 instanceof IntegerValue){
			IntegerValue intValue2 = (IntegerValue)value2;
			BigInteger bigValue1 = BigInteger.valueOf(value1);
			BigInteger result = bigValue1.pow(intValue2.intValue());
			return BignumValue.bignorm(result);
		}else if(value2 instanceof FloatValue){
			double floatValue1 = value1;
			double floatValue2 = ((FloatValue)value2).doubleValue();
			return ObjectFactory.createFloat(Math.pow(floatValue1, floatValue2));
		}
		// TODO: coerce args(0) into star-star Fixnum
		throw new RubyException(RubyRuntime.ArgumentErrorClass, "Fixnum cannot star-star with " + args.get(0).getRubyClass().getName());
	}
}

class Fixnum_operator_bnot extends RubyMethod {
	public Fixnum_operator_bnot() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		return ObjectFactory.createFixnum(~value1.intValue());
	}
}

public class FixnumClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Fixnum", RubyRuntime.IntegerClass);
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
		return c;
	}
}
