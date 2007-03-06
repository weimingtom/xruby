/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFixnum extends RubyBasic {
	private final int value_;
	
	public RubyFixnum(int i) {
		super(RubyRuntime.FixnumClass);
		value_ = i;
	}
	
	public int intValue() {
		return value_;
	}
	
	public int hashCode() {
		return value_;
	}
	
	public boolean equals(Object o) {
		if (null == o) {
			return false;
		} else if (o instanceof RubyFixnum) {
			return value_ == ((RubyFixnum)o).intValue();
		} else {
			return false;
		}
	}
	
	public String toString() {
		return Integer.toString(value_);
	}
	
	public String toString(int radix) {
		if (value_ < 0){
			return "-" + Integer.toString(-value_, radix);
		}
		return Integer.toString(value_, radix);
	}

	public RubyMethod findPublicMethod(String name) {
		return getRubyClass().findOwnPublicMethod(name);
	}

	public RubyMethod findMethod(String name) {
		return getRubyClass().findOwnMethod(name);
	}
}
