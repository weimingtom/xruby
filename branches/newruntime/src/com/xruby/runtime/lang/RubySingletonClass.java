package com.xruby.runtime.lang;

public class RubySingletonClass extends RubyClass {
	public void attachSingletonClass(RubyValue obj) {
		ensureIvTableNotNull();
		RubyID id = StringMap.intern("__attached__");
		this.ivTable.put(id, obj);
	}

	public boolean isSingleton() {
		return true;
	}

	public boolean isReal() {
		return false;
	}
}
