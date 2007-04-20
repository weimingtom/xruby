/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.WeakHashMap;
import com.xruby.runtime.value.RubyArray;

//we are using map as list here.
public class ObjectSpace {
    private static WeakHashMap<RubyValue, RubyValue> map_= new WeakHashMap<RubyValue, RubyValue>();

    public static void add(RubyValue v) {
        map_.put(v, null);
    }

    public static int each_object(RubyValue receiver, RubyModule m, RubyBlock block) {
        int i = 0;
        for (RubyValue v : map_.keySet()) {
            ++i;
            if (null == m || RubyAPI.isKindOf(m, v)) {
                block.invoke(receiver, new RubyArray(v));
            }
        }
        return i;
    }
}
