/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import com.xruby.core.value.*;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name);
		constants_.put(name, new RubyValue(RubyRuntime.ModuleClass, m));//NOTE, do not use ObjectFactory.createClass, it will cause initialization issue
		return m;
	}

	public RubyValue defineModule(String name) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			v = new RubyValue(RubyRuntime.ModuleClass, new RubyModule(name));
			constants_.put(name, v);
			return v;
		}
		
		if (v.getRubyClass() != RubyRuntime.ModuleClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
		}
		
		return v;
	}

	/// e.g. A::B
	RubyValue getConstantViaColon2(String name) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + name_ + "::" + name);
		}

		return v;
	}

	public static RubyValue getConstantViaColon2(RubyValue receiver, String name) throws RubyException {
		if (receiver.getRubyClass() != RubyRuntime.ClassClass &&
			receiver.getRubyClass() != RubyRuntime.ModuleClass) {
			RubyValue v = RubyRuntime.callPublicMethod(receiver, null, "to_s");
			String s = ((StringValue)v.getValue()).toString();
			throw new RubyException(RubyRuntime.TypeErrorClass, s + " is not a class/module");
		}
		
		return ((ModuleClassAndMethodCollection)receiver.getValue()).getConstantViaColon2(name);
	}
}

