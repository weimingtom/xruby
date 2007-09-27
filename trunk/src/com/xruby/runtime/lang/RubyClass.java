/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.RubyArray;
import com.xruby.runtime.lang.annotation.DummyMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

@RubyLevelClass(name="Class", superclass="Module", dummy={ 
		@DummyMethod(name="inherited", privateMethod=true)
		}
)
public class RubyClass extends RubyModule {
	private static MethodCache cache = new MethodCache();

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
    
    @RubyLevelMethod(name="new")
    public static RubyClass newClass(RubyValue receiver) {
		return RubyAPI.defineClass("", RubyRuntime.ObjectClass);
	}
    
    @RubyLevelMethod(name="new")
    public static RubyClass newClass(RubyValue receiver, RubyValue arg) {
		return RubyAPI.defineClass("", (RubyClass)arg);
	}
    
    @RubyLevelMethod(name="new")
    public RubyValue newInstance(RubyArray args, RubyBlock block) {
    	RubyValue v = this.allocObject(block);
    	callInitializeMethod(v, args, block);
    	return v;
    }
    
    private void callInitializeMethod(RubyValue v, RubyArray args, RubyBlock block) {
		RubyMethod m = v.findMethod(RubyID.initializeId);
        if (m != null) {
            m.invoke(v, args, block);
        }
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
    
    @RubyLevelMethod(name="superclass")
    public RubyValue superclass() {
        RubyClass c = this.superclass_;

        if (null != c) {
            c = c.getRealClass();
        }

        return (null == c) ? RubyConstant.QNIL : c;
    }

    public void defineAllocMethod(RubyMethod m) {
        m.setAccess(RubyMethod.PRIVATE);
        this.getRubyClass().addMethod(RubyID.ID_ALLOCATOR, m, RubyMethod.PRIVATE);
	}
    
    public void defineModuleMethod(String name, RubyMethod m) {
    	throw new Error("should not reach here!");
    }
    
    public void setInherited(RubyClass klass) {
    	RubyAPI.callOneArgMethod(this, klass, null, RubyID.inheritedID);
    }

	public RubyValue allocObject(RubyBlock block) {
        RubyValue value = RubyAPI.callNoArgMethod(this, block, RubyID.ID_ALLOCATOR);
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
            RubyMethod m = klass.methods_.get(mid);
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
            RubyMethod m = klass.methods_.get(mid);
            if (m != null && RubyMethod.PUBLIC == m.getAccess()) {
                cache.putMethod(this, mid, m);
                return m;
            }
            klass = klass.superclass_;
        }

        return null;
	}

	public void collectClassMethodNames(RubyArray a, int mode) {
		RubyClass klass = this;
		
		while (klass != null) {
			klass.collectOwnMethodNames(a, mode);
			klass = klass.superclass_;
		}
	}

	protected RubyValue addMethod(RubyID id, RubyMethod method, int attribute) {
		cache.removeMethod(id);
		return super.addMethod(id, method, attribute);
	}
}
