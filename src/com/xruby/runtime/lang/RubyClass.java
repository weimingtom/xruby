/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyClass extends RubyModule {
	protected static MethodCache cache = new MethodCache();
	
	// Just for internal test
	public static void resetCache() {
		cache.reset();
	}
	
	//private Set<RubyObject> instances_ = new HashSet<RubyObject>();
	private RubyClass superclass_;
	private RubyMethod alloc_method_;
	private int objectAddress;
	
	public RubyClass(String name, RubyClass superclass, RubyModule owner) {
		super(name, owner);
		superclass_ = superclass;
		this.objectAddress = super.hashCode();
	}
	
	public int objectAddress() {
		return this.objectAddress;
	}
	
	//We called super(null, ...) in RubyModule's constructor to avoid initialization pains 
	public RubyClass getRubyClass() {
		return RubyRuntime.ClassClass;
	}

	public RubyClass getSuperClass() {
		return superclass_;
	}
	
	public void defineAllocMethod(RubyMethod m) {
		alloc_method_ = m;
	}
	
	public RubyValue invokeAllocMethod(RubyValue reciver, RubyBlock block) {//TODO reciver can be 'this' in the future
		if (null != alloc_method_) {
			return alloc_method_.invoke(reciver, null, null, block);
		} else {
			return superclass_.invokeAllocMethod(reciver, block);
		}
	}
	
	boolean isMyParent(final RubyClass superclass) {
		return superclass_ == superclass;
	}

	public boolean isKindOf(RubyClass value) {
		if (value == this) {
			return true;
		} else if (null != superclass_) {
			return superclass_.isKindOf(value);
		} else {
			return false;
		}
	}
	
	protected RubyMethod findSingletonMethod(RubyID mid) {
		if (this.singleton_class_ != null) {
			MethodCache.CacheEntry entry = cache.getMethod(this.singleton_class_, mid);
			if (entry != null && entry.klass == this && entry.mid == mid) {
				if (entry.method == null) {
					return null;
				} else {
					return entry.method;
				}
			}
		}
		
		RubyMethod m = super.findSingletonMethod(mid);
		if (null == m && null != superclass_) {
			m = superclass_.findSingletonMethod(mid);
		}
		
		if (this.singleton_class_ != null) {
			cache.putMethod(this.singleton_class_, mid, m);
		}
		
		return m;
	}
	
	protected RubyMethod findSingletonPublicMethod(RubyID mid) {
		if (this.singleton_class_ != null) {
			MethodCache.CacheEntry entry = cache.getMethod(this.singleton_class_, mid);
			if (entry != null && entry.klass == this && entry.mid == mid) {
				if (entry.method == null) {
					return null;
				} else if (entry.method.isPublic()) {
					return entry.method;
				}
			}
		}
		
		RubyMethod m = super.findSingletonMethod(mid);//findSingletonPublicMethod(mid);
		if (null == m && null != superclass_) {
			m = superclass_.findSingletonMethod(mid);//.findSingletonPublicMethod(mid);
		}
		
		if (this.singleton_class_ != null) {
			cache.putMethod(this.singleton_class_, mid, m);
		}
		
		if (m != null && m.isPublic()) {
			return m;
		} else {
			return null;
		}
		
		//return m;
	}

	protected RubyMethod findSuperMethod(RubyID mid) {
		MethodCache.CacheEntry entry = cache.getMethod(this.superclass_, mid);
		if (entry != null && entry.klass == this && entry.mid == mid) {
			if (entry.method == null) {
				return null;
			} else {
				return entry.method;
			}
		}
		
		RubyMethod m =  (null != superclass_) ? superclass_.findOwnMethod(mid) : null;
		
		cache.putMethod(this.superclass_, mid, m);
		
		return m;
	}
	
	public RubyMethod findOwnMethod(RubyID mid) {
		MethodCache.CacheEntry entry = cache.getMethod(this, mid);
		if (entry != null && entry.klass == this && entry.mid == mid) {
			if (entry.method == null) {
				return null;
			} else {
				return entry.method;
			}
		}
		
		RubyMethod m = super.findOwnMethod(mid);
		if (null == m && null != superclass_) {
			m = superclass_.findOwnMethod(mid);
		}
		
		cache.putMethod(this, mid, m);
		
		return m;
	}
	
	public RubyMethod findOwnPublicMethod(RubyID mid) {
		MethodCache.CacheEntry entry = cache.getMethod(this, mid);
		if (entry != null && entry.klass == this && entry.mid == mid) {
			if (entry.method == null) {
				return null;
			} else if (entry.method.isPublic()){
				return entry.method;
			}
		}
		
		RubyMethod m = super.findOwnMethod(mid);//.findOwnPublicMethod(mid);
		if (null == m && null != superclass_) {
			m = superclass_.findOwnMethod(mid);//.findOwnPublicMethod(mid);
		}
		
		cache.putMethod(this, mid, m);
		
		if (m != null && m.isPublic()) {
			return m;
		} else {
			return null;
		}
		
		//return m;
	}

	protected void collectClassMethodNames(RubyArray a) {
		super.collectOwnMethodNames(a);
		if (null != superclass_){
			superclass_.collectClassMethodNames(a);
		}
	}

	protected RubyValue findClassVariable(String name) {
		RubyValue v = null;
		if (null != superclass_){
			v = superclass_.findClassVariable(name);
		}

		if (null != v) {
			return v;
		}
		
		return super.findClassVariable(name);
	}

	private RubyClass findWhereIsClassVariableDefined(String name) {
		RubyValue v = super.findClassVariable(name);
		if (null != v) {
			return this;
		}
		
		if (null != superclass_){
			return superclass_.findWhereIsClassVariableDefined(name);
		}
		
		return null;
	}

	private void setOwnClassVariable(RubyValue value, String name) {
		super.setClassVariable(value, name);
	}

	public RubyValue setClassVariable(RubyValue value, String name) {
		RubyClass c = findWhereIsClassVariableDefined(name);
		if (null == c) {
			setOwnClassVariable(value, name);
		} else {
			c.setOwnClassVariable(value, name);
		}
		
		return value;
	}
	
	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setOwner(this);
		RubyID mid = StringMap.intern(name);
		return addMethod(mid, m);
	}
	
	protected RubyValue addMethod(RubyID id, RubyMethod method) {
		cache.removeMethod(id);
		return super.addMethod(id, method);
	}
}
