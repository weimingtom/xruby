package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyValue;


public class RubyRange {
	private RubyValue begin;
	private RubyValue end;
	private boolean excludeEnd;
	
	public RubyRange(RubyValue left, RubyValue right, boolean isExclusive) {
		begin = left;
		end = right;
		excludeEnd = isExclusive;
	}
	
	public RubyValue getLeft() {
		return begin;
	}
	
	public RubyValue getRight() {
		return end;
	}
	
	public boolean isExcludeEnd() {
		return excludeEnd;
	}	
}
