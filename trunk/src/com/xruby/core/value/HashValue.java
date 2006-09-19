/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import java.util.*;

import com.xruby.core.lang.RubyValue;

/**
 * @breif Internal representation of a ruby hash 
 * 
 */
public class HashValue {
	private Map<RubyValue, RubyValue> map_ = new HashMap<RubyValue, RubyValue>();
	
	private RubyValue default_value_ = ObjectFactory.nilValue;
	
	public void add(RubyValue k, RubyValue v) {
		map_.put(k, v);
	}
	
	public int size() {
		return map_.size();
	}
	
	public RubyValue get(RubyValue k) {
		RubyValue v = map_.get(k);
		if (null == v) {
			return default_value_;
		} else {
			return v;
		}
	}
	
}
