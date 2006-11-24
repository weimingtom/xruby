package com.xruby.runtime.lang;

public class RubyRealClass extends RubyClass {
	public boolean isReal() {
		return true;
	}

	public boolean isSingleton() {
		return false;
	}
}
