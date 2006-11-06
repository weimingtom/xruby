package com.xruby.newruntime.lang;

public class RubyObject extends RubyIvBase {
	public RubyObject() {		
	}
	
	public RubyObject(RubyClass klass) {
		this.setRubyClass(klass);
	}
}
