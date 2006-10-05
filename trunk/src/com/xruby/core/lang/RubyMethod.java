/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import com.xruby.core.value.*;

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
	
	/**
	 * Emulate ruby's parameter passing behavior
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	public final RubyValue invoke(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		/*if (argc_ > 0) {
			int args_length = (null == args) ? 0 : args.size();
			if (args_length < (argc_ - default_argc_)) {
				//number of arguments falls short anyway
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + args_length + " for " + (argc_ - default_argc_) + ")");
			} else if (args_length < argc_) {
				//need default parameter
				initializeDefaultParameter(args, args_length);
			}
		}*/

		return run(receiver, args, block);
	}
	
	/**
	 * Template method
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	protected abstract RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException;
}
