/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyFloat;

import java.math.BigDecimal;

class Float_to_s extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyFloat value = (RubyFloat) receiver;
        return ObjectFactory.createString(Double.toString(value.doubleValue()));
    }
}

class Float_operator_minus extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        double floatValue1 = ((RubyFloat) receiver).doubleValue();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Float");
        }
        return ObjectFactory.createFloat(floatValue1 - floatValue2);
    }
}

class Float_operator_compare extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyFloat value1 = (RubyFloat) receiver;
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            return ObjectFactory.NIL_VALUE;
        }
        double floatValue1 = value1.doubleValue();
        if (floatValue1 < floatValue2) {
            return ObjectFactory.createFixnum(-1);
        } else if (floatValue1 > floatValue2) {
            return ObjectFactory.FIXNUM1;
        } else {
            return ObjectFactory.FIXNUM0;
        }
    }
}

class Float_floor extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        value = Math.floor(value);
        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
            return ObjectFactory.createFixnum((int) value);
        }
        return ObjectFactory.createBignum(BigDecimal.valueOf(value).toBigInteger());
    }
}

class Float_ceil extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        value = Math.ceil(value);
        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
            return ObjectFactory.createFixnum((int) value);
        }
        return ObjectFactory.createBignum(BigDecimal.valueOf(value).toBigInteger());
    }
}

class Float_truncate extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
            return ObjectFactory.createFixnum((int) value);
        }
        return RubyBignum.bignorm(BigDecimal.valueOf(value).toBigInteger());
    }
}

class Float_round extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        value = Math.round(value);
        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
            return ObjectFactory.createFixnum((int) value);
        }
        return RubyBignum.bignorm(BigDecimal.valueOf(value).toBigInteger());
    }
}

class Float_operator_mod extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        double floatValue1 = ((RubyFloat) receiver).doubleValue();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Float");
        }
        double value3 = floatValue1 / floatValue2;
        double result = floatValue1 - Math.floor(floatValue2 * value3);
        return ObjectFactory.createFloat(result);
    }
}

class Float_operator_plus extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        double floatValue1 = ((RubyFloat) receiver).doubleValue();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Float");
        }
        return ObjectFactory.createFloat(floatValue1 + floatValue2);
    }
}

class Float_operator_star extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        double floatValue1 = ((RubyFloat) receiver).doubleValue();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Float");
        }
        return ObjectFactory.createFloat(floatValue1 * floatValue2);
    }
}

class Float_operator_div extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        double floatValue1 = ((RubyFloat) receiver).doubleValue();
        Object value2 = arg;
        double floatValue2 = 0;
        if (value2 instanceof RubyBignum) {
            floatValue2 = ((RubyBignum) value2).getInternal().doubleValue();
        } else if (value2 instanceof RubyFixnum) {
            floatValue2 = ((RubyFixnum) value2).intValue();
        } else if (value2 instanceof RubyFloat) {
            floatValue2 = ((RubyFloat) value2).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, arg.getRubyClass().getName() + " can't be coersed into Float");
        }
        return ObjectFactory.createFloat(floatValue1 / floatValue2);
    }
}

class Float_abs extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        return ObjectFactory.createFloat(Math.abs(value));
    }
}

class Float_finite extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        return ObjectFactory.createBoolean(!Double.isInfinite(value));
    }
}

class Float_infinite extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        if (value == Double.NEGATIVE_INFINITY) {
            return ObjectFactory.createFixnum(-1);
        } else if (value == Double.POSITIVE_INFINITY) {
            return ObjectFactory.FIXNUM1;
        } else {
            return ObjectFactory.NIL_VALUE;
        }
    }
}

class Float_nan extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        return ObjectFactory.createBoolean(Double.isNaN(value));
    }
}

class Float_to_i extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        double value = ((RubyFloat) receiver).doubleValue();
        return ObjectFactory.createFixnum((int) value);
    }
}

public class FloatClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.FloatClass;
        c.defineMethod("to_s", new Float_to_s());
        c.defineMethod("-", new Float_operator_minus());
        c.defineMethod("+", new Float_operator_plus());
        c.defineMethod("*", new Float_operator_star());
        c.defineMethod("/", new Float_operator_div());
        c.defineMethod("<=>", new Float_operator_compare());
        c.defineMethod("floor", new Float_floor());
        c.defineMethod("ceil", new Float_ceil());
        c.defineMethod("truncate", new Float_truncate());
        c.defineMethod("round", new Float_round());
        c.defineMethod("%", new Float_operator_mod());
        c.defineMethod("abs", new Float_abs());
        c.defineMethod("finite?", new Float_finite());
        c.defineMethod("infinite?", new Float_infinite());
        c.defineMethod("nan?", new Float_nan());
        c.defineMethod("to_i", new Float_to_i());
    }
}
