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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash value = (RubyHash)receiver;
		return ObjectFactory.createFixnum(value.size());
	}
}

class Hash_hash_access extends RubyMethod {
	public Hash_hash_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash value = (RubyHash)receiver;
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash value = (RubyHash)receiver;
		value.add(args.get(0), args.get(1));
		return args.get(1);
	}
}

class Hash_to_s extends RubyMethod {

    public Hash_to_s() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash value = (RubyHash)receiver;
		return value.to_s();
    }
}

class Hash_each extends RubyMethod {

    public Hash_each() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash hash = (RubyHash)receiver;
        hash.rb_iterate(receiver, block);

        return receiver;
    }
}

class Hash_initialize extends RubyMethod {
	public Hash_initialize() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash hash = (RubyHash)receiver;

		if (null != block && null != args) { // validation
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
		}

		if (null != args) {
			RubyValue defaultValue = args.get(0);
			hash.setDefaultValue(defaultValue);
		}

		if (null != block) { // Hash.new {...}
			hash.setBlock(block);
		}

		return receiver;
	}
}

class Hash_has_key_question extends RubyMethod {
	public Hash_has_key_question() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash h = (RubyHash)receiver;
		return h.has_key(args.get(0)) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
	}
}

class Hash_has_value_question extends RubyMethod {
	public Hash_has_value_question() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash h = (RubyHash)receiver;
		return h.has_value(args.get(0)) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
	}
}

class Hash_values_at extends RubyMethod {
	public Hash_values_at() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash h = (RubyHash)receiver;
		return h.values_at(args);
	}
}

class Hash_equal extends RubyMethod {
	public Hash_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash left = (RubyHash)receiver;
		Object right = args.get(0);
		if (!(right instanceof RubyHash)) {
			return ObjectFactory.falseValue;
		}
		return left.equals((RubyHash)right) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
	}
}

class Hash_keys extends RubyMethod {
	public Hash_keys() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyHash h = (RubyHash)receiver;
		return h.keys();
	}
}

class Hash_new extends RubyMethod {
	public Hash_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createHash();
	}
}

public class HashClassBuilder {

    public static void initialize() {
		RubyClass c = RubyRuntime.HashClass;
		c.defineMethod("length", new Hash_length());
		c.defineMethod("[]", new Hash_hash_access());
		c.defineMethod("[]=", new Hash_hash_set());
		c.defineMethod("each", new Hash_each());
		c.defineMethod("to_s", new Hash_to_s());
		c.defineMethod("initialize", new Hash_initialize());
		c.defineMethod("has_key?", new Hash_has_key_question());
		c.defineMethod("has_value?", new Hash_has_value_question());
		c.defineMethod("values_at", new Hash_values_at());
		c.defineMethod("==", new Hash_equal());
		c.defineMethod("keys", new Hash_keys());
		c.defineAllocMethod(new Hash_new());

		c.includeModule(RubyRuntime.EnumerableModule);
	}
}
