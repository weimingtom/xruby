/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.xruby.runtime.lang.CommonRubyID;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyFloat;
import com.xruby.runtime.value.RubyTime;

class Time_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createTime();
    }
}

class Time_to_f extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyTime t = (RubyTime) receiver;
        return ObjectFactory.createFloat((double) t.getTime() / 1000);
    }
}

class Time_to_i extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyTime t = (RubyTime) receiver;
        return ObjectFactory.createFixnum((int) (t.getTime() / 1000));
    }
}

class Time_usec extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyTime t = (RubyTime) receiver;
        return ObjectFactory.createFixnum(t.getUsec());
    }
}

class Time_to_s extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyTime t = (RubyTime) receiver;
        return ObjectFactory.createString(t.toString());
    }
}

class Time_at extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        Object value = arg;
        double time = 0;
        if (value instanceof RubyFixnum) {
            time = ((RubyFixnum) value).intValue();
        } else if (value instanceof RubyBignum) {
            time = ((RubyBignum) value).getInternal().longValue();
        } else if (value instanceof RubyFloat) {
            time = ((RubyFloat) value).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Time");
        }
        return ObjectFactory.createTime(new Date((long) (time*1000)));
    }
}

class Time_plus extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyTime time = (RubyTime) receiver;
        Object value = arg;
        double timeAdd = 0;
        if (value instanceof RubyFixnum) {
            timeAdd = ((RubyFixnum) value).intValue();
        } else if (value instanceof RubyBignum) {
            timeAdd = ((RubyBignum) value).getInternal().longValue();
        } else if (value instanceof RubyFloat) {
            timeAdd = ((RubyFloat) value).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Float");
        }
        return ObjectFactory.createTime(new Date(time.getTime() + (long)(timeAdd * 1000)));
    }
}

class Time_minus extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyTime time1 = (RubyTime) receiver;
        if (arg instanceof RubyTime) {
            RubyTime time2 = RubyTypesUtil.convertToTime(arg);
            long timeInteval = time1.getTime() - time2.getTime();
            if (timeInteval % 1000 == 0) {
                return ObjectFactory.createFixnum((int) (timeInteval / 1000));
            }
            return ObjectFactory.createFloat((double) timeInteval / 1000);
        }
        
        Object value = arg;
        double time = 0;
        if (value instanceof RubyFixnum) {
            time = ((RubyFixnum) value).intValue();
        } else if (value instanceof RubyBignum) {
            time = ((RubyBignum) value).getInternal().longValue();
        } else if (value instanceof RubyFloat) {
            time = ((RubyFloat) value).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Numberic");
        }
        return ObjectFactory.createTime(new Date((time1.getTime() - (long)(time * 1000))));
    }
}

class Time_operator_compare extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        long time1 = ((RubyTime) receiver).getTime();
        long time2 = RubyTypesUtil.convertToTime(arg).getTime();
        if (time1 < time2) {
            return ObjectFactory.FIXNUM_NEGATIVE_ONE;
        } else if (time1 > time2) {
            return ObjectFactory.FIXNUM1;
        }
        return ObjectFactory.FIXNUM0;
    }
}

class Time_utc extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }

        int i = 0;
        int year = ((RubyFixnum) args.get(i++)).intValue();
        int month = (args.size() <= i) ? 0 : ((RubyFixnum) args.get(i++)).intValue();
        int day = (args.size() <= i) ? 0 : ((RubyFixnum) args.get(i++)).intValue();
        int hour = (args.size() <= i) ? 0 : ((RubyFixnum) args.get(i++)).intValue();
        int min = (args.size() <= i) ? 0 : ((RubyFixnum) args.get(i++)).intValue();
        int sec = (args.size() <= i) ? 0 : ((RubyFixnum) args.get(i++)).intValue();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.clear();
        calendar.set(year, month-1, day, hour, min, sec); 
        return ObjectFactory.createTime(calendar.getTime());
    }
}

public class TimeClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.TimeClass;
        c.defineMethod("to_f", new Time_to_f());
		RubyMethod tv_sec = new Time_to_i();
		c.defineMethod("tv_sec", tv_sec);
		c.defineMethod("to_i", tv_sec);
		RubyMethod usec = new Time_usec();
		c.defineMethod("tv_usec", usec);
		c.defineMethod("usec", usec);
        c.defineMethod(CommonRubyID.toSID, new Time_to_s());
        c.defineMethod(CommonRubyID.plusID, new Time_plus());
        c.defineMethod(CommonRubyID.subID, new Time_minus());
        c.defineMethod("<=>", new Time_operator_compare());
        c.defineAllocMethod(new Time_new());

        c.getSingletonClass().defineMethod("now", ClassClassBuilder.class_new_);
        c.getSingletonClass().defineMethod("at", new Time_at());
        RubyMethod utc = new Time_utc();
        c.getSingletonClass().defineMethod("utc", utc);
        c.getSingletonClass().defineMethod("gm", utc);
    }
}

