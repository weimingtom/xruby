/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Math_sqrt extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sqrt(d));
	}
}

class Math_log extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log(d));
	}
}

class Math_log10 extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.log10(d));
	}
}


class Math_exp extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.exp(d));
	}
}

class Math_cos extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.cos(d));
	}
}

class Math_sin extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sin(d));
	}
}

class Math_tan extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.tan(d));
	}
}

class Math_cosh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.cosh(d));
	}
}

class Math_sinh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.sinh(d));
	}
}

class Math_tanh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.tanh(d));
	}
}

class Math_acos extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.acos(d));
	}
}

/*
class Math_acosh extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.acosh(d));
	}
}*/

class Math_asin extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.asin(d));
	}
}

class Math_atan extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d = RubyTypesUtil.convertToJavaDouble(arg);
		return ObjectFactory.createFloat(Math.atan(d));
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
		//m.defineModuleMethod("acosh", new Math_acosh());
		m.defineModuleMethod("asin", new Math_asin());
		m.defineModuleMethod("atan", new Math_atan());
		m.defineModuleMethod("atan2", new Math_atan2());
	}
}
