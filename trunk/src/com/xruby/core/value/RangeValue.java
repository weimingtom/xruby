package com.xruby.core.value;

import com.xruby.core.lang.*;

public class RangeValue {
	private int left_;
	private int right_;
	private boolean isExclusive_;
	
	public RangeValue(int left, int right, boolean isExclusive) {
		left_ = left;
		right_ = right;
		isExclusive_ = isExclusive;
	}
	
}
