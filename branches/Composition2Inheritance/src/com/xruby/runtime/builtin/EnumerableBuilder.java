package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;

/**
 * WARNING !!!
 * TODO: the implementation of Enumerable has a drawback, please take care if you wanna use it
 */

class Enum_collect extends RubyMethod {

    public Enum_collect() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver);
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, "each");
        return repeatableBlock.getRetValue();
    }
}

class Enum_all extends RubyMethod {

    public Enum_all() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver);
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, "each");
        RubyArray array = repeatableBlock.getRetValue();

        for (RubyValue value : array) {
            // TODO: We should add RubyBoolean and its to_s
            if (value.equals(ObjectFactory.falseValue)) {
                return ObjectFactory.falseValue;
            }
        }
        return ObjectFactory.trueValue;
    }
}

class Enum_any extends RubyMethod {

    public Enum_any() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver);
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, "each");
        RubyArray array = repeatableBlock.getRetValue();

        for (RubyValue value : array) {
            // TODO: We should add RubyBoolean and its to_s
            if (value.equals(ObjectFactory.trueValue)) {
                return ObjectFactory.trueValue;
            }
        }
        return ObjectFactory.falseValue;
    }
}

public class EnumerableBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.EnumModule;
		RubyMethod enum_collect = new Enum_collect();
		m.defineMethod("collect", enum_collect);
		m.defineMethod("map", enum_collect);
		m.defineMethod("all?", new Enum_all());
		m.defineMethod("any?", new Enum_any());

	}
}
