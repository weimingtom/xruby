/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelModule;

@RubyLevelModule(name="GC")
public class RubyGC {
    @RubyLevelMethod(name="start", singleton=true)
    public static RubyValue start(RubyValue receiver) {
        System.gc();
        return ObjectFactory.NIL_VALUE;
    }
}
