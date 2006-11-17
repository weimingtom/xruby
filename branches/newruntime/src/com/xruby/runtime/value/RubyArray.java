package com.xruby.runtime.value;

import java.util.ArrayList;
import java.util.Iterator;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyValue;

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
		this.setRubyClass(RubyRuntime.arrayClass);
		array = new ArrayList<RubyValue>(size);
		this.isNotSingleAsterisk = isNotSingleAsterisk;
	}

	public boolean isNotSingleAsterisk() {
		return this.isNotSingleAsterisk;
	}
	
	public boolean isEmpty() {
		return this.array.isEmpty();
	}
	
	public void add(RubyValue value) {
		this.array.add(value);
	}

	public RubyValue remove(int index) {
		if (index < 0 || index >= this.array.size()) {
			return RubyConstant.QNIL;			
		}
		
		return this.array.remove((int)index);
	}

	public int length() {
		return this.array.size();
	}

	public Iterator<RubyValue> iterator() {
		return this.array.iterator();
	}

	public void set(int index, RubyValue value) {
		int size = this.array.size();
		if (index < 0) {
			index += size;
		}
		
		if (index < 0) {
			RubyAPI.raise(RubyRuntime.indexError, "index %d out of array", index);
		}
		
		if (index < size) {
			this.array.set(index, value);
		} else {
			this.array.ensureCapacity(index + 1);
			for (int i = size; i < index; i++) {
				this.array.add(RubyConstant.QNIL);
			}
			this.array.add((int)index, value);
		}
	}
	
	public RubyValue get(int index) {
		int size = array.size();
		
		if (index < 0) {
			index += size;
		}
		
		if (index < 0 || index >= size) {
			return RubyConstant.QNIL;
		}
		
		return this.array.get((int)index);
	}

	//TODO public RubyValue subArray(RRange)
	public RubyValue subArray(int begin, int length) {
		int arraySize = array.size();
		if (begin > arraySize) {
			return RubyConstant.QNIL;
		}
		
		if (length < 0) {
			return RubyConstant.QNIL;
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

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof RubyArray) {
			RubyArray a = (RubyArray)obj;
			return this.array.equals(a.array);
		}
		
		return false;
	}	
	
	public RubyString toS() {
		RubyString buf = ObjectFactory.createString("");
		
		for (RubyValue value : array) {			
			buf.append(value);
		}
		
		return buf;
	}
	
	public RubyArray plus(RubyArray v) {
		RubyArray result = new RubyArray();
		result.array.addAll(this.array);
		result.array.addAll(v.array);
		return result;
	}

	public void concat(RubyArray v) {
		this.array.addAll(v.array);
	}

	public RubyArray times(int times) {
		if (times == 0) {
			return new RubyArray();			
		}
		
		if (times < 0) {
			RubyAPI.raise(RubyRuntime.argumentError, "negative argument");
		}
		
		// FIXME: too big argument
		
		RubyArray result = new RubyArray();
		for (int i = 0; i < times; i++) {
			result.array.addAll(this.array);
		}
		
		return result;
	}
	
	public boolean include(RubyValue target) {
		for (RubyValue value : this.array) {
			if (RubyAPI.equal(value, target)) {
				return true;
			}
		}
		
		return false;
	}

	public void expand(RubyValue v) {
		if (v instanceof RubyArray) {
			//[5,6,*[1, 2]]
			array.addAll(((RubyArray)v).array);	
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
			return new RubyArray(0);
		}

		RubyArray v = new RubyArray(size, true);
		for (int i = index; i < array.size(); ++i) {
			v.add(array.get(i));
		}

		return v;
	}
	
}
