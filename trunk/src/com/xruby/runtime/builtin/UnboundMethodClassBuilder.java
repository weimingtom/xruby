/**
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.RubyMethodValue;

class UnboundMethod_bind extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        m.bind(arg);
        return receiver;
    }
}

public class UnboundMethodClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.UnboundMethodClass;
        c.defineMethod("bind", new UnboundMethod_bind());
    }
}
