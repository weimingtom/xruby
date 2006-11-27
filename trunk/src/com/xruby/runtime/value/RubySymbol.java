package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubySymbol extends RubyBasic {

	private String value_;
	
	public RubySymbol(String s) {
		super(RubyRuntime.SymbolClass);
		value_ = s.intern();
	}
	
	public String toString() {
		return value_;
	}

}
