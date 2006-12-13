/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.value;

import junit.framework.*;
import com.xruby.runtime.lang.*;

public class RubyHashTest extends TestCase {

	public void test_hashCode() {
		assertEquals(ObjectFactory.createFixnum(123).hashCode(), ObjectFactory.createFixnum(123).hashCode());
		assertEquals(ObjectFactory.createString("xxx").hashCode(), ObjectFactory.createString("xxx").hashCode());
	}
	
	public void test_simple_add() {
		RubyHash h = new RubyHash();
		RubyValue k1 = ObjectFactory.fixnum1;
		RubyValue v1 = ObjectFactory.createString("xxx");
		h.add(k1, v1);
		RubyValue r1 = h.get(k1);
		assertEquals(v1, r1);
	}
	
	public void test_add() {
		RubyHash h = new RubyHash();
		assertEquals(0, h.size());
		
		RubyValue v1 = ObjectFactory.createString("xxx");
		h.add(ObjectFactory.fixnum1, v1);
		assertEquals(1, h.size());
		RubyValue r1 = h.get(ObjectFactory.fixnum1);
		assertEquals(v1, r1);
		
		RubyValue v2 = ObjectFactory.createString("yyy");
		h.add(ObjectFactory.createString("abc"), v2);
		assertEquals(2, h.size());
		RubyValue r2 = h.get(ObjectFactory.createString("abc"));
		assertEquals(v2, r2);
	}

}
