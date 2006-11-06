package com.xruby.newruntime.lang;

public class RubyDelegateMethod extends RubyMethod {
	protected void before() {		
	}
	
	protected void after() {		
	}
	
	private RubyMethod delegate;
	
	public RubyDelegateMethod(RubyMethod method) {
		this.delegate = method;
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args,
			RubyBlock block) {
		this.before();
		RubyValue result = this.delegate.run(receiver, args, block);
		this.after();
		return result;
	}
}
