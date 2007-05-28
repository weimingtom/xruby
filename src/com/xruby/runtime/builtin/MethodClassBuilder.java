/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Method_call extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        return m.call(args, block);
    }
}

class Method_to_s extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        return ObjectFactory.createString(m.toString());
    }
}

class Method_to_proc extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        return m.convertToRubyProc();
    }
}

class Method_arity extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        return ObjectFactory.createFixnum(m.arity());
    }
}

class Method_unbind extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyMethodValue m = (RubyMethodValue)receiver;
        return m.unbind();
    }
}

public class MethodClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.MethodClass;
        c.defineMethod("call", new Method_call());
        c.defineMethod("to_proc", new Method_to_proc());
        RubyMethod to_s = new Method_to_s();
        c.defineMethod("to_s", to_s);
        c.defineMethod("inspect", to_s);
        c.defineMethod("arity", new Method_arity());
        c.defineMethod("unbind", new Method_unbind());
    }
}
