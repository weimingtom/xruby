/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Module_AccessControl {
	static void run(int access, RubyModule c, RubyArray args, RubyBlock block) {
		if (null == args) {
			c.setAccessMode(access);
			return;
		}
		
		for (RubyValue arg : args) {
			String method_name;
			if (arg instanceof RubyString) {
				method_name = ((RubyString)arg).toString();
			} else if (arg instanceof RubySymbol) {
				method_name = ((RubySymbol)arg).toString();
			} else {
				throw new RubyException(RubyRuntime.TypeErrorClass, arg.toString() + " is not a symbol");
			}
			
			if (c.setAccess(method_name, access) == null) {
				throw new RubyException(RubyRuntime.NameErrorClass, "undefined method '"+ method_name + "' for " + c.getName());
			}
		}
	}
}

class Module_public extends RubyVarArgMethod {
	public Module_public() {
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		Module_AccessControl.run(PUBLIC, (RubyModule)receiver, args, block);
		return receiver;
	}
}

class Module_protected extends RubyVarArgMethod {
	public Module_protected() {
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		Module_AccessControl.run(PROTECTED, (RubyModule)receiver, args, block);
		return receiver;
	}
}

class Module_private extends RubyVarArgMethod {
	public Module_private() {
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		Module_AccessControl.run(PRIVATE, (RubyModule)receiver, args, block);
		return receiver;
	}
}

class Module_private_class_method extends RubyVarArgMethod {
	public Module_private_class_method() {
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		Module_AccessControl.run(PRIVATE, receiver.getRubyClass(), args, block);
		return receiver;
	}
}

class Module_name extends RubyVarArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule m = (RubyModule)receiver;
		RubyString s = ObjectFactory.createString();
		m.to_s(s);
		return s;
	}
}

class Module_inspect extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return RubyAPI.callPublicMethod(receiver, args, block, "to_s");
	}
}

class AttrReader extends RubyNoArgMethod {
	private String methodName_;

	public AttrReader(String methodName) {
		methodName_ = "@" + methodName;
	}

	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return receiver.getInstanceVariable(methodName_);
	}
}

class Module_attr_reader extends RubyVarArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule m = (RubyModule)receiver;

		for (RubyValue v : args) {
			String s = convertToString(v);
			m.defineMethod(s, new AttrReader(s));
		}

		return ObjectFactory.nilValue;
	}
}

class AttrWriter extends RubyOneArgMethod {
	private String methodName_;

	public AttrWriter(String methodName) {
		methodName_ = "@" + methodName;
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		return receiver.setInstanceVariable(arg, methodName_);
	}
}

class Module_attr_writer extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule m = (RubyModule)receiver;

		for (RubyValue v : args) {
			String s = convertToString(v);
			m.defineMethod(s + "=", new AttrWriter(s));
		}

		return ObjectFactory.nilValue;
	}
}

class Module_attr_accessor extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule m = (RubyModule)receiver;

		for (RubyValue v : args) {
			String s = convertToString(v);
			m.defineMethod(s, new AttrReader(s));
			m.defineMethod(s + "=", new AttrWriter(s));
		}

		return ObjectFactory.nilValue;
	}
}

class Module_attr extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule m = (RubyModule)receiver;

		String s = convertToString(args.get(0));
		m.defineMethod(s, new AttrReader(s));

		if (args.get(1) == ObjectFactory.trueValue) {
			m.defineMethod(s + "=", new AttrWriter(s));
		}

		return ObjectFactory.nilValue;
	}
}

class Module_include extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyModule module = (RubyModule)receiver;
		if (args != null) {
			for(RubyValue m: args){
				module.includeModule((RubyModule)m);
			}
		}

		return receiver;
	}
}

class Module_extend_object extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		arg.getSingletonClass().includeModule((RubyModule)receiver);
		return arg;
	}
}

class Module_ancestors extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyModule module = (RubyModule)receiver;
		RubyArray r = new RubyArray();
		module.collectIncludedModuleNames(r);
		return r;
	}
}

class Module_operator_compare extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyModule module = (RubyModule)receiver;
		if (!(arg instanceof RubyModule)) {
			return ObjectFactory.nilValue;
		}
		
		RubyModule other_module = (RubyModule)arg;
		if (module == other_module) {
			return ObjectFactory.fixnum0;
		}
		
		if (module instanceof RubyClass || other_module instanceof RubyClass) {
			RubyClass c1 = (RubyClass)module;
			RubyClass c2 = (RubyClass)other_module;
			if (c1.isKindOf(c2)) {
				return ObjectFactory.createFixnum(-1);
			} else if (c2.isKindOf(c1)) {
				return ObjectFactory.fixnum1;
			}
		}
		
		return ObjectFactory.nilValue;
	}
}

class Module_case_equal extends RubyOneArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (receiver instanceof RubyClass) {
			return RubyAPI.isKindOf(receiver, arg) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
		} else {
			//TODO does not work as expected
			RubyModule module = (RubyModule)receiver;
			RubyArray a = new RubyArray();
			module.collectIncludedModuleNames(a);
			return a.include(arg.getRubyClass()) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
		}
	}
}

public class ModuleClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ModuleClass;
		c.defineMethod("public", new Module_public());
		c.defineMethod("protected", new Module_protected());
		c.defineMethod("private", new Module_private());
		c.defineMethod("private_class_method", new Module_private_class_method());
		RubyMethod name = new Module_name();
		c.defineMethod("to_s", name);
		c.defineMethod("name", name);
		c.defineMethod("inspect", new Module_inspect());
		c.defineMethod("include", new Module_include());
		c.defineMethod("extend_object", new Module_extend_object());
		c.defineMethod("<=>", new Module_operator_compare());
		c.defineMethod("===", new Module_case_equal());
		c.defineMethod("ancestors", new Module_ancestors());

		c.setAccessPrivate();
		c.defineMethod("attr_reader", new Module_attr_reader());
		c.defineMethod("attr_writer", new Module_attr_writer());
		c.defineMethod("attr_accessor", new Module_attr_accessor());
		c.defineMethod("attr", new Module_attr());
		c.setAccessPublic();
	}
}
