/**
 * Copyright 2006-2007 Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

import java.math.BigInteger;

class Bignum_initialize extends RubyVarArgMethod {
    public Bignum_initialize() {
        super(0, false, 2);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        throw new RubyException(RubyRuntime.RuntimeErrorClass, "Bitnum#new cannot be called");
    }
}

class Bignum_to_s extends RubyVarArgMethod {
    public Bignum_to_s() {
        super(0, false, 1);
    }

    public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        if (null == args) {
            return ObjectFactory.createString(value.to_s());
        }

        int radix = ((RubyFixnum) args.get(0)).intValue();
        return ObjectFactory.createString(value.to_s(radix));
    }
}

class Bignum_operator_star extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_mul(arg);
    }
}

class Bignum_operator_divide extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_div(arg);
    }
}

class Bignum_quo extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_div(arg);//TODO quo is not as same as '/'
    }
}

class Bignum_operator_plus extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_add(arg);
    }
}

class Bignum_operator_minus extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_sub(arg);
    }
}

class Bignum_operator_mod extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_mod(arg);
    }
}

class Bignum_operator_bor extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_bor(arg);
    }
}

class Bignum_operator_band extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_band(arg);
    }
}

class Bignum_operator_bxor extends RubyOneArgMethod {
    public RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return value.op_bxor(arg);
    }
}

class Bignum_operator_bnot extends RubyNoArgMethod {
    public RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyBignum value = (RubyBignum) receiver;
        return RubyBignum.bignorm(value.getInternal().not());
    }
}

class Bignum_operator_right_shift extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        RubyFixnum value2 = (RubyFixnum) arg;
        BigInteger bigValue = value1.getInternal().shiftRight(value2.intValue());
        if (value1.getInternal().signum() < 0) {
            //FIXME: 
            bigValue = bigValue.add(new BigInteger("1"));
        }
        return RubyBignum.bignorm(bigValue);
    }
}

class Bignum_operator_left_shift extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        RubyFixnum value2 = (RubyFixnum) arg;
        return RubyBignum.bignorm(value1.getInternal().shiftLeft(value2.intValue()));
    }
}

class Bignum_operator_compare extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        Object value2 = arg;
        int result = 0;
        if (value2 instanceof RubyBignum) {
            BigInteger bigValue2 = ((RubyBignum) value2).getInternal();
            result = value1.getInternal().compareTo(bigValue2);
        } else if (value2 instanceof RubyFixnum) {
            String v2 = new Integer(((RubyFixnum)value2).intValue()).toString();
            result = value1.getInternal().compareTo(new BigInteger(v2));
        } else if (value2 instanceof RubyFloat) {
            double floatValue1 = value1.getInternal().doubleValue();
            double floatValue2 = ((RubyFloat) value2).doubleValue();
            if (floatValue1 < floatValue2) {
                result = -1;
            } else if (floatValue1 > floatValue2) {
                result = 1;
            }
        } else {
            return ObjectFactory.NIL_VALUE;
        }
        return ObjectFactory.createFixnum(result);
    }
}

class Bignum_to_f extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        return ObjectFactory.createFloat(value1.getInternal().doubleValue());
    }
}

class Bignum_size extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        return ObjectFactory.createFixnum(value1.size());
    }
}

class Bignum_get_bit extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyBignum value1 = (RubyBignum) receiver;
        int index = arg.toInt();
        boolean flag = value1.getInternal().testBit(index);
        if (flag) {
            return ObjectFactory.FIXNUM1;
        }
        return ObjectFactory.FIXNUM0;
    }
}

class Bignum_operator_star_star extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        BigInteger value1 = ((RubyBignum) receiver).getInternal();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            // TODO: output wraning: "in a**b, b may be too big"
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            int intValue2 = ((RubyFixnum) value2).intValue();
            if (intValue2 == 0) {
                return ObjectFactory.FIXNUM1;
            }
            if (intValue2 > 0) {
                if (value1.bitLength() * intValue2 > 1024 * 1024) {
                    // TODO: output wraning: "in a**b, b may be too big"
                } else {
                    BigInteger result = value1.pow(intValue2);
                    return ObjectFactory.createBignum(result);
                }
            }
            floatValue2 = intValue2;
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Bignum");
        }
        return ObjectFactory.createFloat(Math.pow(value1.doubleValue(), floatValue2));
    }
}

public class BignumClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.BignumClass;
        c.defineMethod(RubyID.toSID, new Bignum_to_s());
        c.defineMethod("*", new Bignum_operator_star());
        c.defineMethod("/", new Bignum_operator_divide());
        c.defineMethod("quo", new Bignum_quo());
        c.defineMethod(RubyID.plusID, new Bignum_operator_plus());
        c.defineMethod(RubyID.subID, new Bignum_operator_minus());
        c.defineMethod("%", new Bignum_operator_mod());
        c.defineMethod("&", new Bignum_operator_band());
        c.defineMethod("|", new Bignum_operator_bor());
        c.defineMethod("^", new Bignum_operator_bxor());
        c.defineMethod(">>", new Bignum_operator_right_shift());
        c.defineMethod("<<", new Bignum_operator_left_shift());
        c.defineMethod("<=>", new Bignum_operator_compare());
        c.defineMethod("to_f", new Bignum_to_f());
        c.defineMethod("size", new Bignum_size());
        c.defineMethod("~", new Bignum_operator_bnot());
        c.defineMethod("[]", new Bignum_get_bit());
        c.defineMethod("**", new Bignum_operator_star_star());
        c.defineMethod("initialize", new Bignum_initialize());
    }
}
