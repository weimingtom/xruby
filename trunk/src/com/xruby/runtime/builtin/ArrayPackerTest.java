/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.builtin.ObjectFactory;
import com.xruby.runtime.builtin.RubyArray;
import com.xruby.runtime.lang.RubyConstant;
import junit.framework.TestCase;

public class ArrayPackerTest extends TestCase {
    public void test_pack() {
        StringBuilder s = ArrayPacker.pack(new RubyArray(ObjectFactory.FIXNUM1), "q");
        String expected = new String(new char[]{1, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(expected.length(), s.toString().length());
    }

    public void test_unpack_empty() {
        RubyArray a = ArrayPacker.unpack("", "q");
        assertEquals(1, a.size());
        assertEquals(RubyConstant.QNIL, a.get(0));
    }

    public void test_unpack() {
        String s = new String(new char[]{1, 0, 0, 0, 0, 0, 0, 0});
        RubyArray a = ArrayPacker.unpack(s, "q");
        assertEquals(1, a.size());
        assertEquals(ObjectFactory.FIXNUM1, a.get(0));
    }
}
