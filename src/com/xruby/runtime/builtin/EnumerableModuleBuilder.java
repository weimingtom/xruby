/** 
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;

/**
 * WARNING !!!
 * TODO: the implementation of Enumerable has a drawback, please take care if you wanna use it
 */

class Enum_collect extends RubyVarArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
		RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
		return repeatableBlock.getRetValue();
	}
}

class Enum_all extends RubyVarArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
		RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
		RubyArray array = repeatableBlock.getRetValue();

		for (RubyValue value : array) {
			// TODO: We should add RubyBoolean and its to_s
			if (value == ObjectFactory.falseValue) {
				return ObjectFactory.falseValue;
			}
		}
		return ObjectFactory.trueValue;
	}
}

class Enum_any extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
		RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
		RubyArray array = repeatableBlock.getRetValue();

		for (RubyValue value : array) {
			// TODO: We should add RubyBoolean and its to_s
			if (value == ObjectFactory.trueValue) {
				return ObjectFactory.trueValue;
			}
		}
		return ObjectFactory.falseValue;
	}
}

public class EnumerableModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.EnumerableModule;
		RubyMethod enum_collect = new Enum_collect();
		m.defineMethod("collect", enum_collect);
		m.defineMethod("map", enum_collect);
		m.defineMethod("all?", new Enum_all());
		m.defineMethod("any?", new Enum_any());
	}
}
