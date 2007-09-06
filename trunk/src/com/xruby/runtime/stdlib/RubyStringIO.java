/**
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.stdlib;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.value.*;

@RubyLevelClass(name="StringIO", modules="Enumerable")
public class RubyStringIO extends RubyBasic {
    private RubyString value_;

    private RubyStringIO() {
        super(RubyRuntime.StringIOClass);
    }

    @RubyAllocMethod
    public static RubyStringIO alloc(RubyValue receiver) {
        return new RubyStringIO();
    }

    @RubyLevelMethod(name="initialize")
    public RubyStringIO initialize(RubyArray args) {
        if (null == args) {
            value_ = ObjectFactory.createString();
        } else {
            value_ = ((RubyString)args.get(0)).clone();
        }
        return this;
    }

    @RubyLevelMethod(name="string")
    public RubyString string() {
        return value_;
    }

    @RubyLevelMethod(name="puts")
    public RubyString puts(RubyValue arg) {
        return value_.appendString(arg);
    }
}
