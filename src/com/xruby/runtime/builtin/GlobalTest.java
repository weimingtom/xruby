package com.xruby.runtime.builtin;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.xruby.runtime.lang.GlobalVariables;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

import junit.framework.TestCase;

public class GlobalTest extends TestCase {
	public void testRaise() {
		try {
			RubyRuntime.topSelf.callMethod("raise", ObjectFactory.createString("raise exception"));
			fail("not reach here");
		} catch (RubyException e) {
		}
	}
	
	private void runOutputTest(String method, String result, RubyValue... args) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		GlobalVariables.setOut(new PrintStream(output));
		RubyArray params = new RubyArray();
		for (RubyValue value : args) {
			params.add(value);
		}
		
		assertEquals(RubyConstant.QNIL, RubyRuntime.topSelf.callMethod(method, params));		
		GlobalVariables.setOut(original);
		
		assertEquals(result, output.toString());
	}
	
	public void testPuts() {
		runOutputTest("puts", "text\n", ObjectFactory.createString("text"));
		runOutputTest("puts", "text\ntrue\n", ObjectFactory.createString("text"), RubyConstant.QTRUE);
		runOutputTest("puts", "\n");
		
		runOutputTest("print", "text", ObjectFactory.createString("text"));
		runOutputTest("print", "texttrue", ObjectFactory.createString("text"), RubyConstant.QTRUE);
	}
}
