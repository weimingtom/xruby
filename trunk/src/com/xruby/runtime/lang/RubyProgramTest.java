/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;
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
        a.add(ObjectFactory.NIL_VALUE);
        a.add(ObjectFactory.createString("ABCD"));
        a.add(ObjectFactory.createFixnum(5432));
        RubyAPI.callMethod(ObjectFactory.TOP_LEVEL_SELF_VALUE,
                a,
                null,
                printID);

        //puts "hello world"
        RubyAPI.callOneArgMethod(ObjectFactory.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createString("hello, world!"),
                null,
                printID);

        //puts 123
        RubyAPI.callOneArgMethod(ObjectFactory.TOP_LEVEL_SELF_VALUE,
                ObjectFactory.createFixnum(123),
                null,
                printID);

        //puts 1.2
        RubyAPI.callOneArgMethod(ObjectFactory.TOP_LEVEL_SELF_VALUE,
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
        System.setOut(new PrintStream(output));

        RubyProgram p = new TestingProgram();
        RubyValue r = p.invoke();

        System.setOut(original);

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
