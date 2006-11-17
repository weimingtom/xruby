package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class NoBlockRubyMethod extends RubyMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args,
			RubyBlock block) {
		return run(receiver, args);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyArray args);
}
