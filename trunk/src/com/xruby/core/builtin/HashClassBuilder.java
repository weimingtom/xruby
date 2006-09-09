/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Hash_length extends RubyMethod {
	public Hash_length(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		return ObjectFactory.createFixnum(value.size());
	}
}

class Hash_hash_access extends RubyMethod {
	public Hash_hash_access(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		if (1 == args.length) {
			return value.get(args[0]);
		}
		
		//TODO
		throw new RubyException("not implemented");
	}
}

class Hash_hash_set extends RubyMethod {
	public Hash_hash_set(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		value.add(args[0], args[1]);
		return args[1];
	}
}

public class HashClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Hash", RubyRuntime.ObjectClass);
		c.defineMethod("length", new Hash_length(0));
		c.defineMethod("[]", new Hash_hash_access(-1));
		c.defineMethod("[]=", new Hash_hash_set(-1));
		return c;
	}
}
