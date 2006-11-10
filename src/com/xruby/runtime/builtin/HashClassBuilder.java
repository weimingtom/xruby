/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import com.xruby.runtime.value.HashValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Hash_length extends RubyMethod {
	public Hash_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		return ObjectFactory.createFixnum(value.size());
	}
}

class Hash_hash_access extends RubyMethod {
	public Hash_hash_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		HashValue value = (HashValue)receiver.getValue();
		value.add(args.get(0), args.get(1));
		return args.get(1);
	}
}

class Hash_to_s extends RubyMethod {
    
    public Hash_to_s() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
        HashValue value = (HashValue) receiver.getValue();
		return value.to_s();
    }
}

public class HashClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Hash", RubyRuntime.ObjectClass);
		c.defineMethod("length", new Hash_length());
		c.defineMethod("[]", new Hash_hash_access());
		c.defineMethod("[]=", new Hash_hash_set());
        c.defineMethod("to_s", new Hash_to_s());
        return c;
	}
}
