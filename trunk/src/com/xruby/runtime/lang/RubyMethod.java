/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyMethod extends MethodBlockBase {
	private RubyModule owner_;//save a reference of the class/module to implement 'super' and class variable
	private int access_;
	
	public static final int PUBLIC = 0;
	public static final int PROTECTED = 1;
	public static final int PRIVATE = 2;

	protected RubyMethod(int argc) {
		super(argc, false, 0);
		access_ = PUBLIC;
	}

	//The compiler always uses this
	protected RubyMethod(int argc, boolean has_asterisk_parameter, int default_argc)  {
		super(argc, has_asterisk_parameter, default_argc);
		access_ = PUBLIC;
	}

	public RubyBlock convertToRubyBolck(RubyValue self) {
		final RubyMethod m = this;
		return new RubyBlock(argc_, has_asterisk_parameter_, default_argc_, null, self, null) {
			protected RubyValue run(RubyValue receiver, RubyArray args) {
				return m.invoke(receiver, args, null);
			}
		};
	}

	boolean isPublic() {
		return PUBLIC == access_;
	}

	public void setAccess(int access) {
		access_ = access;
	}
	
	protected void setOwner(RubyModule c) {
		owner_ = c;
	}
	
	protected RubyModule getOwner() {
		return owner_;
	}
	
	protected void assertArgNumberAtLeast(RubyArray args, int expected_argc) {
		assert(expected_argc > 0);
		if (null == args || args.size() < expected_argc) {
			int actual_argc = (null == args ) ? 0 : args.size();
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + actual_argc + " for " + expected_argc + ")");
		}
	}
	
	protected void assertArgNumberEqual(RubyArray args, int expected_argc) {
		assert(expected_argc > 0);
		if (null == args || args.size() != expected_argc) {
			int actual_argc = (null == args ) ? 0 : args.size();
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + actual_argc + " for " + expected_argc + ")");
		}
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
	public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
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
		
		// TODO: verrify argc == 0

		RubyValue v = run(receiver, args, block);
		if (null != block) {
			v.setReturnedInBlock(block.returned(), block.breakedOrReturned(), false);
		} else {
			v.setReturnedInBlock(false, false, false);
		}
		return v;
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

/**
 * Represent a method removed by 'undef'
 * When a method is 'undef'ed, it can not be simply removed, instead, a UndefMethod::getInstance()
 * should be inserted to the method table.
 */
class UndefMethod extends RubyMethod {

	private static UndefMethod instance_ = new UndefMethod();
	
	private UndefMethod() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		throw new Error("should not reach here!");
	}
	
	static RubyMethod getInstance() {
		return instance_;
	}
	
	static boolean isUndef(RubyMethod m) {
		return m == instance_;
	}
	
}
