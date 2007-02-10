/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

/**
 * Provides caller
 * TODO Does not support thread now
 * TODO wrong format, should be ["test.rb:6:in `g'", "test.rb:9"]
 */
public class FrameManager {
	private static Stack<String> trace_ = new Stack<String>();
	
	static void pushRecord(String s) {
		trace_.push(s);
	}
	
	static void popRecord() {
		trace_.pop();
	}
	
	public static RubyArray caller(int skip) {
		int expected_size = trace_.size() - skip -1;
		if (expected_size <= 0) {
			return new RubyArray(0);
		}
		
		RubyArray a = new RubyArray(expected_size);
		int i = 0;
		for (String s : trace_) {
			++i;
			if (i >= skip && i <= expected_size) {
				a.insert(0, ObjectFactory.createString(s));
			}
		}
		return a;
	}
}
