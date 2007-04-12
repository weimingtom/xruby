/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class f extends RubyNoArgMethod {
    private RubyID printID = StringMap.intern("print");

    public RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyAPI.callOneArgMethod(ObjectFactory.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createString("hello"),
                block,
                printID);
    }
}

public class RubyMethodTest extends TestCase {

    public void setUp() {
        RubyRuntime.init(null);
    }

    public void test() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(output));

        f m = new f();
        m.invoke(null, null, null, null);

        System.setOut(original);

        String expected = "hello";
        assertEquals(expected, output.toString());
    }
}
