package com.xruby.compiler.parser;

import junit.framework.TestCase;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class TestCaseExtend extends TestCase {
    static public void assertInstanceOf(String message, Object expected, Object actual) {
        if (expected == null && actual == null)
            return;
        if (expected != null && expected.equals(actual))
            return;
        fail(actual + " should be instanceof " + expected);
    }
}
