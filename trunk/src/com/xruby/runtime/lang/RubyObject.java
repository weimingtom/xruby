/** 
 * Copyright 2005-2007 Xue Yong Zhi, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.lang.annotation.MethodType;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;

@RubyLevelClass(name="Object")
public class RubyObject extends RubyBasic {
	public RubyObject(RubyClass c) {
		super(c);
	}
	
	@RubyLevelMethod(name="extend", type=MethodType.VAR_ARG)
	public RubyObject extend(RubyArray args) {
		if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }
		
		for (RubyValue v : args) {
            RubyAPI.callPublicOneArgMethod(v, this, null, RubyID.extendObjectID);
        }

        return this;
	}
	
	@RubyLevelMethod(name="freeze")
	public RubyObject obj_freeze() {
		this.freeze();
		return this;
	}
	
	@RubyLevelMethod(name="frozen?")
	public RubyValue fronzen_p() {
		return ObjectFactory.createBoolean(frozen());
	}
	
	@RubyLevelMethod(name="object_id", alias="__id__")
	public RubyFixnum obj_id() {
		return ObjectFactory.createFixnum(this.hashCode());
	}
	
	@RubyLevelMethod(name="hash")
	public RubyFixnum obj_hash() {
		return ObjectFactory.createFixnum(this.hashCode());
	}
}
