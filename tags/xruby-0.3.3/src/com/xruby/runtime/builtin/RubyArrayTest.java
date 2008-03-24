/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyValue;
import junit.framework.TestCase;

public class RubyArrayTest extends TestCase {
    public void test() {
        RubyArray a = new RubyArray(0);
        assertEquals(0, a.size());
        assertEquals(RubyConstant.QNIL, a.get(-1));
        assertEquals(RubyConstant.QNIL, a.get(0));
        assertEquals(RubyConstant.QNIL, a.get(1));

        RubyValue i = ObjectFactory.createFixnum(999);
        assertEquals(i, a.set(0, i));
        assertEquals(1, a.size());

        RubyValue s = ObjectFactory.createString("xxx");
        assertEquals(s, a.set(4, s));
        assertEquals(5, a.size());

        assertEquals(i, a.get(0));
        assertEquals(RubyConstant.QNIL, a.get(1));
        assertEquals(RubyConstant.QNIL, a.get(2));
        assertEquals(RubyConstant.QNIL, a.get(3));
        assertEquals(s, a.get(4));
        assertEquals(RubyConstant.QNIL, a.get(5));

        assertEquals(s, a.get(-1));
        assertEquals(RubyConstant.QNIL, a.get(-2));
        assertEquals(RubyConstant.QNIL, a.get(-3));
        assertEquals(RubyConstant.QNIL, a.get(-4));
        assertEquals(i, a.get(-5));
        assertEquals(RubyConstant.QNIL, a.get(-6));

        RubyValue b = RubyConstant.QTRUE;
        assertEquals(b, a.set(-1, b));
        assertEquals(b, a.get(4));
    }

    public void test_collect() {
        RubyArray a = new RubyArray(1);
        a.add(RubyConstant.QNIL);

        RubyValue v = a.collect(0);
        RubyArray r = (RubyArray) v;
        assertEquals(1, r.size());
        assertEquals(RubyConstant.QNIL, r.get(0));
    }

    public void test_collect_empty() {
        RubyArray a = new RubyArray(0);

        RubyValue v = a.collect(0);
        RubyArray r = (RubyArray) v;
        assertEquals(0, r.size());
    }

    public void test_expand() {
        RubyArray a = new RubyArray(1);
        a.add(ObjectFactory.FIXNUM1);

        RubyArray b = new RubyArray(2);
        b.add(ObjectFactory.createFixnum(2));
        b.add(ObjectFactory.createFixnum(3));

        a.expand(b);
        assertEquals(3, a.size());
    }

    public void test_subarray() {
        // a = [1, 2, 3]
        RubyArray a = new RubyArray();
        a.add(ObjectFactory.FIXNUM1);
        a.add(ObjectFactory.createFixnum(2));
        a.add(ObjectFactory.createFixnum(3));

        // a[1, 2]
        RubyArray b = a.subarray(1, 2);
        assertEquals(2, b.size());
        assertEquals(2, ((RubyFixnum) b.get(0)).toInt());
        assertEquals(3, ((RubyFixnum) b.get(1)).toInt());

        // begin > array size
        b = a.subarray(4, 2);
        assertNull(b);

        // begin < 0
        b = a.subarray(-1, 1);
        assertEquals(1, b.size());
        assertEquals(3, ((RubyFixnum) b.get(0)).toInt());

        // length < 0
        b = a.subarray(0, -1);
        assertNull(b);
    }

    public void test_plus() {
        // a = [1, 2]
        RubyArray a = new RubyArray();
        a.add(ObjectFactory.FIXNUM1);
        a.add(ObjectFactory.createFixnum(2));

        // b = [3, 4]
        RubyArray b = new RubyArray();
        a.add(ObjectFactory.createFixnum(3));
        a.add(ObjectFactory.createFixnum(4));

        // [1, 2, 3, 4]
        RubyArray newArray = a.plus(b);
        assertEquals(4, newArray.size());
        assertEquals(1, ((RubyFixnum) newArray.get(0)).toInt());
        assertEquals(2, ((RubyFixnum) newArray.get(1)).toInt());
        assertEquals(3, ((RubyFixnum) newArray.get(2)).toInt());
        assertEquals(4, ((RubyFixnum) newArray.get(3)).toInt());
    }

    public void test_times() {
        // a = [1, 2]
        RubyArray a = new RubyArray();
        a.add(ObjectFactory.FIXNUM1);
        a.add(ObjectFactory.createFixnum(2));

        // [1, 2, 1, 2]
        RubyArray newArray = a.times(2);
        assertEquals(4, newArray.size());
        assertEquals(1, ((RubyFixnum) newArray.get(0)).toInt());
        assertEquals(2, ((RubyFixnum) newArray.get(1)).toInt());
        assertEquals(1, ((RubyFixnum) newArray.get(2)).toInt());
        assertEquals(2, ((RubyFixnum) newArray.get(3)).toInt());

        // []
        newArray = a.times(0);
        assertEquals(0, newArray.size());

        try {
            a.times(-1);
            fail("exception should be thrown");
        } catch (RubyException re) {
        }
    }

    public void test_remove() {
        // a = [1, 2]
        RubyArray a = new RubyArray();
        a.add(ObjectFactory.FIXNUM1);
        a.add(ObjectFactory.createFixnum(2));

        RubyValue v = a.delete_at(0);
        assertEquals(1, a.size());
        assertEquals(1, ((RubyFixnum) v).toInt());
        assertEquals(2, ((RubyFixnum) a.get(0)).toInt());

        RubyArray b = new RubyArray();
        v = b.delete_at(1);
        assertEquals(RubyConstant.QNIL, v);

        // remove negative index
        RubyArray c = new RubyArray();
        v = c.delete_at(-1);
        assertEquals(RubyConstant.QNIL, v);
    }

    public void test_includes() {
        RubyArray a = new RubyArray();
        RubyValue i1 = ObjectFactory.FIXNUM1;
        RubyValue i2 = ObjectFactory.createFixnum(2);
        RubyValue i3 = ObjectFactory.createFixnum(2);
        RubyValue i4 = ObjectFactory.createFixnum(4);

        assertTrue(a.include(i1) == RubyConstant.QFALSE);
        assertTrue(a.include(i2) == RubyConstant.QFALSE);
        assertTrue(a.include(i3) == RubyConstant.QFALSE);
        assertTrue(a.include(i4) == RubyConstant.QFALSE);

        a.add(i1);
        a.add(i2);

        assertTrue(a.include(i1) == RubyConstant.QTRUE);
        assertTrue(a.include(i2) == RubyConstant.QTRUE);
        assertTrue(a.include(i3) == RubyConstant.QTRUE);
        assertTrue(a.include(i4) == RubyConstant.QFALSE);
    }
}
