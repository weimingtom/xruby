package com.xruby.runtime.value;

import junit.framework.TestCase;

public class RegexpValueTest extends TestCase {
	public void test_match() {
		assertTrue((new RegexpValue("^f.*r$")).caseEqual("foobar"));
		assertTrue((new RegexpValue("hello")).caseEqual("hello"));
		assertTrue(!(new RegexpValue("hellxxx")).caseEqual("hello"));
		assertTrue((new RegexpValue("(.)(.)(\\d+)(\\d)")).caseEqual("THX1138."));
	}
}
