/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.xruby.runtime.value.*;

import junit.framework.TestCase;


class f extends RubyMethod {

    public f() {
        super(0);
    }

    public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
        					new RubyArray(ObjectFactory.createString("hello")),
        					block,
        					"print");
    }
}


public class RubyMethodTest extends TestCase {
	public void test() {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));

		f m = new f();
		m.invoke(null, null, null);
		
		System.setOut(original);
		
		String expected = "hello";
		assertEquals(expected, output.toString());
	}
}
