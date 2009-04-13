/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.ObjectFactory;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class f extends RubyNoArgMethod {
    private RubyID printID = RubyID.intern("print");

    public RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyAPI.callOneArgMethod(RubyRuntime.TOP_LEVEL_SELF_VALUE,
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
        RubyRuntime.setStdout(output);

        f m = new f();
        m.invoke(null, null);

        RubyRuntime.setStdout(original);

        String expected = "hello";
        assertEquals(expected, output.toString());
    }
}
