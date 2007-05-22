/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Class_new extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyClass r = (RubyClass) receiver;
        RubyValue v = r.allocObject(block);
        
        if (null != args && args.size() == 1) {
            callInitializeMethod(v, args.get(0), null, block);
        } else {
            callInitializeMethod(v, null, args, block);
        }
        
        return v;
    }

    private void callInitializeMethod(RubyValue v, RubyValue arg, RubyArray args, RubyBlock block) {
        RubyMethod m = v.findMethod(CommonRubyID.initializeId);
        if (m != null) {
            m.invoke(v, arg, args, block);
        }
    }
}

class Class_superclass extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyClass r = (RubyClass) receiver;
        RubyClass c = r.getSuperClass();

        if (null != c) {
            c = c.getRealClass();
        }

        return (null == c) ? ObjectFactory.NIL_VALUE : c;
    }
}

public class ClassClassBuilder {
    static RubyMethod class_new_ = new Class_new();

    public static void initialize() {
        RubyClass c = RubyRuntime.ClassClass;
        c.defineMethod("new", class_new_);
        c.defineMethod("superclass", new Class_superclass());

        /*
        c.setAccessPrivate();        
        c.defineMethod("inherited", new RubyDummyMethod());
        */
    }
}
