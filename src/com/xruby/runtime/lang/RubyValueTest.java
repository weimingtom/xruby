/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
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
