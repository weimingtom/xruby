/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import com.xruby.core.builtin.*;

class MethodBlockBase {
	protected int argc_;
	protected boolean has_asterisk_parameter_;
	protected RubyValue asterisk_parameter_;
	
	protected MethodBlockBase(int argc, boolean has_asterisk_parameter) {
		argc_ = argc;
		has_asterisk_parameter_ = has_asterisk_parameter;
	}

	protected RubyValue initializeAsteriskParameter(RubyValue[] args) {
		final int args_length = (null == args)? 0 : args.length;
		int extra = args_length - argc_;
		if (extra < 0) {
			extra = 0;
		}
		
		ArrayValue a = new ArrayValue(extra);
		
		for (int i = args_length - extra; i < args_length; ++i) {
			a.add(args[i]);
		}
		
		asterisk_parameter_ = new RubyValue(RubyRuntime.ArrayClass, a);
		return asterisk_parameter_;
	}
}

public abstract class RubyBlock extends MethodBlockBase {
	public RubyBlock(int argc, boolean has_asterisk_parameter) {
		super(argc, has_asterisk_parameter);
	}

	public RubyValue invoke(RubyValue receiver, RubyValue[] args) {
		if (has_asterisk_parameter_ &&
				(argc_ > 0) &&
				(null != args && args.length == 1) &&
				(args[0].getRubyClass() == RubyRuntime.ArrayClass)) {
			//TODO maybe we should test if args[0] supports 'to_ary' method
			ArrayValue v = (ArrayValue)args[0].getValue();
			args = v.toArray();
		}
		
		RubyValue[] new_args = args;
		if (null == args) {
			if (argc_ > 0) {
				new_args = new RubyValue[argc_];
				for (int i = 0; i < argc_ ; ++i) {
					new_args[i] = ObjectFactory.nilValue;
				}
			}
		} else if (args.length < argc_) {
			new_args = new RubyValue[argc_];
			System.arraycopy(args, 0, new_args, 0, args.length);
			for (int i = args.length; i < argc_ ; ++i) {
				new_args[i] = ObjectFactory.nilValue;
			}
		}
		
		return run(receiver, new_args);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyValue[] args);
}
