/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
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
	private RubySingletonClass singleton_class_ = null;
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
		RubyValue v = RubyAPI.callPublicMethod(this, (RubyValue)o, "==");
		return RubyAPI.testTrueFalse(v);
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
	
	protected RubyMethod findSingletonMethod(String name) {
		return getSingletonClass().findOwnMethod(name);
	}
	
	protected RubyMethod findSingletonPublicMethod(String name) {	
		return getSingletonClass().findOwnPublicMethod(name);
	}

	public RubyMethod findPublicMethod(String name) {
		RubyMethod m = findSingletonPublicMethod(name);
		if (null != m && m.isPublic()) {
			return m;
		} 
		
		m = getRubyClass().findOwnPublicMethod(name);
		if (null != m) {
			return m;
		}
		
		return null;
	}

	public RubyMethod findMethod(String name) {
		RubyMethod m = findSingletonMethod(name);
		if (null != m) {
			return m;
		}
		
		m = getRubyClass().findOwnMethod(name);
		if (null != m) {
			return m;
		}

		return null;
	}

	public void collectMethodNames(RubyArray a) {
		getSingletonClass().collectOwnMethodNames(a);
		getRubyClass().collectClassMethodNames(a);
	}

}

