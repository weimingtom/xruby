/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFixnum extends RubyValue {
	private final int value_;
	
	public RubyFixnum(int i) {
		value_ = i;
	}
	
	public int intValue() {
		return value_;
	}
	
	public int hashCode() {
		return value_;
	}

    public void setRubyClass(RubyClass klass) {
        throw new RubyException(RubyRuntime.TypeErrorClass, "fixnum can't be set class");
    }

    public RubyClass getRubyClass() {
        return RubyRuntime.FixnumClass;
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

	public RubyMethod findPublicMethod(RubyID mid) {
		return getRubyClass().findOwnPublicMethod(mid);
	}

	public RubyMethod findMethod(RubyID mid) {
		return getRubyClass().findOwnMethod(mid);
	}
}