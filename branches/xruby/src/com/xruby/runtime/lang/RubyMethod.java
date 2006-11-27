/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyMethod extends MethodBlockBase {
	private int access_;
	
	public static final int PUBLIC = 0;
	public static final int PROTECTED = 1;
	public static final int PRIVATE = 2;

	boolean isPublic() {
		return PUBLIC == access_;
	}

	public void setAccess(int access) {
		access_ = access;
	}
	
	//TODO remove this later(update all ClassBuilder)
	public RubyMethod(int argc) {
		super(argc, false, 0);
		access_ = PUBLIC;
	}
	
	public RubyMethod(int argc, boolean has_asterisk_parameter, int default_argc)  {
		super(argc, has_asterisk_parameter, default_argc);
		access_ = PUBLIC;
	}
	
	protected static String convertToString(RubyValue v) {
		if (v instanceof RubyString) {
			return ((RubyString)v).toString();
		} else if (v instanceof RubySymbol) {
			return ((RubySymbol)v).toString();
		} else {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, inspect(v) + " is not a symbol");
		}
	}
	
	private static String inspect(RubyValue value) {
		RubyValue v = RubyAPI.callPublicMethod(value, null, "inspect");
		return ((RubyString)v).toString();
	}
	
	/**
	 * Emulate ruby's parameter passing behavior
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	public final RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (argc_ > 0) {
			int args_length = (null == args) ? 0 : args.size();
			if (args_length < (argc_ - default_argc_)) {
				//number of arguments falls short anyway
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + args_length + " for " + (argc_ - default_argc_) + ")");
			} else if (args_length < argc_ && null == args) {
				//need default parameter, allocate one to avoid null reference
				args = new RubyArray();
			}
		}

		return run(receiver, args, block);
	}
	
	/**
	 * Template method
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	protected abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block);
}
