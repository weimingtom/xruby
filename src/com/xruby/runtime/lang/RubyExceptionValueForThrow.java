package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyExceptionValueForThrow extends RubyExceptionValue {

	private RubySymbol symbol_;
	private RubyValue returnValue_;
	
	public RubyExceptionValueForThrow(RubySymbol symbol, RubyValue returnValue) {
		super(RubyRuntime.NameErrorClass, "uncaught throw `" + symbol.toString() + "'");
		symbol_= symbol;
		returnValue_ = returnValue;
	}

	public RubyValue getReturnValue() {
		return returnValue_;
	}
}
