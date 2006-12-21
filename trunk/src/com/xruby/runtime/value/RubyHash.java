/**
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * @breif Internal representation of a ruby hash
 *
 */
public class RubyHash extends RubyBasic {
	private Map<RubyValue, RubyValue> map_ = new HashMap<RubyValue, RubyValue>();
	// To ensure the order
	private List<RubyValue> keys_ = new ArrayList<RubyValue>();

	private RubyValue default_value_ = ObjectFactory.nilValue;
	private RubyBlock block = null;

	RubyHash() {
		super(RubyRuntime.HashClass);
	}

	public void add(RubyValue k, RubyValue v) {
		map_.put(k, v);
	    keys_.add(k);
	}

	public int size() {
		return map_.size();
	}

	public RubyValue to_s() {
		RubyString r = ObjectFactory.createString();

		for (RubyValue key : map_.keySet()) {
	        RubyValue value = map_.get(key);
	        r.appendString(key.toString()+ value.toString());
		}

		return r;
	}


	public RubyValue get(RubyValue k) {
		RubyValue v = map_.get(k);
		if (null == v) {
			return default_value_;
		} else {
			return v;
		}
	}

	public void rb_iterate(RubyValue receiver, RubyBlock block) {
		for(RubyValue key: keys_) {
			RubyValue value = map_.get(key);
			RubyArray args = new RubyArray();
			args.add(key);
			args.add(value);

			block.invoke(receiver, args);
		}
	}

	public RubyArray to_a() {
		RubyArray array = new RubyArray();
		for(RubyValue key: keys_) {
			RubyValue value = map_.get(key);
			RubyArray entry = new RubyArray();
			entry.add(key);
			entry.add(value);
			array.add(entry);
		}

		return array;
	}

	public boolean has_key(RubyValue key) {
		for (RubyValue v : keys_) {
			if (RubyAPI.testEqual(key, v)) {
				return true;
			}
		}

		return false;
	}

	public boolean has_value(RubyValue value) {
		for(RubyValue key: keys_) {
			RubyValue v = map_.get(key);
			if (RubyAPI.testEqual(value, v)) {
				return true;
			}
		}

		return false;
	}

	public RubyArray values_at(RubyArray keys) {
		RubyArray a = new RubyArray();

		if (null == keys) {
			return a;
		}
		
		for (RubyValue key : keys) {
			RubyValue v = map_.get(key);
			if (null != v) {
				a.add(v);
			}
		}
		
		return a;
	}

	public boolean equals(RubyHash that) {
		if (this.size() != that.size()) {
			return false;
		}

		for (RubyValue key : keys_) {
			RubyValue v1 = that.get(key);
			if (null == v1) {
				return false;
			}
			
			RubyValue v2 = this.get(key);
			if (!RubyAPI.testEqual(v1, v2)) {
				return false;
			}
		}

		return true;
	}
	
	public RubyArray keys() {
		RubyArray a = new RubyArray();
		for (RubyValue key : keys_) {
			a.add(key);
		}
		return a;
	}
	
	public RubyArray values() {
		RubyArray a = new RubyArray();
		
		for (RubyValue key : map_.values()) {
			a.add(key);
		}
		
		return a;
	}

	// Getter and Setter for default value
	public RubyValue getDefaultValue() {
		return default_value_;
	}

	public void setDefaultValue(RubyValue defaultValue) {
		this.default_value_ = defaultValue;
	}

	public RubyBlock getBlock() {
		return block;
	}

	public void setBlock(RubyBlock block) {
		this.block = block;
	}
}
