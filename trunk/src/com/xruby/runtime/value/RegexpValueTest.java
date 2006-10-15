package com.xruby.core.value;

import junit.framework.TestCase;

public class RegexpValueTest extends TestCase {
	public void test_match() {
		assertTrue((new RegexpValue("^f.*r$")).match("foobar"));
		assertTrue((new RegexpValue("hello")).match("hello"));
		assertTrue(!(new RegexpValue("hellxxx")).match("hello"));
	}
}
