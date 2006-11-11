package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyValue;


public class RangeValue {
	private RubyValue left_;
	private RubyValue right_;
	private boolean isExclusive_;
	
	public RangeValue(RubyValue left, RubyValue right, boolean isExclusive) {
		left_ = left;
		right_ = right;
		isExclusive_ = isExclusive;
	}
	
	public RubyValue getLeft() {
		return left_;
	}
	
	public RubyValue getRight() {
		return right_;
	}
	
	public RubyValue excludeEnd() {
		return ObjectFactory.createBoolean(isExclusive_);
	}	
}
