/**
 * Copyright 2006-2007 Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.xruby.runtime.lang.*;

public class RubyBignum extends RubyBasic {
    private static final BigInteger FIXNUM_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger FIXNUM_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private BigInteger value_;

    RubyBignum(String value, int radix) {
        super(RubyRuntime.BignumClass);
        value_ = new BigInteger(value, radix);
    }

    RubyBignum(String value) {
        super(RubyRuntime.BignumClass);
        value_ = new BigInteger(value);
    }

    RubyBignum(BigInteger value) {
        super(RubyRuntime.BignumClass);
        value_ = value;
    }

    public String to_s() {
        return value_.toString(10);
    }

    public String to_s(int radix) {
        return value_.toString(radix);
    }

    public BigInteger getInternal() {
        return value_;
    }

    public void setValue(BigInteger value) {
        value_ = value;
    }

    public int size() {
        int alignedBytesCount = (((value_.bitLength() - 1) & -32) >> 3) + 4;
        return alignedBytesCount;
    }

    public RubyValue op_mul(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.multiply(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.multiply(bigValue);
        } else if (value instanceof RubyFloat) {
            RubyFloat floatValue = (RubyFloat) value;
            double ret = value_.doubleValue() * floatValue.doubleValue();
            return ObjectFactory.createFloat(ret);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().getName()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_div(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.divide(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.divide(bigValue);
        } else if (value instanceof RubyFloat) {
            RubyFloat floatValue = (RubyFloat) value;
            double ret = value_.doubleValue() / floatValue.doubleValue();
            return ObjectFactory.createFloat(ret);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_add(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.add(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.add(bigValue);
        } else if (value instanceof RubyFloat) {
            RubyFloat floatValue = (RubyFloat) value;
            double ret = value_.doubleValue() + floatValue.doubleValue();
            return ObjectFactory.createFloat(ret);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_sub(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.subtract(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.subtract(bigValue);
        } else if (value instanceof RubyFloat) {
            RubyFloat floatValue = (RubyFloat) value;
            double ret = value_.doubleValue() - floatValue.doubleValue();
            return ObjectFactory.createFloat(ret);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_mod(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.mod(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.mod(bigValue);
        } else if (value instanceof RubyFloat) {
            double floatValue1 = value_.doubleValue();
            double floatValue2 = ((RubyFloat) value).doubleValue();
            return ObjectFactory.createFloat(floatValue1 % floatValue2);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_band(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.and(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.and(bigValue);
        } else if (value instanceof RubyFloat) {
            double floatValue = ((RubyFloat) value).doubleValue();
            BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
            result = value_.and(bigValue);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_bor(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.or(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.or(bigValue);
        } else if (value instanceof RubyFloat) {
            double floatValue = ((RubyFloat) value).doubleValue();
            BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
            result = value_.or(bigValue);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public RubyValue op_bxor(RubyValue value) {
        BigInteger result;
        if (value instanceof RubyBignum) {
            RubyBignum bigValue = (RubyBignum) value;
            result = value_.xor(bigValue.value_);
        } else if (value instanceof RubyFixnum) {
            RubyFixnum intValue = (RubyFixnum) value;
            BigInteger bigValue = BigInteger.valueOf(intValue.intValue());
            result = value_.xor(bigValue);
        } else if (value instanceof RubyFloat) {
            double floatValue = ((RubyFloat) value).doubleValue();
            BigInteger bigValue = BigDecimal.valueOf(floatValue).toBigInteger();
            result = value_.xor(bigValue);
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, value
                    .getRubyClass().toString()
                    + " not expected");
        }
        return bignorm(result);
    }

    public static RubyValue bignorm(BigInteger value) {
        if (value.compareTo(FIXNUM_MAX) > 0 || value.compareTo(FIXNUM_MIN) < 0)
            return ObjectFactory.createBignum(value);
        return ObjectFactory.createFixnum(value.intValue());
    }

    public static RubyValue bignorm(long value) {
        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE)
            return ObjectFactory.createBignum(BigInteger.valueOf(value));
        return ObjectFactory.createFixnum((int) value);
    }
}
