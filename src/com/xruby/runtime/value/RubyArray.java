/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import java.util.*;

import com.xruby.runtime.lang.*;

/**
 * @breif Internal representation of a ruby array 
 * 
 */
public class RubyArray implements Iterable<RubyValue> {
	private ArrayList<RubyValue> values_;
	private boolean notSingleAsterisk_ = true; //e.g. yield *[[]]

	public boolean notSingleAsterisk() {
		return notSingleAsterisk_;
	}
	
	public RubyArray() {
		values_ = new ArrayList<RubyValue>();
		notSingleAsterisk_ = true;
	}
	
	public RubyArray(int size) {
		this(size, true);
	}
	
	public RubyArray(int size, boolean notSingleAsterisk) {
		values_ = new ArrayList<RubyValue>(size);
		notSingleAsterisk_ = notSingleAsterisk;
	}
	
	public RubyArray(RubyValue v) {
		values_ = new ArrayList<RubyValue>(1);
		values_.add(v);
	}
	
	public void add(RubyValue v) {
		values_.add(v);
	}
	
	public RubyValue remove(int index) throws RubyException {
		if (index < 0 || index > size()) {
			return ObjectFactory.nilValue;
		}
		
		return values_.remove(index);		
	}
	
	public int size() {
		return values_.size();
	}
	
	public Iterator<RubyValue> iterator() {
		return values_.iterator();
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
	
	public RubyArray subarray(RangeValue range) {
		int left = range.getLeft();
		if (left < 0) {
			left += values_.size();
		}
		int right = range.getRight();
		if (right < 0) {
			right += values_.size();
		}
		
		int length = right - left + 1;
		length = length > 0 ? length : 0;
		
		return subarray(left, length);
	}
	
	public RubyArray subarray(int begin, int length) {
		int arraySize = values_.size();
		if (begin > arraySize) {
			return null;
		}
		
		if (length < 0) {
			return null;
		}
		
		if (begin < 0) {
			begin += values_.size();
		}
		
		if (begin + length > arraySize) {
			length = arraySize - begin;
			if (length < 0) {
				length = 0;
			}
		}
		
		if (length == 0) {
			return new RubyArray(0);
		}
		
		RubyArray resultArray = new RubyArray(length);
		int last = begin + length;
		for (int i = begin; i < last; i++) {
			resultArray.add(values_.get(i));
		}	
		
		return resultArray;
	}

	public RubyValue equals(RubyArray that) throws RubyException {
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
		StringValue r = new StringValue();
		
		for (RubyValue v : values_) {
			RubyValue s = RubyRuntime.callPublicMethod(v, null, "to_s");
			r.appendString(((StringValue)s.getValue()).toString());
		}
		
		return ObjectFactory.createString(r);
	}
	
	ArrayList<RubyValue> getInternal() {
		return values_;
	}
	
	public void concat(RubyValue v) throws RubyException {
		Object o = v.getValue();
		if (v.getRubyClass() != RubyRuntime.ArrayClass) {//TODO use RuyRuntime.isKindOf() ?
			throw new RubyException(RubyRuntime.TypeErrorClass,
					"can't convert " + v.getRubyClass().toString() + " into Array");
		}

		values_.addAll(((RubyArray)o).getInternal());
	}

	public void expand(RubyValue v) {
		Object o = v.getValue();
		if (o instanceof RubyArray) {
			//[5,6,*[1, 2]]
			values_.addAll(((RubyArray)o).getInternal());	
		} else {
			//[5,6,*1], [5,6,*nil]
			values_.add(v);
		}
	}

	//create a new Array containing every element from index to the end
	public RubyValue collect(int index) {
		assert(index >= 0);

		final int size = values_.size() - index;
		if (size < 0) {
			return ObjectFactory.createEmptyArray();
		}

		RubyArray v = new RubyArray(size, true);
		for (int i = index; i < values_.size(); ++i) {
			v.add(values_.get(i));
		}

		return ObjectFactory.createArray(v);
	}
	
	public RubyArray plus(RubyArray array) {
		int size = values_.size() + array.size();
		RubyArray resultArray = new RubyArray(size);
		resultArray.values_.addAll(values_);
		resultArray.values_.addAll(array.values_);
		return resultArray;
	}

	public RubyArray times(int times) throws RubyException {
		if (times < 0) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "negative argument");
		}
		
		int size = values_.size() * times;
		RubyArray resultArray = new RubyArray(size);
		for (int i = 0; i < times; i++) {
			resultArray.values_.addAll(values_);
		}
		
		return resultArray;
	}

	/// Returns true if the given object is present
	public boolean include(RubyValue v) throws RubyException {
		for (RubyValue value : values_) {
			if (RubyRuntime.testEqual(value, v)) {
				return true;
			}
		}
		
		return false;
	}
}

