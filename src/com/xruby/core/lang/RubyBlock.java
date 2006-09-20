/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import com.xruby.core.value.*;

class MethodBlockBase {
	protected int argc_;
	protected boolean has_asterisk_parameter_;
	protected RubyValue asterisk_parameter_;
	
	protected MethodBlockBase(int argc, boolean has_asterisk_parameter) {
		argc_ = argc;
		has_asterisk_parameter_ = has_asterisk_parameter;
	}

	protected RubyValue initializeAsteriskParameter(ArrayValue args) {
		if (null == args) {
			asterisk_parameter_ = ObjectFactory.createEmptyArray();
		} else {
			asterisk_parameter_ = args.collect(argc_);
		}
		
		return asterisk_parameter_;
	}
}

public abstract class RubyBlock extends MethodBlockBase {
	public RubyBlock(int argc, boolean has_asterisk_parameter) {
		super(argc, has_asterisk_parameter);
	}

	public RubyValue invoke(RubyValue receiver, ArrayValue args) {
		boolean single_lhs = (1 == argc_) && (!has_asterisk_parameter_);
		boolean single_rhs = (null != args) && (1 == args.size()) && (args.notSingleAsterisk()) && (argc_ > 0);
		if (single_lhs) {
			return run(receiver, new ArrayValue(ArrayValue.expandArrayIfThereIsZeroOrOneValue(args)));
		} else if (single_rhs) {
			return run(receiver, ArrayValue.expandArrayIfThereIsOnlyOneArrayValue(args));
		} else {
			return run(receiver, null != args ? args : new ArrayValue(0, true));
		}
	}
	
	protected abstract RubyValue run(RubyValue receiver, ArrayValue args);
}
