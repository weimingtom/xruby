package com.xruby.runtime.builtin;

import java.math.BigInteger;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Bignum_initialize extends RubyMethod {
	public Bignum_initialize() {
		super(0, false, 2);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		throw new RubyException(RubyRuntime.RuntimeErrorClass, "Bitnum#new cannot be called");
	}
}

class Bignum_to_s extends RubyMethod { 
	public Bignum_to_s() {
		super(0, false, 1); 
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		if (args == null || args.size() == 0 || args.get(0) == null){
			return ObjectFactory.createString(value.to_s());
		}

		int radix = ((RubyFixnum)args.get(0)).intValue();
		return ObjectFactory.createString(value.to_s(radix));
	} 
}

class Bignum_operator_star extends RubyMethod { 
	public Bignum_operator_star() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_mul(arg);
	} 
}

class Bignum_operator_divide extends RubyMethod { 
	public Bignum_operator_divide() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_div(arg);
	} 
}

class Bignum_operator_plus extends RubyMethod { 
	public Bignum_operator_plus() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_add(arg);
	} 
}

class Bignum_operator_minus extends RubyMethod { 
	public Bignum_operator_minus() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_sub(arg);
	} 
}

class Bignum_operator_mod extends RubyMethod { 
	public Bignum_operator_mod() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_mod(arg);
	} 
}

class Bignum_operator_bor extends RubyMethod { 
	public Bignum_operator_bor() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_bor(arg);
	} 
}

class Bignum_operator_band extends RubyMethod { 
	public Bignum_operator_band() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_band(arg);
	} 
}

class Bignum_operator_bxor extends RubyMethod { 
	public Bignum_operator_bxor() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		RubyValue arg = args.get(0);
		return value.op_bxor(arg);
	} 
}

class Bignum_operator_bnot extends RubyMethod { 
	public Bignum_operator_bnot() {
		super(0);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value = (RubyBignum)receiver;
		return RubyBignum.bignorm(value.getInternal().not());
	} 
}

class Bignum_operator_right_shift extends RubyMethod {
	public Bignum_operator_right_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		RubyFixnum value2 = (RubyFixnum)args.get(0);
		if (value2.intValue() < 0){
			BigInteger bigValue1 = value1.getInternal().shiftLeft(-value2.intValue());
			return RubyBignum.bignorm(bigValue1);
		}
		return RubyBignum.bignorm(value1.getInternal().shiftRight(value2.intValue()));
	}
}

class Bignum_operator_left_shift extends RubyMethod {
	public Bignum_operator_left_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		RubyFixnum value2 = (RubyFixnum)args.get(0);
		if (value2.intValue() <= 0){
			return RubyBignum.bignorm(value1.getInternal().shiftRight(-value2.intValue()));
		}
		return RubyBignum.bignorm(value1.getInternal().shiftLeft(value2.intValue()));
	}
}

class Bignum_operator_compare extends RubyMethod {
	public Bignum_operator_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		Object value2 = args.get(0);
		int result = 0;
		if (value2 instanceof RubyBignum){
			BigInteger bigValue2 = ((RubyBignum)value2).getInternal();
			result = value1.getInternal().compareTo(bigValue2);
		}
		else if (value2 instanceof RubyFixnum){
			if (value1.getInternal().signum() < 0){
				result = -1;
			}
			result = 1;
		}
		else if (value2 instanceof RubyFloat){
			double floatValue1 = value1.getInternal().doubleValue();
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

class Bignum_to_f extends RubyMethod {
	public Bignum_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		return ObjectFactory.createFloat(value1.getInternal().doubleValue());
	}
}

class Bignum_size extends RubyMethod {
	public Bignum_size() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		int alignedBytesCount = (((value1.getInternal().bitLength() - 1) & -32) >> 3) + 4;
		return ObjectFactory.createFixnum(alignedBytesCount);
	}
}

class Bignum_get_bit extends RubyMethod {
	public Bignum_get_bit() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBignum value1 = (RubyBignum)receiver;
		int index = RubyTypesUtil.convertToFixnum(args.get(0)).intValue();
		boolean flag = value1.getInternal().testBit(index);
		if (flag){
			return ObjectFactory.createFixnum(1);
		}
		return ObjectFactory.createFixnum(0);
	}
}

class Bignum_operator_star_star extends RubyMethod {
	public Bignum_operator_star_star () {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		BigInteger value1 = ((RubyBignum)receiver).getInternal();
		Object value2 = args.get(0);
		double floatValue2 = 0;
		if (value2 instanceof RubyBignum){
			// TODO: output wraning: "in a**b, b may be too big"
			floatValue2 = ((RubyBignum)value2).getInternal().doubleValue();
		}else if (value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else if (value2 instanceof RubyFixnum){
			int intValue2 = ((RubyFixnum)value2).intValue();
			if (intValue2 == 0){
				return ObjectFactory.createFixnum(1);
			}
			if (intValue2 > 0){
				if (value1.bitLength() * intValue2 > 1024 * 1024){
					// TODO: output wraning: "in a**b, b may be too big"
				}else{
					BigInteger result = value1.pow(intValue2);
					return ObjectFactory.createBignum(result);
				}
			}
			floatValue2 = intValue2;
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, args.get(0).getRubyClass().getName() + " can't be coersed into Bignum");
		}
		return ObjectFactory.createFloat(Math.pow(value1.doubleValue(), floatValue2));
	}
}

public class BignumClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.BignumClass;
		c.defineMethod("to_s", new Bignum_to_s());
		c.defineMethod("*", new Bignum_operator_star());
		c.defineMethod("/", new Bignum_operator_divide());
		c.defineMethod("+", new Bignum_operator_plus());
		c.defineMethod("-", new Bignum_operator_minus());
		c.defineMethod("%", new Bignum_operator_mod());
		c.defineMethod("&", new Bignum_operator_band());
		c.defineMethod("|", new Bignum_operator_bor());
		c.defineMethod("^", new Bignum_operator_bxor());
		c.defineMethod(">>", new Bignum_operator_right_shift());
		c.defineMethod("<<", new Bignum_operator_left_shift());
		c.defineMethod("<=>", new Bignum_operator_compare());
		c.defineMethod("to_f",  new Bignum_to_f());
		c.defineMethod("size",  new Bignum_size());
		c.defineMethod("~",  new Bignum_operator_bnot());
		c.defineMethod("[]",  new Bignum_get_bit());
		c.defineMethod("**",  new Bignum_operator_star_star());
		c.defineMethod("initialize",  new Bignum_initialize());
	}
}
