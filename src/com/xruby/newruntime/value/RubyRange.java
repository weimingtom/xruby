package com.xruby.newruntime.value;

import com.xruby.newruntime.lang.RubyBasic;
import com.xruby.newruntime.lang.RubyRuntime;

public class RubyRange extends RubyBasic {
	private int begin;
	private int end;
	private boolean excludeEnd;
	
	public RubyRange() {
		this.setRubyClass(RubyRuntime.rangeClass);
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void setExcludeEnd(boolean excludeEnd) {
		this.excludeEnd = excludeEnd;
	}
	
	public boolean isExcludeEnd() {
		return this.excludeEnd;
	}

	public boolean include(int i) {
		if (i < begin) {
			return false;
		}
		
		if (i > end) {
			return false;
		}
		
		if (this.excludeEnd && i == this.end) {
			return false;
		}
		
		return true;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof RubyRange)) {
			return false;
		}
		
		RubyRange range = (RubyRange)obj;
		if ((range.begin == begin) 
		&& (range.end == end) 
		&& (range.excludeEnd == excludeEnd)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.begin + "..." + this.end;
	}	
}
