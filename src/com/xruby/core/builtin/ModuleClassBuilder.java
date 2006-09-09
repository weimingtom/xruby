/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Module_AccessControl {

	static RubyValue run(int access, RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		RubyClass c = (RubyClass)receiver.getValue();

		if (null == args) {
			c.setAccessMode(access);
			return receiver;
		}
		
		for (RubyValue arg : args) {
			String method_name;
			if (arg.getRubyClass() == RubyRuntime.StringClass) {
				method_name = ((StringBuilder)arg.getValue()).toString();
			} else if (arg.getRubyClass() == RubyRuntime.SymbolClass) {
				method_name = (String)arg.getValue();
			} else {
				throw new RubyException(RubyRuntime.TypeErrorClass, arg.toString() + " is not a symbol");
			}
			
			if (c.setAccess(method_name, access) == null) {
				throw new RubyException(RubyRuntime.NameErrorClass, "undefined method `"+ method_name + "` for class `" + c.getName() + "`");
			}
		}
		
		return receiver;
	}
}

class Module_public extends RubyMethod {
	public Module_public() {
		super(-1, false);
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return Module_AccessControl.run(PUBLIC, receiver, args, block);
	}
}

class Module_protected extends RubyMethod {
	public Module_protected() {
		super(-1, false);
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return Module_AccessControl.run(PROTECTED, receiver, args, block);
	}
}

class Module_private extends RubyMethod {
	public Module_private() {
		super(-1, false);
		setAccess(PRIVATE);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return Module_AccessControl.run(PRIVATE, receiver, args, block);
	}
}

public class ModuleClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Module", RubyRuntime.ObjectClass);
		c.defineMethod("public", new Module_public());
		c.defineMethod("protected", new Module_protected());
		c.defineMethod("private", new Module_private());
		return c;
	}
}
