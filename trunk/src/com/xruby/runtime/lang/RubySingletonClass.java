package com.xruby.runtime.lang;

public class RubySingletonClass extends RubyClass {

	public RubySingletonClass() {
		super("", null, null);
	}

	public boolean isSingleton() {
		return true;
	}

	public boolean isReal() {
		return false;
	}
}
