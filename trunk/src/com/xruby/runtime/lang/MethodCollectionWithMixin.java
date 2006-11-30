package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

abstract class MethodCollectionWithMixin extends MethodCollection {
	private ArrayList<RubyModule> mixins_ = new ArrayList<RubyModule>();

	MethodCollectionWithMixin(RubyClass c) {
		super(c);
	}
	
	public void includeModule(RubyModule m) {
		if (!mixins_.contains(m)) {
			mixins_.add(0, m);
		}
	}

	RubyMethod findOwnMethod(String method_name) {
		RubyMethod m = super.findOwnMethod(method_name);
		if (null != m) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findOwnMethod(method_name);
			if (null != m) {
				return m;
			}
		}
		
		return null;
	}

	RubyMethod findOwnPublicMethod(String method_name) {
		RubyMethod m = super.findOwnMethod(method_name);
		if (null != m && m.isPublic()) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findOwnMethod(method_name);
			if (null != m && m.isPublic()) {
				return m;
			}
		}
		
		return null;
	}

	void collectOwnMethodNames(RubyArray a) {
		super.collectOwnMethodNames(a);
		for (RubyModule module : mixins_) {
			module.collectOwnMethodNames(a);
		}
	}

	protected RubyValue findClassVariable(String name) {
		RubyValue v = super.findClassVariable(name);
		if (null != v) {
			return v;
		}

		for (RubyModule module : mixins_) {
			v = module.findClassVariable(name);
			if (null != v) {
				return v;
			}
		}

		return null;
	}
}
