package com.xruby.newruntime.lang;

public abstract class NoBlockRubyMethod extends RubyMethod {
	protected RubyValue run(RubyValue receiver, RubyValue[] args,
			RubyBlock block) {
		return run(receiver, args);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyValue[] args);
}
