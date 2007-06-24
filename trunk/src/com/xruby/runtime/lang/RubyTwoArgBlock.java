/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyTwoArgBlock extends RubyBlock {
    public RubyTwoArgBlock(RubyValue self, RubyValue arg, RubyArray args, RubyBlock block, RubyModule scope, boolean definedInAnotherBlock) {
        super(2, false, 0, self, arg, args, block, scope, definedInAnotherBlock);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args) {
        RubyValue arg0 = ObjectFactory.NIL_VALUE;
        RubyValue arg1 = ObjectFactory.NIL_VALUE;

        if (args != null) {
            int size = args.size();
            if (size >= 1) {
                arg0 = args.get(0);
            }

            if (size >= 2) {
                arg1 = args.get(1);
            }
        }

        return this.run(receiver, arg0, arg1);
    }

    protected RubyValue run(RubyValue receiver, RubyValue arg) {
        return this.run(receiver, arg, ObjectFactory.NIL_VALUE);
    }

    protected RubyValue run(RubyValue receiver) {
        return this.run(receiver, ObjectFactory.NIL_VALUE, ObjectFactory.NIL_VALUE);
    }

    protected abstract RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1);
}
