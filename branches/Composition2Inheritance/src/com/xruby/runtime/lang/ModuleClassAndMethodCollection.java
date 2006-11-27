/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.Iterator;
import java.util.Set;

import com.xruby.runtime.value.*;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name);
		constants_.put(name, m);//NOTE, do not use ObjectFactory.createClass, it will cause initialization issue
		return m;
	}

	public RubyValue defineModule(String name) {
		RubyValue v = constants_.get(name);
		if (null == v) {
			v = new RubyModule(name);
			constants_.put(name, v);
			return v;
		}
		
		if (v.getRubyClass() != RubyRuntime.ModuleClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
		}
		
		return v;
	}

	/// e.g. A::B
	RubyValue getConstant(String name) {
		return constants_.get(name);
	}

	RubyValue setConstant(String name, RubyValue value) {
		constants_.put(name, value);
		return value;
	}

	public RubyValue getCurrentNamespaceConstant(String name) {
		RubyValue v = getConstant(name);
		if (null != v) {
			return v;
		}

		v = RubyRuntime.GlobalScope.getConstant(name);
		if (null == v) {
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + name_ + "::" + name);
		}
		return v;
	}

	private static void throw_type_error_if_not_class_module(RubyValue receiver) {
		if (receiver.getRubyClass() != RubyRuntime.ClassClass &&
			receiver.getRubyClass() != RubyRuntime.ModuleClass) {
			RubyValue v = RubyAPI.callPublicMethod(receiver, null, "to_s");
			String s = ((RubyString)v).toString();
			throw new RubyException(RubyRuntime.TypeErrorClass, s + " is not a class/module");
		}
	}

	public static RubyValue getConstant(RubyValue receiver, String name) {
		throw_type_error_if_not_class_module(receiver);
		
		RubyValue v = ((ModuleClassAndMethodCollection)receiver).getConstant(name);
		if (null == v) {
			String module_name = ((ModuleClassAndMethodCollection)receiver).getName();
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + module_name + "::" + name);
		}
		
		return v;
	}

	public static RubyValue setConstant(RubyValue value, RubyValue receiver, String name) {
		throw_type_error_if_not_class_module(receiver);

		return ((ModuleClassAndMethodCollection)receiver).setConstant(name, value);
	}

	public static RubyValue getTopLevelConstant(String name) {
		RubyValue v = RubyRuntime.GlobalScope.getConstant(name);
		if (null == v) {
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + name);
		}
		return v;
	}

	public static RubyValue setTopLevelConstant(RubyValue value, String name) {
		return RubyRuntime.GlobalScope.setConstant(name, value);
	}
	
	public RubyValue getConstants() {
		Set<String> keys = constants_.keySet();
		RubyArray a = new RubyArray(keys.size());
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()){
			a.add(ObjectFactory.createString(iterator.next()));
		}
		return a;
	}
}

