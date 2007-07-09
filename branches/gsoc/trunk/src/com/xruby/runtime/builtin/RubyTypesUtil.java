/**
 * Copyright 2006-2007 Jie Li, Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubySymbol;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyFloat;
import com.xruby.runtime.value.RubyString;
import com.xruby.runtime.value.RubyTime;

public class RubyTypesUtil {
    public static RubyFixnum convertToFixnum(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return (RubyFixnum) arg;
        } else if (arg instanceof RubyString) {
            return ObjectFactory.createFixnum(Integer.valueOf(((RubyString) arg).toString()));
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Fixnum");
        }
    }

    public static RubyFloat convertToFloat(RubyValue arg) {
        if (arg instanceof RubyFloat) {
            return (RubyFloat) arg;
        } else if (arg instanceof RubyFixnum) {
            return ObjectFactory.createFloat(((RubyFixnum) arg).intValue());
        } else {
            RubyValue v = RubyAPI.callPublicMethod(arg, null, null, RubyID.toFID);
            return (RubyFloat) v;
        }
    }

    public static RubyString convertToString(RubyValue arg) {
        if (arg instanceof RubyString) {
            return (RubyString) arg;
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into String");
        }
    }

    public static RubyTime convertToTime(RubyValue arg) {
        if (arg instanceof RubyTime) {
            return (RubyTime) arg;
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Time");
        }
    }

    public static RubySymbol convertToSymbol(RubyValue arg) {
        if (arg instanceof RubySymbol) {
            return (RubySymbol) arg;
        } else if (arg instanceof RubyString) {
            return ObjectFactory.createSymbol(arg.toString());
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Symbol");
        }
    }

    public static String convertToJavaString(RubyValue arg) {
        if (arg instanceof RubyString) {
            return ((RubyString) arg).toString();
        } else if (arg instanceof RubySymbol) {
            return ((RubySymbol) arg).toString();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into String");
        }
    }

    public static int convertToJavaInt(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return ((RubyFixnum) arg).intValue();
        } else if (arg instanceof RubyBignum) {
            return ((RubyBignum) arg).getInternal().intValue();
        } else if (arg instanceof RubyFloat) {
            return (int) ((RubyFloat) arg).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Integer");
        }
    }

    public static long convertToJavaLong(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return ((RubyFixnum) arg).intValue();
        } else if (arg instanceof RubyBignum) {
            return ((RubyBignum) arg).getInternal().longValue();
        } else if (arg instanceof RubyFloat) {
            return (long) ((RubyFloat) arg).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Integer");
        }
    }

    public static double convertToJavaDouble(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return ((RubyFixnum) arg).intValue();
        } else if (arg instanceof RubyBignum) {
            return ((RubyBignum) arg).getInternal().longValue();
        } else if (arg instanceof RubyFloat) {
            return ((RubyFloat) arg).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Float");
        }
    }

    public static float convertToJavaFloat(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return ((RubyFixnum) arg).intValue();
        } else if (arg instanceof RubyBignum) {
            return ((RubyBignum) arg).getInternal().longValue();
        } else if (arg instanceof RubyFloat) {
            return (float) ((RubyFloat) arg).doubleValue();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Float");
        }
    }
}
