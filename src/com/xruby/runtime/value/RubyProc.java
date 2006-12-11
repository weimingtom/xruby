package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyProc extends RubyBasic {
	private RubyBlock value_;
	
	RubyProc(RubyBlock v) {
		super(RubyRuntime.ProcClass);
		value_ = v;
	}
	
	public RubyBlock getValue() {
		return value_;
	}
	
}
