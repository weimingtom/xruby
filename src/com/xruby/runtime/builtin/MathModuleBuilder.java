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
		m.defineModuleMethod("sqrt", new Math_sqrt());
		m.defineModuleMethod("exp", new Math_exp());
		m.defineModuleMethod("log", new Math_log());
		m.defineModuleMethod("log10", new Math_log10());
		m.defineModuleMethod("cos", new Math_cos());
		m.defineModuleMethod("sin", new Math_sin());
		m.defineModuleMethod("tan", new Math_tan());
		m.defineModuleMethod("cosh", new Math_cosh());
		m.defineModuleMethod("sinh", new Math_sinh());
		m.defineModuleMethod("tanh", new Math_tanh());
		m.defineModuleMethod("acos", new Math_acos());
		m.defineModuleMethod("acosh", new Math_acosh());
		m.defineModuleMethod("asin", new Math_asin());
		m.defineModuleMethod("asinh", new Math_asinh());
		m.defineModuleMethod("atan", new Math_atan());
		m.defineModuleMethod("atanh", new Math_atanh());
		m.defineModuleMethod("atan2", new Math_atan2());
		m.defineModuleMethod("hypot", new Math_hypot());
	}
}
