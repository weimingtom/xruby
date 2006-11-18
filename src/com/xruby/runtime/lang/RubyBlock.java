/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

class MethodBlockBase {
	protected int argc_;
	protected boolean has_asterisk_parameter_;
	protected int default_argc_;
	protected RubyValue asterisk_parameter_;
	protected RubyValue block_parameter_;
	protected RubyValue[] default_values_ = null;
	
	protected MethodBlockBase(int argc, boolean has_asterisk_parameter, int default_argc) {
		argc_ = argc;
		has_asterisk_parameter_ = has_asterisk_parameter;
		default_argc_ = default_argc;
	}

	protected RubyValue initializeAsteriskParameter(RubyArray args) {
		if (null == args) {
			asterisk_parameter_ = ObjectFactory.createEmptyArray();
		} else {
			asterisk_parameter_ = args.collect(argc_);
		}
		
		return asterisk_parameter_;
	}

	protected RubyValue initializeBlockParameter(RubyBlock block) {
		if (null == block) {
			block_parameter_ = ObjectFactory.nilValue;
		} else {
			block_parameter_ = ObjectFactory.createProc(block);
		}

		return block_parameter_;
	}

}

public abstract class RubyBlock extends MethodBlockBase {

	// if run finished, and __breaked__ is not true, it indicated break happend
	//e.g.
	// loop do
	//      break 'xxx'
	// end
	protected boolean __breaked__ = false;
	protected boolean __returned__ = false;
	protected RubyBlock blockOfCurrentMethod_;
	protected RubyValue selfOfCurrentMethod_;

	public boolean breaked() {
		return __breaked__ || __returned__;
	}

	public boolean returned() {
		return __returned__;
	}
		
	public RubyBlock(int argc, boolean has_asterisk_parameter, int default_argc, RubyBlock block, RubyValue self) {
		super(argc, has_asterisk_parameter, default_argc);
		blockOfCurrentMethod_ = block;
		selfOfCurrentMethod_ = self;
	}

	public RubyValue invoke(RubyValue receiver, RubyArray args) {
		boolean single_lhs = (1 == argc_) && (!has_asterisk_parameter_);
		boolean single_rhs = (null != args) && (1 == args.size()) && (args.isNotSingleAsterisk()) && (argc_ > 0);
		if (single_lhs) {
			return run(receiver, new RubyArray(RubyRuntime.expandArrayIfThereIsZeroOrOneValue(args)));
		} else if (single_rhs) {
			return run(receiver, RubyRuntime.expandArrayIfThereIsOnlyOneRubyArray(args));
		} else {
			return run(receiver, null != args ? args : new RubyArray(0, true));
		}
	}

	protected abstract RubyValue run(RubyValue receiver, RubyArray args);
}

