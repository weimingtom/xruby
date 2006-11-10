package com.xruby.runtime.builtin;

import java.math.BigInteger;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Bignum_new extends RubyMethod {
	public Bignum_new() {
		super(0, false, 2);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		throw new RubyException(RubyRuntime.RuntimeErrorClass, "Bitnum#new cannot be called");
		/*BigInteger bigValue;
		
		if (args == null || args.size() == 0)
			bigValue = new BigInteger("0");
		else if (args.size() == 1){
			StringValue str = (StringValue)args.get(0).getValue();
			bigValue = new BigInteger(str.toString());
		}
		else if (args.size() == 2){
			StringValue str = (StringValue)args.get(0).getValue();
			IntegerValue radix = (IntegerValue)args.get(1).getValue();
			bigValue = new BigInteger(str.toString(), radix.intValue());
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
		}
		return ObjectFactory.createBignum(bigValue);*/
	}
}

class Bignum_to_s extends RubyMethod { 
	public Bignum_to_s() {
		super(0, false, 1); 
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		if (args == null || args.size() == 0 || args.get(0) == null){
			return ObjectFactory.createString(value.to_s());
		}

		int radix = ((IntegerValue)args.get(0).getValue()).intValue();
		return ObjectFactory.createString(value.to_s(radix));
	} 
}

class Bignum_operator_star extends RubyMethod { 
	public Bignum_operator_star() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_mul(arg);
	} 
}

class Bignum_operator_divide extends RubyMethod { 
	public Bignum_operator_divide() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_div(arg);
	} 
}

class Bignum_operator_plus extends RubyMethod { 
	public Bignum_operator_plus() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_add(arg);
	} 
}

class Bignum_operator_minus extends RubyMethod { 
	public Bignum_operator_minus() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_sub(arg);
	} 
}

class Bignum_operator_mod extends RubyMethod { 
	public Bignum_operator_mod() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_mod(arg);
	} 
}

class Bignum_operator_bor extends RubyMethod { 
	public Bignum_operator_bor() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_bor(arg);
	} 
}

class Bignum_operator_band extends RubyMethod { 
	public Bignum_operator_band() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_band(arg);
	} 
}

class Bignum_operator_bxor extends RubyMethod { 
	public Bignum_operator_bxor() {
		super(1);
	}

	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		RubyValue arg = args.get(0);
		return value.op_bxor(arg);
	} 
}

class Bignum_operator_right_shift extends RubyMethod {
	public Bignum_operator_right_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value1 = (BignumValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value2.intValue() < 0){
			BigInteger bigValue1 = value1.getValue().shiftLeft(-value2.intValue());
			return BignumValue.bignorm(bigValue1);
		}
		return BignumValue.bignorm(value1.getValue().shiftRight(value2.intValue()));
	}
}

class Bignum_operator_left_shift extends RubyMethod {
	public Bignum_operator_left_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value1 = (BignumValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value2.intValue() <= 0){
			return BignumValue.bignorm(value1.getValue().shiftRight(-value2.intValue()));
		}
		return BignumValue.bignorm(value1.getValue().shiftLeft(value2.intValue()));
	}
}

class Bignum_operator_compare extends RubyMethod {
	public Bignum_operator_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value1 = (BignumValue)receiver.getValue();
		Object value2 = args.get(0).getValue();
		int result = 0;
		if (value2 instanceof BignumValue){
			BigInteger bigValue2 = ((BignumValue)value2).getValue();
			result = value1.getValue().compareTo(bigValue2);
		}
		else if (value2 instanceof IntegerValue){
			if (value1.getValue().signum() < 0){
				result = -1;
			}
			result = 1;
		}
		else if (value2 instanceof FloatValue){
			double floatValue1 = value1.getValue().doubleValue();
			double floatValue2 = ((FloatValue)value2).doubleValue();
			if (floatValue1 < floatValue2){
				result = -1;
			}else if(floatValue1 > floatValue2){
				result = 1;
			}
		}
		else{
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "comparison of Fixnum with " + args.get(0).getRubyClass().getName() + " failed");
		}
		return ObjectFactory.createFixnum(result);
	}
}

class Bignum_to_f extends RubyMethod {
	public Bignum_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		BignumValue value1 = (BignumValue)receiver.getValue();
		return ObjectFactory.createFloat(value1.getValue().doubleValue());
	}
}

public class BignumClassBuilder {
	public static RubyClass create(){
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Bignum", RubyRuntime.IntegerClass);
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
		return c;
	}
	
	public static void initSingletonMethods() {
		RubyMethod m = new Bignum_new();
		ObjectFactory.BignumClassValue.defineMethod("new", m);
	}
}
