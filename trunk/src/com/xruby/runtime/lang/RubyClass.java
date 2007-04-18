/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyClass extends RubyModule {
	protected static MethodCache cache = new MethodCache();

	public static void resetCache() {
		cache.reset();
	}

	//private Set<RubyObject> instances_ = new HashSet<RubyObject>();

	private RubyMethod alloc_method_;
	private int objectAddress;

	public RubyClass(String name, RubyClass superclass, RubyModule owner) {
		super(name, owner);
		superclass_ = superclass;
		this.objectAddress = super.hashCode();
    }

    public boolean isRealModule() {
        return false;
    }

    public boolean isRealClass() {
        return true;
    }

    public boolean isSingleton() {
        return false;
    }

    public String getName() {
        return this.getRealClass().name_;
    }

    public RubyClass getRealClass() {
        RubyClass klass = this;
        while (klass != null && !klass.isRealClass()) {
            klass = klass.superclass_;
        }

        return klass;
    }

    public int objectAddress() {
		return this.objectAddress;
	}

	public RubyClass getSuperClass() {
		return superclass_;
	}

    public void setSuperClass(RubyClass superclass) {
        this.superclass_ = superclass;
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

	protected RubyMethod findSuperMethod(RubyID mid) {
        return null != this.superclass_
                ? this.superclass_.findOwnMethod(mid)
                : null;
    }

    private RubyMethod internalFindOwnMethod(RubyID mid) {
        return super.findOwnMethod(mid);
    }

    public RubyMethod findOwnMethod(RubyID mid) {
		MethodCache.CacheEntry entry = cache.getMethod(this, mid);
		if (entry.klass == this && entry.mid == mid) {
			if (entry.method == null) {
				return null;
			} else {
				return entry.method;
			}
		}

        RubyClass klass = this;

        while (klass != null) {
            RubyMethod m = klass.internalFindOwnMethod(mid);
            if (m != null) {
                cache.putMethod(this, mid, m);
                return m;
            }
            klass = klass.superclass_;
        }

		return null;
	}

	public RubyMethod findOwnPublicMethod(RubyID mid) {
		MethodCache.CacheEntry entry = cache.getMethod(this, mid);
		if (entry.klass == this && entry.mid == mid) {
            RubyMethod em = entry.method;
            if (em != null && RubyMethod.PUBLIC == em.getAccess()) {
                return em;
            } else {
                return null;
            }
		}

        RubyClass klass = this;
        while (klass != null) {
            RubyMethod m = klass.internalFindOwnMethod(mid);
            if (m != null && RubyMethod.PUBLIC == m.getAccess()) {
                cache.putMethod(this, mid, m);
                return m;
            }
            klass = klass.superclass_;
        }

        return null;
	}

	protected void collectClassMethodNames(RubyArray a, int mode) {
		super.collectOwnMethodNames(a, mode);
		if (null != superclass_){
			superclass_.collectClassMethodNames(a, mode);
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
