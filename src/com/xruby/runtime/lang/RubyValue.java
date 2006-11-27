package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyValue {
	public int objectAddress() {
		return super.hashCode();
	}
	
	// method
	public RubyValue callMethod(String name) {
		return this.callMethod(name, RubyMethod.NULL_ARG, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyValue arg) {
		return this.callMethod(name, new RubyArray(arg), RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyArray args) {
		return this.callMethod(name, args, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyBlock block) {
		return this.callMethod(name, RubyMethod.NULL_ARG, block);
	}
	
	public RubyValue callMethod(String name, RubyArray args, RubyBlock block) {
		RubyID id = StringMap.intern(name);
		return this.callMethod(id, args, block);
	}
	
	public RubyValue callMethod(RubyID id) {
		return this.callMethod(id, RubyMethod.NULL_ARG, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(RubyID id, RubyArray args) {
		return this.callMethod(id, args, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(RubyID id, RubyArray args, RubyBlock block) {
		RubyClass klass = this.getRubyClass();
		return klass.callMethod(this, id, args, block);
	}
	
	public RubyValue callPublicMethod(String name, RubyArray args, RubyBlock block) {
		RubyID id = StringMap.intern(name);
		RubyClass klass = this.getRubyClass();
		return klass.callPublicMethod(this, id, args, block);
	}
	
	private RubyClass singletonClass() {
		RubyClass klass;
		
		if ((this instanceof RubyFixnum) || (this instanceof RubySymbol)) {
			RubyAPI.raise(RubyRuntime.typeError, "can't define singleton");
		}
		
		RubyBasic basic = (RubyBasic)this;
		
		if (basic.getRubyClass().isSingleton() 
				&& basic.getRubyClass().getInstanceVariable("__attached__") == this) {
			klass = basic.getRubyClass();
		} else {
			klass = RubyAPI.createMetaClass(basic, basic.getRubyClass());
		}
		
		return klass;
	}
	
	public void defineSingletonMethod(String name, RubyMethod method, int argc) {
		RubyClass klass = singletonClass();
		klass.defineMethod(name, method, argc);
	}
	
	// instance variable
	public final void setInstanceVariable(String name, RubyValue value) {
		RubyID id = StringMap.intern(name);
		this.setInstanceVariable(id, value);
	}
	
	public final RubyValue getInstanceVariable(String name) {
		RubyID id = StringMap.intern(name);
		return this.getInstanceVariable(id);
	}
	
	protected void setInstanceVariable(RubyID id, RubyValue value) {
		// FIXME: generic implementation
	}
	
	protected RubyValue getInstanceVariable(RubyID id) {
		// generic implementation
		return null;
	}
	
	// class
	public abstract RubyClass getRubyClass();
	
	private static RubyID toSId = StringMap.intern("to_s");
	private static RubyID inspectId = StringMap.intern("inspect");
	
	public String toString() {
		RubyValue value = this.callMethod(toSId);
		if (value instanceof RubyString) {
			return ((RubyString)value).toString();
		} else {
			String name = this.getRubyClass().getName();
			return "#<" + name + ":0x" + Integer.toHexString(this.objectAddress()) + ">";
		}
	}	
	
	public String inspect() {
		RubyValue value = this.callMethod(inspectId);
		return value.toString();
	}
}
