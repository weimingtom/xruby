/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;

public class RubyValueTest extends TestCase {
    public void test_equals() {
        assertFalse(ObjectFactory.FIXNUM1.equals(ObjectFactory.NIL_VALUE));
        assertFalse(ObjectFactory.NIL_VALUE.equals(ObjectFactory.FIXNUM1));
    }
}
