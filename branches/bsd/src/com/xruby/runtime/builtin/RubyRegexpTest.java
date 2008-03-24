/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Collection;

import junit.framework.TestCase;

public class RubyRegexpTest extends TestCase {
    public void test_match() {
        assertTrue((new RubyRegexp("^f.*r$")).caseEqual("foobar"));
        assertTrue((new RubyRegexp("hello")).caseEqual("hello"));
        assertTrue(!(new RubyRegexp("hellxxx")).caseEqual("hello"));
        assertTrue((new RubyRegexp("(.)(.)(\\d+)(\\d)")).caseEqual("THX1138."));
    }

    public void test_matchPosition() {
        assertEquals(0, (new RubyRegexp("\\A\\w:\\/\\z")).matchPosition("C:/"));
        assertEquals(1, (new RubyRegexp("(.)(.)(\\d+)(\\d)")).matchPosition("THX1138."));
        assertEquals(-1, (new RubyRegexp("(.)(.)(\\d+)(\\d)")).matchPosition("THX1."));
        assertEquals(0, (new RubyRegexp("^$")).matchPosition(""));
    }

    public void test_split_parentheses() {
        RubyRegexp reg = new RubyRegexp("(%>)");
        Collection<String> result = reg.split("<%= print 1 %>xxx", 0);
        assertEquals(3, result.size());

        int i = 0;
        for (String s : result) {
            if (0 == i) {
                assertEquals("<%= print 1 ", s);
            } else if (1 == i) {
                assertEquals("%>", s);
            } else if (2 == i) {
                assertEquals("xxx", s);
            } else {
                fail();
            }
            ++i;
        }
    }

    public void test_split_no_parentheses() {
        RubyRegexp reg = new RubyRegexp("%>");
        Collection<String> result = reg.split("<%= print 1 %>xxx", 0);
        assertEquals(2, result.size());

        int i = 0;
        for (String s : result) {
            if (0 == i) {
                assertEquals("<%= print 1 ", s);
            } else if (1 == i) {
                assertEquals("xxx", s);
            } else {
                fail();
            }
            ++i;
        }
    }
}
