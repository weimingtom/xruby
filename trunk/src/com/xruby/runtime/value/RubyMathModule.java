package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelModule;

@RubyLevelModule(name="Math")
public class RubyMathModule {
	@RubyLevelMethod(name="sqrt", moduleMethod=true)
	public static RubyValue sqrt(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.sqrt(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="log", moduleMethod=true)
	public static RubyValue log(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.log(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="log10", moduleMethod=true)
	public static RubyValue log10(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.log10(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="exp", moduleMethod=true)
	public static RubyValue exp(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.exp(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="cos", moduleMethod=true)
	public static RubyValue cos(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.cos(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="sin", moduleMethod=true)
	public static RubyValue sin(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.sin(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="tan", moduleMethod=true)
	public static RubyValue tan(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.tan(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="cosh", moduleMethod=true)
	public static RubyValue cosh(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.cosh(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="sinh", moduleMethod=true)
	public static RubyValue sinh(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.sinh(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="tanh", moduleMethod=true)
	public static RubyValue tanh(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.tanh(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="acos", moduleMethod=true)
	public static RubyValue acos(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.acos(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="acosh", moduleMethod=true)
	public static RubyValue acosh(RubyValue receiver, RubyValue arg) {
		double x = arg.toFloat();
		return ObjectFactory.createFloat(Math.log(x + Math.sqrt(x * x - 1.0)));
	}
	
	@RubyLevelMethod(name="asin", moduleMethod=true)
	public static RubyValue asin(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.asin(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="asinh", moduleMethod=true)
	public static RubyValue asinh(RubyValue receiver, RubyValue arg) {
		double x = arg.toFloat();
		return ObjectFactory.createFloat(Math.log(x + Math.sqrt(x * x + 1.0)));
	}
	
	@RubyLevelMethod(name="atan", moduleMethod=true)
	public static RubyValue atan(RubyValue receiver, RubyValue arg) {
		return ObjectFactory.createFloat(Math.atan(arg.toFloat()));
	}
	
	@RubyLevelMethod(name="atanh", moduleMethod=true)
	public static RubyValue atanh(RubyValue receiver, RubyValue arg) {
		double x = arg.toFloat();
		return ObjectFactory.createFloat(Math.log((1.0 + x) / (1.0 - x)) / 2.0);
	}
	
	@RubyLevelMethod(name="atan2", moduleMethod=true)
	public static RubyValue atan2(RubyValue receiver, RubyValue arg1, RubyValue arg2) {
		return ObjectFactory.createFloat(Math.atan(Math.atan2(arg1.toFloat(), arg2.toFloat())));
	}
	
	@RubyLevelMethod(name="hypot", moduleMethod=true)
	public static RubyValue hypot(RubyValue receiver, RubyValue arg1, RubyValue arg2) {
		return ObjectFactory.createFloat(Math.atan(Math.hypot(arg1.toFloat(), arg2.toFloat())));
	}
}
