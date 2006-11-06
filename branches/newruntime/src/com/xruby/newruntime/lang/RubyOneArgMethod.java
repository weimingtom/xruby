package com.xruby.newruntime.lang;

public abstract class RubyOneArgMethod extends NoBlockRubyMethod {
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg);
	
	protected RubyValue run(RubyValue receiver, RubyValue[] args) {
		return this.run(receiver, args[0]);
	}

}
