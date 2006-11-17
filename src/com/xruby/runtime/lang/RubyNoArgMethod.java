package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyNoArgMethod extends NoBlockRubyMethod {
	protected abstract RubyValue run(RubyValue receiver);
	
	public RubyValue run(RubyValue receiver, RubyArray args) {
		return this.run(receiver);
	}
}
