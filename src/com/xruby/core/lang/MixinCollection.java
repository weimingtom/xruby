package com.xruby.core.lang;

import java.util.*;

public class MixinCollection extends MethodCollection {
	private ArrayList<RubyModule> mixins_ = new ArrayList<RubyModule>();

	public void includeModule(RubyModule m) {
		mixins_.add(0, m);
	}

	RubyMethod findMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findMethod(method_name);
			if (null != m) {
				return m;
			}
		}
		
		return null;
	}

	RubyMethod findPublicMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m && m.isPublic()) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findMethod(method_name);
			if (null != m && m.isPublic()) {
				return m;
			}
		}
		
		return null;
	}
}
