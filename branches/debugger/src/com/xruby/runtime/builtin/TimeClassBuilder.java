/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Date;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Time_new extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return ObjectFactory.createTime();
	}
}

class Time_to_f extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyTime t = (RubyTime)receiver;
		return ObjectFactory.createFloat((double)t.getTime() / 1000);
	}
}

class Time_to_i extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyTime t = (RubyTime)receiver;
		return ObjectFactory.createFixnum((int)(t.getTime() / 1000));
	}
}

class Time_to_s extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyTime t = (RubyTime)receiver;
		return ObjectFactory.createString(t.toString());
	}
}

class Time_at extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		Object value = arg;
		long time = 0;
		if (value instanceof RubyFixnum){
			time = ((RubyFixnum)value).intValue();
		} else if (value instanceof RubyBignum) {
			time = ((RubyBignum)value).getInternal().longValue();
		} else if (value instanceof RubyFloat){
			time = (long)((RubyFloat)value).doubleValue();
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Time");
		}
		return ObjectFactory.createTime(new Date(time * 1000));
	}
}

class Time_plus extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyTime time = (RubyTime)receiver;
		Object value = arg;
		long timeAdd = 0;
		if (value instanceof RubyFixnum){
			timeAdd = ((RubyFixnum)value).intValue();
		}else if (value instanceof RubyBignum){
			timeAdd = ((RubyBignum)value).getInternal().longValue();
		}else if (value instanceof RubyFloat){
			double add = (long)((RubyFloat)value).doubleValue();
			return ObjectFactory.createTime(new Date(time.getTime() + (long)(add * 1000)));
		}else{
			throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Float");
		}
		return ObjectFactory.createTime(new Date(time.getTime() + timeAdd * 1000));
	}
}

class Time_minus extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyTime time1 = (RubyTime)receiver;
		RubyTime time2 = RubyTypesUtil.convertToTime(arg);
		long timeInteval = time1.getTime() - time2.getTime();
		return ObjectFactory.createFloat((double)timeInteval / 1000);
	}
}

class Time_operator_compare extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		long time1 = ((RubyTime)receiver).getTime();
		long time2 = RubyTypesUtil.convertToTime(arg).getTime();
		if (time1 < time2){
			return ObjectFactory.createFixnum(-1);
		}else if (time1 > time2) {
			return ObjectFactory.fixnum1;
		}
		return ObjectFactory.fixnum0;
	}
}

public class TimeClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.TimeClass;
		c.defineMethod("to_f", new Time_to_f());
		c.defineMethod("to_i", new Time_to_i());
		c.defineMethod("to_s", new Time_to_s());
		c.defineMethod("+", new Time_plus());
		c.defineMethod("-", new Time_minus());
		c.defineMethod("<=>", new Time_operator_compare());
		c.defineAllocMethod(new Time_new());
		
		c.getSingletonClass().defineMethod("now", ClassClassBuilder.class_new_);
		c.getSingletonClass().defineMethod("at", new Time_at());
		
	}
}
