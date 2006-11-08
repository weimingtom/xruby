package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;

public class RubyDelegateMethod extends RubyMethod {
	protected void before() {		
	}
	
	protected void after() {		
	}
	
	private RubyMethod delegate;
	
	public RubyDelegateMethod(RubyMethod method) {
		this.delegate = method;
	}

	protected RubyValue run(RubyValue receiver, RubyArray args,
			RubyBlock block) {
		this.before();
		RubyValue result = this.delegate.run(receiver, args, block);
		this.after();
		return result;
	}
}
