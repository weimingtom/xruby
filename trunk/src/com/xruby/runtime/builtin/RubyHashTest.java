/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyValue;
import junit.framework.TestCase;

public class RubyHashTest extends TestCase {

    public void test_hashCode() {
        assertEquals(ObjectFactory.createFixnum(123).hashCode(), ObjectFactory.createFixnum(123).hashCode());
        assertEquals(ObjectFactory.createString("xxx").hashCode(), ObjectFactory.createString("xxx").hashCode());
    }

    public void test_simple_add() {
        RubyHash h = new RubyHash();
        RubyValue k1 = ObjectFactory.FIXNUM1;
        RubyValue v1 = ObjectFactory.createString("xxx");
        h.add(k1, v1);
        RubyValue r1 = h.get(k1);
        assertEquals(v1, r1);
    }

    public void test_add() {
        RubyHash h = new RubyHash();
        assertEquals(ObjectFactory.FIXNUM0, h.size());

        RubyValue v1 = ObjectFactory.createString("xxx");
        h.add(ObjectFactory.FIXNUM1, v1);
        assertEquals(ObjectFactory.FIXNUM1, h.size());
        RubyValue r1 = h.get(ObjectFactory.FIXNUM1);
        assertEquals(v1, r1);

        RubyValue v2 = ObjectFactory.createString("yyy");
        h.add(ObjectFactory.createString("abc"), v2);
        assertEquals(ObjectFactory.FIXNUM2, h.size());
        RubyValue r2 = h.get(ObjectFactory.createString("abc"));
        assertEquals(v2, r2);
    }

}
