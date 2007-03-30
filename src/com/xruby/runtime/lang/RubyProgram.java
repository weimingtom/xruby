/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyProgram {

    public RubyValue invoke() {
        return invoke(ObjectFactory.TOP_LEVEL_SELF_VALUE, null, null, RubyRuntime.ObjectClass);
    }

    public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope) {
        RubyRuntime.ObjectClass.setAccessPrivate();/*so that top level methods are private methods of Object by default*/
        return run(receiver, args, block, scope);
    }

    protected abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope);
}
