/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyHash;

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
        c.defineAllocMethod(new Hash_new());
    }
}
