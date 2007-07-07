/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @breif Internal representation of a ruby hash
 */
public class RubyHash extends RubyBasic {
    private HashMap<RubyValue, RubyValue> map_ = new HashMap<RubyValue, RubyValue>();
    private ArrayList<RubyValue> keys_ = new ArrayList<RubyValue>();// To ensure the order, for 'shift' ect
    private RubyValue default_value_ = ObjectFactory.NIL_VALUE;
    private RubyBlock default_value_as_block_ = null;

    RubyHash() {
        super(RubyRuntime.HashClass);
    }

    @SuppressWarnings("unchecked")
    public RubyHash clone() {
        RubyHash h = (RubyHash) super.clone();
        h.map_ = (HashMap<RubyValue, RubyValue>) map_.clone();
        h.keys_ = (ArrayList<RubyValue>) keys_.clone();
        return h;
    }

    // Getter and Setter for default value
    public RubyValue getDefaultValue() {
        return default_value_;
    }

    public void setDefaultValue(RubyValue defaultValue) {
        default_value_as_block_ = null;
        default_value_ = defaultValue;
    }

    public RubyBlock getDefaultValueAsBlock() {
        return default_value_as_block_;
    }

    public void setDefaultValueAsBlock(RubyBlock b) {
        default_value_as_block_ = b;
    }

    public RubyHash add(RubyValue k, RubyValue v) {
        if (!map_.containsKey(k)) {
            keys_.add(k);
        }
        map_.put(k, v);
        return this;
    }

    public int size() {
        return map_.size();
    }

    public RubyValue to_s() {
        RubyString r = ObjectFactory.createString();

        for (RubyValue key : map_.keySet()) {
            RubyValue value = map_.get(key);
            r.appendString(key.toString() + value.toString());
        }

        return r;
    }

    private RubyID defaultID = RubyID.intern("default");

    public RubyValue get(RubyValue k) {
        RubyValue v = map_.get(k);
        if (null != v) {
            return v;
        } else if (null != default_value_as_block_) {
            return default_value_as_block_.invoke(this, new RubyArray(this, k));
        } else {
            return RubyAPI.callOneArgMethod(this, k, null, defaultID);
        }
    }

    public void each(RubyValue receiver, RubyBlock block) {
        for (RubyValue key : keys_) {
            RubyValue value = map_.get(key);
            RubyArray args = new RubyArray();
            args.add(key);
            args.add(value);

            block.invoke(receiver, args);
        }
    }

    public RubyArray to_a() {
        RubyArray array = new RubyArray();
        for (RubyValue key : keys_) {
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

    public RubyValue delete(RubyValue k) {
        RubyValue v = map_.remove(k);
        if (null != v) {
            return v;
        } else {
            return RubyAPI.callOneArgMethod(this, k, null, defaultID);
        }
    }

    public boolean has_value(RubyValue value) {
        for (RubyValue key : keys_) {
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

    public RubyValue shift() {
        if (keys_.isEmpty()) {
            return default_value_;
        }

        RubyValue k = keys_.remove(0);
        RubyValue v = map_.remove(k);

        RubyArray a = new RubyArray(2);
        a.add(k);
        a.add(v);
        return a;
    }
}
