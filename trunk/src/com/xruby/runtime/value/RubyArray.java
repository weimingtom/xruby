/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.util.*;
import com.xruby.runtime.lang.*;

/**
 * @breif Internal representation of a ruby array
 *
 */
public class RubyArray extends RubyBasic implements Iterable<RubyValue> {
	private ArrayList<RubyValue> array_;
	private boolean is_not_single_asterisk_; //e.g. does not look like yield *[[]]

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
		array_ = new ArrayList<RubyValue>(size);
		this.is_not_single_asterisk_ = isNotSingleAsterisk;
	}

	@SuppressWarnings("unchecked")
	public RubyArray clone() {
		RubyArray v = (RubyArray)super.clone();
		v.array_ = (ArrayList<RubyValue>)array_.clone();
		return v;
	}

	public boolean isNotSingleAsterisk() {
		return this.is_not_single_asterisk_;
	}

	public RubyArray add(RubyValue v) {
		array_.add(v);
		return this;
	}
	
	public RubyArray insert(int index, RubyValue v) {
		array_.add(index, v);
		return this;
	}

	public RubyValue remove(int index) {
		if (index < 0 || index > size()) {
			return ObjectFactory.nilValue;
		}

		return array_.remove(index);
	}

	public int size() {
		return array_.size();
	}

	public RubyValue delete(RubyValue arg) {
		boolean found = false;
		while (array_.remove(arg)) {
			found = true;
		}

		return found ? arg : ObjectFactory.nilValue;
	}

	public Iterator<RubyValue> iterator() {
		return array_.iterator();
	}

	private int getRealIndex(int i) {
		int index = i;
		if (index < 0) {
			index = array_.size() + index;
		}

		if (index < 0) {
			throw new RubyException(RubyRuntime.IndexErrorClass, "index " + i + " out of array");
		}

		return index;
	}

	public RubyValue set(int start, RubyValue value) {
		int index = getRealIndex(start);

		if (index < array_.size()) {
			array_.set(index, value);
		} else {
			array_.ensureCapacity(index + 1);
			for (int i = array_.size(); i < index; ++i) {
				array_.add(ObjectFactory.nilValue);
			}
			array_.add(value);
		}

		return value;
	}

	public RubyValue replace(int start, int length, RubyValue value) {
		int index = getRealIndex(start);

		if (length < 0) {
			throw new RubyException(RubyRuntime.IndexErrorClass, "negative length ("+ length + ")");
		} else if (0 == length) {
			if (value instanceof RubyArray) {
				array_.addAll(index, ((RubyArray)value).getInternal());
			} else {
				array_.add(index, value);
			}
		} else {
			for (int i = 0; i < length - 1; ++i) {
				array_.remove(index);
			}

			//TODO should we use addAll if value is RubyArray?
			array_.set(index, value);
		}
		return value;
	}

	public RubyValue get(int index) {
		if (index < 0) {
			index = array_.size() + index;
		}

		if (index < 0 || index >= size()) {
			return ObjectFactory.nilValue;
		} else {
			return array_.get(index);
		}
	}

	public RubyArray copy() {
		RubyArray resultArray = new RubyArray(array_.size());
		for (RubyValue v : array_) {
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
		final int arraySize = array_.size();
		if (begin > arraySize) {
			return null;
		}

		if (length < 0) {
			return null;
		}

		if (begin < 0) {
			begin += arraySize;
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
			resultArray.add(array_.get(i));
		}

		return resultArray;
	}

	public boolean equals(RubyArray that) {
		if (array_.size() != that.size()) {
			return false;
		}

		for (int i = 0; i < array_.size(); ++i) {
			if (!RubyAPI.testEqual(this.get(i), that.get(i))) {
				return false;
			}
		}

		return true;
	}

	public RubyValue to_s() {
		RubyString r = ObjectFactory.createString();

		for (RubyValue v : array_) {
			RubyValue s = RubyAPI.callPublicMethod(v, null, null, "to_s");
			r.appendString(s.toString());
			
            // TODO: The output of to_s is not as the same as cruby, we should solve this issue
            // TODO: and change the corresponding testcases in RubyCompilerTest, such as test_array_expand.
        }

		return r;
	}

	ArrayList<RubyValue> getInternal() {
		return array_;
	}

	public void concat(RubyValue v) {
		if (!(v instanceof RubyArray)) {
			throw new RubyException(RubyRuntime.TypeErrorClass,
					"can't convert " + v.getRubyClass().toString() + " into Array");
		}

		array_.addAll(((RubyArray)v).getInternal());
	}

	public RubyArray plus(RubyArray v) {
		int size = array_.size() + v.size();
		RubyArray resultArray = new RubyArray(size);
		resultArray.array_.addAll(array_);
		resultArray.array_.addAll(v.array_);
		return resultArray;
	}
	
	private boolean remove(RubyValue v) {
		boolean r = false;
		while (array_.remove(v)) {
			r = true;
		}
		return r;
	}

	public RubyArray minus(RubyArray other) {
		RubyArray a = this.copy();
		for (RubyValue v : other) {
			a.remove(v);
		}
		return a;
	}

	public RubyArray times(int times) {
		if (times < 0) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "negative argument");
		}

		int size = array_.size() * times;
		RubyArray resultArray = new RubyArray(size);
		for (int i = 0; i < times; i++) {
			resultArray.array_.addAll(array_);
		}

		return resultArray;
	}

	/// Returns true if the given object is present
	public boolean include(RubyValue v) {
		for (RubyValue value : array_) {
			if (RubyAPI.testEqual(value, v)) {
				return true;
			}
		}

		return false;
	}

	public void rb_iterate(RubyValue receiver, RubyBlock block) {
		for(RubyValue item: array_) {
			RubyArray args = new RubyArray();
			args.add(item);

			block.invoke(receiver, args);
		}
	}

	public RubyArray expand(RubyValue v) {
		if (v instanceof RubyArray) {
			//[5,6,*[1, 2]]
			array_.addAll(((RubyArray)v).getInternal());
		} else {
			//[5,6,*1], [5,6,*nil]
			array_.add(v);
		}

		return this;
	}

	//create a new Array containing every element from index to the end
	public RubyValue collect(int index) {
		assert(index >= 0);

		final int size = array_.size() - index;
		if (size < 0) {
			return new RubyArray();
		}

		RubyArray a = new RubyArray(size, true);
		for (int i = index; i < array_.size(); ++i) {
			a.add(array_.get(i));
		}

		return a;
	}

	public RubyArray unshift(RubyValue value){
		array_.add(0, value);
		return this;
	}

	public RubyArray unshift(RubyArray value){
		array_.addAll(0, value.getInternal());
		return this;
	}

	public void sort() {
		Collections.sort(array_, new Comparator<RubyValue>() {
				public int compare(RubyValue arg0, RubyValue arg1) {
					RubyValue v = RubyAPI.callPublicMethod(arg0, arg1, "<=>");
					return ((RubyFixnum)v).intValue();
				}
			}
		);
	}

	public void sort(final RubyBlock block) {
		final RubyArray self = this;
		Collections.sort(array_, new Comparator<RubyValue>() {

				public int compare(RubyValue arg0, RubyValue arg1) {
					//TODO can not check if block return/break occured.
					RubyValue v = block.invoke(self, new RubyArray(arg0, arg1));
					return ((RubyFixnum)v).intValue();
				}
			}
		);
	}

	public int hash() {
		return array_.hashCode();
	}

	public RubyArray and(RubyArray other) {
		RubyArray a = new RubyArray();
		for (RubyValue v : array_) {
			if (other.include(v) && !a.include(v)) {
				a.add(v);
			}
		}
		return a;
	}

	public RubyArray or(RubyArray other) {
		RubyArray a = new RubyArray();
		for (RubyValue v : array_) {
			if (!a.include(v)) {
				a.add(v);
			}
		}
		for (RubyValue v : other) {
			if (!a.include(v)) {
				a.add(v);
			}
		}
		return a;
	}

	public boolean compact() {
		return remove(ObjectFactory.nilValue);
	}

	public boolean uniq() {
		boolean b = false;
		for (int i = 0; i < array_.size(); ++i) {
			for (int j = i + 1; j < array_.size();) {
				if (RubyAPI.testEqual(array_.get(i), array_.get(j))) {
					array_.remove(j);
					b = true;
				} else {
					++j;
				}
			}
		}
		return b;
	}

	public void reverse() {
		Collections.reverse(array_);
	}
}

