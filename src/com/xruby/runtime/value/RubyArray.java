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
	private ArrayList<RubyValue> array;
	private boolean isNotSingleAsterisk; //e.g. does not look like yield *[[]]

	public RubyArray() {
		this(1, true);
	}

	public RubyArray(int size) {
		this(size, true);
	}

	public RubyArray(RubyValue v) {
		this(1, true);
		add(v);
	}

	public RubyArray(RubyValue value1, RubyValue value2) {
		this(2, true);
		add(value1);
		add(value2);
	}

	public RubyArray(int size, boolean isNotSingleAsterisk) {
		array = new ArrayList<RubyValue>(size);
		this.isNotSingleAsterisk = isNotSingleAsterisk;
	}

	public boolean isNotSingleAsterisk() {
		return this.isNotSingleAsterisk;
	}

	public void add(RubyValue v) {
		array.add(v);
	}

	public RubyValue remove(int index) {
		if (index < 0 || index > size()) {
			return ObjectFactory.nilValue;
		}

		return array.remove(index);
	}

	public int size() {
		return array.size();
	}

	public Iterator<RubyValue> iterator() {
		return array.iterator();
	}

	public RubyValue set(int index, RubyValue value) {
		if (index < 0) {
			index = array.size() + index;
		}

		if (index < 0) {
			//FIXME throw IndexError
			throw new RubyException("IndexError");
		}

		if (index < array.size()) {
			array.set(index, value);
		} else {
			array.ensureCapacity(index + 1);
			for (int i = array.size(); i < index; ++i) {
				array.add(ObjectFactory.nilValue);
			}
			array.add(value);
		}

		return value;
	}

	public RubyValue get(int index) {
		if (index < 0) {
			index = array.size() + index;
		}

		if (index < 0 || index >= size()) {
			return ObjectFactory.nilValue;
		} else {
			return array.get(index);
		}
	}

	public RubyArray subarray(int begin, int length) {
		int arraySize = array.size();
		if (begin > arraySize) {
			return null;
		}

		if (length < 0) {
			return null;
		}

		if (begin < 0) {
			begin += array.size();
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
			resultArray.add(array.get(i));
		}

		return resultArray;
	}

	public RubyValue equals(RubyArray that) {
		if (array.size() != that.size()) {
			return ObjectFactory.falseValue;
		}

		for (int i = 0; i < array.size(); ++i) {
			if (RubyRuntime.callPublicMethod(this.get(i), that.get(i), "==") == ObjectFactory.falseValue) {
				return ObjectFactory.falseValue;
			}
		}

		return ObjectFactory.trueValue;
	}

	public RubyValue to_s() {
		RubyString r = new RubyString();

		for (RubyValue v : array) {
			RubyValue s = RubyRuntime.callPublicMethod(v, null, "to_s");
			r.appendString((s.getValue()).toString());
            // TODO: The output of to_s is not as the same as cruby, we should solve this issue
            // TODO: and change the corresponding testcases in RubyCompilerTest, such as test_array_expand.
        }

		return ObjectFactory.createString(r);
	}

	ArrayList<RubyValue> getInternal() {
		return array;
	}

	public void concat(RubyValue v) {
		Object o = v.getValue();
		if (v.getRubyClass() != RubyRuntime.ArrayClass) {//TODO use RuyRuntime.isKindOf() ?
			throw new RubyException(RubyRuntime.TypeErrorClass,
					"can't convert " + v.getRubyClass().toString() + " into Array");
		}

		array.addAll(((RubyArray)o).getInternal());
	}

	public RubyArray plus(RubyArray v) {
		int size = array.size() + v.size();
		RubyArray resultArray = new RubyArray(size);
		resultArray.array.addAll(array);
		resultArray.array.addAll(v.array);
		return resultArray;
	}

	public RubyArray times(int times) {
		if (times < 0) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "negative argument");
		}

		int size = array.size() * times;
		RubyArray resultArray = new RubyArray(size);
		for (int i = 0; i < times; i++) {
			resultArray.array.addAll(array);
		}

		return resultArray;
	}

	/// Returns true if the given object is present
	public boolean include(RubyValue v) {
		for (RubyValue value : array) {
			if (RubyRuntime.testEqual(value, v)) {
				return true;
			}
		}

		return false;
	}

	public void expand(RubyValue v) {
		Object o = v.getValue();
		if (o instanceof RubyArray) {
			//[5,6,*[1, 2]]
			array.addAll(((RubyArray)o).getInternal());
		} else {
			//[5,6,*1], [5,6,*nil]
			array.add(v);
		}
	}

	//create a new Array containing every element from index to the end
	public RubyValue collect(int index) {
		assert(index >= 0);

		final int size = array.size() - index;
		if (size < 0) {
			return ObjectFactory.createEmptyArray();
		}

		RubyArray v = new RubyArray(size, true);
		for (int i = index; i < array.size(); ++i) {
			v.add(array.get(i));
		}

		return ObjectFactory.createArray(v);
	}

	public RubyValue unshift(RubyValue value){
		array.add(0, value);
		return ObjectFactory.createArray(this);
	}

	public RubyValue unshift(RubyArray value){
		array.addAll(0, value.getInternal());
		return ObjectFactory.createArray(this);
	}

}

