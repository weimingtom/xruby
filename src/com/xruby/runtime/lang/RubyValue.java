/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

import java.util.HashMap;
import java.util.Map;

/*
'return' inside a block will cause return in the method, for example:
	def f
		1.times {return 1}
	end
Or worse (compile-time undetectable):
	def f
		Proc.new{return 1}.call()
	end
so we need to check if this happend after each function call.
As java does not support multiple return value, we made RubyValue
subclass of BlockCallStatus. 	Should be replaced with a 'Context' object
in the future.
*/
abstract class BlockCallStatus {
    private boolean returned_in_block_ = false;
    private boolean breaked_in_block_ = false;
    private boolean do_not_allow_break_ = false;

    public void setReturnedInBlock(boolean returned, boolean break_or_returned, boolean do_not_allow_break) {
        returned_in_block_ = returned;
        breaked_in_block_ = break_or_returned && !returned;//just breaked
        do_not_allow_break_ = do_not_allow_break;
    }

    public boolean returnedInBlock() {
        if (do_not_allow_break_ && breaked_in_block_) {
            //TODO should check context!
            throw new RubyException(RubyRuntime.LocalJumpErrorClass, "break from proc-closure");
        }
        return returned_in_block_;
    }

}

public abstract class RubyValue extends BlockCallStatus implements Cloneable {
    private boolean frozen_ = false;
    private Map<RubyID, RubyValue> instance_varibles_ = null;

    public abstract void setRubyClass(RubyClass klass);
    public abstract RubyClass getRubyClass();

    public RubyValue clone() {
        RubyValue v;
        try {
            v = (RubyValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RubyException(RubyRuntime.ExceptionClass, e.toString());
        }
        return v;
    }

    //Do not use this method if o is not instanceof RubyValue
    public boolean equals(Object o) {
        RubyValue v = RubyAPI.callPublicOneArgMethod(this, (RubyValue) o, null, CommonRubyID.equalID);
        return RubyAPI.testTrueFalse(v);
    }

    public boolean frozen() {
        return frozen_;
    }

    public void freeze() {
        frozen_ = true;
    }

    public RubyValue getInstanceVariable(RubyID id) {
        if (null == instance_varibles_) {
            return ObjectFactory.NIL_VALUE;
        }

        RubyValue v = instance_varibles_.get(id);
        if (null != v) {
            return v;
        } else {
            return ObjectFactory.NIL_VALUE;
        }
    }

    public RubyValue setInstanceVariable(RubyValue value, RubyID id) {
        if (null == instance_varibles_) {
            instance_varibles_ = new HashMap<RubyID, RubyValue>();
        }

        instance_varibles_.put(id, value);
        return value;
    }

    public RubyClass getSingletonClass() {
        RubyClass klass = this.getRubyClass();

        if (klass.isSingleton()
                && klass.getInstanceVariable(CommonRubyID.attachedID) == this) {
            return klass;
        } else {
            return new RubySingletonClass(this, this.getRubyClass());
        }
    }

    public String toString() {
        return getRubyClass().getName() + super.toString();
    }

    public RubyMethod findPublicMethod(RubyID mid) {
        return getRubyClass().findOwnPublicMethod(mid);
    }

    public RubyMethod findMethod(RubyID mid) {
        return getRubyClass().findOwnMethod(mid);
    }

    public void collectMethodNames(RubyArray a, int mode) {
        getRubyClass().collectClassMethodNames(a, mode);
    }
}

