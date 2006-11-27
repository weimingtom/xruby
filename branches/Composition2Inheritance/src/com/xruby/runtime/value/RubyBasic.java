package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

//TODO some stuffs in RubyValue should be moved into here.
class RubyBasic extends RubyValue {
	public RubyBasic(RubyClass c) {
		super(c, null);
	}
	
	public RubyBasic(RubyClass c, Object v) {
		super(c, v);
	}
	
	//FIXME remove this
	public RubyValue getValue() {
		return this;
	}
}
