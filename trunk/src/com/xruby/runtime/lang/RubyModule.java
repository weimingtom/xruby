/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyString;
import com.xruby.runtime.value.RubyArray;

public class RubyModule extends MethodCollection {

	private RubyModule owner_ = null;//owner is where is the module is defined under.
    protected RubyClass superclass_;

    public RubyModule(String name, RubyModule owner) {
		super(null);
		super.name_ = name;
		owner_ = owner;
	}

    public boolean isRealModule() {
        return true;
    }

    public boolean isRealClass() {
        return false;
    }

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setOwner(this);
		RubyID mid = StringMap.intern(name);
		return addMethod(mid, m);
	}

	/// This method is only used by java classes in package 'com.xruby.runtime.builtin'.
	/// It has less overhead than 'defineClass' (no hash table lookup).
	/// This method is NOT used by classes compiled from ruby script.
	public RubyClass defineNewClass(String name, RubyClass parent) {
        if (parent == null) {
            parent = RubyRuntime.ObjectClass;
        }
        
        RubyClass c = new RubyClass(name, parent, this);
        c.setName(name);
        c.setRubyClass(RubyRuntime.ClassClass);
        new RubySingletonClass(c, parent.getRubyClass());
        
        constants_.put(name, c);
		return c;
	}

	private RubyClass defineClass(String name, RubyClass parent) {
		RubyValue v = constants_.get(name);
		if (null == v) {
			return defineNewClass(name, (null == parent) ? RubyRuntime.ObjectClass : parent);
		}

		if (!(v instanceof RubyClass)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a class");
		}

		RubyClass c = (RubyClass)v;

		if (null != parent) {
			if (!c.isMyParent(parent)){
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class "+ name);
			}
		}

		c.setAccessPublic();
		return c;
	}

	/// define a new class or get a old one
	public RubyClass defineClass(String name, RubyValue parent) {
		if (null != parent && !(parent instanceof RubyClass)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + parent.getRubyClass().getName() + " given)");
		}

		return defineClass(name, null == parent ? null : (RubyClass)parent);
	}

	/// For compile-time recognizable builtin class, just do sanity checks...
	public RubyClass defineBuiltInClass(RubyClass c, RubyValue parent) {
		if (null != parent) {
			if (!(parent instanceof RubyClass)) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + parent.getRubyClass().getName() + " given)");
			}

			if (!c.isMyParent((RubyClass)parent)){
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class "+ c.getName());
			}
		}

		c.setAccessPublic();
		return c;
	}
	
	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name, this);
        m.setName(name);
        m.setRubyClass(RubyRuntime.ModuleClass);
        constants_.put(name, m);//NOTE, do not use ObjectFactory.createClass, it will cause initialization issue
		return m;
	}

	public RubyModule defineModule(String name) {
		RubyValue v = constants_.get(name);
		if (null == v) {
			return defineNewModule(name);
		}
		
		if (!(v instanceof RubyModule) || (v instanceof RubyClass)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
		}
		
		return (RubyModule)v;
	}

	RubyValue getConstant(String name) {
		RubyValue v = super.getOwnConstant(name);
		if (null != v) {
			return v;
		}

        if (null != this.superclass_) {
            v = this.superclass_.getConstant(name);
            if (null != v) {
                return v;
            }
        }

        if (null != owner_) {
            v = this.owner_.getConstant(name);
            if (null != v) {
                return v;
            }
        }

        return null;
    }
	
	public void to_s(RubyString s) {
        if (null != owner_) {
			owner_.to_s(s);
			if (s.length() > 0) {
				s.appendString("::");
			}
		}

        String name = this.getName();
        if (name != null) {
            s.appendString(getName());
        }
    }

	public void module_function(String method_name) {
		RubyID mid = StringMap.intern(method_name);
		RubyMethod m = findOwnMethod(mid);
		if (null == m || UndefMethod.isUndef(m)) {
			throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" +  method_name + "' for " + getName());
		}
		getSingletonClass().defineMethod(method_name, m);
	}

    /*
	 * Include Module
	 */
    public void includeModule(RubyModule module) {
		if (module == null) {
			return;
		}
		RubyModule c = this;
		boolean changed = false;
		while (module != null) {
			boolean superclassSeen = false;
			if (c.methods_ == module.methods_) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "cyclic include detected");
			}

			boolean skip = false;

			for (RubyClass p = this.superclass_; p != null; p = p.superclass_) {
				if (p instanceof RubyIncludeClass) {
					if (p.methods_ == module.methods_) {
						if (!superclassSeen) {
							c = p;
							skip = true;
							break;
						}
					}
				} else if (p.isRealClass()) {
					superclassSeen = true;
					break;
				}
			}

			if (!skip) {
				c.superclass_ = new RubyIncludeClass(module, c.superclass_);
				c = c.superclass_;
				changed = true;
			}

			module = module.superclass_;
		}

		if (changed) {
			RubyClass.resetCache();
		}
	}

    public final void collectIncludedModuleNames(RubyArray a) {
        for (RubyModule m = this; m != null; m = m.superclass_) {
            if (m.isRealModule()) {
                a.add(m);
            } else if (m instanceof RubyIncludeClass) {
                a.add(((RubyIncludeClass)m).getIncludedModule());
            }
        }
	}
}
