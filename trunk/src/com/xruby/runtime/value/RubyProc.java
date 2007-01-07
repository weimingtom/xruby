package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyProc extends RubyBasic {
	private RubyBlock value_;
	private boolean created_by_lambda_;
	
	RubyProc(RubyBlock v, boolean created_by_lambda) {
		super(RubyRuntime.ProcClass);
		value_ = v;
		created_by_lambda_ = created_by_lambda;
	}
	
	public RubyBlock getValue() {
		return value_;
	}

	public boolean createdByLambda() {
		return created_by_lambda_;
	}
	
}
