/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyString;

public class RubyModule extends MethodCollectionWithMixin {

	private RubyModule owner_ = null;//owner is where is the module is defined under.

	public RubyModule(String name, RubyModule owner) {
		super(null);
		super.name_ = name;
		owner_ = owner;
	}
	
	//We called super(null) in RubyModule's constructor to avoid initialization pains 
	public RubyClass getRubyClass() {
		return RubyRuntime.ModuleClass;
	}

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setOwner(this);
		getSingletonClass().addMethod(name, m);
		return super.addMethod(name, m);
	}

	/// This method is only used by java classes in package 'com.xruby.runtime.builtin'.
	/// It has less overhead than 'defineClass' (no hash table lookup).
	/// This method is NOT used by classes compiled from ruby script.
	public RubyClass defineNewClass(String name, RubyClass parent) {
		RubyClass c = new RubyClass(name, parent, this);
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
		RubyValue v = super.getConstant(name);
		if (null != v) {
			return v;
		}
		
		if (null == owner_) {
			return null;
		}

		return owner_.getConstant(name);
	}
	
	public void to_s(RubyString s) {
		if (null == owner_) {
			return;
		} else {
			owner_.to_s(s);
			if (s.length() > 0) {
				s.appendString("::");
			}
			s.appendString(getName());
		}
	}

	public void module_function(String method_name) {
		RubyMethod m = findMethod(method_name);
		if (null == m || UndefMethod.isUndef(m)) {
			throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" +  method_name + "' for " + getName());
		}
		getSingletonClass().defineMethod(method_name, m);
	}
}
