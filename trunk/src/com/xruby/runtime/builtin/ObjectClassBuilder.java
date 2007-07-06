/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyObject;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Object_extend extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }

        for (RubyValue v : args) {
            RubyAPI.callPublicOneArgMethod(v, receiver, null, RubyID.extendObjectID);
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

//TODO compiler should be able to use EmptyMethod to avoid generating some class file
class EmptyMethod extends RubyOneArgMethod {

   public static final EmptyMethod INSTANCE = new EmptyMethod();
   
    	private EmptyMethod() {
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		return ObjectFactory.NIL_VALUE;
	}
}

public class ObjectClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.ObjectClass;
        c.defineAllocMethod(new Object_alloc());

        c.defineMethod("extend", new Object_extend());
        c.defineMethod("freeze", new Object_freeze());
        c.defineMethod("frozen?", new Object_frozen_question());
        RubyMethod object_id = new Object_object_id();
        c.defineMethod("object_id", object_id);
        c.defineMethod("__id__", object_id);
        c.defineMethod("hash", new Object_hash());
        c.defineMethod("inherited", EmptyMethod.INSTANCE);
    }
}
