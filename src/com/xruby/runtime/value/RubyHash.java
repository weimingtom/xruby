package com.xruby.runtime.value;

import java.util.HashMap;
import java.util.Map;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyHash extends RubyBasic {
	private Map<RubyValue, RubyValue> map;
	
	public RubyHash() {
		this.setRubyClass(RubyRuntime.hashClass);
		this.map = new HashMap<RubyValue, RubyValue>();
	}
	
	public int size() {
		return this.map.size();
	}
	
	public boolean isEmpty() {
		return this.map.isEmpty();
	}
	
	public RubyValue get(RubyValue key) {
		RubyValue value = this.map.get(key);
		return value != null ? value : RubyConstant.QNIL;
	}
	
	public RubyValue put(RubyValue key, RubyValue value) {
		return this.map.put(key, value);
	}
}
