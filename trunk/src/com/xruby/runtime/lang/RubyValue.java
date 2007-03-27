/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

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
	private boolean do_not_allow_break_= false;

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
	private RubyClass class_;
	private boolean frozen_ = false;
	protected RubySingletonClass singleton_class_ = null;
	private Map<String, RubyValue> instance_varibles_ = null;

	public RubyValue(RubyClass c) {
		class_ = c;
	}

	public RubyValue clone() {
		RubyValue v;
		try {
			v = (RubyValue)super.clone();
			if (null != singleton_class_) {
				v.singleton_class_ = new RubySingletonClass();
				v.singleton_class_.copyMethods(singleton_class_);
			}
		} catch (CloneNotSupportedException e) {
			throw new RubyException(RubyRuntime.ExceptionClass, e.toString());
		}
		return v;
	}

	//Do not use this method if o is not instanceof RubyValue
	public boolean equals(Object o) {
		RubyValue v = RubyAPI.callPublicOneArgMethod(this, (RubyValue)o, null, "==");
		return RubyAPI.testTrueFalse(v);
	}

	public boolean frozen() {
		return frozen_;
	}

	public void freeze() {
		frozen_ = true;
	}
	
	public RubyValue getInstanceVariable(String name) {
		if (null == instance_varibles_) {
			return ObjectFactory.nilValue;
		}
		
		RubyValue v = instance_varibles_.get(name);
		if (null != v) {
			return v;
		} else {
			return ObjectFactory.nilValue;
		}
	}
	
	public RubyValue setInstanceVariable(RubyValue value, String name) {
		if (null == instance_varibles_) {
			instance_varibles_ = new HashMap<String, RubyValue>();
		}
		
		instance_varibles_.put(name, value);
		return value;
	}

	public void setRubyClass(RubyClass c) {
		class_ = c;
	}

	public RubyClass getRubyClass() {
		return class_;
	}
	
	public RubyClass getSingletonClass() {
		if (null == singleton_class_) {
			singleton_class_ = new RubySingletonClass();
		}
		return singleton_class_;
	}
	
	public String toString() {
		return getRubyClass().getName() + super.toString();
	}
	
	protected RubyMethod findSingletonMethod(RubyID mid) {
		if (null == singleton_class_) {
			return null;
		}
		return singleton_class_.findOwnMethod(mid);
	}
	
	protected RubyMethod findSingletonPublicMethod(RubyID mid) {	
		if (null == singleton_class_) {
			return null;
		}
		return singleton_class_.findOwnPublicMethod(mid);
	}

	public RubyMethod findPublicMethod(RubyID mid) {
		RubyMethod m = findSingletonPublicMethod(mid);
		if (null != m && m.isPublic()) {
			return m;
		} 
		
		return getRubyClass().findOwnPublicMethod(mid);
	}

	public RubyMethod findMethod(RubyID mid) {
		RubyMethod m = findSingletonMethod(mid);
		if (null != m) {
			return m;
		}
		
		return getRubyClass().findOwnMethod(mid);
	}

	public void collectMethodNames(RubyArray a) {
		getSingletonClass().collectOwnMethodNames(a);
		getRubyClass().collectClassMethodNames(a);
	}

}

