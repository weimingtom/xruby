/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class IO_write extends RubyMethod {
	public IO_write() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value;
		if (RubyRuntime.StringClass == args.get(0).getRubyClass()) {
			value = (StringValue)args.get(0).getValue();
		} else {
			RubyValue str = RubyRuntime.callPublicMethod(args.get(0), null, "to_s");
			value = (StringValue) str.getValue();
		}
		
		IOValue io = (IOValue)receiver.getValue();
		if (null == io) {
			System.out.print(value.toString());
		} else {
			io.print(value.toString());
		}
		return ObjectFactory.createFixnum(value.length());
	}
}

class IO_print extends Kernel_print {
	public IO_print() {
	}
	
	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return _run(receiver, args, block);
	}
}

class IO_close extends RubyMethod {
	public IO_close() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IOValue io = (IOValue)receiver.getValue();
		if (null != io) {
			//not stdout, stderr, stdin
			io.close();
		}
		return ObjectFactory.nilValue;
	}
}

public class IOClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("IO",
				RubyRuntime.ObjectClass);
		c.defineMethod("write", new IO_write());
		c.defineMethod("print", new IO_print());
		c.defineMethod("close", new IO_close());
		return c;
	}
}
