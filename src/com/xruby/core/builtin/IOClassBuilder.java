/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class IO_write extends RubyMethod {
	public IO_write(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		StringBuilder value;
		if (RubyRuntime.StringClass == args[0].getRubyClass()) {
			value = (StringBuilder)args[0].getValue();
		} else {
			RubyValue str = RubyRuntime.callPublicMethod(args[0], null, "to_s");
			value = (StringBuilder) str.getValue();
		}
		
		System.out.print(value.toString());
		return ObjectFactory.createFixnum(value.length());
	}
}

public class IOClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("IO",
				RubyRuntime.ObjectClass);
		c.defineMethod("write", new IO_write(1));
		return c;
	}
}
