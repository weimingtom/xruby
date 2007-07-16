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
        m.setAccess(RubyMethod.PRIVATE);
        this.getRubyClass().addMethod(RubyID.ID_ALLOCATOR, m);
	}
    
    public void setInherited(RubyClass klass) {
    	RubyAPI.callOneArgMethod(this, klass, null, RubyID.inheritedID);
    }

	public RubyValue allocObject(RubyBlock block) {
        RubyValue value = RubyAPI.callMethod(this, null, block, RubyID.ID_ALLOCATOR);
        if (value.getRubyClass().getRealClass() != this.getRealClass()) {
        	throw new RubyException(RubyRuntime.TypeErrorClass, "wrong instance allocation");
        }
        
        return value;
	}

	boolean isMyParent(final RubyClass superclass) {
		return superclass_ == superclass;
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

	public void collectClassMethodNames(RubyArray a, int mode) {
		super.collectOwnMethodNames(a, mode);
		if (null != superclass_){
			superclass_.collectClassMethodNames(a, mode);
		}
	}

	protected RubyValue addMethod(RubyID id, RubyMethod method) {
		cache.removeMethod(id);
		return super.addMethod(id, method);
	}
}
