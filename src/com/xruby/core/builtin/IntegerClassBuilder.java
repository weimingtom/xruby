/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Integer_downto extends RubyMethod {
	public Integer_downto(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_upto extends RubyMethod {
	public Integer_upto(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_chr extends RubyMethod {
	public Integer_chr(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_succ extends RubyMethod {
	public Integer_succ(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_to_int extends RubyMethod {
	public Integer_to_int(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Integer_ceil extends RubyMethod {
	public Integer_ceil(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_floor extends RubyMethod {
	public Integer_floor(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_to_i extends RubyMethod {
	public Integer_to_i(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Integer_integer_question extends RubyMethod {
	public Integer_integer_question(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_times extends RubyMethod {
	public Integer_times(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_round extends RubyMethod {
	public Integer_round(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_next extends RubyMethod {
	public Integer_next(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Integer_truncate extends RubyMethod {
	public Integer_truncate(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

public class IntegerClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Integer", RubyRuntime.NumericClass);
		c.defineMethod("downto", new Integer_downto(1));
		c.defineMethod("upto", new Integer_upto(1));
		c.defineMethod("chr", new Integer_chr(0));
		c.defineMethod("succ", new Integer_succ(0));
		c.defineMethod("to_int", new Integer_to_int(0));
		c.defineMethod("ceil", new Integer_ceil(0));
		c.defineMethod("floor", new Integer_floor(0));
		c.defineMethod("to_i", new Integer_to_i(0));
		c.defineMethod("integer?", new Integer_integer_question(0));
		c.defineMethod("times", new Integer_times(0));
		c.defineMethod("round", new Integer_round(0));
		c.defineMethod("next", new Integer_next(0));
		c.defineMethod("truncate", new Integer_truncate(0));
		return c;
	}
}
