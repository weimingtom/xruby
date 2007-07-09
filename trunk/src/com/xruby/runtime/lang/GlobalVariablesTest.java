/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;

public class GlobalVariablesTest extends TestCase {

    public void test_importValuesFromCommandLine() {
        GlobalVariables.importValuesFromCommandLine(new String[]{"test_import1", "test_import2=5"});
        assertEquals(ObjectFactory.TRUE_VALUE, GlobalVariables.get("$test_import1"));
        assertEquals(ObjectFactory.createString("5"), GlobalVariables.get("$test_import2"));
    }

}
