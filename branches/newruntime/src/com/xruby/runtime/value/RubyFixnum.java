package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;


public class RubyFixnum extends RubyValue {
	private long value;
	
	private RubyFixnum(long value) {
		this.value = value;
	}
	
	public RubyClass getRubyClass() {
		return RubyRuntime.fixnumClass;
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
		return ObjectFactory.createString(Long.toString(this.value, (int)radix));
	}
	
	private static class FixnumCache {
		private FixnumCache(){}
		
		static final RubyFixnum cache[] = new RubyFixnum[-(-128) + 127 + 1];
		
		static {
			for(int i = 0; i < cache.length; i++) {
				cache[i] = new RubyFixnum(i - 128);
			}
		}
	}

	public static RubyFixnum int2Fix(int i) {
		final int offset = 128;
		if (i >= -128 && i <= 127) { // must cache 
		    return FixnumCache.cache[i + offset];
		}
		
		return new RubyFixnum(i);
	}
	
	public static RubyFixnum long2Fix(long i) {
		final int offset = 128;
		if (i >= -128 && i <= 127) { // must cache 
		    return FixnumCache.cache[(int)i + offset];
		}
		
		return new RubyFixnum(i);
	}
}
