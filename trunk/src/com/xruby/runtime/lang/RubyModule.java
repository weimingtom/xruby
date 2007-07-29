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

    void setScope(RubyModule owner) {
        this.owner_ = owner;
    }

    public boolean isRealModule() {
        return true;
    }

    public boolean isRealClass() {
        return false;
    }

    public RubyValue defineMethod(String name, RubyMethod m) {
        RubyID mid = RubyID.intern(name);
        m.setScope(this);
        return addMethod(mid, m);
    }

    public RubyValue defineMethod(RubyID mid, RubyMethod m) {
        m.setScope(this);
        return addMethod(mid, m);
    }

    protected RubyValue addMethod(RubyID id, RubyMethod m) {
        RubyValue v = super.addMethod(id, m);
        if (RubyRuntime.running && id != RubyID.ID_ALLOCATOR) {
            RubyAPI.callOneArgMethod(this, id.toSymbol(), null, RubyID.methodAddedID);
        }
        return v;
    }
    
    public boolean isMethodBound(RubyID id, boolean check) {
    	RubyMethod m = this.findMethod(id);
    	if (null != m && !UndefMethod.isUndef(m)) {
    		return true;
    	}
    	
    	return false;
    }
    
    public boolean isKindOf(RubyClass klass) {
		RubyModule m = this;
		
		while (m != null) {
			if (m == klass || m.methods_ == klass.methods_) {
				return true;
			}
			
			m = m.superclass_;
		}
		
		return false;
	}

    /// This method is only used by java classes in package 'com.xruby.runtime.builtin'.
    /// It has less overhead than 'defineClass' (no hash table lookup).
    /// This method is NOT used by classes compiled from ruby script.
    public RubyClass defineNewClass(String name, RubyClass parent) {
        if (parent == null) {
            parent = RubyRuntime.ObjectClass;
        }

        RubyClass klass = ClassFactory.makeRubyClass(parent);
        if (null != name) {
            //Class can be nameless when they are created by Struct.new (e.g. Struct.new(:name, :address))
            klass.setScope(this);
            klass.setName(name);
            constants_.put(name, klass);
        }
        ClassFactory.inheritedClass(parent, klass);

        ObjectSpace.add(klass);
        return klass;
    }

    private RubyClass defineClass(String name, RubyClass parent) {
        RubyValue v = null;
        if (null != name) {
            v = constants_.get(name);
        }
        if (null == v) {
            return defineNewClass(name, parent);
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

    public RubyValue getConstant(String name) {
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

    public void module_function(String method_name) {
        RubyID mid = RubyID.intern(method_name);
        RubyMethod m = findOwnMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" +  method_name + "' for " + getName());
        }
        getSingletonClass().defineMethod(method_name, m);
    }
    
    // Class Variable    
    public RubyValue getClassVariable(String name) {
		RubyModule klass = this;
		RubyID id = RubyID.intern(name);
		
		while (klass != null) {
			if (klass.instance_varibles_ != null) {
				RubyValue v = klass.instance_varibles_.get(id);
				if (v != null) {
					return v;
				}
			}
			
			klass = klass.superclass_;
		}
		
		throw new RubyException(RubyRuntime.NameErrorClass,
				"uninitialized class variable " + name + " in " + (null == name_ ? "Object" : name_)); 
	}
    
    public RubyValue setClassVariable(RubyValue value, String name) {
    	RubyModule klass = this;
		RubyID id = RubyID.intern(name);
		
		while (klass != null) {
			if (klass.instance_varibles_ != null) {
				klass.instance_varibles_.put(id, value);
				return value;
			}
			
			klass = klass.superclass_;
		}
		
		this.setInstanceVariable(value, id);
		return value;
    }
}
