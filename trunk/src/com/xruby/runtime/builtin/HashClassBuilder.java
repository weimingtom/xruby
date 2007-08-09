/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyHash;

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

class Hash_hash_set extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyHash value = (RubyHash) receiver;
        value.add(args.get(0), args.get(1));
        return args.get(1);
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
        c.defineMethod("[]", new Hash_hash_access());
        c.defineMethod("[]=", new Hash_hash_set());
        c.defineAllocMethod(new Hash_new());
    }
}
