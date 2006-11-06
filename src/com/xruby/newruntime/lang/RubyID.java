package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyFixnum;

class RubyIDGenerator {
	// ID_ALLOCATOR = 1
	
	private static long lastId = 2;
	
	public static void reset(long seed) {
		lastId = seed;
	}
	
	public static long nextId() {
		return lastId++;
	}
}

public class RubyID {
	static RubyID ID_ALLOCATOR = new RubyID(1);
	
	private long id;
	
	public RubyID() {
		this(0);
	}
	
	public RubyID(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public RubySymbol toSymbol() {
		return new RubySymbol(this.id);
	}
	
	public RubyFixnum toFixnum() {
		return RubyFixnum.long2Fix(this.id);
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		return (obj instanceof RubyID) ? this.id == ((RubyID)obj).id : false;
	}

	public int hashCode() {
		return (int)this.id;
	}
}
