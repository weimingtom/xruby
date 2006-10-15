/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.xruby.runtime.value.*;

import junit.framework.TestCase;


class f extends RubyMethod
{

    public f()
    {
        super(0);
    }

    public RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block)
        throws RubyException
    {
        return RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue,
        					new ArrayValue(ObjectFactory.createString("hello")),
        					block,
        					"puts");
    }
}


public class RubyMethodTest extends TestCase {
	public void test() throws RubyException {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));

		f m = new f();
		m.invoke(null, null, null);
		
		System.setOut(original);
		
		String expected = "hello\r\n";
		assertEquals(expected, output.toString());
	}
}
