package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;

public abstract class NoBlockRubyMethod extends RubyMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args,
			RubyBlock block) {
		return run(receiver, args);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyArray args);
}
