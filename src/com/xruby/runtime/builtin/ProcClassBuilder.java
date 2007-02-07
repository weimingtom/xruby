/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Proc_call extends RubyMethod {
	public Proc_call() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		throw new Error("we overided invoke, so this method should never be called");
	}

	public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyValue v = ((RubyProc)receiver).call(receiver, args);
		block = ((RubyProc)receiver).getBlock();
		if (null != block) {
			v.setReturnedInBlock(block.createdByLambda() ? false : block.returned(), block.breakedOrReturned(), !block.createdByLambda());
		} else {
			v.setReturnedInBlock(false, false, false);
		}
		return v;
	}
}

class Proc_arity extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyBlock b = ((RubyProc)receiver).getBlock();
		return ObjectFactory.createFixnum(b.arity());
	}

}

class Proc_alloc extends RubyMethod {
	public Proc_alloc() {
		super(-1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createProc(block);
	}
}

public class ProcClassBuilder {	
	public static void initialize() {
		RubyClass c = RubyRuntime.ProcClass;
		c.defineMethod("call", new Proc_call());
		c.defineMethod("arity", new Proc_arity());
		c.defineAllocMethod(new Proc_alloc());
	}
}