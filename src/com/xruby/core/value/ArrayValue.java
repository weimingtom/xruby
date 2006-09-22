/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.value;

import java.util.*;

import com.xruby.core.lang.*;

/**
 * @breif Internal representation of a ruby array 
 * 
 */
public class ArrayValue implements Iterable<RubyValue> {
	private ArrayList<RubyValue> values_;
	private boolean notSingleAsterisk_ = true; //e.g. yield *[[]]

	public boolean notSingleAsterisk() {
		return notSingleAsterisk_;
	}
	
	public ArrayValue(int size, boolean notSingleAsterisk) {
		values_ = new ArrayList<RubyValue>(size);
		notSingleAsterisk_ = notSingleAsterisk;
	}
	
	public ArrayValue(RubyValue v) {
		values_ = new ArrayList<RubyValue>(1);
		values_.add(v);
	}
	
	public void add(RubyValue v) {
		values_.add(v);
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
		StringValue r = new StringValue();
		
		for (RubyValue v : values_) {
			RubyValue s = RubyRuntime.callPublicMethod(v, null, "to_s");
			r.append((StringValue)s.getValue());
		}
		
		return ObjectFactory.createString(r);
	}
	
	ArrayList<RubyValue> getInternal() {
		return values_;
	}
	
	public void concat(RubyValue v) throws RubyException {
		Object o = v.getValue();
		if (v.getRubyClass() != RubyRuntime.ArrayClass) {//TODO use RuyRuntime.testInstanceOf() ?
			throw new RubyException(RubyRuntime.TypeErrorClass,
					"can't convert " + v.getRubyClass().toString() + " into Array");
		}

		values_.addAll(((ArrayValue)o).getInternal());
	}

	public void expand(RubyValue v) {
		Object o = v.getValue();
		if (o instanceof ArrayValue) {
			//[5,6,*[1, 2]]
			values_.addAll(((ArrayValue)o).getInternal());	
		} else {
			//[5,6,*1], [5,6,*nil]
			values_.add(v);
		}
	}

	public static RubyValue expandArrayIfThereIsZeroOrOneValue(ArrayValue a) {
		if (a.size() <= 1) {
			return a.get(0);
		} else {
			return ObjectFactory.createArray(a);
		}
	}

	public static RubyValue expandArrayIfThereIsZeroOrOneValue(RubyValue v) {
		if (v.getValue() instanceof ArrayValue) {
			ArrayValue a = (ArrayValue)v.getValue();
			if (!a.notSingleAsterisk()) {
				return expandArrayIfThereIsZeroOrOneValue(a);
			}
		}

		return v;
	}
	
	public static ArrayValue expandArrayIfThereIsOnlyOneArrayValue(ArrayValue a) {
		if (a.size() == 1 &&
				a.get(0).getValue() instanceof ArrayValue) {
			return (ArrayValue)a.get(0).getValue();
		} else {
			return a;
		}
	}

	public static ArrayValue convertToArrayIfNotYet(RubyValue v) {
		if (v.getValue() instanceof ArrayValue) {
			return (ArrayValue)v.getValue();
		} else {
			return new ArrayValue(v);
		}
	}

	//create a new Array containing every element from index to the end
	public RubyValue collect(int index) {
		assert(index >= 0);

		final int size = values_.size() - index;
		if (size < 0) {
			return ObjectFactory.createEmptyArray();
		}

		ArrayValue v = new ArrayValue(size, true);
		for (int i = index; i < values_.size(); ++i) {
			v.add(values_.get(i));
		}

		return ObjectFactory.createArray(v);
	}
}

