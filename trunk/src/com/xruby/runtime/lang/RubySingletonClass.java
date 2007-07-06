/**
 * Copyright 2005-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class RubySingletonClass extends RubyClass {

    private RubyValue owner_;

    public RubySingletonClass(RubyValue obj, RubyClass superclass) {
        super(null, superclass, null);
        owner_ = obj;
        obj.setRubyClass(this);
        this.setInstanceVariable(obj, CommonRubyID.attachedID);

        if (obj instanceof RubySingletonClass) {
            RubySingletonClass klass = (RubySingletonClass)obj;
            this.setRubyClass(this);
            RubyClass singletonsuper = klass.getSuperClass().getRealClass().getRubyClass();
            klass.setSuperClass(singletonsuper);
        } else {
            RubyClass metasuper = superclass.getRealClass().getRubyClass();
            if (metasuper != null) {
                this.setRubyClass(metasuper);
            }
        }
    }

    public RubyValue getConstant(String name) {
        if (owner_ instanceof RubyModule) {
            return ((RubyModule)owner_).getConstant(name);
        } else {
            return super.getConstant(name);
        }
    }

    public RubyValue getClassVariable(String name) {
        if (owner_ instanceof RubyModule) {
            return ((RubyModule)owner_).getClassVariable(name);
        } else {
            return super.getClassVariable(name);
        }
    }

    public boolean isSingleton() {
        return true;
    }

    public boolean isRealClass() {
        return false;
    }

    public RubyValue allocObject(RubyBlock block) {
        throw new RubyException(RubyRuntime.TypeErrorClass, "can't create instance of virtual class");
    }
}
