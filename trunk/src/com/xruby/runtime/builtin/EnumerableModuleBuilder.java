/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

/**
 * WARNING !!!
 * TODO: the implementation of Enumerable has a drawback, please take care if you wanna use it
 */

class Enumerable_collect extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
        return repeatableBlock.getRetValue();
    }
}

class Enumerable_all extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
        RubyArray array = repeatableBlock.getRetValue();

        for (RubyValue value : array) {
            // TODO: We should add RubyBoolean and its to_s
            if (value == ObjectFactory.FALSE_VALUE) {
                return ObjectFactory.FALSE_VALUE;
            }
        }
        return ObjectFactory.TRUE_VALUE;
    }
}

class Enumerable_any extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RepeatableRubyBlock repeatableBlock = new RepeatableRubyBlock(block, receiver, getOwner());
        RubyAPI.callPublicMethod(receiver, args, repeatableBlock, CommonRubyID.eachID);
        RubyArray array = repeatableBlock.getRetValue();

        for (RubyValue value : array) {
            // TODO: We should add RubyBoolean and its to_s
            if (value == ObjectFactory.TRUE_VALUE) {
                return ObjectFactory.TRUE_VALUE;
            }
        }
        return ObjectFactory.FALSE_VALUE;
    }
}

public class EnumerableModuleBuilder {
    public static void initialize() {
        RubyModule m = RubyRuntime.EnumerableModule;
        RubyMethod enum_collect = new Enumerable_collect();
        m.defineMethod("collect", enum_collect);
        m.defineMethod("map", enum_collect);
        m.defineMethod("all?", new Enumerable_all());
        m.defineMethod("any?", new Enumerable_any());
    }
}
