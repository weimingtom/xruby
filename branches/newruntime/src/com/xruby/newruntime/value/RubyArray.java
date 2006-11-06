package com.xruby.newruntime.value;

import java.util.ArrayList;

import com.xruby.newruntime.lang.RubyBasic;
import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;
import com.xruby.newruntime.lang.RubyValue;

public class RubyArray extends RubyBasic {
	private ArrayList<RubyValue> array = new ArrayList<RubyValue>();
	
	public RubyArray() {
		this.setRubyClass(RubyRuntime.arrayClass);
	}
	
	public int length() {
		return this.array.size();
	}
	
	public boolean isEmpty() {
		return this.array.isEmpty();
	}
	
	public void add(RubyValue value) {
		this.array.add(value);
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
	
	public void set(int index, RubyValue value) {
		int size = this.array.size();
		if (index < 0) {
			index += size;
		}
		
		if (index < 0) {
			RubyRuntime.raise(RubyRuntime.indexError, "index %d out of array", index);
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
	
	public RubyValue remove(int index) {
		if (index < 0 || index >= this.array.size()) {
			return RubyConstant.QNIL;			
		}
		
		return this.array.remove((int)index);
	}
	
	public RubyArray subArray(int begin, int length) {
		return null;
	}
	
	public RubyString toS() {
		RubyString buf = RubyString.newString();
		
		for (RubyValue value : array) {			
			buf.append(value);
		}
		
		return buf;
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
	
	public void concat(RubyArray array) {
		this.array.addAll(array.array);
	}
	
	public RubyArray plus(RubyArray array) {
		RubyArray result = new RubyArray();
		result.array.addAll(this.array);
		result.array.addAll(array.array);
		return result;
	}
	
	public RubyArray times(int times) {
		if (times == 0) {
			return new RubyArray();			
		}
		
		if (times < 0) {
			RubyRuntime.raise(RubyRuntime.argumentError, "negative argument");
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
			if (RubyUtil.equal(value, target)) {
				return true;
			}
		}
		
		return false;
	}
}
