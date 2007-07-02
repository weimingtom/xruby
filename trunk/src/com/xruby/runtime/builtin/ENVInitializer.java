/**
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyObject;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyString;

class ENV_array_get extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyString s = RubyTypesUtil.convertToString(arg);
        String v = System.getenv(s.toString());
        if (null == v) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return ObjectFactory.createString(v);
        }
    }
}

public class ENVInitializer {
    public static void initialize() {
        RubyValue v = RubyAPI.setTopLevelConstant(new RubyObject(RubyRuntime.ObjectClass), "ENV");
        v.getSingletonClass().defineMethod("[]", new ENV_array_get());
    }
}
