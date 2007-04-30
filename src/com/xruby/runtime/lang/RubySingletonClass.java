/** 
 * Copyright 2005-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class RubySingletonClass extends RubyClass {
    public RubySingletonClass(RubyValue obj, RubyClass superclass) {
        super(null, superclass, null);
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

	public boolean isSingleton() {
		return true;
	}

	public boolean isRealClass() {
		return false;
	}
}
