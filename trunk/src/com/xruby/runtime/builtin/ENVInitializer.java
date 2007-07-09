/**
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Map;

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

class ENV_index extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String s = RubyTypesUtil.convertToJavaString(arg);
        Map<String, String> map = System.getenv();

        if (map.containsValue(s)) {
            for (String k : map.keySet()) {
                String v = map.get(k);
                if (s.equals(v)) {
                    return ObjectFactory.createString(k);
                }
            }
        }

        return ObjectFactory.NIL_VALUE;
    }
}

public class ENVInitializer {
    public static void initialize() {
        RubyValue v = RubyAPI.setTopLevelConstant(new RubyObject(RubyRuntime.ObjectClass), "ENV");
        v.getSingletonClass().defineMethod("__get_os_ev__", new ENV_array_get());
        v.getSingletonClass().defineMethod("__os_ev_index__", new ENV_index());
    }
}
