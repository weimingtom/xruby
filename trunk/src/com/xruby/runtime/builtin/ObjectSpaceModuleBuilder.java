/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.ObjectSpace;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;

class ObjectSpace_each_object extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        int n = ObjectSpace.each_object(receiver, (null == args) ? null : (RubyModule)args.get(0), block);
        return ObjectFactory.createFixnum(n);
    }
}

public class ObjectSpaceModuleBuilder {
    public static void initialize() {
        RubyModule c = RubyRuntime.ObjectSpaceModule;
        c.getSingletonClass().defineMethod("each_object", new ObjectSpace_each_object());
    }
}
