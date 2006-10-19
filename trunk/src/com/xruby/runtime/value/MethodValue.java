package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class MethodValue {

	private RubyValue receiver_;
	private RubyMethod methods_;
	
	public MethodValue(RubyValue receiver, RubyMethod methods) {
		receiver_ = receiver;
		methods_ = methods;
	}

	public RubyValue call(ArrayValue args, RubyBlock block) throws RubyException {
		return methods_.invoke(receiver_, args, block);
	}
}
