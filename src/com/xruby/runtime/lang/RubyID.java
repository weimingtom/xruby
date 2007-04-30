/** 
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.concurrent.atomic.AtomicLong;

class RubyIDGenerator {
	// ID_ALLOCATOR = 1
	
	private static AtomicLong lastId = new AtomicLong(2);
	
	public static RubyID nextId() {
		return new RubyID(lastId.getAndIncrement());
	}
}

public class RubyID {
	public static RubyID ID_ALLOCATOR = new RubyID(1);
	
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

	public int hashCode() {
		return (int)this.id;
	}
	
	/*
	public RubySymbol toSymbol() {
		return new RubySymbol(this.id);
	}
	
	public RubyFixnum toFixnum() {
		return RubyFixnum.long2Fix(this.id);
	}
	*/
}
