package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyData<T> extends RubyBasic {
	
	private T value_;
	
	RubyData(RubyClass c, T v) {
		super(c);
		value_ = v;
	}
	
	public T getData() {
		return value_;
	}
	
	public void setData(T v) {
		value_ = v;
	}
}
