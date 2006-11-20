package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyValue {
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
	
	public RubyValue callMethod(RubyID id, RubyArray args) {
		return this.callMethod(id, args, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(RubyID id, RubyArray args, RubyBlock block) {
		RubyClass klass = RubyAPI.classof(this);
		return klass.callMethod(this, id, args, block);
	}
	
	private RubyClass singletonClass() {
		RubyClass klass;
		
		if ((this instanceof RubyFixnum) || (this instanceof RubySymbol)) {
			RubyAPI.raise(RubyRuntime.typeError, "can't define singleton");
		}
		
		RubyBasic basic = (RubyBasic)this;
		
		if (basic.getRubyClass().isSingleton() 
				&& basic.getRubyClass().getIv("__attached__") == this) {
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
	public final void setIv(String name, RubyValue value) {
		RubyID id = StringMap.intern(name);
		this.setIvar(id, value);
	}
	
	public final RubyValue getIv(String name) {
		RubyID id = StringMap.intern(name);
		return this.getIvar(id);
	}
	
	protected void setIvar(RubyID id, RubyValue value) {
		// FIXME: generic implementation
	}
	
	protected RubyValue getIvar(RubyID id) {
		// generic implementation
		return null;
	}
	
	// class
	public RubyString getRubyClassName() {
		RubyClass klass = RubyAPI.classof(this);
		return klass.getName();
	}
}
