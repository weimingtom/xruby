package com.xruby.newruntime.value;

import com.xruby.newruntime.lang.RubyValue;


public class RubyFixnum extends RubyValue {
	private long value;
	
	private RubyFixnum(long value) {
		this.value = value;
	}
	
	public long longValue() {
		return this.value;
	}
	
	public int intValue() {
		return (int)this.value;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof RubyFixnum)) {
			return false;
		}

		RubyFixnum num = (RubyFixnum)obj;
		return this.value == num.value;
	}
	
	public String toString() {
		return Long.toString(this.value);
	}
	
	public RubyString toS(long radix) {
		return RubyString.newString(Long.toString(this.value, (int)radix));
	}

	public static RubyFixnum int2Fix(int i) {
		return new RubyFixnum(i);
	}
	
	public static RubyFixnum long2Fix(long i) {
		return new RubyFixnum(i);
	}
}
