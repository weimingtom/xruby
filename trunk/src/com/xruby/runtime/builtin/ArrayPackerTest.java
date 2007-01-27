package com.xruby.runtime.builtin;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class ArrayPackerTest extends TestCase {
	public void test_pack() {
		StringBuilder s = ArrayPacker.pack(new RubyArray(ObjectFactory.fixnum1), "q");
		String expected = new String(new char[] {1, 0, 0, 0, 0, 0, 0, 0});
		assertEquals(expected.length(), s.toString().length());
	}
}
