/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.WeakHashMap;

import com.xruby.runtime.lang.annotation.MethodType;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelModule;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;

//we are using map as list here.
@RubyLevelModule(name="ObjectSpace")
public class ObjectSpace {
    private static WeakHashMap<RubyValue, RubyValue> map_= new WeakHashMap<RubyValue, RubyValue>();

    public static void add(RubyValue v) {
        map_.put(v, null);
    }
    
    @RubyLevelMethod(name="each_object", type=MethodType.VAR_ARG, block=true, singleton=true)
    public static RubyFixnum each_object(RubyValue receiver, RubyArray args, RubyBlock block) {
    	int n = ObjectSpace.each_object(receiver, (null == args) ? null : (RubyModule)args.get(0), block);
        return ObjectFactory.createFixnum(n);
    }

    public static int each_object(RubyValue receiver, RubyModule m, RubyBlock block) {
        int i = 0;
        for (RubyValue v : map_.keySet()) {
            if (null == m || RubyAPI.isKindOf(m, v)) {
                block.invoke(receiver, v);
                ++i;
            }
        }
        return i;
    }
    
    
}
