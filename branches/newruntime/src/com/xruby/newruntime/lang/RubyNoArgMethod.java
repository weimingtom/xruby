package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;

public abstract class RubyNoArgMethod extends NoBlockRubyMethod {
	protected abstract RubyValue run(RubyValue receiver);
	
	public RubyValue run(RubyValue receiver, RubyArray args) {
		return this.run(receiver);
	}
}
