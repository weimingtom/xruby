package com.xruby.runtime.lang;

public class RubyBasic extends RubyValue {
	private RubyClass klass;
    
    public void setRubyClass(RubyClass klass) {
    	this.klass = klass;
    }
    
    public RubyClass getRubyClass() {
    	return this.klass;
    }
}
