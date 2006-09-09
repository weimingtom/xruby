/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import junit.framework.*;
import com.xruby.core.lang.*;

public class HashValueTest extends TestCase {

	public void test_hashCode() {
		assertEquals(ObjectFactory.createFixnum(123).hashCode(), ObjectFactory.createFixnum(123).hashCode());
		assertEquals(ObjectFactory.createString("xxx").hashCode(), ObjectFactory.createString("xxx").hashCode());
	}
	
	public void test_simple_add() {
		HashValue h = new HashValue();
		RubyValue k1 = ObjectFactory.createFixnum(1);
		RubyValue v1 = ObjectFactory.createString("xxx");
		h.add(k1, v1);
		RubyValue r1 = h.get(k1);
		assertEquals(v1, r1);
	}
	
	public void test_add() {
		HashValue h = new HashValue();
		assertEquals(0, h.size());
		
	
		RubyValue v1 = ObjectFactory.createString("xxx");
		h.add(ObjectFactory.createFixnum(1), v1);
		assertEquals(1, h.size());
		RubyValue r1 = h.get(ObjectFactory.createFixnum(1));
		assertEquals(v1, r1);
		
		RubyValue v2 = ObjectFactory.createString("yyy");
		h.add(ObjectFactory.createString("abc"), v2);
		assertEquals(2, h.size());
		RubyValue r2 = h.get(ObjectFactory.createString("abc"));
		assertEquals(v2, r2);
	}

}
