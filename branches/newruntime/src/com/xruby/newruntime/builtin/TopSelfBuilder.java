package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyString;

public class TopSelfBuilder implements ClassBuilder {
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
			return RubyString.newString("main");
		}		
	};
}
