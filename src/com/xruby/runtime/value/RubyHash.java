/**
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * @breif Internal representation of a ruby hash
 *
 */
public class RubyHash {
	private Map<RubyValue, RubyValue> map_ = new HashMap<RubyValue, RubyValue>();
    // To ensure the order
    private List<RubyValue> keys_ = new ArrayList<RubyValue>();

	private RubyValue default_value_ = ObjectFactory.nilValue;
    private RubyBlock block = null;

    public void add(RubyValue k, RubyValue v) {
		map_.put(k, v);
        keys_.add(k);
    }

	public int size() {
		return map_.size();
	}

    public RubyValue to_s() {
		RubyString r = new RubyString();

		for (RubyValue key : map_.keySet()) {
            RubyValue value = map_.get(key);
            r.appendString((key.getValue()).toString()+(value.getValue()).toString());
		}

		return ObjectFactory.createString(r);
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
