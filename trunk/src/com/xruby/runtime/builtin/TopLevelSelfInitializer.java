/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class TopLevelSelf_include extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        assert(ObjectFactory.TOP_LEVEL_SELF_VALUE == receiver);

        for (RubyValue v : args) {
            RubyClass c = v.getRubyClass();
            if (c != RubyRuntime.ModuleClass) {
                throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + c.getName() + " (expected Module)");
            }
            RubyRuntime.ObjectClass.includeModule((RubyModule) v);
        }

        return RubyRuntime.ObjectClass;
    }
}

public class TopLevelSelfInitializer {
    public static void initialize() {
        ObjectFactory.TOP_LEVEL_SELF_VALUE.getSingletonClass().defineMethod("include", new TopLevelSelf_include());
        RubyRuntime.ObjectClass.includeModule(RubyRuntime.GlobalScope);
    }

}
