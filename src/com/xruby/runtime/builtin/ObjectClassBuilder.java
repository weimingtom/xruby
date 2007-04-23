/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Object_operator_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (receiver == arg) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class Object_clone extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return (RubyValue) receiver.clone();
    }
}

class Object_extend extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }

        for (RubyValue v : args) {
            RubyAPI.callPublicOneArgMethod(v, receiver, null, CommonRubyID.extendObjectID);
        }

        return receiver;
    }
}

class Object_alloc extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return new RubyObject((RubyClass) receiver);
    }
}

class Object_object_id extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        //Object.hashCode() javadoc:
        //As much as is reasonably practical, the hashCode method defined
        //by class Object does return distinct integers for distinct objects.
        return ObjectFactory.createFixnum(receiver.hashCode());
    }
}

class Object_hash extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createFixnum(receiver.hashCode());
    }
}

class Object_freeze extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        receiver.freeze();
        return receiver;
    }
}

class Object_frozen_question extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return receiver.frozen() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

public class ObjectClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.ObjectClass;
        RubyMethod equal = new Object_operator_equal();
        c.defineMethod("==", equal);
        c.defineMethod("equal?", equal);
        RubyMethod clone = new Object_clone();
        c.defineMethod("clone", clone);
        c.defineMethod("dup", clone);
        c.defineMethod("extend", new Object_extend());
        c.defineMethod("freeze", new Object_freeze());
        c.defineMethod("frozen?", new Object_frozen_question());
        RubyMethod object_id = new Object_object_id();
        c.defineMethod("object_id", object_id);
        c.defineMethod("__id__", object_id);
        c.defineMethod("hash", new Object_hash());
        c.defineAllocMethod(new Object_alloc());
    }
}
