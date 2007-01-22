package com.xruby.runtime.value;

import java.lang.reflect.Field;
import com.xruby.runtime.lang.*;

public class RubyProc extends RubyBinding {
	private RubyBlock value_;
	
	RubyProc(RubyBlock v) {
		super(RubyRuntime.ProcClass);
		setSelf(ObjectFactory.topLevelSelfValue);//TODO should not hardcode this
		setScope(RubyRuntime.GlobalScope);//TODO should not hardcode this
		value_ = v;
	}
	
	public RubyBlock getBlock() {
		return value_;
	}
	
	private void setUpCallContext() {
		Field[] fields = value_.getClass().getFields();
		for (Field f: fields) {
			RubyValue v = getVariable(f.getName());
			if (null != v) {
				try {
					f.set(value_, v);
				} catch (IllegalArgumentException e) {
					throw new Error(e);
				} catch (IllegalAccessException e) {
					throw new Error(e);
				}
			}
		}
	}
	
	public RubyValue call(RubyValue receiver, RubyArray args) {
		setUpCallContext();
		return value_.invoke(receiver, args, false);
	}
}
