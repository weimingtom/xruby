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
                return block.invoke(receiver, key);
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
        c.defineMethod("initialize", new Hash_initialize());
        c.defineMethod("==", new Hash_equal());
        c.defineAllocMethod(new Hash_new());
    }
}
