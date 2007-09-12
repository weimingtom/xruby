/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

import java.util.HashMap;
import java.util.Map;

abstract class MethodCollection extends ConstantCollection {
    protected Map<RubyID, RubyMethod> methods_ = new HashMap<RubyID, RubyMethod>();

    MethodCollection(RubyClass c) {
        super(c);
    }

    protected void copyMethods(MethodCollection other) {
        methods_.putAll(other.methods_);
    }

    protected RubyMethod findOwnMethod(RubyID mid) {
        return methods_.get(mid);
    }

    protected RubyMethod findOwnPublicMethod(RubyID mid) {
        RubyMethod m = methods_.get(mid);
        if (null != m && RubyMethod.PUBLIC == m.getAccess()) {
            return m;
        }

        return null;
    }

    public void collectOwnMethodNames(RubyArray a, int mode) {
        for (RubyID id : methods_.keySet()) {
            if (id == RubyID.ID_ALLOCATOR) {
                continue;
            }
            
            if (RubyMethod.ALL == mode ||
                methods_.get(id).getAccess() == mode) {
                a.add(ObjectFactory.createString(id.toString()));
            }
        }
    }

    protected RubyValue addMethod(RubyID id, RubyMethod m, int attribute) {
        m.setID(id);
        m.setAccess(attribute);
        methods_.put(id, m);
        return RubyConstant.QNIL;
    }

    public void undefMethod(String method_name) {
        RubyID mid = RubyID.intern(method_name);
        if (findOwnMethod(mid) == null) {
            throw new RubyException(RubyRuntime.NameErrorClass, "undefined method " + mid.toString() + " for class `Object'");
        }

        addMethod(mid, UndefMethod.getInstance(), RubyMethod.PUBLIC);
    }

    public void aliasMethod(String newName, String oldName) {
        RubyID oldId = RubyID.intern(oldName);
        RubyMethod m = findOwnMethod(oldId);
        if (null == m) {
            if (this instanceof RubyModule) {
                //TODO may be we should just overide this method in RubyModule
                m = RubyRuntime.ObjectClass.findPublicMethod(oldId);
            }
            if (null == m) {
                throw new RubyException(RubyRuntime.NameErrorClass, "undefined method " + oldName + " for class `Object'");
            }
        }

        RubyID newId = RubyID.intern(newName);
        methods_.put(newId, m);
    }

    public RubyMethod setAccess(RubyID mid, int access) {
        RubyMethod m = findOwnMethod(mid);
        if (null == m) {
            if (this instanceof RubyModule) {
                //TODO may be we should just overide this method in RubyModule
                m = RubyRuntime.ObjectClass.findPublicMethod(mid);
            }
        }

        if (null != m) {
            m.setAccess(access);
        }

        return m;
    }
}
