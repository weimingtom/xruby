package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;


public class RubyRange extends RubyBasic {
	private RubyValue begin;
	private RubyValue end;
	private boolean excludeEnd;

	RubyRange() {
		super(RubyRuntime.RangeClass);
	}

	public void setValue(RubyValue left, RubyValue right, boolean isExclusive) {
		RubyMethod m = left.findMethod("<=>");
		if (m == null){
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
		}
		RubyArray args = new RubyArray();
		args.add(right);
		try {
			RubyValue result = m.invoke(left, args, null);
			if (result == ObjectFactory.nilValue){
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
			}
		} catch (RubyException exception){
			if (exception.getRubyValue().getRubyClass() == RubyRuntime.ArgumentErrorClass){
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
			}
			throw exception;
		}

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
