package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyFixnum;

public class RubyValue {
	public int objectAddress() {
		return super.hashCode();
	}
	
	public RubyValue callMethod(String name) {
		return this.callMethod(name, new RubyValue[0], RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyValue arg) {
		return this.callMethod(name, new RubyValue[]{arg}, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyValue[] args) {
		return this.callMethod(name, args, RubyBlock.NULL_BLOCK);
	}
	
	public RubyValue callMethod(String name, RubyBlock block) {
		return this.callMethod(name, new RubyValue[0], block);
	}
	
	public RubyValue callMethod(String name, RubyValue[] args, RubyBlock block) {
		RubyID id = StringMap.intern(name);
		return this.callMethod(id, args, block);
	}
	
	public RubyValue callMethod(RubyID id, RubyValue[] args) {
		return this.callMethod(id, args, null);
	}
	
	public RubyValue callMethod(RubyID id, RubyValue[] args, RubyBlock block) {
		RubyClass klass = RubyUtil.classof(this);
		return klass.callMethod(this, id, args, block);
	}
	
	private RubyClass singletonClass() {
		RubyClass klass;
		
		if ((this instanceof RubyFixnum) || (this instanceof RubySymbol)) {
			RubyRuntime.raise(RubyRuntime.typeError, "can't define singleton");
		}
		
		RubyBasic basic = (RubyBasic)this;
		
		if (basic.getRubyClass().isSingleton() 
				&& basic.getRubyClass().getIv("__attached__") == this) {
			klass = basic.getRubyClass();
		} else {
			klass = RubyInternalUtil.createMetaClass(basic, basic.getRubyClass());
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
}
