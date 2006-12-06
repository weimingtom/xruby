package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

abstract class ConstantCollection extends MethodCollectionWithMixin {
	protected Map<String, RubyValue> constants_ = new HashMap<String, RubyValue>();

	ConstantCollection(RubyClass c) {
		super(c);
	}

	/// e.g. A::B
	protected RubyValue getConstant(String name) {
		return constants_.get(name);
	}

	protected RubyValue setConstant(String name, RubyValue value) {
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
		if (!(receiver instanceof RubyClass) &&
				!(receiver instanceof RubyModule)) {
			RubyValue v = RubyAPI.callPublicMethod(receiver, null, "to_s");
			String s = ((RubyString)v).toString();
			throw new RubyException(RubyRuntime.TypeErrorClass, s + " is not a class/module");
		}
	}

	public static RubyValue getConstant(RubyValue receiver, String name) {
		throw_type_error_if_not_class_module(receiver);
		
		RubyValue v = ((RubyModule)receiver).getConstant(name);
		if (null == v) {
			String module_name = ((RubyModule)receiver).getName();
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + module_name + "::" + name);
		}
		
		return v;
	}

	public static RubyValue setConstant(RubyValue value, RubyValue receiver, String name) {
		throw_type_error_if_not_class_module(receiver);

		return ((RubyModule)receiver).setConstant(name, value);
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
}
