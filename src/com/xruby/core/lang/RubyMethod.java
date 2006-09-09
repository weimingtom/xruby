/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

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
		super(argc, false);
		access_ = PUBLIC;
	}
	
	public RubyMethod(int argc, boolean has_asterisk_parameter)  {
		super(argc, has_asterisk_parameter);
		access_ = PUBLIC;
	}
	
	/**
	 * Emulate ruby's parameter passing behavior
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	public final RubyValue invoke(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		//For now it just call run(), but in the future we may
		//add some extra here, like checking if number of parameters matches.
		return run(receiver, args, block);
	}
	
	/**
	 * Template method
	 * @param receiver
	 * @param args
	 * @return
	 * @throws RubyException
	 */
	protected abstract RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException;
}
