package com.xruby.runtime.lang;

public class RubyModule extends RubyClassModuleBase {	
	public void defineModuleMethod(String name, RubyMethod method, int argc) {
		this.definePrivateMethod(name, method, argc);
		this.defineSingletonMethod(name, method, argc);
	}
}
