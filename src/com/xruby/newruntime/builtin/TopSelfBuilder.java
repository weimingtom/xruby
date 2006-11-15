package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;
import com.xruby.newruntime.value.ObjectFactory;

public class TopSelfBuilder implements ExtensionBuilder {
	public RubyValue rbTopSelf;
	
	public void initialize() {
		this.rbTopSelf = RubyRuntime.objectClass.newInstance();
		this.rbTopSelf.defineSingletonMethod("to_s", TopSelfMethod.mainToS, 0);
	}
	
	public RubyValue getTopSelf() {
		return this.rbTopSelf;
	}
}

class TopSelfMethod {
	public static RubyMethod mainToS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return ObjectFactory.createString("main");
		}		
	};
}
