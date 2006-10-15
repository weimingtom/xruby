package com.xruby.core.value;

public class RangeValue {
	private int left_;
	private int right_;
	private boolean isExclusive_;
	
	public RangeValue(int left, int right, boolean isExclusive) {
		left_ = left;
		right_ = right;
		isExclusive_ = isExclusive;
	}
	
	public int getLeft() {
		return left_;
	}
	
	public int getRight() {
		return right_;
	}

	/// Test if @value is in the range
	public boolean include(int value) {
		if (value >= left_ && value < right_) {
			return true;
		} else if (!isExclusive_ && value == right_) {
			return true;
		} else {
			return false;
		}
	}
	
}
