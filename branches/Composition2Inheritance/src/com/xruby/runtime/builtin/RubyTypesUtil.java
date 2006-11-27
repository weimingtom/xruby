package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.*;

public class RubyTypesUtil {
	
	public static RubyFixnum convertToFixnum(RubyValue arg){
		if (arg instanceof RubyFixnum) {
			return (RubyFixnum)arg;
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Fixnum");
		}
	}
	
	public static RubyString convertToString(RubyValue arg){
		if (arg instanceof RubyString) {
			return (RubyString)arg;
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into String");
		}
	}
	
	public static RubyTime convertToTime(RubyValue arg){
		if (arg instanceof RubyTime) {
			return (RubyTime)arg;
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + arg.getRubyClass().getName() + " into Time");
		}
	}
}
