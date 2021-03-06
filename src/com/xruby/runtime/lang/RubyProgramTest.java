/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.ObjectFactory;
import com.xruby.runtime.builtin.RubyArray;
import com.xruby.runtime.builtin.RubyFixnum;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestingProgram extends RubyProgram {

    public static void main(String[] args) {
        try {
            new TestingProgram().invoke();
        } catch (RubyException e) {
            e.printStackTrace();
        }
    }

    public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope) {
        //puts nil, "abC", "5432"
        RubyID printID = RubyID.intern("print");

        RubyArray a = new RubyArray(3);
        a.add(RubyConstant.QNIL);
        a.add(ObjectFactory.createString("ABCD"));
        a.add(ObjectFactory.createFixnum(5432));
        RubyAPI.callMethod(RubyRuntime.TOP_LEVEL_SELF_VALUE,
                a,
                null,
                printID);

        //puts "hello world"
        RubyAPI.callOneArgMethod(RubyRuntime.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createString("hello, world!"),
                null,
                printID);

        //puts 123
        RubyAPI.callOneArgMethod(RubyRuntime.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createFixnum(123),
                null,
                printID);

        //puts 1.2
        RubyAPI.callOneArgMethod(RubyRuntime.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createFloat(1.2),
                null,
                printID);

        //return 123 + 456
        return RubyAPI.callPublicOneArgMethod(ObjectFactory.createFixnum(123),
                ObjectFactory.createFixnum(456),
                null,
                RubyID.plusID);
    }
}

public class RubyProgramTest extends TestCase {
    public void setUp() {
        RubyRuntime.init(null);
    }

    public void test_output() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;
        RubyRuntime.setStdout(output);

        RubyProgram p = new TestingProgram();
        RubyValue r = p.invoke();

        RubyRuntime.setStdout(original);

        RubyFixnum i = (RubyFixnum) r;
        assertEquals(579, i.toInt());

        String expected =
                "nil" +
                        "ABCD" +
                        "5432" +
                        "hello, world!" +
                        "123" +
                        "1.2";
        assertEquals(expected, output.toString());
    }

}
