/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.math.BigInteger;

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
    
    public RubyValue opPlus(RubyValue v) {
    	if (v instanceof RubyFixnum) {
    		return RubyBignum.bignorm((long)this.value_ + (long)v.toInt());
    	}
    	
    	if (v instanceof RubyFloat) {
            return ObjectFactory.createFloat(value_ + ((RubyFloat)v).doubleValue());
    	}
    	
    	// FIXME: should be coerced.
    	if (v instanceof RubyBignum) {
    		BigInteger bigValue1 = BigInteger.valueOf(value_);
    		BigInteger bigValue2 = ((RubyBignum)v).getInternal();
    		return RubyBignum.bignorm(bigValue1.add(bigValue2));
    	}
    	
    	throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().getName() + " can't be coersed into Fixnum");
    }
    
    public RubyValue opMinus(RubyValue v) {
    	if (v instanceof RubyFixnum) {
    		return RubyBignum.bignorm((long)this.value_ - (long)v.toInt());
    	}
    	
    	if (v instanceof RubyFloat) {
    		return ObjectFactory.createFloat(this.value_ - ((RubyFloat)v).doubleValue());
    	}
    	
    	// FIXME: should be coerced.
    	if (v instanceof RubyBignum) {
    		BigInteger bigValue1 = BigInteger.valueOf(this.value_);
            BigInteger bigValue2 = ((RubyBignum)v).getInternal();
            return RubyBignum.bignorm(bigValue1.subtract(bigValue2));
    	}
    	
        throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().getName() + " can't be coersed into Fixnum");
    }
    
    public RubyValue opMul(RubyValue v) {
    	if (v instanceof RubyFixnum) {
    		return RubyBignum.bignorm((long)this.value_ * (long)v.toInt());
    	}
    	
    	if (v instanceof RubyFloat) {
    		return ObjectFactory.createFloat(this.value_ * ((RubyFloat)v).doubleValue());
    	}
    	
    	if (v instanceof RubyBignum) {
    		BigInteger bigValue1 = BigInteger.valueOf(this.value_);
            BigInteger bigValue2 = ((RubyBignum)v).getInternal();
            return RubyBignum.bignorm(bigValue1.multiply(bigValue2));
    	}
    	
    	throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().getName() + " can't be coersed into Fixnum");
    }
    
    public RubyValue opRev() {
    	return RubyBignum.bignorm(~this.value_);
    }
    
    public RubyFloat convertToFloat() {
    	return ObjectFactory.createFloat(this.value_);
    }
}
