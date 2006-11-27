package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.*;

public class RubyTypesUtil {
	
	public static RubyFixnum convertToFixnum(RubyValue arg){
		return convertTo(RubyFixnum.class, arg);
	}
	
	public static RubyBignum convertToBignum(RubyValue arg){
		return convertTo(RubyBignum.class, arg);
	}
	
	public static RubyString convertToString(RubyValue arg){
		return convertTo(RubyString.class, arg);
	}
	
	public static RubyFloat convertToFloat(RubyValue arg){
		return convertTo(RubyFloat.class, arg);
	}
	
	public static RubyTime convertToTime(RubyValue arg){
		return convertTo(RubyTime.class, arg);
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T convertTo(Class<T> klass, RubyValue arg){
		try{
			return (T)arg.getValue();
		}catch(ClassCastException e){
			throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + arg.getRubyClass().getName() + " into " + klass.getSimpleName());
		}
	}
}
