/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import java.math.BigDecimal;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Float_to_s extends RubyMethod {
	public Float_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFloat value = (RubyFloat)receiver.getValue();
		return ObjectFactory.createString(Double.toString(value.doubleValue()));
	}
}

class Float_operator_minus extends RubyMethod {
	public Float_operator_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double floatValue1 = ((RubyFloat)receiver.getValue()).doubleValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}else if(value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}else if(value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else{
			// TODO: coerce args(0) into minus
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "Float cannot minus with " + args.get(0).getRubyClass().getName());
		}
		return ObjectFactory.createFloat(floatValue1 - floatValue2);
	}
}

class Float_operator_compare extends RubyMethod {
	public Float_operator_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFloat value1 = (RubyFloat)receiver.getValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}
		else if (value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}
		else if (value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}
		else{
			return ObjectFactory.nilValue;
		}
		double floatValue1 = value1.doubleValue();
		if (floatValue1 < floatValue2){
			return ObjectFactory.createFixnum(-1);
		}else if(floatValue1 > floatValue2){
			return ObjectFactory.createFixnum(1);
		}else{
			return ObjectFactory.createFixnum(0);
		}
	}
}

class Float_floor extends RubyMethod {
	public Float_floor() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		value = Math.floor(value);
		if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE){
			return ObjectFactory.createFixnum((int)value);
		}
		return ObjectFactory.createBignum(BigDecimal.valueOf(value).toBigInteger());
	}
}

class Float_ceil extends RubyMethod {
	public Float_ceil() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		value = Math.ceil(value);
		if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE){
			return ObjectFactory.createFixnum((int)value);
		}
		return ObjectFactory.createBignum(BigDecimal.valueOf(value).toBigInteger());
	}
}

class Float_truncate extends RubyMethod {
	public Float_truncate() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE){
			return ObjectFactory.createFixnum((int)value);
		}
		return BignumValue.bignorm(BigDecimal.valueOf(value).toBigInteger());
	}
}

class Float_round extends RubyMethod {
	public Float_round() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		value = Math.round(value);
		if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE){
			return ObjectFactory.createFixnum((int)value);
		}
		return BignumValue.bignorm(BigDecimal.valueOf(value).toBigInteger());
	}
}

class Float_operator_mod extends RubyMethod {
	public Float_operator_mod() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double floatValue1 = ((RubyFloat)receiver.getValue()).doubleValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}else if(value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}else if(value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else{
			// TODO: coerce args(0) into mod
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "Float cannot mod with " + args.get(0).getRubyClass().getName());
		}
		double value3 = floatValue1 / floatValue2;
		double result = floatValue1 - Math.floor(floatValue2 * value3);
		return ObjectFactory.createFloat(result);
	}
}

class Float_operator_plus extends RubyMethod {
	public Float_operator_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double floatValue1 = ((RubyFloat)receiver.getValue()).doubleValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}else if(value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}else if(value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else{
			// TODO: coerce args(0) into plus
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "Float cannot plus with " + args.get(0).getRubyClass().getName());
		}
		return ObjectFactory.createFloat(floatValue1 + floatValue2);
	}
}

class Float_operator_star extends RubyMethod {
	public Float_operator_star() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double floatValue1 = ((RubyFloat)receiver.getValue()).doubleValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}else if(value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}else if(value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else{
			// TODO: coerce args(0) into star
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "Float cannot star with " + args.get(0).getRubyClass().getName());
		}
		return ObjectFactory.createFloat(floatValue1 * floatValue2);
	}
}

class Float_operator_div extends RubyMethod {
	public Float_operator_div() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double floatValue1 = ((RubyFloat)receiver.getValue()).doubleValue();
		Object value2 = args.get(0).getValue();
		double floatValue2 = 0;
		if (value2 instanceof BignumValue){
			floatValue2 = ((BignumValue)value2).getValue().doubleValue();
		}else if(value2 instanceof RubyFixnum){
			floatValue2 = ((RubyFixnum)value2).intValue();
		}else if(value2 instanceof RubyFloat){
			floatValue2 = ((RubyFloat)value2).doubleValue();
		}else{
			// TODO: coerce args(0) into div
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "Float cannot div with " + args.get(0).getRubyClass().getName());
		}
		return ObjectFactory.createFloat(floatValue1 / floatValue2);
	}
}

class Float_abs extends RubyMethod {
	public Float_abs() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		return ObjectFactory.createFloat(Math.abs(value));
	}
}

class Float_finite extends RubyMethod {
	public Float_finite() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		return ObjectFactory.createBoolean(!Double.isInfinite(value));
	}
}

class Float_infinite extends RubyMethod {
	public Float_infinite() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		if (value == Double.NEGATIVE_INFINITY){
			return ObjectFactory.createFixnum(-1);
		}else if(value == Double.POSITIVE_INFINITY){
			return ObjectFactory.createFixnum(1);
		}else{
			return ObjectFactory.nilValue;
		}
	}
}

class Float_nan extends RubyMethod {
	public Float_nan() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double value = ((RubyFloat)receiver.getValue()).doubleValue();
		return ObjectFactory.createBoolean(Double.isNaN(value));
	}
}

public class FloatClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Float", RubyRuntime.NumericClass);
		c.defineMethod("to_s", new Float_to_s());
		c.defineMethod("-", new Float_operator_minus());
		c.defineMethod("+", new Float_operator_plus());
		c.defineMethod("*", new Float_operator_star());
		c.defineMethod("/", new Float_operator_div());
		c.defineMethod("<=>", new Float_operator_compare());
		c.defineMethod("floor", new Float_floor());
		c.defineMethod("ceil", new Float_ceil());
		c.defineMethod("truncate", new Float_truncate());
		c.defineMethod("round", new Float_round());
		c.defineMethod("%", new Float_operator_mod());
		c.defineMethod("abs", new Float_abs());
		c.defineMethod("finite?", new Float_finite());
		c.defineMethod("infinite?", new Float_infinite());
		c.defineMethod("nan?", new Float_nan());
		return c;
	}
}
