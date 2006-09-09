/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.xruby.core.builtin.ObjectFactory;

import junit.framework.TestCase;


class f extends RubyMethod
{

    public f(int i)
    {
        super(i);
    }

    public RubyValue run(RubyValue rubyvalue, RubyValue arubyvalue[], RubyBlock block)
        throws RubyException
    {
        return RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue, new RubyValue[] {
            ObjectFactory.createString("hello")
        }, block, "puts");
    }
}


public class RubyMethodTest extends TestCase {
	public void test() throws RubyException {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));

		f m = new f(2);
		m.invoke(null, null, null);
		
		System.setOut(original);
		
		String expected = "hello\r\n";
		assertEquals(expected, output.toString());
	}
}
