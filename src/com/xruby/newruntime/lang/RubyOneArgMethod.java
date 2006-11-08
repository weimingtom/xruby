package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;

public abstract class RubyOneArgMethod extends NoBlockRubyMethod {
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg);
	
	protected RubyValue run(RubyValue receiver, RubyArray args) {
		return this.run(receiver, args.get(0));
	}

}
