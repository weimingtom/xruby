/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class RubyValueTest extends TestCase {
	public void test_equals() {
		assertFalse(ObjectFactory.fixnum1.equals(ObjectFactory.nilValue));
		assertFalse(ObjectFactory.nilValue.equals(ObjectFactory.fixnum1));
	}
}
