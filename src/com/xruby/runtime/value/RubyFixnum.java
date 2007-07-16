/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFixnum extends RubySpecialValue {
    private final int value_;

    RubyFixnum(int i) {
        value_ = i;
    }

    public int intValue() {
        return value_;
    }
    
	public int toInt() {
		return value_;
	}
	
	public RubyFixnum convertToInteger() {
		return this;
    }

	public int hashCode() {
        return value_;
    }

    public RubyClass getRubyClass() {
        return RubyRuntime.FixnumClass;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
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
        return Integer.toString(value_, radix);
    }
}
