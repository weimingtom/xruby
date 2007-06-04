/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBinding;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import java.lang.reflect.Field;

public class RubyProc extends RubyBinding {
    private final RubyBlock value_;

    RubyProc(RubyBlock v) {
        super(RubyRuntime.ProcClass);
        setSelf(ObjectFactory.TOP_LEVEL_SELF_VALUE);//TODO should not hardcode this
        setScope(RubyRuntime.ObjectClass);//TODO should not hardcode this
        value_ = v;
    }

    public boolean equals(Object o) {
        if (null == o) {
            return false;
        } else if (o instanceof RubyProc) {
            return value_ == ((RubyProc) o).value_;
        } else {
            return false;
        }
    }

    public RubyBlock getBlock() {
        return value_;
    }

    public boolean isDefinedInAnotherBlock() {
        return value_.isDefinedInAnotherBlock();
    }

    private void setUpCallContext() {
        Field[] fields = value_.getClass().getFields();
        for (Field f : fields) {
            RubyValue v = getVariable(f.getName());
            if (null != v) {
                try {
                    f.set(value_, v);
                } catch (IllegalArgumentException e) {
                    throw new Error(e);
                } catch (IllegalAccessException e) {
                    throw new Error(e);
                }
            }
        }
    }

    public RubyValue call(RubyArray args) {
        setUpCallContext();
        return value_.invoke(value_.getSelf(), args);
    }
}
