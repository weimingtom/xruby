package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyProc extends RubyBinding {
	private RubyBlock value_;
	
	RubyProc(RubyBlock v) {
		super(RubyRuntime.ProcClass);
		setSelf(ObjectFactory.topLevelSelfValue);//TODO should not hardcode this
		setScope(RubyRuntime.GlobalScope);//TODO should not hardcode this
		value_ = v;
	}
	
	public RubyBlock getBlock() {
		return value_;
	}
}
