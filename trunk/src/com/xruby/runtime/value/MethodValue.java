package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class MethodValue {

	private RubyValue receiver_;
	private String name_;
	private RubyMethod method_;
	
	public MethodValue(RubyValue receiver, String name, RubyMethod method) {
		receiver_ = receiver;
		name_ = name;
		method_ = method;
	}

	public RubyValue call(RubyArray args, RubyBlock block) throws RubyException {
		return method_.invoke(receiver_, args, block);
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder("#<Method: ");
		s.append(receiver_.getRubyClass().getName());
		s.append("#");
		s.append(name_);
		s.append(">");
		return s.toString();
	}
}
