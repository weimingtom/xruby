/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Proc_call extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        throw new Error("we overided invoke, so this method should never be called");
    }

    public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyValue v = ((RubyProc)receiver).call(args);
        block = ((RubyProc)receiver).getBlock();
        if (null != block) {
            v.setReturnedInBlock(block.returned(), block.breakedOrReturned(), !block.createdByLambda());
        } else {
            v.setReturnedInBlock(false, false, false);
        }
        return v;
    }

    public RubyValue invoke(RubyValue receiver, RubyBlock block) {
        return this.invoke(receiver, (RubyArray)null, block);
    }

    public RubyValue invoke(RubyValue receiver, RubyValue arg, RubyBlock block) {
        block = ((RubyProc)receiver).getBlock();
        RubyArray args = ObjectFactory.createArray(1, 0, block.createdByLambda());
        args.add(arg);
        return this.invoke(receiver, args, block);
    }
}

public class ProcClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.ProcClass;
        RubyMethod call = new Proc_call();
        c.defineMethod("call", call);
        c.defineMethod("[]", call);
    }
}