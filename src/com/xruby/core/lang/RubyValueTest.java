/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import junit.framework.TestCase;
import com.xruby.core.builtin.*;

public class RubyValueTest extends TestCase {
	public void test_equals() {
		assertFalse(ObjectFactory.createFixnum(1).equals(ObjectFactory.nilValue));
		assertFalse(ObjectFactory.nilValue.equals(ObjectFactory.createFixnum(1)));
	}
}
