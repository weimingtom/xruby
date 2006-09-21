/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class IO_write extends RubyMethod {
	public IO_write(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value;
		if (RubyRuntime.StringClass == args.get(0).getRubyClass()) {
			value = (StringValue)args.get(0).getValue();
		} else {
			RubyValue str = RubyRuntime.callPublicMethod(args.get(0), null, "to_s");
			value = (StringValue) str.getValue();
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
