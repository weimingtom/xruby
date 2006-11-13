package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;

/**
 *
 */

class Enum_collect extends RubyMethod {

    public Enum_collect() {
        super(0);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block);
        RubyRuntime.callPublicMethod(receiver, args, repeatableBlock, "each");
        RubyArray array = repeatableBlock.getRetValue();

        return ObjectFactory.createArray(array);
    }
}

public class EnumerableBuilder {
    private static RubyModule enumModuel = RubyRuntime.GlobalScope.defineNewModule("Enumerable");

    static {
        RubyMethod enum_collect = new Enum_collect();
        enumModuel.defineMethod("collect", enum_collect);
        enumModuel.defineMethod("map", enum_collect);
    }

    public static RubyModule create() {
        return enumModuel;
	}
}
