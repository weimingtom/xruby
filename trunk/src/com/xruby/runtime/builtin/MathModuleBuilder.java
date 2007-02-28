/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Math_sqrt extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sqrt(x));
	}
}

class Math_log extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log(x));
	}
}

class Math_log10 extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log10(x));
	}
}


class Math_exp extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.exp(x));
	}
}

class Math_cos extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.cos(x));
	}
}

class Math_sin extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sin(x));
	}
}

class Math_tan extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.tan(x));
	}
}

class Math_cosh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.cosh(x));
	}
}

class Math_sinh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sinh(x));
	}
}

class Math_tanh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.tanh(x));
	}
}

class Math_acos extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.acos(x));
	}
}

class Math_acosh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log(x + Math.sqrt(x * x - 1.0)));
	}
}

class Math_asin extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.asin(x));
	}
}

class Math_asinh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log(x + Math.sqrt(x * x + 1.0)));
	}
}

class Math_atan extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.atan(x));
	}
}

class Math_atanh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double x = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log((1.0 + x) / (1.0 - x)) / 2.0);
	}
}

class Math_atan2 extends RubyMethod {
	public Math_atan2() {
		super(2);
	}
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double y = RubyTypesUtil.convertToJavaDouble(args.get(0));
		double x = RubyTypesUtil.convertToJavaDouble(args.get(1));
		return ObjectFactory.createFloat(Math.atan2(y, x));
	}
}

class Math_hypot extends RubyMethod {
	public Math_hypot() {
		super(2);
	}
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		double y = RubyTypesUtil.convertToJavaDouble(args.get(0));
		double x = RubyTypesUtil.convertToJavaDouble(args.get(1));
		return ObjectFactory.createFloat(Math.hypot(y, x));
	}
}

public class MathModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MathModule;
		
		//TODO Create a method wrapper so that following methods can be instantiated only once
		m.getSingletonClass().defineMethod("sqrt", new Math_sqrt());
		m.getSingletonClass().defineMethod("exp", new Math_exp());
		m.getSingletonClass().defineMethod("log", new Math_log());
		m.getSingletonClass().defineMethod("log10", new Math_log10());
		m.getSingletonClass().defineMethod("cos", new Math_cos());
		m.getSingletonClass().defineMethod("sin", new Math_sin());
		m.getSingletonClass().defineMethod("tan", new Math_tan());
		m.getSingletonClass().defineMethod("cosh", new Math_cosh());
		m.getSingletonClass().defineMethod("sinh", new Math_sinh());
		m.getSingletonClass().defineMethod("tanh", new Math_tanh());
		m.getSingletonClass().defineMethod("acos", new Math_acos());
		m.getSingletonClass().defineMethod("acosh", new Math_acosh());
		m.getSingletonClass().defineMethod("asin", new Math_asin());
		m.getSingletonClass().defineMethod("asinh", new Math_asinh());
		m.getSingletonClass().defineMethod("atan", new Math_atan());
		m.getSingletonClass().defineMethod("atanh", new Math_atanh());
		m.getSingletonClass().defineMethod("atan2", new Math_atan2());
		m.getSingletonClass().defineMethod("hypot", new Math_hypot());
		
		m.setAccessPrivate();
		m.defineMethod("sqrt", new Math_sqrt());
		m.defineMethod("exp", new Math_exp());
		m.defineMethod("log", new Math_log());
		m.defineMethod("log10", new Math_log10());
		m.defineMethod("cos", new Math_cos());
		m.defineMethod("sin", new Math_sin());
		m.defineMethod("tan", new Math_tan());
		m.defineMethod("cosh", new Math_cosh());
		m.defineMethod("sinh", new Math_sinh());
		m.defineMethod("tanh", new Math_tanh());
		m.defineMethod("acos", new Math_acos());
		m.defineMethod("acosh", new Math_acosh());
		m.defineMethod("asin", new Math_asin());
		m.defineMethod("asinh", new Math_asinh());
		m.defineMethod("atan", new Math_atan());
		m.defineMethod("atanh", new Math_atanh());
		m.defineMethod("atan2", new Math_atan2());
		m.defineMethod("hypot", new Math_hypot());
		m.setAccessPublic();
	}
}
