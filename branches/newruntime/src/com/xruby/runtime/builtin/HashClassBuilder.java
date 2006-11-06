/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Hash_length extends RubyMethod {
	public Hash_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		return ObjectFactory.createFixnum(value.size());
	}
}

class Hash_hash_access extends RubyMethod {
	public Hash_hash_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		if (1 == args.size()) {
			return value.get(args.get(0));
		}
		
		//TODO
		throw new RubyException("not implemented");
	}
}

class Hash_hash_set extends RubyMethod {
	public Hash_hash_set() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		value.add(args.get(0), args.get(1));
		return args.get(1);
	}
}

public class HashClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Hash", RubyRuntime.ObjectClass);
		c.defineMethod("length", new Hash_length());
		c.defineMethod("[]", new Hash_hash_access());
		c.defineMethod("[]=", new Hash_hash_set());
		return c;
	}
}
