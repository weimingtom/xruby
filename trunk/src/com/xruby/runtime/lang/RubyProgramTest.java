/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

import java.io.*;
import junit.framework.TestCase;

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
		RubyID printID = StringMap.intern("print");
		
		RubyArray a = new RubyArray(3, true);
		a.add(ObjectFactory.nilValue);
		a.add(ObjectFactory.createString("ABCD"));
		a.add(ObjectFactory.createFixnum(5432));
		RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
								a,
								null,
								printID);

		//puts "hello world"
		RubyAPI.callOneArgMethod(ObjectFactory.topLevelSelfValue,
								ObjectFactory.createString("hello, world!"),
								null,
								printID);

		//puts 123
		RubyAPI.callOneArgMethod(ObjectFactory.topLevelSelfValue,
								ObjectFactory.createFixnum(123),
								null,
								printID);

		//puts 1.2
		RubyAPI.callOneArgMethod(ObjectFactory.topLevelSelfValue,
								ObjectFactory.createFloat(1.2),
								null,
								printID);

		//return 123 + 456
		return RubyAPI.callPublicOneArgMethod(ObjectFactory.createFixnum(123),
								ObjectFactory.createFixnum(456),
								null,
								CommonRubyID.plusID);
	}
}

public class RubyProgramTest extends TestCase {

	public void test_output() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));
		
		RubyProgram p = new TestingProgram();
		RubyValue r = p.invoke();
		
		System.setOut(original);
		
		RubyFixnum i = (RubyFixnum)r;
		assertEquals(579, i.intValue());

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
