/** 
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.concurrent.atomic.AtomicLong;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyFixnum;


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
	private RubySymbol symbol;
	
	RubyID(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public int hashCode() {
		return (int)this.id;
	}
	
	public RubySymbol toSymbol() {
		if (this.symbol == null) {			
			this.symbol = new RubySymbol(this);
		}
		
		return this.symbol;
	}
	
	public RubyFixnum toFixnum() {
		return ObjectFactory.createFixnum((int)this.id);
	}
}
