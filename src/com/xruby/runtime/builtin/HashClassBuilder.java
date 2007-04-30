/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyHash;

class Hash_length extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash value = (RubyHash) receiver;
        return ObjectFactory.createFixnum(value.size());
    }
}

class Hash_hash_access extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash value = (RubyHash) receiver;
        if (1 == args.size()) {
            return value.get(args.get(0));
        }

        //TODO
        throw new RubyException("not implemented");
    }
}

//TODO this should be implmented in ruby
class Hash_fetch extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
    	RubyValue key = args.get(0);

        RubyHash value = (RubyHash) receiver;
        if (args.size() >= 1) {
            RubyValue v = value.get(key);
            if (v != ObjectFactory.NIL_VALUE) {
            	return v;//found
            } else if (args.size() >= 2) {
                return args.get(1);//default_value
            } else if (null != block) {
                return block.invoke(receiver, new RubyArray(key));
            } else {
            	throw new RubyException(RubyRuntime.IndexErrorClass, "key not found");
            }
        }

        //TODO
        throw new RubyException("not implemented");
    }
}

class Hash_hash_set extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash value = (RubyHash) receiver;
        value.add(args.get(0), args.get(1));
        return args.get(1);
    }
}

class Hash_to_s extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash value = (RubyHash) receiver;
        return value.to_s();
    }
}

class Hash_each extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash hash = (RubyHash) receiver;
        hash.each(receiver, block);

        return receiver;
    }
}

class Hash_initialize extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash hash = (RubyHash) receiver;

        if (null != block && null != args) { // validation
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
        }

        if (null != args) {
            RubyValue defaultValue = args.get(0);
            hash.setDefaultValue(defaultValue);
        }

        if (null != block) { // Hash.new {...}
            hash.setDefaultValueAsBlock(block);
        }

        return receiver;
    }
}

class Hash_has_key_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.has_key(arg) ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class Hash_delete extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        //TODO hsh.delete( aKeyObject ) {| aKeyObject | block } 
        return h.delete(arg);
    }
}

class Hash_has_value_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.has_value(arg) ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class Hash_values_at extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.values_at(args);
    }
}

class Hash_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyHash left = (RubyHash) receiver;
        Object right = arg;
        if (!(right instanceof RubyHash)) {
            return ObjectFactory.FALSE_VALUE;
        }
        return left.equals((RubyHash) right) ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class Hash_keys extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.keys();
    }
}

class Hash_values extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.values();
    }
}

class Hash_shift extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.shift();
    }
}

class Hash_default extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        return h.getDefaultValue();
    }
}

class Hash_default_assign extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyHash h = (RubyHash) receiver;
        h.setDefaultValue(arg);
        return h;
    }
}

class Hash_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
    	RubyHash h = ObjectFactory.createHash();
    	h.setRubyClass((RubyClass) receiver);
    	return h;
    }
}

public class HashClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.HashClass;
        RubyMethod length = new Hash_length();
        c.defineMethod("length", length);
        c.defineMethod("size", length);
        c.defineMethod("[]", new Hash_hash_access());
        c.defineMethod("[]=", new Hash_hash_set());
        c.defineMethod("fetch", new Hash_fetch());
        RubyMethod each = new Hash_each();
        c.defineMethod("each", each);
        c.defineMethod("each_pair", each);
        c.defineMethod("to_s", new Hash_to_s());
        c.defineMethod("initialize", new Hash_initialize());
        c.defineMethod("has_key?", new Hash_has_key_question());
        c.defineMethod("has_value?", new Hash_has_value_question());
        c.defineMethod("values_at", new Hash_values_at());
        c.defineMethod("==", new Hash_equal());
        c.defineMethod("keys", new Hash_keys());
        c.defineMethod("values", new Hash_values());
        c.defineMethod("shift", new Hash_shift());
        c.defineMethod("delete", new Hash_delete());		
        c.defineMethod("default", new Hash_default());
        c.defineMethod("default=", new Hash_default_assign());
        c.defineAllocMethod(new Hash_new());

        c.includeModule(RubyRuntime.EnumerableModule);
    }
}
