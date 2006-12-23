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
public class RubyArray extends RubyBasic implements Iterable<RubyValue> {
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
		super(RubyRuntime.ArrayClass);
		array = new ArrayList<RubyValue>(size);
		this.isNotSingleAsterisk = isNotSingleAsterisk;
	}

	public boolean isNotSingleAsterisk() {
		return this.isNotSingleAsterisk;
	}

	public RubyArray add(RubyValue v) {
		array.add(v);
		return this;
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

	public RubyArray copy() {
		RubyArray resultArray = new RubyArray(array.size());
		for (RubyValue v : array) {
			resultArray.add(v);
		}

		return resultArray;
	}
	
	public RubyValue compare(RubyArray other_array) {
		int length = (size() <= other_array.size()) ? size() : other_array.size();
		for (int i = 0; i < length; ++i) {
			RubyValue v = RubyAPI.callPublicMethod(get(i), other_array.get(i), "<=>");
			if (!RubyAPI.testEqual(v, ObjectFactory.fixnum0)) {
				return v;
			}
		}
		
		if (size() == other_array.size()) {
			return ObjectFactory.fixnum0;
		} else if (size() > other_array.size()) {
			return ObjectFactory.fixnum1;
		} else {
			return ObjectFactory.createFixnum(-1);
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

	public boolean equals(RubyArray that) {
		if (array.size() != that.size()) {
			return false;
		}

		for (int i = 0; i < array.size(); ++i) {
			if (!RubyAPI.testEqual(this.get(i), that.get(i))) {
				return false;
			}
		}

		return true;
	}

	public RubyValue to_s() {
		RubyString r = ObjectFactory.createString();

		for (RubyValue v : array) {
			RubyValue s = RubyAPI.callPublicMethod(v, null, "to_s");
			r.appendString(s.toString());
			
            // TODO: The output of to_s is not as the same as cruby, we should solve this issue
            // TODO: and change the corresponding testcases in RubyCompilerTest, such as test_array_expand.
        }

		return r;
	}

	ArrayList<RubyValue> getInternal() {
		return array;
	}

	public void concat(RubyValue v) {
		if (!(v instanceof RubyArray)) {
			throw new RubyException(RubyRuntime.TypeErrorClass,
					"can't convert " + v.getRubyClass().toString() + " into Array");
		}

		array.addAll(((RubyArray)v).getInternal());
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
			if (RubyAPI.testEqual(value, v)) {
				return true;
			}
		}

		return false;
	}

	public void rb_iterate(RubyValue receiver, RubyBlock block) {
		for(RubyValue item: array) {
			RubyArray args = new RubyArray();
			args.add(item);

			block.invoke(receiver, args);
		}
	}

	public RubyArray expand(RubyValue v) {
		if (v instanceof RubyArray) {
			//[5,6,*[1, 2]]
			array.addAll(((RubyArray)v).getInternal());
		} else {
			//[5,6,*1], [5,6,*nil]
			array.add(v);
		}

		return this;
	}

	//create a new Array containing every element from index to the end
	public RubyValue collect(int index) {
		assert(index >= 0);

		final int size = array.size() - index;
		if (size < 0) {
			return new RubyArray();
		}

		RubyArray a = new RubyArray(size, true);
		for (int i = index; i < array.size(); ++i) {
			a.add(array.get(i));
		}

		return a;
	}

	public RubyArray unshift(RubyValue value){
		array.add(0, value);
		return this;
	}

	public RubyArray unshift(RubyArray value){
		array.addAll(0, value.getInternal());
		return this;
	}

	public void sort() {
		Collections.sort(array, new Comparator<RubyValue>() {
				public int compare(RubyValue arg0, RubyValue arg1) {
					RubyValue v = RubyAPI.callPublicMethod(arg0, arg1, "<=>");
					return ((RubyFixnum)v).intValue();
				}
			}
		);
	}

	public void sort(final RubyBlock block) {
		final RubyArray self = this;
		Collections.sort(array, new Comparator<RubyValue>() {

				public int compare(RubyValue arg0, RubyValue arg1) {
					//TODO can not check if block return/break occured.
					RubyValue v = block.invoke(self, new RubyArray(arg0, arg1));
					return ((RubyFixnum)v).intValue();
				}
			}
		);
	}

	public int hash() {
		return array.hashCode();
	}

	public RubyArray intersect(RubyArray other) {
		RubyArray a = new RubyArray();
		for (RubyValue v : array) {
			if (other.include(v) && !a.include(v)) {
				a.add(v);
			}
		}
		return a;
	}
}

