package com.xruby.newruntime.lang;

public abstract class RubyNoArgMethod extends NoBlockRubyMethod {
	protected abstract RubyValue run(RubyValue receiver);
	
	public RubyValue run(RubyValue receiver, RubyValue[] args) {
		return this.run(receiver);
	}
}
