/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import java.util.*;

import com.xruby.core.lang.*;

/**
 * @breif Internal representation of a ruby array 
 * 
 */
public class ArrayValue {
	private ArrayList<RubyValue> values_;

	public ArrayValue(int size) {
		values_ = new ArrayList<RubyValue>(size);
	}
	
	public void add(RubyValue v) {
		values_.add(v);
	}
	
	public int size() {
		return values_.size();
	}

	public RubyValue[] toArray() {
		return values_.toArray(new RubyValue[values_.size()]);
	}

	public RubyValue set(int index, RubyValue value) throws RubyException {
		if (index < 0) {
			index = values_.size() + index;
		}

		if (index < 0) {
			//FIXME throw IndexError
			throw new RubyException("IndexError");
		}
	
		if (index < values_.size()) {
			values_.set(index, value);
		} else {
			values_.ensureCapacity(index + 1);
			for (int i = values_.size(); i < index; ++i) {
				values_.add(ObjectFactory.nilValue);
			}
			values_.add(value);
		}

		return value;
	}
	
	public RubyValue get(int index) {
		if (index < 0) {
			index = values_.size() + index;
		}
		
		if (index < 0 || index >= size()) {
			return ObjectFactory.nilValue;
		} else {
			return values_.get(index);
		}
	}

	public RubyValue equals(ArrayValue that) throws RubyException {
		if (values_.size() != that.size()) {
			return ObjectFactory.falseValue;
		}

		for (int i = 0; i < values_.size(); ++i) {
			if (RubyRuntime.callPublicMethod(this.get(i), that.get(i), "==") == ObjectFactory.falseValue) {
				return ObjectFactory.falseValue;
			}
		}

		return ObjectFactory.trueValue;
	}

	public RubyValue to_s() throws RubyException {
		StringBuilder r = new StringBuilder();
		
		for (RubyValue v : values_) {
			RubyValue s = RubyRuntime.callPublicMethod(v, null, "to_s");
			r.append((StringBuilder)s.getValue());
		}
		
		return ObjectFactory.createString(r);
	}
	
	ArrayList<RubyValue> getInternal() {
		return values_;
	}
	
	public void concat(ArrayValue v) {
		values_.addAll(v.getInternal());
	}
}
