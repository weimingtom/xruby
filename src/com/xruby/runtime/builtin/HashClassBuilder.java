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
			RubyValue retValue = value.get(args.get(0));
            RubyBlock defBlock = value.getBlock();

            // If block was given while being defined, invoke block
            if(ObjectFactory.nilValue == retValue && null != defBlock) {
                RubyValue key = args.get(0);
                args.set(1, key);
                args.set(0, receiver);
                defBlock.invoke(receiver, args);
                retValue = value.get(key);
            }

            return retValue;
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

class Hash_initialize extends RubyMethod {
    public Hash_initialize() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
        HashValue hash = new HashValue();

        if(null != block && null != args) { // validation
            throw new RubyException("Hash: in `initialize': wrong number of arguments");
        }

        if(null != args) {
            RubyValue defaultValue = args.get(0);
            hash.setDefaultValue(defaultValue);
        }

        if (null != block) { // Hash.new {...}
            hash.setBlock(block);
        }


        receiver.setValue(hash);
        
        return receiver;
    }
}

public class HashClassBuilder {
    
    public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Hash", RubyRuntime.ObjectClass);
        c.defineMethod("length", new Hash_length());
		c.defineMethod("[]", new Hash_hash_access());
		c.defineMethod("[]=", new Hash_hash_set());
        c.defineMethod("to_s", new Hash_to_s());
        c.defineMethod("initialize", new Hash_initialize());
        return c;
	}
}
