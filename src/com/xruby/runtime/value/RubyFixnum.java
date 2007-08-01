/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.math.BigInteger;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.MethodType;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

@RubyLevelClass(name="Fixnum", superclass="Integer")
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
    
    @RubyLevelMethod(name="+", type=MethodType.ONE_ARG)
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
    
    @RubyLevelMethod(name="-", type=MethodType.ONE_ARG)
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
    
    @RubyLevelMethod(name="*", type=MethodType.ONE_ARG)
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
    
    @RubyLevelMethod(name="~")
    public RubyValue opRev() {
    	return RubyBignum.bignorm(~this.value_);
    }
    
    @RubyLevelMethod(name="to_f")
    public RubyFloat convertToFloat() {
    	return ObjectFactory.createFloat(this.value_);
    }
    
    @RubyLevelMethod(name="<<", type=MethodType.ONE_ARG)
    public RubyValue lshift(RubyValue arg) {
    	return lshift(arg.toInt());
    }
    
    @RubyLevelMethod(name=">>", type=MethodType.ONE_ARG)
    public RubyValue rshift(RubyValue arg) {
    	return rshift(arg.toInt());
    }
    
    private static int BIT_SIZE = 32;
    
    private RubyValue lshift(int i) {
    	if (i == 0) {
    		return this;
    	} else if (i < 0) {
    		return rshift(-i);
    	}
    	// FIXME: TO BE IMPROVED
    	BigInteger bigValue1 = BigInteger.valueOf(this.value_);
        return RubyBignum.bignorm(bigValue1.shiftLeft(i));
    }

	private RubyValue rshift(int i) {
		if (i == 0) {
    		return this;
    	} else if (i < 0) {
    		return lshift(-i);
    	}
		
		if (i >= BIT_SIZE - 1) {
    		if (this.value_ < 0) {
    			return ObjectFactory.createFixnum(-1);
    		}
    		
    		return ObjectFactory.createFixnum(0);
    	}
    	
    	return ObjectFactory.createFixnum(this.value_ >> i);
	}
	
	@RubyLevelMethod(name="==", type=MethodType.ONE_ARG)
	public RubyValue opEqual(RubyValue arg) {
		if (arg == this) {
			return RubyConstant.QTRUE;
		}
		
		if (arg instanceof RubyFixnum) {
			return ObjectFactory.createBoolean(this.value_ == ((RubyFixnum)arg).value_);
		}
		
		return RubyAPI.callOneArgMethod(arg, this, null, RubyID.equalID);
	}
	
	@RubyLevelMethod(name="to_s", type=MethodType.NO_OR_ONE_ARG)
	public RubyString to_s() {
		return ObjectFactory.createString(this.toString());
	}
	
	public RubyString to_s(RubyValue v) {
		 int radix = v.toInt();
         if (radix < 2 || radix > 36) {
             throw new RubyException(RubyRuntime.ArgumentErrorClass, "illegal radix " + radix);
         }
         
         return ObjectFactory.createString(this.toString(radix));
	}
	
	@RubyLevelMethod(name="quo", type=MethodType.ONE_ARG)
	public RubyFloat quo(RubyValue v) {
        if (v instanceof RubyFixnum) {
        	return ObjectFactory.createFloat(this.value_ / v.toInt());
        }
        
        // FIXME: should be coerced.
        throw new RubyException(RubyRuntime.TypeErrorClass, v.getRubyClass().getName() + " can't be coersed into Fixnum");
	}
}
